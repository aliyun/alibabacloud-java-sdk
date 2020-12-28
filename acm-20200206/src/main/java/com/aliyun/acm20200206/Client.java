// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206;

import com.aliyun.tea.*;
import com.aliyun.acm20200206.models.*;
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
        this._endpoint = this.getEndpoint("acm", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BatchExportConfigurationsResponse batchExportConfigurations(BatchExportConfigurationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchExportConfigurationsWithOptions(request, headers, runtime);
    }

    public BatchExportConfigurationsResponse batchExportConfigurationsWithOptions(BatchExportConfigurationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("BatchExportConfigurations", "2020-02-06", "HTTPS", "GET", "AK", "/diamond-ops/pop/batch/export", "json", req, runtime), new BatchExportConfigurationsResponse());
    }

    public BatchImportConfigurationsResponse batchImportConfigurations(BatchImportConfigurationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchImportConfigurationsWithOptions(request, headers, runtime);
    }

    public BatchImportConfigurationsResponse batchImportConfigurationsWithOptions(BatchImportConfigurationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            body.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            body.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("BatchImportConfigurations", "2020-02-06", "HTTPS", "POST", "AK", "/diamond-ops/pop/batch/import", "json", req, runtime), new BatchImportConfigurationsResponse());
    }

    public CheckConfigurationCloneResponse checkConfigurationClone(CheckConfigurationCloneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkConfigurationCloneWithOptions(request, headers, runtime);
    }

    public CheckConfigurationCloneResponse checkConfigurationCloneWithOptions(CheckConfigurationCloneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            body.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceFrom)) {
            body.put("NamespaceFrom", request.namespaceFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceTo)) {
            body.put("NamespaceTo", request.namespaceTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CheckConfigurationClone", "2020-02-06", "HTTPS", "POST", "AK", "/diamond-ops/pop/batch/checkForClone", "json", req, runtime), new CheckConfigurationCloneResponse());
    }

    public CheckConfigurationExportResponse checkConfigurationExport(CheckConfigurationExportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkConfigurationExportWithOptions(request, headers, runtime);
    }

    public CheckConfigurationExportResponse checkConfigurationExportWithOptions(CheckConfigurationExportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            body.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CheckConfigurationExport", "2020-02-06", "HTTPS", "POST", "AK", "/diamond-ops/pop/batch/checkForExport", "json", req, runtime), new CheckConfigurationExportResponse());
    }

    public CloneConfigurationResponse cloneConfiguration(CloneConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneConfigurationWithOptions(request, headers, runtime);
    }

    public CloneConfigurationResponse cloneConfigurationWithOptions(CloneConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            body.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceFrom)) {
            body.put("NamespaceFrom", request.namespaceFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceTo)) {
            body.put("NamespaceTo", request.namespaceTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CloneConfiguration", "2020-02-06", "HTTPS", "POST", "AK", "/diamond-ops/pop/batch/clone", "json", req, runtime), new CloneConfigurationResponse());
    }

    public CreateConfigurationResponse createConfiguration(CreateConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigurationWithOptions(request, headers, runtime);
    }

    public CreateConfigurationResponse createConfigurationWithOptions(CreateConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            body.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            body.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            body.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            body.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreateConfiguration", "2020-02-06", "HTTPS", "POST", "AK", "/diamond-ops/pop/configuration", "json", req, runtime), new CreateConfigurationResponse());
    }

    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNamespaceWithOptions(request, headers, runtime);
    }

    public CreateNamespaceResponse createNamespaceWithOptions(CreateNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreateNamespace", "2020-02-06", "HTTPS", "POST", "AK", "/diamond-ops/pop/namespace", "json", req, runtime), new CreateNamespaceResponse());
    }

    public DeleteConfigurationResponse deleteConfiguration(DeleteConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigurationWithOptions(request, headers, runtime);
    }

    public DeleteConfigurationResponse deleteConfigurationWithOptions(DeleteConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteConfiguration", "2020-02-06", "HTTPS", "DELETE", "AK", "/diamond-ops/pop/configuration", "json", req, runtime), new DeleteConfigurationResponse());
    }

    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteNamespaceWithOptions(request, headers, runtime);
    }

    public DeleteNamespaceResponse deleteNamespaceWithOptions(DeleteNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteNamespace", "2020-02-06", "HTTPS", "DELETE", "AK", "/diamond-ops/pop/namespace", "json", req, runtime), new DeleteNamespaceResponse());
    }

    public DeployConfigurationResponse deployConfiguration(DeployConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployConfigurationWithOptions(request, headers, runtime);
    }

    public DeployConfigurationResponse deployConfigurationWithOptions(DeployConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            body.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            body.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            body.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            body.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.betaIps)) {
            body.put("BetaIps", request.betaIps);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("DeployConfiguration", "2020-02-06", "HTTPS", "PUT", "AK", "/diamond-ops/pop/configuration", "json", req, runtime), new DeployConfigurationResponse());
    }

    public DescribeConfigurationResponse describeConfiguration(DescribeConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConfigurationWithOptions(request, headers, runtime);
    }

    public DescribeConfigurationResponse describeConfigurationWithOptions(DescribeConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeConfiguration", "2020-02-06", "HTTPS", "GET", "AK", "/diamond-ops/pop/configuration", "json", req, runtime), new DescribeConfigurationResponse());
    }

    public DescribeImportFileUrlResponse describeImportFileUrl(DescribeImportFileUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeImportFileUrlWithOptions(request, headers, runtime);
    }

    public DescribeImportFileUrlResponse describeImportFileUrlWithOptions(DescribeImportFileUrlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("ContentType", request.contentType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeImportFileUrl", "2020-02-06", "HTTPS", "GET", "AK", "/diamond-ops/pop/batch/importFileUrl", "json", req, runtime), new DescribeImportFileUrlResponse());
    }

    public DescribeNamespaceResponse describeNamespace(DescribeNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNamespaceWithOptions(request, headers, runtime);
    }

    public DescribeNamespaceResponse describeNamespaceWithOptions(DescribeNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeNamespace", "2020-02-06", "HTTPS", "GET", "AK", "/diamond-ops/pop/namespace", "json", req, runtime), new DescribeNamespaceResponse());
    }

    public DescribeNamespacesResponse describeNamespaces() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNamespacesWithOptions(headers, runtime);
    }

    public DescribeNamespacesResponse describeNamespacesWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeNamespaces", "2020-02-06", "HTTPS", "GET", "AK", "/diamond-ops/pop/namespace/list", "json", req, runtime), new DescribeNamespacesResponse());
    }

    public DescribeNamespacesWithCreateResponse describeNamespacesWithCreate() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNamespacesWithCreateWithOptions(headers, runtime);
    }

    public DescribeNamespacesWithCreateResponse describeNamespacesWithCreateWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeNamespacesWithCreate", "2020-02-06", "HTTPS", "GET", "AK", "/diamond-ops/pop/namespace/listWithCreate", "json", req, runtime), new DescribeNamespacesWithCreateResponse());
    }

    public DescribeTraceByConfigurationResponse describeTraceByConfiguration(DescribeTraceByConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTraceByConfigurationWithOptions(request, headers, runtime);
    }

    public DescribeTraceByConfigurationResponse describeTraceByConfigurationWithOptions(DescribeTraceByConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeTraceByConfiguration", "2020-02-06", "HTTPS", "GET", "AK", "/diamond-ops/pop/trace/getByConfiguration", "json", req, runtime), new DescribeTraceByConfigurationResponse());
    }

    public UpdateNamespaceResponse updateNamespace(UpdateNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNamespaceWithOptions(request, headers, runtime);
    }

    public UpdateNamespaceResponse updateNamespaceWithOptions(UpdateNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            body.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            body.put("NamespaceName", request.namespaceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpdateNamespace", "2020-02-06", "HTTPS", "PUT", "AK", "/diamond-ops/pop/namespace", "json", req, runtime), new UpdateNamespaceResponse());
    }
}
