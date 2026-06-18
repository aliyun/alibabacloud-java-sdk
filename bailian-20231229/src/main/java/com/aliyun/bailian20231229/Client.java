// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229;

import com.aliyun.tea.*;
import com.aliyun.bailian20231229.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "bailian.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "bailian.ap-southeast-1.aliyuncs.com")
        );
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
     * <b>description</b> :
     * <ul>
     * <li>You cannot use an API to add data tables. To add data tables, go to the <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> page in the console.</li>
     * <li>A RAM user must obtain the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. The <code>AliyunBailianDataFullAccess</code> permission, which includes the <code>sfm:AddCategory</code> permission, is required. An Alibaba Cloud account can call this operation directly without requiring authorization. To call this operation, use the latest version of the <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>This operation is not idempotent.
     * <strong>Rate limiting:</strong> Frequent calls to this operation are subject to rate limiting. Do not exceed a frequency of 5 calls per second. If rate limiting is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a category in a specified workspace to classify and manage files. Each workspace supports a maximum of 500 categories.</p>
     * 
     * @param request AddCategoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCategoryResponse
     */
    public AddCategoryResponse addCategoryWithOptions(String WorkspaceId, AddCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryName)) {
            body.put("CategoryName", request.categoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryType)) {
            body.put("CategoryType", request.categoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            body.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCategoryId)) {
            body.put("ParentCategoryId", request.parentCategoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCategory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/category/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You cannot use an API to add data tables. To add data tables, go to the <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> page in the console.</li>
     * <li>A RAM user must obtain the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. The <code>AliyunBailianDataFullAccess</code> permission, which includes the <code>sfm:AddCategory</code> permission, is required. An Alibaba Cloud account can call this operation directly without requiring authorization. To call this operation, use the latest version of the <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>This operation is not idempotent.
     * <strong>Rate limiting:</strong> Frequent calls to this operation are subject to rate limiting. Do not exceed a frequency of 5 calls per second. If rate limiting is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a category in a specified workspace to classify and manage files. Each workspace supports a maximum of 500 categories.</p>
     * 
     * @param request AddCategoryRequest
     * @return AddCategoryResponse
     */
    public AddCategoryResponse addCategory(String WorkspaceId, AddCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addCategoryWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To call this operation, a RAM user (sub-account) must first have the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio and be a member of a <a href="https://help.aliyun.com/document_detail/2851098.html">business space</a>. This requires the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:AddCategory permission. A primary account can call this operation directly without authorization. We recommend using the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Throttling:</strong>
     * Do not call this operation more than 5 times per second. If a request is throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a connector. This API currently supports only file connectors.</p>
     * 
     * @param tmpReq AddConnectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddConnectorResponse
     */
    public AddConnectorResponse addConnectorWithOptions(String WorkspaceId, AddConnectorRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddConnectorShrinkRequest request = new AddConnectorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileConnectorConfig)) {
            request.fileConnectorConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileConnectorConfig, "FileConnectorConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectorName)) {
            body.put("ConnectorName", request.connectorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorType)) {
            body.put("ConnectorType", request.connectorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileConnectorConfigShrink)) {
            body.put("FileConnectorConfig", request.fileConnectorConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddConnector"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/connector"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddConnectorResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To call this operation, a RAM user (sub-account) must first have the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio and be a member of a <a href="https://help.aliyun.com/document_detail/2851098.html">business space</a>. This requires the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:AddCategory permission. A primary account can call this operation directly without authorization. We recommend using the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Throttling:</strong>
     * Do not call this operation more than 5 times per second. If a request is throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a connector. This API currently supports only file connectors.</p>
     * 
     * @param request AddConnectorRequest
     * @return AddConnectorResponse
     */
    public AddConnectorResponse addConnector(String WorkspaceId, AddConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addConnectorWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To call this API, a RAM user (sub-account) must have the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and be <a href="https://help.aliyun.com/document_detail/2851098.html">added to a workspace</a>. The required policy is <code>AliyunBailianDataFullAccess</code>, which includes the <code>sfm:AddFile</code> permission. An Alibaba Cloud account (primary account) can call this API directly without authorization. We recommend using the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this API.</li>
     * <li>This API is not idempotent.
     * <strong>Throttling:</strong> Frequent calls to this API are subject to throttling. Do not exceed a rate of 10 calls per second. If your request is throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports a file from the temporary storage space of Alibaba Cloud Model Studio into a data connection (formerly known as application data).</p>
     * 
     * @param tmpReq AddFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFileResponse
     */
    public AddFileResponse addFileWithOptions(String WorkspaceId, AddFileRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddFileShrinkRequest request = new AddFileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parserConfig)) {
            request.parserConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parserConfig, "ParserConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryType)) {
            body.put("CategoryType", request.categoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leaseId)) {
            body.put("LeaseId", request.leaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalFileUrl)) {
            body.put("OriginalFileUrl", request.originalFileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parser)) {
            body.put("Parser", request.parser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parserConfigShrink)) {
            body.put("ParserConfig", request.parserConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
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
     * <b>description</b> :
     * <ul>
     * <li>To call this API, a RAM user (sub-account) must have the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and be <a href="https://help.aliyun.com/document_detail/2851098.html">added to a workspace</a>. The required policy is <code>AliyunBailianDataFullAccess</code>, which includes the <code>sfm:AddFile</code> permission. An Alibaba Cloud account (primary account) can call this API directly without authorization. We recommend using the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this API.</li>
     * <li>This API is not idempotent.
     * <strong>Throttling:</strong> Frequent calls to this API are subject to throttling. Do not exceed a rate of 10 calls per second. If your request is throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports a file from the temporary storage space of Alibaba Cloud Model Studio into a data connection (formerly known as application data).</p>
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
     * <b>description</b> :
     * <ul>
     * <li><p>Please ensure that the OSS Bucket and Alibaba Cloud Model Studio belong to the same Alibaba Cloud account (main account) and that authorization has been completed according to the <a href="https://help.aliyun.com/document_detail/2782155.html">Configuration instructions for importing data from OSS</a>.</p>
     * <ul>
     * <li>Supported Bucket storage types do not include Archive, Cold Archive, or Deep Cold Archive. Buckets with content encryption are supported. Public read/write, public read, and private Buckets are supported.</li>
     * <li>If you want to use a Bucket with <a href="https://help.aliyun.com/document_detail/2636937.html">Referer hotlink protection</a> enabled, refer to <a href="https://help.aliyun.com/document_detail/2636937.html">Allow access only from trusted websites</a> to add the domain <code>*.console.aliyun.com</code> to the Referer allowlist.</li>
     * </ul>
     * </li>
     * <li><p>A RAM user (sub-account) must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:AddFilesFromAuthorizedOss permission point) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. The Alibaba Cloud account (main account) can call this directly without authorization. We recommend that you call this operation through the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</p>
     * </li>
     * <li><p>This operation is not idempotent.
     * <strong>Throttling description:</strong>
     * Frequent calls to this operation will be throttled. The frequency should not exceed 5 calls per second. If throttled, please try again later.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports files from an authorized OSS Bucket into Alibaba Cloud Model Studio (Bailian) application data.</p>
     * 
     * @param tmpReq AddFilesFromAuthorizedOssRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFilesFromAuthorizedOssResponse
     */
    public AddFilesFromAuthorizedOssResponse addFilesFromAuthorizedOssWithOptions(String WorkspaceId, AddFilesFromAuthorizedOssRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddFilesFromAuthorizedOssShrinkRequest request = new AddFilesFromAuthorizedOssShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileDetails)) {
            request.fileDetailsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileDetails, "FileDetails", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryType)) {
            body.put("CategoryType", request.categoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileDetailsShrink)) {
            body.put("FileDetails", request.fileDetailsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            body.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossRegionId)) {
            body.put("OssRegionId", request.ossRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overWriteFileByOssKey)) {
            body.put("OverWriteFileByOssKey", request.overWriteFileByOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFilesFromAuthorizedOss"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/file/fromoss"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFilesFromAuthorizedOssResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>Please ensure that the OSS Bucket and Alibaba Cloud Model Studio belong to the same Alibaba Cloud account (main account) and that authorization has been completed according to the <a href="https://help.aliyun.com/document_detail/2782155.html">Configuration instructions for importing data from OSS</a>.</p>
     * <ul>
     * <li>Supported Bucket storage types do not include Archive, Cold Archive, or Deep Cold Archive. Buckets with content encryption are supported. Public read/write, public read, and private Buckets are supported.</li>
     * <li>If you want to use a Bucket with <a href="https://help.aliyun.com/document_detail/2636937.html">Referer hotlink protection</a> enabled, refer to <a href="https://help.aliyun.com/document_detail/2636937.html">Allow access only from trusted websites</a> to add the domain <code>*.console.aliyun.com</code> to the Referer allowlist.</li>
     * </ul>
     * </li>
     * <li><p>A RAM user (sub-account) must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:AddFilesFromAuthorizedOss permission point) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. The Alibaba Cloud account (main account) can call this directly without authorization. We recommend that you call this operation through the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</p>
     * </li>
     * <li><p>This operation is not idempotent.
     * <strong>Throttling description:</strong>
     * Frequent calls to this operation will be throttled. The frequency should not exceed 5 calls per second. If throttled, please try again later.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports files from an authorized OSS Bucket into Alibaba Cloud Model Studio (Bailian) application data.</p>
     * 
     * @param request AddFilesFromAuthorizedOssRequest
     * @return AddFilesFromAuthorizedOssResponse
     */
    public AddFilesFromAuthorizedOssResponse addFilesFromAuthorizedOss(String WorkspaceId, AddFilesFromAuthorizedOssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addFilesFromAuthorizedOssWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:AddTable permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a table to a tabular data connector.</p>
     * 
     * @param tmpReq AddTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTableResponse
     */
    public AddTableResponse addTableWithOptions(String WorkspaceId, AddTableRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddTableShrinkRequest request = new AddTableShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableColumns)) {
            request.tableColumnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableColumns, "TableColumns", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            body.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableColumnsShrink)) {
            body.put("TableColumns", request.tableColumnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableDesc)) {
            body.put("TableDesc", request.tableDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTable"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/table"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTableResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:AddTable permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a table to a tabular data connector.</p>
     * 
     * @param request AddTableRequest
     * @return AddTableResponse
     */
    public AddTableResponse addTable(String WorkspaceId, AddTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addTableWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>RAM users (sub-accounts) must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ApplyFileUploadLease permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this API. Alibaba Cloud accounts (primary accounts) can directly call this API without authorization. We recommend that you call this API by using the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>This API is not idempotent.
     * <strong>Throttling:</strong>
     * This API is subject to throttling if called too frequently. The frequency must not exceed 10 calls per second. If throttled, please retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Request an upload lease for uploading knowledge base files or files for agent application conversational interactions.</p>
     * 
     * @param request ApplyFileUploadLeaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyFileUploadLeaseResponse
     */
    public ApplyFileUploadLeaseResponse applyFileUploadLeaseWithOptions(String CategoryId, String WorkspaceId, ApplyFileUploadLeaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryType)) {
            body.put("CategoryType", request.categoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5)) {
            body.put("Md5", request.md5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sizeInBytes)) {
            body.put("SizeInBytes", request.sizeInBytes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useInternalEndpoint)) {
            body.put("UseInternalEndpoint", request.useInternalEndpoint);
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
     * <b>description</b> :
     * <ul>
     * <li>RAM users (sub-accounts) must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ApplyFileUploadLease permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this API. Alibaba Cloud accounts (primary accounts) can directly call this API without authorization. We recommend that you call this API by using the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>This API is not idempotent.
     * <strong>Throttling:</strong>
     * This API is subject to throttling if called too frequently. The frequency must not exceed 10 calls per second. If throttled, please retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Request an upload lease for uploading knowledge base files or files for agent application conversational interactions.</p>
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
     * <b>description</b> :
     * <p>1\. This interface is intended for pro-code deployment only; other scenarios are currently not supported. 2. After obtaining the temporary file upload lease via this interface, upload the file manually.</p>
     * 
     * <b>summary</b> : 
     * <p>This interface is intended for pro-code deployment only; other scenarios are currently not supported. It is used to apply for a temporary file upload lease. After obtaining the lease, you must upload the file manually.</p>
     * 
     * @param request ApplyTempStorageLeaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyTempStorageLeaseResponse
     */
    public ApplyTempStorageLeaseResponse applyTempStorageLeaseWithOptions(String WorkspaceId, ApplyTempStorageLeaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sizeInBytes)) {
            body.put("SizeInBytes", request.sizeInBytes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyTempStorageLease"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyTempStorageLeaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>1\. This interface is intended for pro-code deployment only; other scenarios are currently not supported. 2. After obtaining the temporary file upload lease via this interface, upload the file manually.</p>
     * 
     * <b>summary</b> : 
     * <p>This interface is intended for pro-code deployment only; other scenarios are currently not supported. It is used to apply for a temporary file upload lease. After obtaining the lease, you must upload the file manually.</p>
     * 
     * @param request ApplyTempStorageLeaseRequest
     * @return ApplyTempStorageLeaseResponse
     */
    public ApplyTempStorageLeaseResponse applyTempStorageLease(String WorkspaceId, ApplyTempStorageLeaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyTempStorageLeaseWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation updates document tags in a data connection in batches.</p>
     * 
     * @param tmpReq BatchUpdateFileTagRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdateFileTagResponse
     */
    public BatchUpdateFileTagResponse batchUpdateFileTagWithOptions(String WorkspaceId, BatchUpdateFileTagRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUpdateFileTagShrinkRequest request = new BatchUpdateFileTagShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileInfos)) {
            request.fileInfosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileInfos, "FileInfos", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileInfosShrink)) {
            body.put("FileInfos", request.fileInfosShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateMode)) {
            body.put("UpdateMode", request.updateMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateFileTag"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/batchupdatetag"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateFileTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This operation updates document tags in a data connection in batches.</p>
     * 
     * @param request BatchUpdateFileTagRequest
     * @return BatchUpdateFileTagResponse
     */
    public BatchUpdateFileTagResponse batchUpdateFileTag(String WorkspaceId, BatchUpdateFileTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchUpdateFileTagWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A RAM user (sub-account) must first obtain the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (the <code>AliyunBailianDataFullAccess</code> policy, which includes the <code>sfm:ChangeParseSetting</code> permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. An Alibaba Cloud account (primary account) can call this operation directly without authorization. We recommend using the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Throttling</strong>
     * The system throttles frequent calls to this operation. Do not exceed a frequency of 10 requests per second. If your request is throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures the parsing method for a specific file type. For example, you can specify LLM-based document parsing for .pdf files and the Qwen VL Parser for .jpg files.</p>
     * 
     * @param tmpReq ChangeParseSettingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeParseSettingResponse
     */
    public ChangeParseSettingResponse changeParseSettingWithOptions(String WorkspaceId, ChangeParseSettingRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ChangeParseSettingShrinkRequest request = new ChangeParseSettingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parserConfig)) {
            request.parserConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parserConfig, "ParserConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parser)) {
            body.put("Parser", request.parser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parserConfigShrink)) {
            body.put("ParserConfig", request.parserConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeParseSetting"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/parser/settings"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeParseSettingResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A RAM user (sub-account) must first obtain the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (the <code>AliyunBailianDataFullAccess</code> policy, which includes the <code>sfm:ChangeParseSetting</code> permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. An Alibaba Cloud account (primary account) can call this operation directly without authorization. We recommend using the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Throttling</strong>
     * The system throttles frequent calls to this operation. Do not exceed a frequency of 10 requests per second. If your request is throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures the parsing method for a specific file type. For example, you can specify LLM-based document parsing for .pdf files and the Qwen VL Parser for .jpg files.</p>
     * 
     * @param request ChangeParseSettingRequest
     * @return ChangeParseSettingResponse
     */
    public ChangeParseSettingResponse changeParseSetting(String WorkspaceId, ChangeParseSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeParseSettingWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建并发布智能体应用</p>
     * 
     * @param tmpReq CreateAndPulishAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAndPulishAgentResponse
     */
    public CreateAndPulishAgentResponse createAndPulishAgentWithOptions(String workspaceId, CreateAndPulishAgentRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAndPulishAgentShrinkRequest request = new CreateAndPulishAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.applicationConfig)) {
            request.applicationConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.applicationConfig, "applicationConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sampleLibrary)) {
            request.sampleLibraryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sampleLibrary, "sampleLibrary", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationConfigShrink)) {
            body.put("applicationConfig", request.applicationConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instructions)) {
            body.put("instructions", request.instructions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleLibraryShrink)) {
            body.put("sampleLibrary", request.sampleLibraryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAndPulishAgent"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/application/agents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAndPulishAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建并发布智能体应用</p>
     * 
     * @param request CreateAndPulishAgentRequest
     * @return CreateAndPulishAgentResponse
     */
    public CreateAndPulishAgentResponse createAndPulishAgent(String workspaceId, CreateAndPulishAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAndPulishAgentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Permissions</strong>:<ul>
     * <li><strong>RAM user</strong>: A RAM user must obtain the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. You can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the \<code>sfm:CreateIndex\\</code> permission required for this operation.</li>
     * <li><strong>Alibaba Cloud account</strong>: By default, Alibaba Cloud accounts have the required permissions and can call this operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>How to call</strong>: Use the latest version of the &lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation. The SDK handles the complex signature calculation logic to simplify the process.</li>
     * <li><strong>What to do next</strong>: This operation only initializes a knowledge base creation job. After calling this operation, you must call the <strong>SubmitIndexJob</strong> operation to complete the creation. Otherwise, an empty knowledge base is created. For related code examples, see <a href="https://help.aliyun.com/document_detail/2852772.html">Knowledge base API guide</a>.</li>
     * <li><strong>Idempotence</strong>: This operation is not idempotent. Repeated calls may create multiple knowledge bases with the same name. To ensure idempotence, query for the knowledge base before you create it.
     * <strong>Rate limiting:</strong>
     * Frequent calls to this operation are subject to rate limiting. Do not exceed a frequency of 10 calls per second. If you encounter rate limiting, retry the call later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Use this API to create two types of knowledge bases: unstructured knowledge bases for documents, audio, or video, and structured knowledge bases for data queries or image Q&amp;A.</p>
     * 
     * @param tmpReq CreateIndexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIndexResponse
     */
    public CreateIndexResponse createIndexWithOptions(String WorkspaceId, CreateIndexRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateIndexShrinkRequest request = new CreateIndexShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.categoryIds)) {
            request.categoryIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.categoryIds, "CategoryIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columns)) {
            request.columnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columns, "Columns", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.documentIds)) {
            request.documentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.documentIds, "DocumentIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableIds)) {
            request.tableIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableIds, "TableIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.metaExtractColumns)) {
            request.metaExtractColumnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.metaExtractColumns, "metaExtractColumns", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryIdsShrink)) {
            query.put("CategoryIds", request.categoryIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chunkSize)) {
            query.put("ChunkSize", request.chunkSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnsShrink)) {
            query.put("Columns", request.columnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createIndexType)) {
            query.put("CreateIndexType", request.createIndexType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentIdsShrink)) {
            query.put("DocumentIds", request.documentIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.embeddingModelName)) {
            query.put("EmbeddingModelName", request.embeddingModelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRewrite)) {
            query.put("EnableRewrite", request.enableRewrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overlapSize)) {
            query.put("OverlapSize", request.overlapSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankInstruct)) {
            query.put("RerankInstruct", request.rerankInstruct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankMinScore)) {
            query.put("RerankMinScore", request.rerankMinScore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankMode)) {
            query.put("RerankMode", request.rerankMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankModelName)) {
            query.put("RerankModelName", request.rerankModelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.separator)) {
            query.put("Separator", request.separator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinkInstanceId)) {
            query.put("SinkInstanceId", request.sinkInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinkRegion)) {
            query.put("SinkRegion", request.sinkRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinkType)) {
            query.put("SinkType", request.sinkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structureType)) {
            query.put("StructureType", request.structureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableIdsShrink)) {
            query.put("TableIds", request.tableIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("channelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chunkMode)) {
            query.put("chunkMode", request.chunkMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectId)) {
            query.put("connectId", request.connectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceCode)) {
            query.put("datasourceCode", request.datasourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableHeaders)) {
            query.put("enableHeaders", request.enableHeaders);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeScene)) {
            query.put("knowledgeScene", request.knowledgeScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeType)) {
            query.put("knowledgeType", request.knowledgeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaExtractColumnsShrink)) {
            query.put("metaExtractColumns", request.metaExtractColumnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineCommercialCu)) {
            query.put("pipelineCommercialCu", request.pipelineCommercialCu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineCommercialType)) {
            query.put("pipelineCommercialType", request.pipelineCommercialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineRetrieveRateLimitStrategy)) {
            query.put("pipelineRetrieveRateLimitStrategy", request.pipelineRetrieveRateLimitStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            query.put("table", request.table);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIndex"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIndexResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Permissions</strong>:<ul>
     * <li><strong>RAM user</strong>: A RAM user must obtain the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. You can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the \<code>sfm:CreateIndex\\</code> permission required for this operation.</li>
     * <li><strong>Alibaba Cloud account</strong>: By default, Alibaba Cloud accounts have the required permissions and can call this operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>How to call</strong>: Use the latest version of the &lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation. The SDK handles the complex signature calculation logic to simplify the process.</li>
     * <li><strong>What to do next</strong>: This operation only initializes a knowledge base creation job. After calling this operation, you must call the <strong>SubmitIndexJob</strong> operation to complete the creation. Otherwise, an empty knowledge base is created. For related code examples, see <a href="https://help.aliyun.com/document_detail/2852772.html">Knowledge base API guide</a>.</li>
     * <li><strong>Idempotence</strong>: This operation is not idempotent. Repeated calls may create multiple knowledge bases with the same name. To ensure idempotence, query for the knowledge base before you create it.
     * <strong>Rate limiting:</strong>
     * Frequent calls to this operation are subject to rate limiting. Do not exceed a frequency of 10 calls per second. If you encounter rate limiting, retry the call later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Use this API to create two types of knowledge bases: unstructured knowledge bases for documents, audio, or video, and structured knowledge bases for data queries or image Q&amp;A.</p>
     * 
     * @param request CreateIndexRequest
     * @return CreateIndexResponse
     */
    public CreateIndexResponse createIndex(String WorkspaceId, CreateIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIndexWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can store specific information from conversations (memory nodes. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/long-term-memory">Long-term memory</a>) in a long-term memory. Agent applications can then reference this information in subsequent conversations. This is not an automatic creation procedure. You must first invoke the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-creatememory">CreateMemory</a> operation to create a long-term memory and obtain the <code>memoryId</code>. Then pass the <code>memoryId</code> when you <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/application-calling">invoke the agent application through the API</a>.<blockquote>
     * <p>Long-term memory does not support storing and managing user profiles through the API. Perform related operations in the console. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/long-term-memory#578ebae524m6l">Long-term memory</a>.</p>
     * </blockquote>
     * </li>
     * <li>If you pass a <code>memoryId</code>, the system uses automatic creation to generate memory nodes (MemoryNode) under the specified long-term memory based on conversation records. You can also invoke the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-creatememorynode">CreateMemoryNode</a> operation to manually create memory nodes.</li>
     * <li>This operation does not support idempotence.
     * <strong>Throttling:</strong> Ensure that the interval between two consecutive requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a long-term memory.</p>
     * 
     * @param request CreateMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMemoryResponse
     */
    public CreateMemoryResponse createMemoryWithOptions(String workspaceId, CreateMemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMemory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMemoryResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can store specific information from conversations (memory nodes. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/long-term-memory">Long-term memory</a>) in a long-term memory. Agent applications can then reference this information in subsequent conversations. This is not an automatic creation procedure. You must first invoke the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-creatememory">CreateMemory</a> operation to create a long-term memory and obtain the <code>memoryId</code>. Then pass the <code>memoryId</code> when you <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/application-calling">invoke the agent application through the API</a>.<blockquote>
     * <p>Long-term memory does not support storing and managing user profiles through the API. Perform related operations in the console. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/long-term-memory#578ebae524m6l">Long-term memory</a>.</p>
     * </blockquote>
     * </li>
     * <li>If you pass a <code>memoryId</code>, the system uses automatic creation to generate memory nodes (MemoryNode) under the specified long-term memory based on conversation records. You can also invoke the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-creatememorynode">CreateMemoryNode</a> operation to manually create memory nodes.</li>
     * <li>This operation does not support idempotence.
     * <strong>Throttling:</strong> Ensure that the interval between two consecutive requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a long-term memory.</p>
     * 
     * @param request CreateMemoryRequest
     * @return CreateMemoryResponse
     */
    public CreateMemoryResponse createMemory(String workspaceId, CreateMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMemoryWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a memory node.</p>
     * 
     * @param request CreateMemoryNodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMemoryNodeResponse
     */
    public CreateMemoryNodeResponse createMemoryNodeWithOptions(String workspaceId, String memoryId, CreateMemoryNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMemoryNode"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + "/memoryNodes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMemoryNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a memory node.</p>
     * 
     * @param request CreateMemoryNodeRequest
     * @return CreateMemoryNodeResponse
     */
    public CreateMemoryNodeResponse createMemoryNode(String workspaceId, String memoryId, CreateMemoryNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMemoryNodeWithOptions(workspaceId, memoryId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API does not currently support the creation of text-to-image prompt templates.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a prompt template.</p>
     * 
     * @param request CreatePromptTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePromptTemplateResponse
     */
    public CreatePromptTemplateResponse createPromptTemplateWithOptions(String workspaceId, CreatePromptTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePromptTemplate"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/promptTemplates"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePromptTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API does not currently support the creation of text-to-image prompt templates.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a prompt template.</p>
     * 
     * @param request CreatePromptTemplateRequest
     * @return CreatePromptTemplateResponse
     */
    public CreatePromptTemplateResponse createPromptTemplate(String workspaceId, CreatePromptTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPromptTemplateWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除智能体</p>
     * 
     * @param request DeleteAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgentWithOptions(String workspaceId, String appCode, DeleteAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgent"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/application/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(appCode) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除智能体</p>
     * 
     * @param request DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgent(String workspaceId, String appCode, DeleteAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentWithOptions(workspaceId, appCode, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the sfm:DeleteCategory permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. Alibaba Cloud accounts can call this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limiting:</strong>
     * This operation is subject to rate limiting. Do not exceed 5 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Permanently deletes a specified category.</p>
     * 
     * @param request DeleteCategoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategoryWithOptions(String CategoryId, String WorkspaceId, DeleteCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCategory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/category/" + com.aliyun.openapiutil.Client.getEncodeParam(CategoryId) + "/"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the sfm:DeleteCategory permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. Alibaba Cloud accounts can call this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limiting:</strong>
     * This operation is subject to rate limiting. Do not exceed 5 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Permanently deletes a specified category.</p>
     * 
     * @param request DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategory(String CategoryId, String WorkspaceId, DeleteCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCategoryWithOptions(CategoryId, WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><warning>  Deleted text chunks cannot be recovered (hard delete). Proceed with caution.</p>
     * <ul>
     * <li><strong>Permission requirements</strong>:<ul>
     * <li><strong>Resource Access Management (RAM) user</strong>: Obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio first (you can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:DeleteChunk permission required by this operation), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has permissions by default and can invoke this operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Invocation method</strong>: Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>. The SDK provides encapsulation of complex signature calculation logic and simplifies the invocation procedure.</li>
     * <li><strong>Effective latency</strong>: Changes typically take effect immediately. During peak hours, there may be a slight delay (seconds).</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent. Repeated calls to delete an already deleted text chunk return a success response.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes specified text chunks from a knowledge base. Deleted text chunks cannot be retrieved or recalled.</p>
     * 
     * @param tmpReq DeleteChunkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChunkResponse
     */
    public DeleteChunkResponse deleteChunkWithOptions(String WorkspaceId, DeleteChunkRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteChunkShrinkRequest request = new DeleteChunkShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.chunkIds)) {
            request.chunkIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.chunkIds, "ChunkIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunkIdsShrink)) {
            query.put("ChunkIds", request.chunkIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChunk"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/chunk/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChunkResponse());
    }

    /**
     * <b>description</b> :
     * <p><warning>  Deleted text chunks cannot be recovered (hard delete). Proceed with caution.</p>
     * <ul>
     * <li><strong>Permission requirements</strong>:<ul>
     * <li><strong>Resource Access Management (RAM) user</strong>: Obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio first (you can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:DeleteChunk permission required by this operation), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has permissions by default and can invoke this operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Invocation method</strong>: Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>. The SDK provides encapsulation of complex signature calculation logic and simplifies the invocation procedure.</li>
     * <li><strong>Effective latency</strong>: Changes typically take effect immediately. During peak hours, there may be a slight delay (seconds).</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent. Repeated calls to delete an already deleted text chunk return a success response.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes specified text chunks from a knowledge base. Deleted text chunks cannot be retrieved or recalled.</p>
     * 
     * @param request DeleteChunkRequest
     * @return DeleteChunkResponse
     */
    public DeleteChunkResponse deleteChunk(String WorkspaceId, DeleteChunkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteChunkWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>RAM用户（子账号）需要首先获取阿里云百炼的<a href="https://help.aliyun.com/document_detail/2848578.html">API权限</a>（需要<code>AliyunBailianDataFullAccess</code>，已包括sfm:DeleteConnector权限点），并<a href="https://help.aliyun.com/document_detail/2851098.html">加入一个业务空间</a>后，方可调用本接口。阿里云账号（主账号）可直接调用无须授权。建议您通过最新版<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">阿里云百炼SDK</a><a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">阿里云百炼SDK</a>来调用本接口。</li>
     * <li>本接口不具备幂等性。
     * <strong>限流说明：</strong>
     * 本接口频繁调用会被限流，频率请勿超过5次/秒。如遇限流，请稍后重试。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除连接器</p>
     * 
     * @param request DeleteConnectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConnectorResponse
     */
    public DeleteConnectorResponse deleteConnectorWithOptions(String ConnectorId, String WorkspaceId, DeleteConnectorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConnector"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/connector/" + com.aliyun.openapiutil.Client.getEncodeParam(ConnectorId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConnectorResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>RAM用户（子账号）需要首先获取阿里云百炼的<a href="https://help.aliyun.com/document_detail/2848578.html">API权限</a>（需要<code>AliyunBailianDataFullAccess</code>，已包括sfm:DeleteConnector权限点），并<a href="https://help.aliyun.com/document_detail/2851098.html">加入一个业务空间</a>后，方可调用本接口。阿里云账号（主账号）可直接调用无须授权。建议您通过最新版<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">阿里云百炼SDK</a><a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">阿里云百炼SDK</a>来调用本接口。</li>
     * <li>本接口不具备幂等性。
     * <strong>限流说明：</strong>
     * 本接口频繁调用会被限流，频率请勿超过5次/秒。如遇限流，请稍后重试。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除连接器</p>
     * 
     * @param request DeleteConnectorRequest
     * @return DeleteConnectorResponse
     */
    public DeleteConnectorResponse deleteConnector(String ConnectorId, String WorkspaceId, DeleteConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConnectorWithOptions(ConnectorId, WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deleting data tables via API is not supported. To delete a data table or specific data within a table, go to &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> to perform the operation.</li>
     * <li>This API is used to delete files in &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> and does not affect any knowledge bases that have already been built. To delete a file from a knowledge base, invoke the <strong>DeleteIndexDocument</strong> API.</li>
     * <li>A RAM user must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the <code>sfm:DeleteFile</code> permission point) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this API. An Alibaba Cloud account can invoke this API directly without authorization. We recommend that you use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this API.</li>
     * <li>This API can only delete files whose status is either Failed to Parse (<code>PARSE_FAILED</code>) or Parse Succeeded (<code>PARSE_SUCCESS</code>).</li>
     * <li>This API is idempotent.
     * <strong>Rate Limiting Notice:</strong>
     * Frequent invocation of this API will trigger rate limiting. Do not exceed 10 requests per second. If rate limited, retry after a short wait.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Permanently delete a specified file from application data. Deleting data tables via API is not supported. For details, see the API Guide below.</p>
     * 
     * @param request DeleteFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFileWithOptions(String FileId, String WorkspaceId, DeleteFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFile"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/file/" + com.aliyun.openapiutil.Client.getEncodeParam(FileId) + "/"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deleting data tables via API is not supported. To delete a data table or specific data within a table, go to &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> to perform the operation.</li>
     * <li>This API is used to delete files in &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> and does not affect any knowledge bases that have already been built. To delete a file from a knowledge base, invoke the <strong>DeleteIndexDocument</strong> API.</li>
     * <li>A RAM user must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the <code>sfm:DeleteFile</code> permission point) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this API. An Alibaba Cloud account can invoke this API directly without authorization. We recommend that you use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this API.</li>
     * <li>This API can only delete files whose status is either Failed to Parse (<code>PARSE_FAILED</code>) or Parse Succeeded (<code>PARSE_SUCCESS</code>).</li>
     * <li>This API is idempotent.
     * <strong>Rate Limiting Notice:</strong>
     * Frequent invocation of this API will trigger rate limiting. Do not exceed 10 requests per second. If rate limited, retry after a short wait.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Permanently delete a specified file from application data. Deleting data tables via API is not supported. For details, see the API Guide below.</p>
     * 
     * @param request DeleteFileRequest
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFile(String FileId, String WorkspaceId, DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFileWithOptions(FileId, WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deleting data tables through the API is not supported. To delete a data table or specific data in a table, go to &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</li>
     * <li>This API is used to delete files in &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>. It does not affect knowledge bases that have already been built. To delete files in a knowledge base, call the <strong>DeleteIndexDocument</strong> operation.</li>
     * <li>A RAM user (sub-account) must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which already includes the sfm:DeleteFiles permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. The Alibaba Cloud account (main account) can call this operation directly without authorization. We recommend that you use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation can only delete files whose status is parsing failed (PARSE_FAILED) or parsing succeeded (PARSE_SUCCESS).</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong>
     * Frequent calls to this operation are throttled. Do not exceed 10 queries per second (QPS). If you are throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Delete files in batch</p>
     * 
     * @param tmpReq DeleteFilesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFilesResponse
     */
    public DeleteFilesResponse deleteFilesWithOptions(String WorkspaceId, DeleteFilesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteFilesShrinkRequest request = new DeleteFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileIds)) {
            request.fileIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileIds, "FileIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileIdsShrink)) {
            body.put("FileIds", request.fileIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFiles"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/file/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFilesResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deleting data tables through the API is not supported. To delete a data table or specific data in a table, go to &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</li>
     * <li>This API is used to delete files in &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>. It does not affect knowledge bases that have already been built. To delete files in a knowledge base, call the <strong>DeleteIndexDocument</strong> operation.</li>
     * <li>A RAM user (sub-account) must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which already includes the sfm:DeleteFiles permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. The Alibaba Cloud account (main account) can call this operation directly without authorization. We recommend that you use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation can only delete files whose status is parsing failed (PARSE_FAILED) or parsing succeeded (PARSE_SUCCESS).</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong>
     * Frequent calls to this operation are throttled. Do not exceed 10 queries per second (QPS). If you are throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Delete files in batch</p>
     * 
     * @param request DeleteFilesRequest
     * @return DeleteFilesResponse
     */
    public DeleteFilesResponse deleteFiles(String WorkspaceId, DeleteFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFilesWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the sfm:DeleteIndex permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>If the knowledge base is associated with an application, you must first dissociate it from the application before deleting it. This can currently only be done through the console. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</li>
     * <li>Deletion is irreversible. A deleted knowledge base cannot be recovered. Proceed with caution.</li>
     * <li>Invoking this operation does not delete files that have been imported into &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</li>
     * <li>This operation has idempotence.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Permanently deletes a specified knowledge base.</p>
     * 
     * @param request DeleteIndexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIndexResponse
     */
    public DeleteIndexResponse deleteIndexWithOptions(String WorkspaceId, DeleteIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIndex"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIndexResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the sfm:DeleteIndex permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>If the knowledge base is associated with an application, you must first dissociate it from the application before deleting it. This can currently only be done through the console. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</li>
     * <li>Deletion is irreversible. A deleted knowledge base cannot be recovered. Proceed with caution.</li>
     * <li>Invoking this operation does not delete files that have been imported into &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</li>
     * <li>This operation has idempotence.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Permanently deletes a specified knowledge base.</p>
     * 
     * @param request DeleteIndexRequest
     * @return DeleteIndexResponse
     */
    public DeleteIndexResponse deleteIndex(String WorkspaceId, DeleteIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation does not support deleting data from data query or image Q&amp;A knowledge bases. Use the Model Studio console instead.</li>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the sfm:DeleteIndexDocument permission), before calling this operation. Alibaba Cloud accounts can call this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to call this operation.</li>
     * <li>Before calling this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>You can only delete files whose status is import failed (INSERT_ERROR) or import succeeded (FINISH) in the knowledge base. To query the file status in a specified knowledge base, call the <strong>ListIndexDocuments</strong> operation.</li>
     * <li>Deletion is irreversible. The content of deleted files cannot be recovered, and the <strong>Retrieve</strong> operation can no longer retrieve related information. Proceed with caution.</li>
     * <li>Calling this operation does not delete documents that have been imported into &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Permanently deletes files from a specified knowledge base.</p>
     * 
     * @param tmpReq DeleteIndexDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIndexDocumentResponse
     */
    public DeleteIndexDocumentResponse deleteIndexDocumentWithOptions(String WorkspaceId, DeleteIndexDocumentRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteIndexDocumentShrinkRequest request = new DeleteIndexDocumentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.documentIds)) {
            request.documentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.documentIds, "DocumentIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentIdsShrink)) {
            query.put("DocumentIds", request.documentIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIndexDocument"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/delete_index_document"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIndexDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation does not support deleting data from data query or image Q&amp;A knowledge bases. Use the Model Studio console instead.</li>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the sfm:DeleteIndexDocument permission), before calling this operation. Alibaba Cloud accounts can call this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to call this operation.</li>
     * <li>Before calling this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>You can only delete files whose status is import failed (INSERT_ERROR) or import succeeded (FINISH) in the knowledge base. To query the file status in a specified knowledge base, call the <strong>ListIndexDocuments</strong> operation.</li>
     * <li>Deletion is irreversible. The content of deleted files cannot be recovered, and the <strong>Retrieve</strong> operation can no longer retrieve related information. Proceed with caution.</li>
     * <li>Calling this operation does not delete documents that have been imported into &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Permanently deletes files from a specified knowledge base.</p>
     * 
     * @param request DeleteIndexDocumentRequest
     * @return DeleteIndexDocumentResponse
     */
    public DeleteIndexDocumentResponse deleteIndexDocument(String WorkspaceId, DeleteIndexDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexDocumentWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that your long-term memory has been created and has not been deleted (that is, the memoryId is valid).</li>
     * <li>The delete operation is irreversible. The deleted long-term memory, including all of its long-term memory nodes, cannot be recovered. The <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-getmemory">GetMemory</a> operation will no longer be able to retrieve its information. Proceed with caution.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong> Make sure that the interval between two requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Permanently deletes a specified long-term memory.</p>
     * 
     * @param request DeleteMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMemoryResponse
     */
    public DeleteMemoryResponse deleteMemoryWithOptions(String workspaceId, String memoryId, DeleteMemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMemory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMemoryResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that your long-term memory has been created and has not been deleted (that is, the memoryId is valid).</li>
     * <li>The delete operation is irreversible. The deleted long-term memory, including all of its long-term memory nodes, cannot be recovered. The <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-getmemory">GetMemory</a> operation will no longer be able to retrieve its information. Proceed with caution.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong> Make sure that the interval between two requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Permanently deletes a specified long-term memory.</p>
     * 
     * @param request DeleteMemoryRequest
     * @return DeleteMemoryResponse
     */
    public DeleteMemoryResponse deleteMemory(String workspaceId, String memoryId, DeleteMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMemoryWithOptions(workspaceId, memoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a memory fragment.</p>
     * 
     * @param request DeleteMemoryNodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMemoryNodeResponse
     */
    public DeleteMemoryNodeResponse deleteMemoryNodeWithOptions(String workspaceId, String memoryId, String memoryNodeId, DeleteMemoryNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMemoryNode"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + "/memoryNodes/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryNodeId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMemoryNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a memory fragment.</p>
     * 
     * @param request DeleteMemoryNodeRequest
     * @return DeleteMemoryNodeResponse
     */
    public DeleteMemoryNodeResponse deleteMemoryNode(String workspaceId, String memoryId, String memoryNodeId, DeleteMemoryNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMemoryNodeWithOptions(workspaceId, memoryId, memoryNodeId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a prompt template based on the template ID.</p>
     * 
     * @param request DeletePromptTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePromptTemplateResponse
     */
    public DeletePromptTemplateResponse deletePromptTemplateWithOptions(String workspaceId, String promptTemplateId, DeletePromptTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePromptTemplate"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/promptTemplates/" + com.aliyun.openapiutil.Client.getEncodeParam(promptTemplateId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePromptTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a prompt template based on the template ID.</p>
     * 
     * @param request DeletePromptTemplateRequest
     * @return DeletePromptTemplateResponse
     */
    public DeletePromptTemplateResponse deletePromptTemplate(String workspaceId, String promptTemplateId, DeletePromptTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePromptTemplateWithOptions(workspaceId, promptTemplateId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A Resource Access Management (RAM) user must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (<code>AliyunBailianDataFullAccess</code> or <code>AliyunBailianDataReadOnlyAccess</code>, both of which include the sfm:DescribeFile permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. An Alibaba Cloud account can invoke this operation directly without authorization. Invoke this operation by using the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information about a file in application data, including the file name, type, and status.</p>
     * 
     * @param request DescribeFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFileResponse
     */
    public DescribeFileResponse describeFileWithOptions(String WorkspaceId, String FileId, DescribeFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
     * <b>description</b> :
     * <ul>
     * <li>A Resource Access Management (RAM) user must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (<code>AliyunBailianDataFullAccess</code> or <code>AliyunBailianDataReadOnlyAccess</code>, both of which include the sfm:DescribeFile permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. An Alibaba Cloud account can invoke this operation directly without authorization. Invoke this operation by using the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information about a file in application data, including the file name, type, and status.</p>
     * 
     * @param request DescribeFileRequest
     * @return DescribeFileResponse
     */
    public DescribeFileResponse describeFile(String WorkspaceId, String FileId, DescribeFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeFileWithOptions(WorkspaceId, FileId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tipping status of the Alipay wallet bound to an application.</p>
     * 
     * @param request GetAlipayTransferStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlipayTransferStatusResponse
     */
    public GetAlipayTransferStatusResponse getAlipayTransferStatusWithOptions(GetAlipayTransferStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspace_id", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlipayTransferStatus"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/alipay/transfer/status"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlipayTransferStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tipping status of the Alipay wallet bound to an application.</p>
     * 
     * @param request GetAlipayTransferStatusRequest
     * @return GetAlipayTransferStatusResponse
     */
    public GetAlipayTransferStatusResponse getAlipayTransferStatus(GetAlipayTransferStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlipayTransferStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the Alipay tipping URL for an application.</p>
     * 
     * @param request GetAlipayUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlipayUrlResponse
     */
    public GetAlipayUrlResponse getAlipayUrlWithOptions(GetAlipayUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("app_id", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspace_id", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlipayUrl"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/alipay/transfer/url"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlipayUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the Alipay tipping URL for an application.</p>
     * 
     * @param request GetAlipayUrlRequest
     * @return GetAlipayUrlResponse
     */
    public GetAlipayUrlResponse getAlipayUrl(GetAlipayUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlipayUrlWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>RAM用户（子账号）需要首先获取阿里云百炼的<a href="https://help.aliyun.com/document_detail/2848578.html">API权限</a>（<code>AliyunBailianDataFullAccess</code>或<code>AliyunBailianDataReadOnlyAccess</code>均可，已包括sfm:GetAvailableParserTypes权限点），并<a href="https://help.aliyun.com/document_detail/2851098.html">加入一个业务空间</a>后，方可调用本接口。阿里云账号（主账号）可直接调用无须授权。建议您通过最新版&lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">阿里云百炼SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">阿里云百炼SDK</a>来调用本接口。</li>
     * <li>本接口具有幂等性。
     * <strong>限流说明：</strong>
     * 本接口频繁调用会被限流，频率请勿超过10次/秒。如遇限流，请稍后重试。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists all supported parser types based on the input file type (file extension).</p>
     * 
     * @param request GetAvailableParserTypesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAvailableParserTypesResponse
     */
    public GetAvailableParserTypesResponse getAvailableParserTypesWithOptions(String WorkspaceId, GetAvailableParserTypesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAvailableParserTypes"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/parser/parsertype"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAvailableParserTypesResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>RAM用户（子账号）需要首先获取阿里云百炼的<a href="https://help.aliyun.com/document_detail/2848578.html">API权限</a>（<code>AliyunBailianDataFullAccess</code>或<code>AliyunBailianDataReadOnlyAccess</code>均可，已包括sfm:GetAvailableParserTypes权限点），并<a href="https://help.aliyun.com/document_detail/2851098.html">加入一个业务空间</a>后，方可调用本接口。阿里云账号（主账号）可直接调用无须授权。建议您通过最新版&lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">阿里云百炼SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">阿里云百炼SDK</a>来调用本接口。</li>
     * <li>本接口具有幂等性。
     * <strong>限流说明：</strong>
     * 本接口频繁调用会被限流，频率请勿超过10次/秒。如遇限流，请稍后重试。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists all supported parser types based on the input file type (file extension).</p>
     * 
     * @param request GetAvailableParserTypesRequest
     * @return GetAvailableParserTypesResponse
     */
    public GetAvailableParserTypesResponse getAvailableParserTypes(String WorkspaceId, GetAvailableParserTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAvailableParserTypesWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To call this operation, a RAM user (sub-account) must have the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and must <a href="https://help.aliyun.com/document_detail/2851098.html">join a business space</a>. This requires the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:GetConnector permission. An Alibaba Cloud account (primary account) can call this operation directly. We recommend using the latest <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a><a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong>
     * This operation is subject to throttling. Do not exceed a frequency of 5 calls per second. If a request is throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves details about a connector. This operation currently supports only file connectors.</p>
     * 
     * @param request GetConnectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConnectorResponse
     */
    public GetConnectorResponse getConnectorWithOptions(String WorkspaceId, GetConnectorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            query.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorName)) {
            query.put("ConnectorName", request.connectorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConnector"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/connector"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConnectorResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To call this operation, a RAM user (sub-account) must have the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and must <a href="https://help.aliyun.com/document_detail/2851098.html">join a business space</a>. This requires the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:GetConnector permission. An Alibaba Cloud account (primary account) can call this operation directly. We recommend using the latest <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a><a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong>
     * This operation is subject to throttling. Do not exceed a frequency of 5 calls per second. If a request is throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves details about a connector. This operation currently supports only file connectors.</p>
     * 
     * @param request GetConnectorRequest
     * @return GetConnectorResponse
     */
    public GetConnectorResponse getConnector(String WorkspaceId, GetConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConnectorWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (<code>AliyunBailianDataFullAccess</code> or <code>AliyunBailianDataReadOnlyAccess</code>, both of which include the sfm:GetIndexJobStatus permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</li>
     * <li>You must have a knowledge base job task in progress. To create a knowledge base creation task, invoke the <strong>SubmitIndexJob</strong> operation. To create a knowledge base document append task, invoke the <strong>SubmitIndexAddDocumentsJob</strong> operation. Obtain the corresponding <code>JobId</code> from the response.</li>
     * <li>Invoke this operation at intervals of 5 seconds or more.</li>
     * <li>This operation is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the current status of a specified knowledge base creation job or knowledge base document append job.</p>
     * 
     * @param request GetIndexJobStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIndexJobStatusResponse
     */
    public GetIndexJobStatusResponse getIndexJobStatusWithOptions(String WorkspaceId, GetIndexJobStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIndexJobStatus"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/job/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIndexJobStatusResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (<code>AliyunBailianDataFullAccess</code> or <code>AliyunBailianDataReadOnlyAccess</code>, both of which include the sfm:GetIndexJobStatus permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</li>
     * <li>You must have a knowledge base job task in progress. To create a knowledge base creation task, invoke the <strong>SubmitIndexJob</strong> operation. To create a knowledge base document append task, invoke the <strong>SubmitIndexAddDocumentsJob</strong> operation. Obtain the corresponding <code>JobId</code> from the response.</li>
     * <li>Invoke this operation at intervals of 5 seconds or more.</li>
     * <li>This operation is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the current status of a specified knowledge base creation job or knowledge base document append job.</p>
     * 
     * @param request GetIndexJobStatusRequest
     * @return GetIndexJobStatusResponse
     */
    public GetIndexJobStatusResponse getIndexJobStatus(String WorkspaceId, GetIndexJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIndexJobStatusWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;intl&quot;&gt;
     * This operation is not available on the Alibaba Cloud International Website (www\.alibabacloud.com).
     * &lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before you call this operation, a RAM user must obtain the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (which requires the <code>AliyunBailianDataFullAccess</code> permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>. Alibaba Cloud accounts can call this operation directly without authorization. You can call this operation using the latest version of the <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio software development kit (SDK)</a>. Before you call this operation, make sure that the specified knowledge base has been created and has not been deleted. This means that the knowledge base ID (<code>IndexId</code>) must be valid. This operation is idempotent. The maximum query time range (EndTimestamp - StartTimestamp) is 30 days. The granularity of the time window in the returned data is dynamically adjusted based on the query time range.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call the GetIndexMonitor operation to query monitoring data for a specified knowledge base within a specific time range. This data is crucial for App Performance Analytics, capacity planning, and cost management. The monitoring data includes two main dimensions: storage and retrieval. Storage monitoring retrieves the index storage limit and current usage of the knowledge base. Retrieval monitoring retrieves performance metrics for the query period, such as peak queries per second (QPS), total requests, and average QPS. The metrics are provided as totals and are also broken down by time window. The requests are categorized as successful, failed, and rate-limited.</p>
     * 
     * @param request GetIndexMonitorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIndexMonitorResponse
     */
    public GetIndexMonitorResponse getIndexMonitorWithOptions(String WorkspaceId, GetIndexMonitorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIndexMonitor"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/rag/index/monitor"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIndexMonitorResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;intl&quot;&gt;
     * This operation is not available on the Alibaba Cloud International Website (www\.alibabacloud.com).
     * &lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before you call this operation, a RAM user must obtain the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (which requires the <code>AliyunBailianDataFullAccess</code> permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>. Alibaba Cloud accounts can call this operation directly without authorization. You can call this operation using the latest version of the <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio software development kit (SDK)</a>. Before you call this operation, make sure that the specified knowledge base has been created and has not been deleted. This means that the knowledge base ID (<code>IndexId</code>) must be valid. This operation is idempotent. The maximum query time range (EndTimestamp - StartTimestamp) is 30 days. The granularity of the time window in the returned data is dynamically adjusted based on the query time range.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call the GetIndexMonitor operation to query monitoring data for a specified knowledge base within a specific time range. This data is crucial for App Performance Analytics, capacity planning, and cost management. The monitoring data includes two main dimensions: storage and retrieval. Storage monitoring retrieves the index storage limit and current usage of the knowledge base. Retrieval monitoring retrieves performance metrics for the query period, such as peak queries per second (QPS), total requests, and average QPS. The metrics are provided as totals and are also broken down by time window. The requests are categorized as successful, failed, and rate-limited.</p>
     * 
     * @param request GetIndexMonitorRequest
     * @return GetIndexMonitorResponse
     */
    public GetIndexMonitorResponse getIndexMonitor(String WorkspaceId, GetIndexMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIndexMonitorWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong> Ensure that the interval between two consecutive requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the description of a specified long-term memory.</p>
     * 
     * @param request GetMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemoryResponse
     */
    public GetMemoryResponse getMemoryWithOptions(String workspaceId, String memoryId, GetMemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMemory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMemoryResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong> Ensure that the interval between two consecutive requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the description of a specified long-term memory.</p>
     * 
     * @param request GetMemoryRequest
     * @return GetMemoryResponse
     */
    public GetMemoryResponse getMemory(String workspaceId, String memoryId, GetMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryWithOptions(workspaceId, memoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a memory fragment.</p>
     * 
     * @param request GetMemoryNodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemoryNodeResponse
     */
    public GetMemoryNodeResponse getMemoryNodeWithOptions(String workspaceId, String memoryId, String memoryNodeId, GetMemoryNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMemoryNode"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + "/memoryNodes/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryNodeId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMemoryNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a memory fragment.</p>
     * 
     * @param request GetMemoryNodeRequest
     * @return GetMemoryNodeResponse
     */
    public GetMemoryNodeResponse getMemoryNode(String workspaceId, String memoryId, String memoryNodeId, GetMemoryNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryNodeWithOptions(workspaceId, memoryId, memoryNodeId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>RAM用户（子账号）需要首先获取阿里云百炼的<a href="https://help.aliyun.com/document_detail/2848578.html">API权限</a>（<code>AliyunBailianDataFullAccess</code>或<code>AliyunBailianDataReadOnlyAccess</code>均可，已包括sfm:GetParseSettings权限点），并<a href="https://help.aliyun.com/document_detail/2851098.html">加入一个业务空间</a>后，方可调用本接口。阿里云账号（主账号）可直接调用无须授权。建议您通过最新版&lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">阿里云百炼SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">阿里云百炼SDK</a>来调用本接口。</li>
     * <li>本接口具有幂等性。
     * <strong>限流说明：</strong>
     * 本接口频繁调用会被限流，频率请勿超过10次/秒。如遇限流，请稍后重试。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the data parsing settings in a specified category.</p>
     * 
     * @param request GetParseSettingsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetParseSettingsResponse
     */
    public GetParseSettingsResponse getParseSettingsWithOptions(String WorkspaceId, GetParseSettingsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetParseSettings"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/parser/settings"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetParseSettingsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>RAM用户（子账号）需要首先获取阿里云百炼的<a href="https://help.aliyun.com/document_detail/2848578.html">API权限</a>（<code>AliyunBailianDataFullAccess</code>或<code>AliyunBailianDataReadOnlyAccess</code>均可，已包括sfm:GetParseSettings权限点），并<a href="https://help.aliyun.com/document_detail/2851098.html">加入一个业务空间</a>后，方可调用本接口。阿里云账号（主账号）可直接调用无须授权。建议您通过最新版&lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">阿里云百炼SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">阿里云百炼SDK</a>来调用本接口。</li>
     * <li>本接口具有幂等性。
     * <strong>限流说明：</strong>
     * 本接口频繁调用会被限流，频率请勿超过10次/秒。如遇限流，请稍后重试。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the data parsing settings in a specified category.</p>
     * 
     * @param request GetParseSettingsRequest
     * @return GetParseSettingsResponse
     */
    public GetParseSettingsResponse getParseSettings(String WorkspaceId, GetParseSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getParseSettingsWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a prompt template based on the template ID.</p>
     * 
     * @param request GetPromptTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPromptTemplateResponse
     */
    public GetPromptTemplateResponse getPromptTemplateWithOptions(String workspaceId, String promptTemplateId, GetPromptTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPromptTemplate"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/promptTemplates/" + com.aliyun.openapiutil.Client.getEncodeParam(promptTemplateId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPromptTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a prompt template based on the template ID.</p>
     * 
     * @param request GetPromptTemplateRequest
     * @return GetPromptTemplateResponse
     */
    public GetPromptTemplateResponse getPromptTemplate(String workspaceId, String promptTemplateId, GetPromptTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPromptTemplateWithOptions(workspaceId, promptTemplateId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取发布态智能体应用</p>
     * 
     * @param request GetPublishedAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPublishedAgentResponse
     */
    public GetPublishedAgentResponse getPublishedAgentWithOptions(String workspaceId, String appCode, GetPublishedAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPublishedAgent"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/application/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(appCode) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPublishedAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取发布态智能体应用</p>
     * 
     * @param request GetPublishedAgentRequest
     * @return GetPublishedAgentResponse
     */
    public GetPublishedAgentResponse getPublishedAgent(String workspaceId, String appCode, GetPublishedAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPublishedAgentWithOptions(workspaceId, appCode, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>高代码部署服务</p>
     * 
     * @param request HighCodeDeployRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return HighCodeDeployResponse
     */
    public HighCodeDeployResponse highCodeDeployWithOptions(String workspaceId, HighCodeDeployRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentDesc)) {
            body.put("agentDesc", request.agentDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            body.put("agentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCodeName)) {
            body.put("sourceCodeName", request.sourceCodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCodeOssUrl)) {
            body.put("sourceCodeOssUrl", request.sourceCodeOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telemetryEnabled)) {
            body.put("telemetryEnabled", request.telemetryEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HighCodeDeploy"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/highCode/publish"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HighCodeDeployResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>高代码部署服务</p>
     * 
     * @param request HighCodeDeployRequest
     * @return HighCodeDeployResponse
     */
    public HighCodeDeployResponse highCodeDeploy(String workspaceId, HighCodeDeployRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.highCodeDeployWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API does not support querying data tables.</li>
     * <li>To call this API, a RAM user must first obtain the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permission</a> for Model Studio and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>. This requires the <code>AliyunBailianDataFullAccess</code> permission, which includes the <code>sfm:ListCategory</code> permission. Alibaba Cloud accounts can call this API directly. Use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>.</li>
     * <li>This operation supports pagination. When making your first request, set the <code>MaxResults</code> parameter to specify the maximum number of items to return. If more items are available, the response includes a <code>NextToken</code>. To retrieve the next page of results, set the <code>NextToken</code> parameter to the value from the previous response and specify <code>MaxResults</code> again. An empty <code>NextToken</code> indicates that no more results are available.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limiting:</strong> This API is subject to rate limiting. Do not exceed 5 requests per second. If the system throttles a request, retry it after a short interval.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of one or more categories in a specified workspace.</p>
     * 
     * @param request ListCategoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCategoryResponse
     */
    public ListCategoryResponse listCategoryWithOptions(String WorkspaceId, ListCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryName)) {
            body.put("CategoryName", request.categoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryType)) {
            body.put("CategoryType", request.categoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            body.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCategoryId)) {
            body.put("ParentCategoryId", request.parentCategoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCategory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/categories"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API does not support querying data tables.</li>
     * <li>To call this API, a RAM user must first obtain the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permission</a> for Model Studio and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>. This requires the <code>AliyunBailianDataFullAccess</code> permission, which includes the <code>sfm:ListCategory</code> permission. Alibaba Cloud accounts can call this API directly. Use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>.</li>
     * <li>This operation supports pagination. When making your first request, set the <code>MaxResults</code> parameter to specify the maximum number of items to return. If more items are available, the response includes a <code>NextToken</code>. To retrieve the next page of results, set the <code>NextToken</code> parameter to the value from the previous response and specify <code>MaxResults</code> again. An empty <code>NextToken</code> indicates that no more results are available.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limiting:</strong> This API is subject to rate limiting. Do not exceed 5 requests per second. If the system throttles a request, retry it after a short interval.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of one or more categories in a specified workspace.</p>
     * 
     * @param request ListCategoryRequest
     * @return ListCategoryResponse
     */
    public ListCategoryResponse listCategory(String WorkspaceId, ListCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCategoryWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For document search&lt;props=&quot;china&quot;&gt; or audio/video search knowledge bases, this operation queries all chunks of a specified file. For data query or image Q&amp;A knowledge bases, this operation retrieves information about all text chunks.</li>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ChunkList permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>This operation has idempotence.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list and information of text chunks.</p>
     * 
     * @param request ListChunksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChunksResponse
     */
    public ListChunksResponse listChunksWithOptions(String WorkspaceId, ListChunksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filed)) {
            body.put("Filed", request.filed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            body.put("IndexId", request.indexId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChunks"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/list_chunks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChunksResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For document search&lt;props=&quot;china&quot;&gt; or audio/video search knowledge bases, this operation queries all chunks of a specified file. For data query or image Q&amp;A knowledge bases, this operation retrieves information about all text chunks.</li>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ChunkList permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>This operation has idempotence.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list and information of text chunks.</p>
     * 
     * @param request ListChunksRequest
     * @return ListChunksResponse
     */
    public ListChunksResponse listChunks(String WorkspaceId, ListChunksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChunksWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ListFile permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Invoke this operation by using the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>When performing paging for the first page, only set <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> in the response serves as the credential for querying subsequent pages. When querying subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response as the query credential (if <code>NextToken</code> is empty, all results have been returned and no further requests are needed), and set <code>MaxResults</code> to limit the number of entries returned.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 5 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of one or more documents in a specified category.</p>
     * 
     * @param tmpReq ListFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFileResponse
     */
    public ListFileResponse listFileWithOptions(String WorkspaceId, ListFileRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListFileShrinkRequest request = new ListFileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileIds)) {
            request.fileIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileIds, "FileIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileIdsShrink)) {
            query.put("FileIds", request.fileIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFile"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/files"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFileResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ListFile permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Invoke this operation by using the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>When performing paging for the first page, only set <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> in the response serves as the credential for querying subsequent pages. When querying subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response as the query credential (if <code>NextToken</code> is empty, all results have been returned and no further requests are needed), and set <code>MaxResults</code> to limit the number of entries returned.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 5 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of one or more documents in a specified category.</p>
     * 
     * @param request ListFileRequest
     * @return ListFileResponse
     */
    public ListFileResponse listFile(String WorkspaceId, ListFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFileWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ListIndexFiles permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>This operation has idempotence.
     * <strong>Throttling:</strong>
     * This operation is throttled if called too frequently. Do not exceed 15 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the files in a specified knowledge base along with their summary information.</p>
     * 
     * @param request ListIndexDocumentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIndexDocumentsResponse
     */
    public ListIndexDocumentsResponse listIndexDocumentsWithOptions(String WorkspaceId, ListIndexDocumentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentName)) {
            query.put("DocumentName", request.documentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentStatus)) {
            query.put("DocumentStatus", request.documentStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableNameLike)) {
            query.put("EnableNameLike", request.enableNameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIndexDocuments"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/list_index_documents"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIndexDocumentsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ListIndexFiles permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>This operation has idempotence.
     * <strong>Throttling:</strong>
     * This operation is throttled if called too frequently. Do not exceed 15 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the files in a specified knowledge base along with their summary information.</p>
     * 
     * @param request ListIndexDocumentsRequest
     * @return ListIndexDocumentsResponse
     */
    public ListIndexDocumentsResponse listIndexDocuments(String WorkspaceId, ListIndexDocumentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndexDocumentsWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A RAM user must have the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio to call this operation. The <code>AliyunBailianDataFullAccess</code> permission, which includes the \<code>sfm:ListIndexFiles\\</code> permission, is required. An Alibaba Cloud account can call this operation without authorization. You can call this operation using the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>Before you call this operation, ensure that your knowledge base exists and its ID, <code>IndexId</code>, is valid.</li>
     * <li>This operation is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of one or more documents in a specified knowledge base.</p>
     * 
     * @param request ListIndexFileDetailsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIndexFileDetailsResponse
     */
    public ListIndexFileDetailsResponse listIndexFileDetailsWithOptions(String WorkspaceId, ListIndexFileDetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentName)) {
            query.put("DocumentName", request.documentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentStatus)) {
            query.put("DocumentStatus", request.documentStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableNameLike)) {
            query.put("EnableNameLike", request.enableNameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIndexFileDetails"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/list_index_file_detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIndexFileDetailsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A RAM user must have the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio to call this operation. The <code>AliyunBailianDataFullAccess</code> permission, which includes the \<code>sfm:ListIndexFiles\\</code> permission, is required. An Alibaba Cloud account can call this operation without authorization. You can call this operation using the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>Before you call this operation, ensure that your knowledge base exists and its ID, <code>IndexId</code>, is valid.</li>
     * <li>This operation is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of one or more documents in a specified knowledge base.</p>
     * 
     * @param request ListIndexFileDetailsRequest
     * @return ListIndexFileDetailsResponse
     */
    public ListIndexFileDetailsResponse listIndexFileDetails(String WorkspaceId, ListIndexFileDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndexFileDetailsWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ListIndex permission) before calling this operation. Alibaba Cloud accounts can call this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of knowledge bases in a specified workspace.</p>
     * 
     * @param request ListIndicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIndicesResponse
     */
    public ListIndicesResponse listIndicesWithOptions(String WorkspaceId, ListIndicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexName)) {
            query.put("IndexName", request.indexName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIndices"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/list_indices"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIndicesResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ListIndex permission) before calling this operation. Alibaba Cloud accounts can call this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of knowledge bases in a specified workspace.</p>
     * 
     * @param request ListIndicesRequest
     * @return ListIndicesResponse
     */
    public ListIndicesResponse listIndices(String WorkspaceId, ListIndicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndicesWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When querying the first page of a paging query, set only <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> value in the response serves as the credential for querying subsequent pages. When querying subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response as the query credential (if <code>NextToken</code> is empty, all results have been returned and no further requests are needed), and settings <code>MaxResults</code> to limit the number of entries returned.</li>
     * <li>This operation supports idempotence.
     * <strong>Rate limit:</strong> Ensure that the interval between two consecutive requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of one or more long-term memory entities in a specified workspace.</p>
     * 
     * @param request ListMemoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMemoriesResponse
     */
    public ListMemoriesResponse listMemoriesWithOptions(String workspaceId, ListMemoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMemories"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMemoriesResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When querying the first page of a paging query, set only <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> value in the response serves as the credential for querying subsequent pages. When querying subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response as the query credential (if <code>NextToken</code> is empty, all results have been returned and no further requests are needed), and settings <code>MaxResults</code> to limit the number of entries returned.</li>
     * <li>This operation supports idempotence.
     * <strong>Rate limit:</strong> Ensure that the interval between two consecutive requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of one or more long-term memory entities in a specified workspace.</p>
     * 
     * @param request ListMemoriesRequest
     * @return ListMemoriesResponse
     */
    public ListMemoriesResponse listMemories(String workspaceId, ListMemoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMemoriesWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of memory nodes.</p>
     * 
     * @param request ListMemoryNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMemoryNodesResponse
     */
    public ListMemoryNodesResponse listMemoryNodesWithOptions(String workspaceId, String memoryId, ListMemoryNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMemoryNodes"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + "/memoryNodes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMemoryNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of memory nodes.</p>
     * 
     * @param request ListMemoryNodesRequest
     * @return ListMemoryNodesResponse
     */
    public ListMemoryNodesResponse listMemoryNodes(String workspaceId, String memoryId, ListMemoryNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMemoryNodesWithOptions(workspaceId, memoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of prompt templates.</p>
     * 
     * @param request ListPromptTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPromptTemplatesResponse
     */
    public ListPromptTemplatesResponse listPromptTemplatesWithOptions(String workspaceId, ListPromptTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPromptTemplates"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/promptTemplates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPromptTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of prompt templates.</p>
     * 
     * @param request ListPromptTemplatesRequest
     * @return ListPromptTemplatesResponse
     */
    public ListPromptTemplatesResponse listPromptTemplates(String workspaceId, ListPromptTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPromptTemplatesWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询已发布的智能体应用列表</p>
     * 
     * @param request ListPublishedAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublishedAgentResponse
     */
    public ListPublishedAgentResponse listPublishedAgentWithOptions(String workspaceId, ListPublishedAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("pageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublishedAgent"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/application/agents"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublishedAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询已发布的智能体应用列表</p>
     * 
     * @param request ListPublishedAgentRequest
     * @return ListPublishedAgentResponse
     */
    public ListPublishedAgentResponse listPublishedAgent(String workspaceId, ListPublishedAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPublishedAgentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><strong>How to call</strong>: To retrieve information from a knowledge base, use the latest <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> with an <a href="https://help.aliyun.com/document_detail/116401.html">AccessKey</a> or <a href="https://help.aliyun.com/document_detail/2990886.html">Spring AI Alibaba</a> with an Alibaba Cloud Model Studio <a href="https://help.aliyun.com/document_detail/2712195.html">API key</a>. Both tools simplify your API calls by handling the complex signature calculation.</li>
     * <li><strong>Required permissions</strong>:<ul>
     * <li><strong>RAM user (sub-account)</strong>: To call this API, a RAM user must be granted <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>. You can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the required <code>sfm:Retrieve</code> permission.</li>
     * <li><strong>Alibaba Cloud account (main account)</strong>: This account has the required permissions by default and can call the API directly.</li>
     * </ul>
     * </li>
     * <li><strong>Response latency</strong>: This API call involves complex retrieval and matching operations, which can cause longer response times. We recommend configuring appropriate request timeouts and retry strategies.</li>
     * <li><strong>Idempotency</strong>: This API is idempotent.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li><strong>How to call</strong>: We recommend using the latest <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this API. The SDK simplifies API calls by handling the complex signature calculation.</li>
     * <li><strong>Required permissions</strong>:<ul>
     * <li><strong>RAM user (sub-account)</strong>: To call this API, a RAM user must be granted <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>. You can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the required <code>sfm:Retrieve</code> permission.</li>
     * <li><strong>Alibaba Cloud account (main account)</strong>: This account has the required permissions by default and can call the API directly.</li>
     * </ul>
     * </li>
     * <li><strong>Response latency</strong>: This API call involves complex retrieval and matching operations, which can cause longer response times. We recommend configuring appropriate request timeouts and retry strategies.</li>
     * <li><strong>Idempotency</strong>: This API is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information from a specified knowledge base.</p>
     * 
     * @param tmpReq RetrieveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetrieveResponse
     */
    public RetrieveResponse retrieveWithOptions(String WorkspaceId, RetrieveRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RetrieveShrinkRequest request = new RetrieveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "Extra", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.images)) {
            request.imagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.images, "Images", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryHistory)) {
            request.queryHistoryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryHistory, "QueryHistory", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rerank)) {
            request.rerankShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rerank, "Rerank", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rewrite)) {
            request.rewriteShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rewrite, "Rewrite", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.searchFilters)) {
            request.searchFiltersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.searchFilters, "SearchFilters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.denseSimilarityTopK)) {
            query.put("DenseSimilarityTopK", request.denseSimilarityTopK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableReranking)) {
            query.put("EnableReranking", request.enableReranking);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRewrite)) {
            query.put("EnableRewrite", request.enableRewrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            query.put("Extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imagesShrink)) {
            query.put("Images", request.imagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryHistoryShrink)) {
            query.put("QueryHistory", request.queryHistoryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankShrink)) {
            query.put("Rerank", request.rerankShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankMinScore)) {
            query.put("RerankMinScore", request.rerankMinScore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankTopN)) {
            query.put("RerankTopN", request.rerankTopN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rewriteShrink)) {
            query.put("Rewrite", request.rewriteShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saveRetrieverHistory)) {
            query.put("SaveRetrieverHistory", request.saveRetrieverHistory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchFiltersShrink)) {
            query.put("SearchFilters", request.searchFiltersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sparseSimilarityTopK)) {
            query.put("SparseSimilarityTopK", request.sparseSimilarityTopK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Retrieve"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/retrieve"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetrieveResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><strong>How to call</strong>: To retrieve information from a knowledge base, use the latest <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> with an <a href="https://help.aliyun.com/document_detail/116401.html">AccessKey</a> or <a href="https://help.aliyun.com/document_detail/2990886.html">Spring AI Alibaba</a> with an Alibaba Cloud Model Studio <a href="https://help.aliyun.com/document_detail/2712195.html">API key</a>. Both tools simplify your API calls by handling the complex signature calculation.</li>
     * <li><strong>Required permissions</strong>:<ul>
     * <li><strong>RAM user (sub-account)</strong>: To call this API, a RAM user must be granted <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>. You can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the required <code>sfm:Retrieve</code> permission.</li>
     * <li><strong>Alibaba Cloud account (main account)</strong>: This account has the required permissions by default and can call the API directly.</li>
     * </ul>
     * </li>
     * <li><strong>Response latency</strong>: This API call involves complex retrieval and matching operations, which can cause longer response times. We recommend configuring appropriate request timeouts and retry strategies.</li>
     * <li><strong>Idempotency</strong>: This API is idempotent.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li><strong>How to call</strong>: We recommend using the latest <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this API. The SDK simplifies API calls by handling the complex signature calculation.</li>
     * <li><strong>Required permissions</strong>:<ul>
     * <li><strong>RAM user (sub-account)</strong>: To call this API, a RAM user must be granted <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>. You can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the required <code>sfm:Retrieve</code> permission.</li>
     * <li><strong>Alibaba Cloud account (main account)</strong>: This account has the required permissions by default and can call the API directly.</li>
     * </ul>
     * </li>
     * <li><strong>Response latency</strong>: This API call involves complex retrieval and matching operations, which can cause longer response times. We recommend configuring appropriate request timeouts and retry strategies.</li>
     * <li><strong>Idempotency</strong>: This API is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information from a specified knowledge base.</p>
     * 
     * @param request RetrieveRequest
     * @return RetrieveResponse
     */
    public RetrieveResponse retrieve(String WorkspaceId, RetrieveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retrieveWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This API does not support knowledge bases for data queries or image Q\&amp;A. To update these knowledge bases, see the <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a> documentation.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This API does not support knowledge bases for data queries or image Q\&amp;A. To update these knowledge bases, see the <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a> documentation.</li>
     * <li>A RAM user (sub-account) can call this API only after being granted the required <a href="https://help.aliyun.com/document_detail/2848578.html">api permission</a> for Alibaba Cloud Model Studio (specifically, the <code>AliyunBailianDataFullAccess</code> policy, which includes the <code>sfm:SubmitIndexAddDocumentsJob</code> permission) and joining a <a href="https://help.aliyun.com/document_detail/2851098.html">workspace</a>. An Alibaba Cloud account can call this API directly without authorization. We recommend using the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this API.</li>
     * <li>Before calling this API, ensure your knowledge base exists and has a valid knowledge base ID (<code>IndexId</code>).</li>
     * <li>Before calling this API, you must first upload files to Alibaba Cloud Model Studio using the <strong>AddFile</strong> API.</li>
     * <li>After calling this API, the job runs in the background and may take several hours to complete, especially during peak times. Do not submit duplicate requests until the job is complete. To check the job status, call the <strong>GetIndexJobStatus</strong> API. The <code>Documents</code> file list returned by the GetIndexJobStatus API contains all files for the job, which is uniquely identified by the <code>job_id</code> you provided. You can check this list to verify whether each file was imported (parsed) successfully. Note that frequent calls to the GetIndexJobStatus API are subject to rate limiting. Do not exceed 20 calls per minute.</li>
     * <li>A successful API call indicates the job has been submitted for processing, which takes time. This API is not idempotent, so do not send duplicate requests; doing so will create multiple jobs.
     * <strong>Rate limiting:</strong> This API is limited to 10 calls per second. If you exceed this limit, wait before retrying.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds parsed files to the specified knowledge base.</p>
     * 
     * @param tmpReq SubmitIndexAddDocumentsJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitIndexAddDocumentsJobResponse
     */
    public SubmitIndexAddDocumentsJobResponse submitIndexAddDocumentsJobWithOptions(String WorkspaceId, SubmitIndexAddDocumentsJobRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitIndexAddDocumentsJobShrinkRequest request = new SubmitIndexAddDocumentsJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.categoryIds)) {
            request.categoryIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.categoryIds, "CategoryIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.documentIds)) {
            request.documentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.documentIds, "DocumentIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "Extra", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryIdsShrink)) {
            query.put("CategoryIds", request.categoryIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chunkMode)) {
            query.put("ChunkMode", request.chunkMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chunkSize)) {
            query.put("ChunkSize", request.chunkSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentIdsShrink)) {
            query.put("DocumentIds", request.documentIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableHeaders)) {
            query.put("EnableHeaders", request.enableHeaders);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            query.put("Extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overlapSize)) {
            query.put("OverlapSize", request.overlapSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.separator)) {
            query.put("Separator", request.separator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitIndexAddDocumentsJob"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/add_documents_to_index"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitIndexAddDocumentsJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This API does not support knowledge bases for data queries or image Q\&amp;A. To update these knowledge bases, see the <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a> documentation.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This API does not support knowledge bases for data queries or image Q\&amp;A. To update these knowledge bases, see the <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a> documentation.</li>
     * <li>A RAM user (sub-account) can call this API only after being granted the required <a href="https://help.aliyun.com/document_detail/2848578.html">api permission</a> for Alibaba Cloud Model Studio (specifically, the <code>AliyunBailianDataFullAccess</code> policy, which includes the <code>sfm:SubmitIndexAddDocumentsJob</code> permission) and joining a <a href="https://help.aliyun.com/document_detail/2851098.html">workspace</a>. An Alibaba Cloud account can call this API directly without authorization. We recommend using the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this API.</li>
     * <li>Before calling this API, ensure your knowledge base exists and has a valid knowledge base ID (<code>IndexId</code>).</li>
     * <li>Before calling this API, you must first upload files to Alibaba Cloud Model Studio using the <strong>AddFile</strong> API.</li>
     * <li>After calling this API, the job runs in the background and may take several hours to complete, especially during peak times. Do not submit duplicate requests until the job is complete. To check the job status, call the <strong>GetIndexJobStatus</strong> API. The <code>Documents</code> file list returned by the GetIndexJobStatus API contains all files for the job, which is uniquely identified by the <code>job_id</code> you provided. You can check this list to verify whether each file was imported (parsed) successfully. Note that frequent calls to the GetIndexJobStatus API are subject to rate limiting. Do not exceed 20 calls per minute.</li>
     * <li>A successful API call indicates the job has been submitted for processing, which takes time. This API is not idempotent, so do not send duplicate requests; doing so will create multiple jobs.
     * <strong>Rate limiting:</strong> This API is limited to 10 calls per second. If you exceed this limit, wait before retrying.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds parsed files to the specified knowledge base.</p>
     * 
     * @param request SubmitIndexAddDocumentsJobRequest
     * @return SubmitIndexAddDocumentsJobResponse
     */
    public SubmitIndexAddDocumentsJobResponse submitIndexAddDocumentsJob(String WorkspaceId, SubmitIndexAddDocumentsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitIndexAddDocumentsJobWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:SubmitIndexJob permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, you must invoke the <strong>CreateIndex</strong> operation and obtain the corresponding <code>IndexId</code>.</li>
     * <li>After invoking this operation, the node requires time to execute and may take several hours during peak periods. Do not submit duplicate requests before the node completes. To query the node execution status, invoke the <strong>GetIndexJobStatus</strong> operation.</li>
     * <li>After the knowledge base is created, you can associate it with an agent application&lt;props=&quot;china&quot;&gt; or workflow application in the same workspace through &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/app-center">Application Management</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/app-center">Application Management</a> (or pass the <code>IndexID</code> through <code>rag_options</code> in <a href="https://help.aliyun.com/document_detail/2846132.html">Application Calls</a>) to supplement your Model Studio application with private knowledge and up-to-date information. You can also choose not to use a Model Studio application and directly query the knowledge base by invoking the <strong>Retrieve</strong> operation.</li>
     * <li>This operation does not support idempotence.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a specified CreateIndex task to complete knowledge base creation.</p>
     * 
     * @param request SubmitIndexJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitIndexJobResponse
     */
    public SubmitIndexJobResponse submitIndexJobWithOptions(String WorkspaceId, SubmitIndexJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitIndexJob"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/submit_index_job"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitIndexJobResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:SubmitIndexJob permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, you must invoke the <strong>CreateIndex</strong> operation and obtain the corresponding <code>IndexId</code>.</li>
     * <li>After invoking this operation, the node requires time to execute and may take several hours during peak periods. Do not submit duplicate requests before the node completes. To query the node execution status, invoke the <strong>GetIndexJobStatus</strong> operation.</li>
     * <li>After the knowledge base is created, you can associate it with an agent application&lt;props=&quot;china&quot;&gt; or workflow application in the same workspace through &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/app-center">Application Management</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/app-center">Application Management</a> (or pass the <code>IndexID</code> through <code>rag_options</code> in <a href="https://help.aliyun.com/document_detail/2846132.html">Application Calls</a>) to supplement your Model Studio application with private knowledge and up-to-date information. You can also choose not to use a Model Studio application and directly query the knowledge base by invoking the <strong>Retrieve</strong> operation.</li>
     * <li>This operation does not support idempotence.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a specified CreateIndex task to complete knowledge base creation.</p>
     * 
     * @param request SubmitIndexJobRequest
     * @return SubmitIndexJobResponse
     */
    public SubmitIndexJobResponse submitIndexJob(String WorkspaceId, SubmitIndexJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitIndexJobWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新并发布智能体应用</p>
     * 
     * @param tmpReq UpdateAndPublishAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAndPublishAgentResponse
     */
    public UpdateAndPublishAgentResponse updateAndPublishAgentWithOptions(String workspaceId, String appCode, UpdateAndPublishAgentRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAndPublishAgentShrinkRequest request = new UpdateAndPublishAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.applicationConfig)) {
            request.applicationConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.applicationConfig, "applicationConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sampleLibrary)) {
            request.sampleLibraryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sampleLibrary, "sampleLibrary", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationConfigShrink)) {
            body.put("applicationConfig", request.applicationConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instructions)) {
            body.put("instructions", request.instructions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleLibraryShrink)) {
            body.put("sampleLibrary", request.sampleLibraryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAndPublishAgent"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/application/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(appCode) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAndPublishAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新并发布智能体应用</p>
     * 
     * @param request UpdateAndPublishAgentRequest
     * @return UpdateAndPublishAgentResponse
     */
    public UpdateAndPublishAgentResponse updateAndPublishAgent(String workspaceId, String appCode, UpdateAndPublishAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAndPublishAgentWithOptions(workspaceId, appCode, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>选择更新并发布智能体应用</p>
     * 
     * @param tmpReq UpdateAndPublishAgentSelectiveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAndPublishAgentSelectiveResponse
     */
    public UpdateAndPublishAgentSelectiveResponse updateAndPublishAgentSelectiveWithOptions(String workspaceId, String appCode, UpdateAndPublishAgentSelectiveRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAndPublishAgentSelectiveShrinkRequest request = new UpdateAndPublishAgentSelectiveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.applicationConfig)) {
            request.applicationConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.applicationConfig, "applicationConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sampleLibrary)) {
            request.sampleLibraryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sampleLibrary, "sampleLibrary", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationConfigShrink)) {
            body.put("applicationConfig", request.applicationConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instructions)) {
            body.put("instructions", request.instructions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleLibraryShrink)) {
            body.put("sampleLibrary", request.sampleLibraryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAndPublishAgentSelective"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/application/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(appCode) + "/updateAndPublishAgentSelective"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAndPublishAgentSelectiveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>选择更新并发布智能体应用</p>
     * 
     * @param request UpdateAndPublishAgentSelectiveRequest
     * @return UpdateAndPublishAgentSelectiveResponse
     */
    public UpdateAndPublishAgentSelectiveResponse updateAndPublishAgentSelective(String workspaceId, String appCode, UpdateAndPublishAgentSelectiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAndPublishAgentSelectiveWithOptions(workspaceId, appCode, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Key limits</strong>: This operation supports only document search knowledge bases. Data query and image Q&amp;A knowledge bases are not supported.</li>
     * <li><strong>Permission requirements</strong>:<ul>
     * <li><strong>Resource Access Management (RAM) user</strong>: Before invoking this operation, obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (you can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:UpdateChunk permission required by this operation), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has permissions by default and can invoke this operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Calling method</strong>: Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>. The SDK provides encapsulation of complex signature calculation logic and simplifies the invocation procedure.</li>
     * <li><strong>Effective latency</strong>: Updates typically take effect immediately. During peak hours, a slight delay (seconds) may occur.</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent. If you repeat the operation on a text chunk that has already been updated, the operation returns a success response.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the content and title of a specified text chunk in a knowledge base, and specifies whether the chunk participates in knowledge base retrieval.</p>
     * 
     * @param request UpdateChunkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateChunkResponse
     */
    public UpdateChunkResponse updateChunkWithOptions(String WorkspaceId, UpdateChunkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunkId)) {
            query.put("ChunkId", request.chunkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDisplayedChunkContent)) {
            query.put("IsDisplayedChunkContent", request.isDisplayedChunkContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateChunk"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/chunk/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateChunkResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Key limits</strong>: This operation supports only document search knowledge bases. Data query and image Q&amp;A knowledge bases are not supported.</li>
     * <li><strong>Permission requirements</strong>:<ul>
     * <li><strong>Resource Access Management (RAM) user</strong>: Before invoking this operation, obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (you can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:UpdateChunk permission required by this operation), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has permissions by default and can invoke this operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Calling method</strong>: Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>. The SDK provides encapsulation of complex signature calculation logic and simplifies the invocation procedure.</li>
     * <li><strong>Effective latency</strong>: Updates typically take effect immediately. During peak hours, a slight delay (seconds) may occur.</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent. If you repeat the operation on a text chunk that has already been updated, the operation returns a success response.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the content and title of a specified text chunk in a knowledge base, and specifies whether the chunk participates in knowledge base retrieval.</p>
     * 
     * @param request UpdateChunkRequest
     * @return UpdateChunkResponse
     */
    public UpdateChunkResponse updateChunk(String WorkspaceId, UpdateChunkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChunkWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A RAM user can call this operation only after they join a workspace and are granted the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permission</a> for Alibaba Cloud Model Studio (Bailian). The <code>AliyunBailianDataFullAccess</code> policy, which includes the <code>sfm:UpdateConnector</code> permission, is required. An Alibaba Cloud account can call this operation directly. Use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio (Bailian) SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio (Bailian) SDK</a> to call this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Throttling:</strong> If you call this operation too frequently, the system may throttle your requests. Do not exceed a frequency of 5 calls per second. If a request is throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a connector.</p>
     * 
     * @param request UpdateConnectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConnectorResponse
     */
    public UpdateConnectorResponse updateConnectorWithOptions(String WorkspaceId, String ConnectorId, UpdateConnectorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectorName)) {
            body.put("ConnectorName", request.connectorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConnector"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/connector/" + com.aliyun.openapiutil.Client.getEncodeParam(ConnectorId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConnectorResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A RAM user can call this operation only after they join a workspace and are granted the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permission</a> for Alibaba Cloud Model Studio (Bailian). The <code>AliyunBailianDataFullAccess</code> policy, which includes the <code>sfm:UpdateConnector</code> permission, is required. An Alibaba Cloud account can call this operation directly. Use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio (Bailian) SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio (Bailian) SDK</a> to call this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Throttling:</strong> If you call this operation too frequently, the system may throttle your requests. Do not exceed a frequency of 5 calls per second. If a request is throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a connector.</p>
     * 
     * @param request UpdateConnectorRequest
     * @return UpdateConnectorResponse
     */
    public UpdateConnectorResponse updateConnector(String WorkspaceId, String ConnectorId, UpdateConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConnectorWithOptions(WorkspaceId, ConnectorId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A RAM User (sub-account) must be granted the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (the <code>AliyunBailianDataFullAccess</code> policy, which includes the <code>sfm:UpdateFileTag</code> permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. An Alibaba Cloud account (main account) can call this operation directly without authorization. We recommend using the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.
     * <strong>Throttling:</strong> Do not call this operation more than 5 times per second. If a request is throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the tags for a specified file.</p>
     * 
     * @param tmpReq UpdateFileTagRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFileTagResponse
     */
    public UpdateFileTagResponse updateFileTagWithOptions(String WorkspaceId, String FileId, UpdateFileTagRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFileTagShrinkRequest request = new UpdateFileTagShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFileTag"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/file/" + com.aliyun.openapiutil.Client.getEncodeParam(FileId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileTagResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A RAM User (sub-account) must be granted the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (the <code>AliyunBailianDataFullAccess</code> policy, which includes the <code>sfm:UpdateFileTag</code> permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. An Alibaba Cloud account (main account) can call this operation directly without authorization. We recommend using the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.
     * <strong>Throttling:</strong> Do not call this operation more than 5 times per second. If a request is throttled, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the tags for a specified file.</p>
     * 
     * @param request UpdateFileTagRequest
     * @return UpdateFileTagResponse
     */
    public UpdateFileTagResponse updateFileTag(String WorkspaceId, String FileId, UpdateFileTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFileTagWithOptions(WorkspaceId, FileId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;intl&quot;&gt;This operation is not available on the Alibaba Cloud International Website (www\.alibabacloud.com).&lt;props=&quot;china&quot;&gt;
     * Before a RAM user can call this operation, the RAM user must have the <code>AliyunBailianDataFullAccess</code> permission for Alibaba Cloud Model Studio. For more information, see <a href="https://help.aliyun.com/document_detail/2848578.html">Grant permissions</a>. The RAM user must also be added to a workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2851098.html">Add a member to a workspace</a>. An Alibaba Cloud account can call this operation without authorization. Use the latest version of the Alibaba Cloud Model Studio SDK to call this operation. For more information, see <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.
     * Before you call this operation, ensure that the knowledge base is created and has not been deleted. The knowledge base ID (<code>Id</code>) must be valid.
     * This operation is idempotent.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified knowledge base.</p>
     * 
     * @param request UpdateIndexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIndexResponse
     */
    public UpdateIndexResponse updateIndexWithOptions(String WorkspaceId, UpdateIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.denseSimilarityTopK)) {
            query.put("DenseSimilarityTopK", request.denseSimilarityTopK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineCommercialCu)) {
            query.put("PipelineCommercialCu", request.pipelineCommercialCu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineCommercialType)) {
            query.put("PipelineCommercialType", request.pipelineCommercialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankMinScore)) {
            query.put("RerankMinScore", request.rerankMinScore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sparseSimilarityTopK)) {
            query.put("SparseSimilarityTopK", request.sparseSimilarityTopK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIndex"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIndexResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;intl&quot;&gt;This operation is not available on the Alibaba Cloud International Website (www\.alibabacloud.com).&lt;props=&quot;china&quot;&gt;
     * Before a RAM user can call this operation, the RAM user must have the <code>AliyunBailianDataFullAccess</code> permission for Alibaba Cloud Model Studio. For more information, see <a href="https://help.aliyun.com/document_detail/2848578.html">Grant permissions</a>. The RAM user must also be added to a workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2851098.html">Add a member to a workspace</a>. An Alibaba Cloud account can call this operation without authorization. Use the latest version of the Alibaba Cloud Model Studio SDK to call this operation. For more information, see <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.
     * Before you call this operation, ensure that the knowledge base is created and has not been deleted. The knowledge base ID (<code>Id</code>) must be valid.
     * This operation is idempotent.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified knowledge base.</p>
     * 
     * @param request UpdateIndexRequest
     * @return UpdateIndexResponse
     */
    public UpdateIndexResponse updateIndex(String WorkspaceId, UpdateIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIndexWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong> Ensure that the interval between two requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the description of a specified long-term memory.</p>
     * 
     * @param request UpdateMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemoryResponse
     */
    public UpdateMemoryResponse updateMemoryWithOptions(String workspaceId, String memoryId, UpdateMemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMemory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMemoryResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong> Ensure that the interval between two requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the description of a specified long-term memory.</p>
     * 
     * @param request UpdateMemoryRequest
     * @return UpdateMemoryResponse
     */
    public UpdateMemoryResponse updateMemory(String workspaceId, String memoryId, UpdateMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMemoryWithOptions(workspaceId, memoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a memory fragment.</p>
     * 
     * @param request UpdateMemoryNodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemoryNodeResponse
     */
    public UpdateMemoryNodeResponse updateMemoryNodeWithOptions(String workspaceId, String memoryId, String memoryNodeId, UpdateMemoryNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMemoryNode"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + "/memoryNodes/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryNodeId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMemoryNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a memory fragment.</p>
     * 
     * @param request UpdateMemoryNodeRequest
     * @return UpdateMemoryNodeResponse
     */
    public UpdateMemoryNodeResponse updateMemoryNode(String workspaceId, String memoryId, String memoryNodeId, UpdateMemoryNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMemoryNodeWithOptions(workspaceId, memoryId, memoryNodeId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a prompt template based on the template ID.</p>
     * 
     * @param request UpdatePromptTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePromptTemplateResponse
     */
    public UpdatePromptTemplateResponse updatePromptTemplateWithOptions(String workspaceId, String promptTemplateId, UpdatePromptTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePromptTemplate"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/promptTemplates/" + com.aliyun.openapiutil.Client.getEncodeParam(promptTemplateId) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePromptTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a prompt template based on the template ID.</p>
     * 
     * @param request UpdatePromptTemplateRequest
     * @return UpdatePromptTemplateResponse
     */
    public UpdatePromptTemplateResponse updatePromptTemplate(String workspaceId, String promptTemplateId, UpdatePromptTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePromptTemplateWithOptions(workspaceId, promptTemplateId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Ensure that the OSS bucket belongs to the same Alibaba Cloud account as your Alibaba Cloud Model Studio instance. You must also complete the authorization steps described in <a href="https://help.aliyun.com/document_detail/2782155.html">Configure data import from OSS</a>.<ul>
     * <li>The bucket storage class must not be Archive, Cold Archive, or Deep Cold Archive. Buckets with server-side encryption are supported. public-read-write, public-read, and private buckets are also supported.</li>
     * <li>If you use a bucket with <a href="https://help.aliyun.com/document_detail/2636937.html">Referer-based hotlink protection</a>, you must add <code>*.console.aliyun.com</code> to the Referer whitelist. For more information, see <a href="https://help.aliyun.com/document_detail/2636937.html">Allow access only from trusted websites</a>.</li>
     * </ul>
     * </li>
     * <li>Before a RAM user (sub-account) can call this operation, they must obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>. The AliyunBailianDataFullAccess policy includes the required <code>sfm:UpdateTableFromAuthorizedOss</code> permission. An Alibaba Cloud account (root account) can call this operation directly without additional permissions. We recommend that you use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> or &lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>This operation is not idempotent.
     * <strong>Rate limiting:</strong> This operation is subject to rate limiting. Do not call it more than five times per second. If you reach the limit, wait before you try again.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update a table in an Alibaba Cloud Model Studio data connector using a file from an authorized OSS bucket.</p>
     * 
     * @param request UpdateTableFromAuthorizedOssRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTableFromAuthorizedOssResponse
     */
    public UpdateTableFromAuthorizedOssResponse updateTableFromAuthorizedOssWithOptions(String WorkspaceId, String TableId, UpdateTableFromAuthorizedOssRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            body.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            body.put("OssKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossRegionId)) {
            body.put("OssRegionId", request.ossRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateMode)) {
            body.put("UpdateMode", request.updateMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableFromAuthorizedOss"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/table/fromoss/" + com.aliyun.openapiutil.Client.getEncodeParam(TableId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableFromAuthorizedOssResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Ensure that the OSS bucket belongs to the same Alibaba Cloud account as your Alibaba Cloud Model Studio instance. You must also complete the authorization steps described in <a href="https://help.aliyun.com/document_detail/2782155.html">Configure data import from OSS</a>.<ul>
     * <li>The bucket storage class must not be Archive, Cold Archive, or Deep Cold Archive. Buckets with server-side encryption are supported. public-read-write, public-read, and private buckets are also supported.</li>
     * <li>If you use a bucket with <a href="https://help.aliyun.com/document_detail/2636937.html">Referer-based hotlink protection</a>, you must add <code>*.console.aliyun.com</code> to the Referer whitelist. For more information, see <a href="https://help.aliyun.com/document_detail/2636937.html">Allow access only from trusted websites</a>.</li>
     * </ul>
     * </li>
     * <li>Before a RAM user (sub-account) can call this operation, they must obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>. The AliyunBailianDataFullAccess policy includes the required <code>sfm:UpdateTableFromAuthorizedOss</code> permission. An Alibaba Cloud account (root account) can call this operation directly without additional permissions. We recommend that you use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> or &lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>This operation is not idempotent.
     * <strong>Rate limiting:</strong> This operation is subject to rate limiting. Do not call it more than five times per second. If you reach the limit, wait before you try again.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update a table in an Alibaba Cloud Model Studio data connector using a file from an authorized OSS bucket.</p>
     * 
     * @param request UpdateTableFromAuthorizedOssRequest
     * @return UpdateTableFromAuthorizedOssResponse
     */
    public UpdateTableFromAuthorizedOssResponse updateTableFromAuthorizedOss(String WorkspaceId, String TableId, UpdateTableFromAuthorizedOssRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTableFromAuthorizedOssWithOptions(WorkspaceId, TableId, request, headers, runtime);
    }
}
