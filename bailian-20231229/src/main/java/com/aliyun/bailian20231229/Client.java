// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229;

import com.aliyun.tea.*;
import com.aliyun.bailian20231229.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("bailian", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>将临时上传的文档导入百炼数据中心，导入成功之后会自动触发文档解析。</p>
     * 
     * @param request AddFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFileResponse
     */
    public AddFileResponse addFileWithOptions(String WorkspaceId, AddFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leaseId)) {
            body.put("LeaseId", request.leaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parser)) {
            body.put("Parser", request.parser);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFile"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/file"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将临时上传的文档导入百炼数据中心，导入成功之后会自动触发文档解析。</p>
     * 
     * @param request AddFileRequest
     * @return AddFileResponse
     */
    public AddFileResponse addFile(String WorkspaceId, AddFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addFileWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>请求文档上传租约，进行文档上传。</p>
     * 
     * @param request ApplyFileUploadLeaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyFileUploadLeaseResponse
     */
    public ApplyFileUploadLeaseResponse applyFileUploadLeaseWithOptions(String CategoryId, String WorkspaceId, ApplyFileUploadLeaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5)) {
            body.put("Md5", request.md5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sizeInBytes)) {
            body.put("SizeInBytes", request.sizeInBytes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyFileUploadLease"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/category/" + com.aliyun.openapiutil.Client.getEncodeParam(CategoryId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyFileUploadLeaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>请求文档上传租约，进行文档上传。</p>
     * 
     * @param request ApplyFileUploadLeaseRequest
     * @return ApplyFileUploadLeaseResponse
     */
    public ApplyFileUploadLeaseResponse applyFileUploadLease(String CategoryId, String WorkspaceId, ApplyFileUploadLeaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyFileUploadLeaseWithOptions(CategoryId, WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档基本信息，包括文档名称、类型、状态等。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFileResponse
     */
    public DescribeFileResponse describeFileWithOptions(String WorkspaceId, String FileId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFile"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/file/" + com.aliyun.openapiutil.Client.getEncodeParam(FileId) + "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档基本信息，包括文档名称、类型、状态等。</p>
     * @return DescribeFileResponse
     */
    public DescribeFileResponse describeFile(String WorkspaceId, String FileId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeFileWithOptions(WorkspaceId, FileId, headers, runtime);
    }
}
