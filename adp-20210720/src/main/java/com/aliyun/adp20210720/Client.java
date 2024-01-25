// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720;

import com.aliyun.tea.*;
import com.aliyun.adp20210720.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    public AddEnvironmentNodesResponse addEnvironmentNodesWithOptions(String uid, AddEnvironmentNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationDisk)) {
            body.put("applicationDisk", request.applicationDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDisk)) {
            body.put("dataDisk", request.dataDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.etcdDisk)) {
            body.put("etcdDisk", request.etcdDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            body.put("hostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterPrivateIPs)) {
            body.put("masterPrivateIPs", request.masterPrivateIPs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            body.put("memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("os", request.os);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tridentSystemDisk)) {
            body.put("tridentSystemDisk", request.tridentSystemDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tridentSystemSizeDisk)) {
            body.put("tridentSystemSizeDisk", request.tridentSystemSizeDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPrivateIPs)) {
            body.put("workerPrivateIPs", request.workerPrivateIPs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEnvironmentNodes"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/nodes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddEnvironmentNodesResponse());
    }

    public AddEnvironmentNodesResponse addEnvironmentNodes(String uid, AddEnvironmentNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addEnvironmentNodesWithOptions(uid, request, headers, runtime);
    }

    public AddEnvironmentProductVersionsResponse addEnvironmentProductVersionsWithOptions(String uid, AddEnvironmentProductVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productVersionInfoList)) {
            body.put("productVersionInfoList", request.productVersionInfoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUIDList)) {
            body.put("productVersionUIDList", request.productVersionUIDList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEnvironmentProductVersions"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/product-versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddEnvironmentProductVersionsResponse());
    }

    public AddEnvironmentProductVersionsResponse addEnvironmentProductVersions(String uid, AddEnvironmentProductVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addEnvironmentProductVersionsWithOptions(uid, request, headers, runtime);
    }

    public AddProductComponentVersionResponse addProductComponentVersionWithOptions(String uid, String componentVersionUID, AddProductComponentVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentVersionSpecUID)) {
            body.put("componentVersionSpecUID", request.componentVersionSpecUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentVersionSpecValues)) {
            body.put("componentVersionSpecValues", request.componentVersionSpecValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseName)) {
            body.put("releaseName", request.releaseName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddProductComponentVersion"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/component-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(componentVersionUID) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddProductComponentVersionResponse());
    }

    public AddProductComponentVersionResponse addProductComponentVersion(String uid, String componentVersionUID, AddProductComponentVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addProductComponentVersionWithOptions(uid, componentVersionUID, request, headers, runtime);
    }

    public AddProductVersionConfigResponse addProductVersionConfigWithOptions(String uid, AddProductVersionConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentReleaseName)) {
            body.put("componentReleaseName", request.componentReleaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentVersionUID)) {
            body.put("componentVersionUID", request.componentVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentComponentReleaseName)) {
            body.put("parentComponentReleaseName", request.parentComponentReleaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentComponentVersionUID)) {
            body.put("parentComponentVersionUID", request.parentComponentVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valueType)) {
            body.put("valueType", request.valueType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddProductVersionConfig"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/configs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddProductVersionConfigResponse());
    }

    public AddProductVersionConfigResponse addProductVersionConfig(String uid, AddProductVersionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addProductVersionConfigWithOptions(uid, request, headers, runtime);
    }

    public AddResourceSnapshotResponse addResourceSnapshotWithOptions(AddResourceSnapshotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterUID)) {
            query.put("clusterUID", request.clusterUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddResourceSnapshot"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resource-snapshots"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddResourceSnapshotResponse());
    }

    public AddResourceSnapshotResponse addResourceSnapshot(AddResourceSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addResourceSnapshotWithOptions(request, headers, runtime);
    }

    public BatchAddEnvironmentNodesResponse batchAddEnvironmentNodesWithOptions(String uid, BatchAddEnvironmentNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceList)) {
            body.put("instanceList", request.instanceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            body.put("overwrite", request.overwrite);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddEnvironmentNodes"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/batch/nodes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddEnvironmentNodesResponse());
    }

    public BatchAddEnvironmentNodesResponse batchAddEnvironmentNodes(String uid, BatchAddEnvironmentNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchAddEnvironmentNodesWithOptions(uid, request, headers, runtime);
    }

    public BatchAddProductVersionConfigResponse batchAddProductVersionConfigWithOptions(String uid, BatchAddProductVersionConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productVersionConfigList)) {
            body.put("productVersionConfigList", request.productVersionConfigList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddProductVersionConfig"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/batch/configs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddProductVersionConfigResponse());
    }

    public BatchAddProductVersionConfigResponse batchAddProductVersionConfig(String uid, BatchAddProductVersionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchAddProductVersionConfigWithOptions(uid, request, headers, runtime);
    }

    public CreateDeliverableResponse createDeliverableWithOptions(CreateDeliverableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.foundation)) {
            body.put("foundation", request.foundation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.products)) {
            body.put("products", request.products);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeliverable"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/delivery/deliverables"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeliverableResponse());
    }

    public CreateDeliverableResponse createDeliverable(CreateDeliverableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeliverableWithOptions(request, headers, runtime);
    }

    public CreateDeliveryInstanceResponse createDeliveryInstanceWithOptions(CreateDeliveryInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterUID)) {
            body.put("clusterUID", request.clusterUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliverableConfigUID)) {
            body.put("deliverableConfigUID", request.deliverableConfigUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliverableUID)) {
            body.put("deliverableUID", request.deliverableUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envUID)) {
            body.put("envUID", request.envUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foundation)) {
            body.put("foundation", request.foundation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.products)) {
            body.put("products", request.products);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateUID)) {
            body.put("templateUID", request.templateUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeliveryInstance"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/delivery/delivery-instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeliveryInstanceResponse());
    }

    public CreateDeliveryInstanceResponse createDeliveryInstance(CreateDeliveryInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeliveryInstanceWithOptions(request, headers, runtime);
    }

    public CreateDeliveryPackageResponse createDeliveryPackageWithOptions(CreateDeliveryPackageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliverableUID)) {
            body.put("deliverableUID", request.deliverableUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryInstanceUID)) {
            body.put("deliveryInstanceUID", request.deliveryInstanceUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originDeliverableUID)) {
            body.put("originDeliverableUID", request.originDeliverableUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageContentType)) {
            body.put("packageContentType", request.packageContentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("packageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("platform", request.platform);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeliveryPackage"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/delivery/delivery-packages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeliveryPackageResponse());
    }

    public CreateDeliveryPackageResponse createDeliveryPackage(CreateDeliveryPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeliveryPackageWithOptions(request, headers, runtime);
    }

    public CreateEnvironmentResponse createEnvironmentWithOptions(CreateEnvironmentRequest request, CreateEnvironmentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            body.put("annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredAt)) {
            body.put("expiredAt", request.expiredAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformList)) {
            body.put("platformList", request.platformList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorConfig)) {
            body.put("vendorConfig", request.vendorConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorType)) {
            body.put("vendorType", request.vendorType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.clientToken)) {
            realHeaders.put("ClientToken", com.aliyun.teautil.Common.toJSONString(headers.clientToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnvironment"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnvironmentResponse());
    }

    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateEnvironmentHeaders headers = new CreateEnvironmentHeaders();
        return this.createEnvironmentWithOptions(request, headers, runtime);
    }

    public CreateEnvironmentLicenseResponse createEnvironmentLicenseWithOptions(String uid, CreateEnvironmentLicenseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            body.put("companyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contact)) {
            body.put("contact", request.contact);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("expireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseQuota)) {
            body.put("licenseQuota", request.licenseQuota);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineFingerprint)) {
            body.put("machineFingerprint", request.machineFingerprint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnvironmentLicense"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/licenses"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnvironmentLicenseResponse());
    }

    public CreateEnvironmentLicenseResponse createEnvironmentLicense(String uid, CreateEnvironmentLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEnvironmentLicenseWithOptions(uid, request, headers, runtime);
    }

    public CreateFoundationReferenceResponse createFoundationReferenceWithOptions(CreateFoundationReferenceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterConfig)) {
            body.put("clusterConfig", request.clusterConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentConfigs)) {
            body.put("componentConfigs", request.componentConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foundationReferenceConfigs)) {
            body.put("foundationReferenceConfigs", request.foundationReferenceConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foundationVersionUID)) {
            body.put("foundationVersionUID", request.foundationVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originFoundationReferenceUID)) {
            body.put("originFoundationReferenceUID", request.originFoundationReferenceUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFoundationReference"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/foundation-references"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFoundationReferenceResponse());
    }

    public CreateFoundationReferenceResponse createFoundationReference(CreateFoundationReferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFoundationReferenceWithOptions(request, headers, runtime);
    }

    public CreateProductResponse createProductWithOptions(CreateProductRequest request, CreateProductHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categories)) {
            body.put("categories", request.categories);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foundationVersionUID)) {
            body.put("foundationVersionUID", request.foundationVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("vendor", request.vendor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withoutProductVersion)) {
            body.put("withoutProductVersion", request.withoutProductVersion);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.clientToken)) {
            realHeaders.put("ClientToken", com.aliyun.teautil.Common.toJSONString(headers.clientToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProduct"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration/api/v2/products"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductResponse());
    }

    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateProductHeaders headers = new CreateProductHeaders();
        return this.createProductWithOptions(request, headers, runtime);
    }

    public CreateProductDeploymentResponse createProductDeploymentWithOptions(CreateProductDeploymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            body.put("environmentUID", request.environmentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldProductVersionUID)) {
            body.put("oldProductVersionUID", request.oldProductVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageConfig)) {
            body.put("packageConfig", request.packageConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageUID)) {
            body.put("packageUID", request.packageUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProductDeployment"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-instances/deployments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductDeploymentResponse());
    }

    public CreateProductDeploymentResponse createProductDeployment(CreateProductDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProductDeploymentWithOptions(request, headers, runtime);
    }

    public CreateProductVersionResponse createProductVersionWithOptions(String uid, CreateProductVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseProductVersionUID)) {
            query.put("baseProductVersionUID", request.baseProductVersionUID);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withoutBaseProductVersion)) {
            body.put("withoutBaseProductVersion", request.withoutBaseProductVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProductVersion"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration/api/v2/products/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductVersionResponse());
    }

    public CreateProductVersionResponse createProductVersion(String uid, CreateProductVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProductVersionWithOptions(uid, request, headers, runtime);
    }

    /**
      * @deprecated
      *
      * @param request CreateProductVersionPackageRequest
      * @param headers CreateProductVersionPackageHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateProductVersionPackageResponse
     */
    // Deprecated
    public CreateProductVersionPackageResponse createProductVersionPackageWithOptions(String uid, CreateProductVersionPackageRequest request, CreateProductVersionPackageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterEngineType)) {
            query.put("clusterEngineType", request.clusterEngineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foundationReferenceUID)) {
            query.put("foundationReferenceUID", request.foundationReferenceUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldFoundationReferenceUID)) {
            query.put("oldFoundationReferenceUID", request.oldFoundationReferenceUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldProductVersionUID)) {
            query.put("oldProductVersionUID", request.oldProductVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageContentType)) {
            query.put("packageContentType", request.packageContentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageToolType)) {
            query.put("packageToolType", request.packageToolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("packageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("platform", request.platform);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.clientToken)) {
            realHeaders.put("ClientToken", com.aliyun.teautil.Common.toJSONString(headers.clientToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProductVersionPackage"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/hosting/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/packages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductVersionPackageResponse());
    }

    /**
      * @deprecated
      *
      * @param request CreateProductVersionPackageRequest
      * @return CreateProductVersionPackageResponse
     */
    // Deprecated
    public CreateProductVersionPackageResponse createProductVersionPackage(String uid, CreateProductVersionPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateProductVersionPackageHeaders headers = new CreateProductVersionPackageHeaders();
        return this.createProductVersionPackageWithOptions(uid, request, headers, runtime);
    }

    public DeleteEnvironmentResponse deleteEnvironmentWithOptions(String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnvironment"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnvironmentResponse());
    }

    public DeleteEnvironmentResponse deleteEnvironment(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEnvironmentWithOptions(uid, headers, runtime);
    }

    public DeleteEnvironmentLicenseResponse deleteEnvironmentLicenseWithOptions(String uid, String licenseUID, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnvironmentLicense"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/licenses/" + com.aliyun.openapiutil.Client.getEncodeParam(licenseUID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnvironmentLicenseResponse());
    }

    public DeleteEnvironmentLicenseResponse deleteEnvironmentLicense(String uid, String licenseUID) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEnvironmentLicenseWithOptions(uid, licenseUID, headers, runtime);
    }

    public DeleteEnvironmentNodeResponse deleteEnvironmentNodeWithOptions(String uid, String nodeUID, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnvironmentNode"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/nodes/" + com.aliyun.openapiutil.Client.getEncodeParam(nodeUID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnvironmentNodeResponse());
    }

    public DeleteEnvironmentNodeResponse deleteEnvironmentNode(String uid, String nodeUID) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEnvironmentNodeWithOptions(uid, nodeUID, headers, runtime);
    }

    public DeleteEnvironmentProductVersionResponse deleteEnvironmentProductVersionWithOptions(String uid, String productVersionUID, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnvironmentProductVersion"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(productVersionUID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnvironmentProductVersionResponse());
    }

    public DeleteEnvironmentProductVersionResponse deleteEnvironmentProductVersion(String uid, String productVersionUID) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEnvironmentProductVersionWithOptions(uid, productVersionUID, headers, runtime);
    }

    public DeleteProductResponse deleteProductWithOptions(String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProduct"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration/api/v2/products/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductResponse());
    }

    public DeleteProductResponse deleteProduct(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductWithOptions(uid, headers, runtime);
    }

    public DeleteProductComponentVersionResponse deleteProductComponentVersionWithOptions(String uid, String relationUID, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProductComponentVersion"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/relations/" + com.aliyun.openapiutil.Client.getEncodeParam(relationUID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductComponentVersionResponse());
    }

    public DeleteProductComponentVersionResponse deleteProductComponentVersion(String uid, String relationUID) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductComponentVersionWithOptions(uid, relationUID, headers, runtime);
    }

    public DeleteProductInstanceConfigResponse deleteProductInstanceConfigWithOptions(String configUID, DeleteProductInstanceConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            query.put("environmentUID", request.environmentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProductInstanceConfig"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-instances/configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configUID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductInstanceConfigResponse());
    }

    public DeleteProductInstanceConfigResponse deleteProductInstanceConfig(String configUID, DeleteProductInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductInstanceConfigWithOptions(configUID, request, headers, runtime);
    }

    public DeleteProductVersionResponse deleteProductVersionWithOptions(String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProductVersion"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductVersionResponse());
    }

    public DeleteProductVersionResponse deleteProductVersion(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductVersionWithOptions(uid, headers, runtime);
    }

    public DeleteProductVersionConfigResponse deleteProductVersionConfigWithOptions(String uid, String configUID, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProductVersionConfig"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configUID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductVersionConfigResponse());
    }

    public DeleteProductVersionConfigResponse deleteProductVersionConfig(String uid, String configUID) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductVersionConfigWithOptions(uid, configUID, headers, runtime);
    }

    public GenerateProductInstanceDeploymentConfigResponse generateProductInstanceDeploymentConfigWithOptions(GenerateProductInstanceDeploymentConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            body.put("environmentUID", request.environmentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageContentType)) {
            body.put("packageContentType", request.packageContentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageUID)) {
            body.put("packageUID", request.packageUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUIDList)) {
            body.put("productVersionUIDList", request.productVersionUIDList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateProductInstanceDeploymentConfig"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-instances/package-configs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateProductInstanceDeploymentConfigResponse());
    }

    public GenerateProductInstanceDeploymentConfigResponse generateProductInstanceDeploymentConfig(GenerateProductInstanceDeploymentConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateProductInstanceDeploymentConfigWithOptions(request, headers, runtime);
    }

    public GetComponentResponse getComponentWithOptions(String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetComponent"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/components/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComponentResponse());
    }

    public GetComponentResponse getComponent(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComponentWithOptions(uid, headers, runtime);
    }

    public GetComponentVersionResponse getComponentVersionWithOptions(String uid, String versionUID, GetComponentVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.withoutChartContent)) {
            query.put("withoutChartContent", request.withoutChartContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetComponentVersion"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration/api/v2/components/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(versionUID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComponentVersionResponse());
    }

    public GetComponentVersionResponse getComponentVersion(String uid, String versionUID, GetComponentVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComponentVersionWithOptions(uid, versionUID, request, headers, runtime);
    }

    public GetDeliverableResponse getDeliverableWithOptions(String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeliverable"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/delivery/deliverables/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeliverableResponse());
    }

    public GetDeliverableResponse getDeliverable(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeliverableWithOptions(uid, headers, runtime);
    }

    public GetDeliveryPackageResponse getDeliveryPackageWithOptions(String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeliveryPackage"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/delivery/delivery-packages/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeliveryPackageResponse());
    }

    public GetDeliveryPackageResponse getDeliveryPackage(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeliveryPackageWithOptions(uid, headers, runtime);
    }

    public GetEnvironmentResponse getEnvironmentWithOptions(String uid, GetEnvironmentRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetEnvironmentShrinkRequest request = new GetEnvironmentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.options)) {
            request.optionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.options, "options", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.optionsShrink)) {
            query.put("options", request.optionsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnvironment"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnvironmentResponse());
    }

    public GetEnvironmentResponse getEnvironment(String uid, GetEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentWithOptions(uid, request, headers, runtime);
    }

    public GetEnvironmentDeliveryInstanceResponse getEnvironmentDeliveryInstanceWithOptions(GetEnvironmentDeliveryInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterUID)) {
            query.put("clusterUID", request.clusterUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envUID)) {
            query.put("envUID", request.envUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnvironmentDeliveryInstance"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/delivery/delivery-instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnvironmentDeliveryInstanceResponse());
    }

    public GetEnvironmentDeliveryInstanceResponse getEnvironmentDeliveryInstance(GetEnvironmentDeliveryInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentDeliveryInstanceWithOptions(request, headers, runtime);
    }

    public GetEnvironmentLicenseResponse getEnvironmentLicenseWithOptions(String uid, String licenseUID, GetEnvironmentLicenseRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetEnvironmentLicenseShrinkRequest request = new GetEnvironmentLicenseShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.options)) {
            request.optionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.options, "options", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.optionsShrink)) {
            query.put("options", request.optionsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnvironmentLicense"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/licenses/" + com.aliyun.openapiutil.Client.getEncodeParam(licenseUID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnvironmentLicenseResponse());
    }

    public GetEnvironmentLicenseResponse getEnvironmentLicense(String uid, String licenseUID, GetEnvironmentLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentLicenseWithOptions(uid, licenseUID, request, headers, runtime);
    }

    public GetEnvironmentNodeResponse getEnvironmentNodeWithOptions(String uid, String nodeUID, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnvironmentNode"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/nodes/" + com.aliyun.openapiutil.Client.getEncodeParam(nodeUID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnvironmentNodeResponse());
    }

    public GetEnvironmentNodeResponse getEnvironmentNode(String uid, String nodeUID) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentNodeWithOptions(uid, nodeUID, headers, runtime);
    }

    public GetFoundationComponentReferenceResponse getFoundationComponentReferenceWithOptions(String componentReferenceUID, String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFoundationComponentReference"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/foundation-references/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/components/" + com.aliyun.openapiutil.Client.getEncodeParam(componentReferenceUID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFoundationComponentReferenceResponse());
    }

    public GetFoundationComponentReferenceResponse getFoundationComponentReference(String componentReferenceUID, String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFoundationComponentReferenceWithOptions(componentReferenceUID, uid, headers, runtime);
    }

    public GetFoundationReferenceResponse getFoundationReferenceWithOptions(String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFoundationReference"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/foundation-references/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/info"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFoundationReferenceResponse());
    }

    public GetFoundationReferenceResponse getFoundationReference(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFoundationReferenceWithOptions(uid, headers, runtime);
    }

    public GetFoundationVersionResponse getFoundationVersionWithOptions(String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFoundationVersion"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/foundation/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFoundationVersionResponse());
    }

    public GetFoundationVersionResponse getFoundationVersion(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFoundationVersionWithOptions(uid, headers, runtime);
    }

    public GetProductResponse getProductWithOptions(String uid, GetProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.withIconURL)) {
            query.put("withIconURL", request.withIconURL);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProduct"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/products/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductResponse());
    }

    public GetProductResponse getProduct(String uid, GetProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductWithOptions(uid, request, headers, runtime);
    }

    public GetProductComponentVersionResponse getProductComponentVersionWithOptions(String relationUID, String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProductComponentVersion"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/relations/" + com.aliyun.openapiutil.Client.getEncodeParam(relationUID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductComponentVersionResponse());
    }

    public GetProductComponentVersionResponse getProductComponentVersion(String relationUID, String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductComponentVersionWithOptions(relationUID, uid, headers, runtime);
    }

    public GetProductDeploymentResponse getProductDeploymentWithOptions(String deploymentUID, GetProductDeploymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProductDeployment"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-instances/deployments/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentUID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductDeploymentResponse());
    }

    public GetProductDeploymentResponse getProductDeployment(String deploymentUID, GetProductDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductDeploymentWithOptions(deploymentUID, request, headers, runtime);
    }

    public GetProductVersionResponse getProductVersionWithOptions(String uid, GetProductVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.withDocumentationURL)) {
            query.put("withDocumentationURL", request.withDocumentationURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withExtendResourceURL)) {
            query.put("withExtendResourceURL", request.withExtendResourceURL);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProductVersion"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductVersionResponse());
    }

    public GetProductVersionResponse getProductVersion(String uid, GetProductVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductVersionWithOptions(uid, request, headers, runtime);
    }

    public GetProductVersionDifferencesResponse getProductVersionDifferencesWithOptions(String uid, String versionUID, GetProductVersionDifferencesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.preVersionUID)) {
            query.put("preVersionUID", request.preVersionUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProductVersionDifferences"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/integration/api/v2/products/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(versionUID) + "/differences"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductVersionDifferencesResponse());
    }

    public GetProductVersionDifferencesResponse getProductVersionDifferences(String uid, String versionUID, GetProductVersionDifferencesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductVersionDifferencesWithOptions(uid, versionUID, request, headers, runtime);
    }

    public GetProductVersionPackageResponse getProductVersionPackageWithOptions(String uid, GetProductVersionPackageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.foundationReferenceUID)) {
            query.put("foundationReferenceUID", request.foundationReferenceUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldFoundationReferenceUID)) {
            query.put("oldFoundationReferenceUID", request.oldFoundationReferenceUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldProductVersionUID)) {
            query.put("oldProductVersionUID", request.oldProductVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageContentType)) {
            query.put("packageContentType", request.packageContentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("packageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageUID)) {
            query.put("packageUID", request.packageUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withURL)) {
            query.put("withURL", request.withURL);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProductVersionPackage"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/hosting/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/packages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductVersionPackageResponse());
    }

    public GetProductVersionPackageResponse getProductVersionPackage(String uid, GetProductVersionPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductVersionPackageWithOptions(uid, request, headers, runtime);
    }

    public GetResourceSnapshotResponse getResourceSnapshotWithOptions(GetResourceSnapshotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceSnapshot"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/resource-snapshots"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceSnapshotResponse());
    }

    public GetResourceSnapshotResponse getResourceSnapshot(GetResourceSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceSnapshotWithOptions(request, headers, runtime);
    }

    public GetWorkflowStatusResponse getWorkflowStatusWithOptions(GetWorkflowStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workflowType)) {
            query.put("workflowType", request.workflowType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.xuid)) {
            query.put("xuid", request.xuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowStatus"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/workflows/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowStatusResponse());
    }

    public GetWorkflowStatusResponse getWorkflowStatus(GetWorkflowStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkflowStatusWithOptions(request, headers, runtime);
    }

    public InitEnvironmentResourceResponse initEnvironmentResourceWithOptions(String uid, InitEnvironmentResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitEnvironmentResource"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/resources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitEnvironmentResourceResponse());
    }

    public InitEnvironmentResourceResponse initEnvironmentResource(String uid, InitEnvironmentResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initEnvironmentResourceWithOptions(uid, request, headers, runtime);
    }

    public ListComponentVersionsResponse listComponentVersionsWithOptions(String uid, ListComponentVersionsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponentVersions"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/components/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentVersionsResponse());
    }

    public ListComponentVersionsResponse listComponentVersions(String uid, ListComponentVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComponentVersionsWithOptions(uid, request, headers, runtime);
    }

    public ListComponentsResponse listComponentsWithOptions(ListComponentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fuzzy)) {
            query.put("fuzzy", request.fuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request._public)) {
            query.put("public", request._public);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponents"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/components"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentsResponse());
    }

    public ListComponentsResponse listComponents(ListComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComponentsWithOptions(request, headers, runtime);
    }

    public ListDeliveryInstanceChangeRecordsResponse listDeliveryInstanceChangeRecordsWithOptions(String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeliveryInstanceChangeRecords"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/delivery/delivery-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/delivery-records"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeliveryInstanceChangeRecordsResponse());
    }

    public ListDeliveryInstanceChangeRecordsResponse listDeliveryInstanceChangeRecords(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeliveryInstanceChangeRecordsWithOptions(uid, headers, runtime);
    }

    public ListDeliveryPackageResponse listDeliveryPackageWithOptions(ListDeliveryPackageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliverableUID)) {
            query.put("deliverableUID", request.deliverableUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("platform", request.platform);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeliveryPackage"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/delivery/delivery-packages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeliveryPackageResponse());
    }

    public ListDeliveryPackageResponse listDeliveryPackage(ListDeliveryPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeliveryPackageWithOptions(request, headers, runtime);
    }

    public ListEnvironmentLicensesResponse listEnvironmentLicensesWithOptions(String uid, ListEnvironmentLicensesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvironmentLicenses"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/licenses"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvironmentLicensesResponse());
    }

    public ListEnvironmentLicensesResponse listEnvironmentLicenses(String uid, ListEnvironmentLicensesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentLicensesWithOptions(uid, request, headers, runtime);
    }

    public ListEnvironmentNodesResponse listEnvironmentNodesWithOptions(String uid, ListEnvironmentNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvironmentNodes"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/nodes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvironmentNodesResponse());
    }

    public ListEnvironmentNodesResponse listEnvironmentNodes(String uid, ListEnvironmentNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentNodesWithOptions(uid, request, headers, runtime);
    }

    public ListEnvironmentTunnelsResponse listEnvironmentTunnelsWithOptions(String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvironmentTunnels"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/tunnels"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvironmentTunnelsResponse());
    }

    public ListEnvironmentTunnelsResponse listEnvironmentTunnels(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentTunnelsWithOptions(uid, headers, runtime);
    }

    public ListEnvironmentsResponse listEnvironmentsWithOptions(ListEnvironmentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterUID)) {
            query.put("clusterUID", request.clusterUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foundationType)) {
            query.put("foundationType", request.foundationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fuzzy)) {
            query.put("fuzzy", request.fuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceStatus)) {
            query.put("instanceStatus", request.instanceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorType)) {
            query.put("vendorType", request.vendorType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvironments"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvironmentsResponse());
    }

    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentsWithOptions(request, headers, runtime);
    }

    public ListFoundationComponentVersionsResponse listFoundationComponentVersionsWithOptions(String uid, ListFoundationComponentVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.onlyEnabled)) {
            query.put("onlyEnabled", request.onlyEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentComponentRelationUID)) {
            query.put("parentComponentRelationUID", request.parentComponentRelationUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFoundationComponentVersions"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/foundation/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/component-versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFoundationComponentVersionsResponse());
    }

    public ListFoundationComponentVersionsResponse listFoundationComponentVersions(String uid, ListFoundationComponentVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFoundationComponentVersionsWithOptions(uid, request, headers, runtime);
    }

    public ListFoundationReferenceComponentsResponse listFoundationReferenceComponentsWithOptions(ListFoundationReferenceComponentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.foundationReferenceUID)) {
            query.put("foundationReferenceUID", request.foundationReferenceUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foundationVersionUID)) {
            query.put("foundationVersionUID", request.foundationVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyEnabled)) {
            query.put("onlyEnabled", request.onlyEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentComponentReferenceUID)) {
            query.put("parentComponentReferenceUID", request.parentComponentReferenceUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFoundationReferenceComponents"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/foundation-references/component-versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFoundationReferenceComponentsResponse());
    }

    public ListFoundationReferenceComponentsResponse listFoundationReferenceComponents(ListFoundationReferenceComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFoundationReferenceComponentsWithOptions(request, headers, runtime);
    }

    public ListFoundationVersionsResponse listFoundationVersionsWithOptions(ListFoundationVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.onlyDefault)) {
            query.put("onlyDefault", request.onlyDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirect)) {
            query.put("sortDirect", request.sortDirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortKey)) {
            query.put("sortKey", request.sortKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFoundationVersions"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/foundation/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFoundationVersionsResponse());
    }

    public ListFoundationVersionsResponse listFoundationVersions(ListFoundationVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFoundationVersionsWithOptions(request, headers, runtime);
    }

    public ListProductComponentVersionsResponse listProductComponentVersionsWithOptions(String uid, ListProductComponentVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseName)) {
            query.put("releaseName", request.releaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirect)) {
            query.put("sortDirect", request.sortDirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortKey)) {
            query.put("sortKey", request.sortKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductComponentVersions"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/component-versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductComponentVersionsResponse());
    }

    public ListProductComponentVersionsResponse listProductComponentVersions(String uid, ListProductComponentVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductComponentVersionsWithOptions(uid, request, headers, runtime);
    }

    public ListProductDeploymentsResponse listProductDeploymentsWithOptions(ListProductDeploymentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            query.put("environmentUID", request.environmentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductDeployments"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-instances/deployments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductDeploymentsResponse());
    }

    public ListProductDeploymentsResponse listProductDeployments(ListProductDeploymentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductDeploymentsWithOptions(request, headers, runtime);
    }

    public ListProductEnvironmentsResponse listProductEnvironmentsWithOptions(String uid, ListProductEnvironmentsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProductEnvironmentsShrinkRequest request = new ListProductEnvironmentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.options)) {
            request.optionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.options, "options", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.platforms)) {
            request.platformsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.platforms, "platforms", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compatibleProductVersionUID)) {
            query.put("compatibleProductVersionUID", request.compatibleProductVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("envType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionsShrink)) {
            query.put("options", request.optionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformsShrink)) {
            query.put("platforms", request.platformsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionSpecUID)) {
            query.put("productVersionSpecUID", request.productVersionSpecUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductEnvironments"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/hosting/products/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/environments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductEnvironmentsResponse());
    }

    public ListProductEnvironmentsResponse listProductEnvironments(String uid, ListProductEnvironmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductEnvironmentsWithOptions(uid, request, headers, runtime);
    }

    /**
      * @deprecated
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListProductFoundationReferencesResponse
     */
    // Deprecated
    public ListProductFoundationReferencesResponse listProductFoundationReferencesWithOptions(String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductFoundationReferences"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/foundation-references"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductFoundationReferencesResponse());
    }

    /**
      * @deprecated
      *
      * @return ListProductFoundationReferencesResponse
     */
    // Deprecated
    public ListProductFoundationReferencesResponse listProductFoundationReferences(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductFoundationReferencesWithOptions(uid, headers, runtime);
    }

    public ListProductInstanceConfigsResponse listProductInstanceConfigsWithOptions(ListProductInstanceConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentReleaseName)) {
            query.put("componentReleaseName", request.componentReleaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            query.put("environmentUID", request.environmentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fuzzy)) {
            query.put("fuzzy", request.fuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("paramType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameter)) {
            query.put("parameter", request.parameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductInstanceConfigs"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-instances/configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductInstanceConfigsResponse());
    }

    public ListProductInstanceConfigsResponse listProductInstanceConfigs(ListProductInstanceConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductInstanceConfigsWithOptions(request, headers, runtime);
    }

    public ListProductInstancesResponse listProductInstancesWithOptions(ListProductInstancesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProductInstancesShrinkRequest request = new ListProductInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.options)) {
            request.optionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.options, "options", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envUID)) {
            query.put("envUID", request.envUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionsShrink)) {
            query.put("options", request.optionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            query.put("productVersionUID", request.productVersionUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductInstances"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductInstancesResponse());
    }

    public ListProductInstancesResponse listProductInstances(ListProductInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductInstancesWithOptions(request, headers, runtime);
    }

    public ListProductVersionConfigsResponse listProductVersionConfigsWithOptions(String uid, ListProductVersionConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentReleaseName)) {
            query.put("componentReleaseName", request.componentReleaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            query.put("configType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fuzzy)) {
            query.put("fuzzy", request.fuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameter)) {
            query.put("parameter", request.parameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductVersionConfigs"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductVersionConfigsResponse());
    }

    public ListProductVersionConfigsResponse listProductVersionConfigs(String uid, ListProductVersionConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductVersionConfigsWithOptions(uid, request, headers, runtime);
    }

    public ListProductVersionsResponse listProductVersionsWithOptions(ListProductVersionsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProductVersionsShrinkRequest request = new ListProductVersionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.platforms)) {
            request.platformsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.platforms, "platforms", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.supportedFoundationTypes)) {
            request.supportedFoundationTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.supportedFoundationTypes, "supportedFoundationTypes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fuzzy)) {
            query.put("fuzzy", request.fuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformsShrink)) {
            query.put("platforms", request.platformsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productUID)) {
            query.put("productUID", request.productUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.released)) {
            query.put("released", request.released);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportedFoundationTypesShrink)) {
            query.put("supportedFoundationTypes", request.supportedFoundationTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductVersions"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductVersionsResponse());
    }

    public ListProductVersionsResponse listProductVersions(ListProductVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductVersionsWithOptions(request, headers, runtime);
    }

    public ListProductsResponse listProductsWithOptions(ListProductsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fuzzy)) {
            query.put("fuzzy", request.fuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProducts"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/products"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductsResponse());
    }

    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductsWithOptions(request, headers, runtime);
    }

    public ListWorkflowTaskLogsResponse listWorkflowTaskLogsWithOptions(String stepName, String taskName, ListWorkflowTaskLogsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWorkflowTaskLogsShrinkRequest request = new ListWorkflowTaskLogsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterValues)) {
            request.filterValuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterValues, "filterValues", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterValuesShrink)) {
            query.put("filterValues", request.filterValuesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("orderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowType)) {
            query.put("workflowType", request.workflowType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.xuid)) {
            query.put("xuid", request.xuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflowTaskLogs"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/workflows/steps/" + com.aliyun.openapiutil.Client.getEncodeParam(stepName) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskName) + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowTaskLogsResponse());
    }

    public ListWorkflowTaskLogsResponse listWorkflowTaskLogs(String stepName, String taskName, ListWorkflowTaskLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkflowTaskLogsWithOptions(stepName, taskName, request, headers, runtime);
    }

    public PutEnvironmentTunnelResponse putEnvironmentTunnelWithOptions(String uid, PutEnvironmentTunnelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tunnelConfig)) {
            body.put("tunnelConfig", request.tunnelConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tunnelType)) {
            body.put("tunnelType", request.tunnelType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutEnvironmentTunnel"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/tunnels"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutEnvironmentTunnelResponse());
    }

    public PutEnvironmentTunnelResponse putEnvironmentTunnel(String uid, PutEnvironmentTunnelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putEnvironmentTunnelWithOptions(uid, request, headers, runtime);
    }

    public PutProductInstanceConfigResponse putProductInstanceConfigWithOptions(PutProductInstanceConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentUID)) {
            body.put("componentUID", request.componentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentVersionUID)) {
            body.put("componentVersionUID", request.componentVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configUID)) {
            body.put("configUID", request.configUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentUID)) {
            body.put("environmentUID", request.environmentUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentComponentName)) {
            body.put("parentComponentName", request.parentComponentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentComponentVersionUID)) {
            body.put("parentComponentVersionUID", request.parentComponentVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
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

        if (!com.aliyun.teautil.Common.isUnset(request.valueType)) {
            body.put("valueType", request.valueType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutProductInstanceConfig"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-instances/configs"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutProductInstanceConfigResponse());
    }

    public PutProductInstanceConfigResponse putProductInstanceConfig(PutProductInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putProductInstanceConfigWithOptions(request, headers, runtime);
    }

    public SetEnvironmentFoundationReferenceResponse setEnvironmentFoundationReferenceWithOptions(String uid, String foundationReferenceUID, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetEnvironmentFoundationReference"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/foundation-references/" + com.aliyun.openapiutil.Client.getEncodeParam(foundationReferenceUID) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetEnvironmentFoundationReferenceResponse());
    }

    public SetEnvironmentFoundationReferenceResponse setEnvironmentFoundationReference(String uid, String foundationReferenceUID) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setEnvironmentFoundationReferenceWithOptions(uid, foundationReferenceUID, headers, runtime);
    }

    public UpdateDeliverableResponse updateDeliverableWithOptions(String uid, UpdateDeliverableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.foundation)) {
            body.put("foundation", request.foundation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.products)) {
            body.put("products", request.products);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeliverable"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/delivery/deliverables/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeliverableResponse());
    }

    public UpdateDeliverableResponse updateDeliverable(String uid, UpdateDeliverableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDeliverableWithOptions(uid, request, headers, runtime);
    }

    public UpdateDeliveryInstanceResponse updateDeliveryInstanceWithOptions(String uid, UpdateDeliveryInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliverableConfigUID)) {
            body.put("deliverableConfigUID", request.deliverableConfigUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliverableUID)) {
            body.put("deliverableUID", request.deliverableUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            body.put("desc", request.desc);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeliveryInstance"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/delivery/delivery-instances/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeliveryInstanceResponse());
    }

    public UpdateDeliveryInstanceResponse updateDeliveryInstance(String uid, UpdateDeliveryInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDeliveryInstanceWithOptions(uid, request, headers, runtime);
    }

    public UpdateEnvironmentResponse updateEnvironmentWithOptions(String uid, UpdateEnvironmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedConfigs)) {
            body.put("advancedConfigs", request.advancedConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorConfig)) {
            body.put("vendorConfig", request.vendorConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnvironment"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnvironmentResponse());
    }

    public UpdateEnvironmentResponse updateEnvironment(String uid, UpdateEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnvironmentWithOptions(uid, request, headers, runtime);
    }

    public UpdateEnvironmentNodeResponse updateEnvironmentNodeWithOptions(String uid, String nodeUID, UpdateEnvironmentNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationDisk)) {
            body.put("applicationDisk", request.applicationDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.etcdDisk)) {
            body.put("etcdDisk", request.etcdDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootPassword)) {
            body.put("rootPassword", request.rootPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taints)) {
            body.put("taints", request.taints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tridentSystemDisk)) {
            body.put("tridentSystemDisk", request.tridentSystemDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tridentSystemSizeDisk)) {
            body.put("tridentSystemSizeDisk", request.tridentSystemSizeDisk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnvironmentNode"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/nodes/" + com.aliyun.openapiutil.Client.getEncodeParam(nodeUID) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnvironmentNodeResponse());
    }

    public UpdateEnvironmentNodeResponse updateEnvironmentNode(String uid, String nodeUID, UpdateEnvironmentNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnvironmentNodeWithOptions(uid, nodeUID, request, headers, runtime);
    }

    public UpdateEnvironmentProductVersionResponse updateEnvironmentProductVersionWithOptions(String uid, UpdateEnvironmentProductVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.oldProductVersionSpecUID)) {
            body.put("oldProductVersionSpecUID", request.oldProductVersionSpecUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldProductVersionUID)) {
            body.put("oldProductVersionUID", request.oldProductVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionSpecUID)) {
            body.put("productVersionSpecUID", request.productVersionSpecUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionUID)) {
            body.put("productVersionUID", request.productVersionUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnvironmentProductVersion"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/product-versions"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnvironmentProductVersionResponse());
    }

    public UpdateEnvironmentProductVersionResponse updateEnvironmentProductVersion(String uid, UpdateEnvironmentProductVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnvironmentProductVersionWithOptions(uid, request, headers, runtime);
    }

    public UpdateFoundationComponentReferenceResponse updateFoundationComponentReferenceWithOptions(String uid, String componentReferenceUID, UpdateFoundationComponentReferenceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentOrchestrationValues)) {
            body.put("componentOrchestrationValues", request.componentOrchestrationValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFoundationComponentReference"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/foundation-references/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/components/" + com.aliyun.openapiutil.Client.getEncodeParam(componentReferenceUID) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFoundationComponentReferenceResponse());
    }

    public UpdateFoundationComponentReferenceResponse updateFoundationComponentReference(String uid, String componentReferenceUID, UpdateFoundationComponentReferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFoundationComponentReferenceWithOptions(uid, componentReferenceUID, request, headers, runtime);
    }

    public UpdateFoundationReferenceResponse updateFoundationReferenceWithOptions(String uid, UpdateFoundationReferenceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterConfig)) {
            body.put("clusterConfig", request.clusterConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFoundationReference"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/foundation-references/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFoundationReferenceResponse());
    }

    public UpdateFoundationReferenceResponse updateFoundationReference(String uid, UpdateFoundationReferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFoundationReferenceWithOptions(uid, request, headers, runtime);
    }

    public UpdateProductResponse updateProductWithOptions(String uid, UpdateProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categories)) {
            body.put("categories", request.categories);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProduct"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/products/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductResponse());
    }

    public UpdateProductResponse updateProduct(String uid, UpdateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductWithOptions(uid, request, headers, runtime);
    }

    public UpdateProductComponentVersionResponse updateProductComponentVersionWithOptions(String uid, String relationUID, UpdateProductComponentVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentOrchestrationValues)) {
            body.put("componentOrchestrationValues", request.componentOrchestrationValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentSpecificationUid)) {
            body.put("componentSpecificationUid", request.componentSpecificationUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentSpecificationValues)) {
            body.put("componentSpecificationValues", request.componentSpecificationValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newComponentVersionUID)) {
            body.put("newComponentVersionUID", request.newComponentVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            body.put("policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseName)) {
            body.put("releaseName", request.releaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unsetComponentVersionSpec)) {
            body.put("unsetComponentVersionSpec", request.unsetComponentVersionSpec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProductComponentVersion"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/relations/" + com.aliyun.openapiutil.Client.getEncodeParam(relationUID) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductComponentVersionResponse());
    }

    public UpdateProductComponentVersionResponse updateProductComponentVersion(String uid, String relationUID, UpdateProductComponentVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductComponentVersionWithOptions(uid, relationUID, request, headers, runtime);
    }

    /**
      * @deprecated
      *
      * @param request UpdateProductFoundationVersionRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateProductFoundationVersionResponse
     */
    // Deprecated
    public UpdateProductFoundationVersionResponse updateProductFoundationVersionWithOptions(String uid, UpdateProductFoundationVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.foundationVersionUID)) {
            body.put("foundationVersionUID", request.foundationVersionUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProductFoundationVersion"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/foundation"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductFoundationVersionResponse());
    }

    /**
      * @deprecated
      *
      * @param request UpdateProductFoundationVersionRequest
      * @return UpdateProductFoundationVersionResponse
     */
    // Deprecated
    public UpdateProductFoundationVersionResponse updateProductFoundationVersion(String uid, UpdateProductFoundationVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductFoundationVersionWithOptions(uid, request, headers, runtime);
    }

    public UpdateProductVersionResponse updateProductVersionWithOptions(String uid, UpdateProductVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            query.put("action", request.action);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.continuousIntegration)) {
            body.put("continuousIntegration", request.continuousIntegration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entry)) {
            body.put("entry", request.entry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProductVersion"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductVersionResponse());
    }

    public UpdateProductVersionResponse updateProductVersion(String uid, UpdateProductVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductVersionWithOptions(uid, request, headers, runtime);
    }

    public UpdateProductVersionConfigResponse updateProductVersionConfigWithOptions(String uid, String configUID, UpdateProductVersionConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentVersionUID)) {
            body.put("componentVersionUID", request.componentVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentComponentVersionUID)) {
            body.put("parentComponentVersionUID", request.parentComponentVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valueType)) {
            body.put("valueType", request.valueType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProductVersionConfig"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/product-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configUID) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductVersionConfigResponse());
    }

    public UpdateProductVersionConfigResponse updateProductVersionConfig(String uid, String configUID, UpdateProductVersionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductVersionConfigWithOptions(uid, configUID, request, headers, runtime);
    }

    public ValidateEnvironmentTunnelResponse validateEnvironmentTunnelWithOptions(String uid, ValidateEnvironmentTunnelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tunnelConfig)) {
            body.put("tunnelConfig", request.tunnelConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tunnelType)) {
            body.put("tunnelType", request.tunnelType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateEnvironmentTunnel"),
            new TeaPair("version", "2021-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/tunnels/validation"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateEnvironmentTunnelResponse());
    }

    public ValidateEnvironmentTunnelResponse validateEnvironmentTunnel(String uid, ValidateEnvironmentTunnelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateEnvironmentTunnelWithOptions(uid, request, headers, runtime);
    }
}
