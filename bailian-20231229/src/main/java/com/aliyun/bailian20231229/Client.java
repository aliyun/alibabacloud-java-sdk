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
     * <b>description</b> :
     * <p>  You cannot use API to create structured table. To create a table, go to <a href="https://bailian.console.alibabacloud.com/#/data-center">Data Management</a> in the console. You can associate a knowledge base with ApsaraDB for RDS to automatically update structured knowledge base. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
     * <ul>
     * <li>If you are using a RAM user, you must first obtain the OpenAPI management permissions (namely sfm:AddCategory) of Model Studio. For more information, see <a href="https://help.aliyun.com/document_detail/2848578.html">Grant OpenAPI permissions to a RAM user</a>. If you are using the Alibaba Cloud account, you do not need permissions. We recommend that you use <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">the latest version of the SDK</a> to call this operation.</li>
     * <li>You can create up to 1,000 categories in each workspace.</li>
     * <li>This interface is not idempotent.
     * <strong>Throttling:</strong> Throttling will be triggered if you call this operation frequently. Do not exceed 5 times per second. If throttling is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a category in the specified workspace to categorize and manage documents. You can create up to 1,000 categories in each workspace.</p>
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
     * <p>  You cannot use API to create structured table. To create a table, go to <a href="https://bailian.console.alibabacloud.com/#/data-center">Data Management</a> in the console. You can associate a knowledge base with ApsaraDB for RDS to automatically update structured knowledge base. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
     * <ul>
     * <li>If you are using a RAM user, you must first obtain the OpenAPI management permissions (namely sfm:AddCategory) of Model Studio. For more information, see <a href="https://help.aliyun.com/document_detail/2848578.html">Grant OpenAPI permissions to a RAM user</a>. If you are using the Alibaba Cloud account, you do not need permissions. We recommend that you use <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">the latest version of the SDK</a> to call this operation.</li>
     * <li>You can create up to 1,000 categories in each workspace.</li>
     * <li>This interface is not idempotent.
     * <strong>Throttling:</strong> Throttling will be triggered if you call this operation frequently. Do not exceed 5 times per second. If throttling is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a category in the specified workspace to categorize and manage documents. You can create up to 1,000 categories in each workspace.</p>
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
     * <p>  Before you call this operation, make sure that you have obtained the lease and uploaded the document to the temporary storage space by using the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-applyfileuploadlease">ApplyFileUploadLease</a> operation. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/upload-files-by-calling-api">Upload files by calling API</a>.</p>
     * <blockquote>
     * <p> After you call this operation, the used lease ID expires immediately. Do not use the same lease ID to submit new requests.</p>
     * </blockquote>
     * <ul>
     * <li>You must call this operation within 12 hours after you call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-applyfileuploadlease">ApplyFileUploadLease</a> operation. Otherwise, the lease expires and the request fails.</li>
     * <li>After you call this operation, the system parses and imports your document. The process takes some time.</li>
     * <li>This interface is not idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports an unstructured document stored in the temporary storage space to Data Management. You cannot use the API to import structured documents. Use the console instead.</p>
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
     * <p>  Before you call this operation, make sure that you have obtained the lease and uploaded the document to the temporary storage space by using the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-applyfileuploadlease">ApplyFileUploadLease</a> operation. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/upload-files-by-calling-api">Upload files by calling API</a>.</p>
     * <blockquote>
     * <p> After you call this operation, the used lease ID expires immediately. Do not use the same lease ID to submit new requests.</p>
     * </blockquote>
     * <ul>
     * <li>You must call this operation within 12 hours after you call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-applyfileuploadlease">ApplyFileUploadLease</a> operation. Otherwise, the lease expires and the request fails.</li>
     * <li>After you call this operation, the system parses and imports your document. The process takes some time.</li>
     * <li>This interface is not idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports an unstructured document stored in the temporary storage space to Data Management. You cannot use the API to import structured documents. Use the console instead.</p>
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
     * <p>将已授权OSS Bucket中的文件添加到百炼应用数据</p>
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
     * <b>summary</b> : 
     * <p>将已授权OSS Bucket中的文件添加到百炼应用数据</p>
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
     * <p>  This operation returns an HTTP URL that can be used to upload an unstructured document (the lease) and parameters required for the upload. Structured documents are not supported.</p>
     * <ul>
     * <li>The HTTP URL returned by this operation is valid only for minutes. Upload the document before the URL expires.</li>
     * <li>After you apply for a lease and upload a document, the document is stored in a temporary storage space for 12 hours. </li>
     * <li>This interface is not idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies for a document upload lease to upload a document.</p>
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
     * <p>  This operation returns an HTTP URL that can be used to upload an unstructured document (the lease) and parameters required for the upload. Structured documents are not supported.</p>
     * <ul>
     * <li>The HTTP URL returned by this operation is valid only for minutes. Upload the document before the URL expires.</li>
     * <li>After you apply for a lease and upload a document, the document is stored in a temporary storage space for 12 hours. </li>
     * <li>This interface is not idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies for a document upload lease to upload a document.</p>
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
     * <p>Configure the parsing method for a specific file type. For example, use LLM parsing for .pdf files, or use Qwen VL parsing for .jpg files.</p>
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
     * <b>summary</b> : 
     * <p>Configure the parsing method for a specific file type. For example, use LLM parsing for .pdf files, or use Qwen VL parsing for .jpg files.</p>
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
     * <p>  <strong>Limits</strong>: This operation can create only knowledge base of the document search type. Data query and image Q\&amp;A types are not supported. Use the console instead.</p>
     * <ul>
     * <li><strong>Required permissions</strong><ul>
     * <li><strong>RAM users</strong>: Must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> of Model Studio (such as the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:CreateIndex permission required), and <a href="https://help.aliyun.com/document_detail/2851098.html">become member of a workspace</a>.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has the permission by default, and can call the operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Call method</strong>: We recommend using the latest version of the <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">GenAI Service Platform SDK</a>. The SDK encapsulates complex signature computational logic to simplify the call process.</li>
     * <li><strong>What to do next</strong>: This operation only initializes knowledge base creation job. After that, call <strong>SubmitIndexJob</strong> to complete the creation. Otherwise, you will get an empty knowledge base. For more information about the sample code, see <a href="https://help.aliyun.com/document_detail/2852772.html">Knowledge base API guide</a>.</li>
     * <li><strong>Idempotence</strong>: This operation is not idempotent. If you call the operation for multiple times, you may create several knowledge bases with the same name. We recommend following a &quot;query first, then create&quot; logic.
     * <strong>Rate limit:</strong> Rate limiting will be triggered if you call this operation frequently. Do not exceed 10 times per second. If limiting is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a knowledge base of the document search type.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSource)) {
            request.dataSourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSource, "DataSource", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceShrink)) {
            query.put("DataSource", request.dataSourceShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.rerankMinScore)) {
            query.put("RerankMinScore", request.rerankMinScore);
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
     * <p>  <strong>Limits</strong>: This operation can create only knowledge base of the document search type. Data query and image Q\&amp;A types are not supported. Use the console instead.</p>
     * <ul>
     * <li><strong>Required permissions</strong><ul>
     * <li><strong>RAM users</strong>: Must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> of Model Studio (such as the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:CreateIndex permission required), and <a href="https://help.aliyun.com/document_detail/2851098.html">become member of a workspace</a>.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has the permission by default, and can call the operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Call method</strong>: We recommend using the latest version of the <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">GenAI Service Platform SDK</a>. The SDK encapsulates complex signature computational logic to simplify the call process.</li>
     * <li><strong>What to do next</strong>: This operation only initializes knowledge base creation job. After that, call <strong>SubmitIndexJob</strong> to complete the creation. Otherwise, you will get an empty knowledge base. For more information about the sample code, see <a href="https://help.aliyun.com/document_detail/2852772.html">Knowledge base API guide</a>.</li>
     * <li><strong>Idempotence</strong>: This operation is not idempotent. If you call the operation for multiple times, you may create several knowledge bases with the same name. We recommend following a &quot;query first, then create&quot; logic.
     * <strong>Rate limit:</strong> Rate limiting will be triggered if you call this operation frequently. Do not exceed 10 times per second. If limiting is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a knowledge base of the document search type.</p>
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
     * <b>summary</b> : 
     * <p>创建Memory</p>
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
     * <b>summary</b> : 
     * <p>创建Memory</p>
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
     * <p>创建记忆Node</p>
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
     * <p>创建记忆Node</p>
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
     * <b>summary</b> : 
     * <p>Creates a prompt template.</p>
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
     * <b>summary</b> : 
     * <p>Creates a prompt template.</p>
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
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgentWithOptions(String workspaceId, String appCode, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgent(String workspaceId, String appCode) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentWithOptions(workspaceId, appCode, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除类目</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategoryWithOptions(String CategoryId, String WorkspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <b>summary</b> : 
     * <p>删除类目</p>
     * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategory(String CategoryId, String WorkspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCategoryWithOptions(CategoryId, WorkspaceId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning</strong> After a text chunk is deleted, it cannot be restored. Proceed with caution.</li>
     * <li><strong>Required permissions</strong>:<ul>
     * <li><strong>RAM users</strong>: Must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> of Model Studio (such as the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:DeleteChunk permission required), and <a href="https://help.aliyun.com/document_detail/2851098.html">become member of a workspace</a>.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has the permission by default, and can call the operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Call method</strong>: We recommend using the latest version of the <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">GenAI Service Platform SDK</a>. The SDK encapsulates complex signature computational logic to simplify the call process.</li>
     * <li><strong>Delay</strong>: The update takes effect immediately. During peak hours, the update may take place in seconds.</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent. If you perform a repeated operation on a chunk that has already been deleted, the interface returns a success.
     * <strong>Rate limit:</strong> Rate limiting will be triggered if you call this operation frequently. Do not exceed 10 times per second. If limiting is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified text chunk from a knowledge base. The deleted chunk cannot be retrieved or recalled.</p>
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
     * <ul>
     * <li><strong>Warning</strong> After a text chunk is deleted, it cannot be restored. Proceed with caution.</li>
     * <li><strong>Required permissions</strong>:<ul>
     * <li><strong>RAM users</strong>: Must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> of Model Studio (such as the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:DeleteChunk permission required), and <a href="https://help.aliyun.com/document_detail/2851098.html">become member of a workspace</a>.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has the permission by default, and can call the operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Call method</strong>: We recommend using the latest version of the <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">GenAI Service Platform SDK</a>. The SDK encapsulates complex signature computational logic to simplify the call process.</li>
     * <li><strong>Delay</strong>: The update takes effect immediately. During peak hours, the update may take place in seconds.</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent. If you perform a repeated operation on a chunk that has already been deleted, the interface returns a success.
     * <strong>Rate limit:</strong> Rate limiting will be triggered if you call this operation frequently. Do not exceed 10 times per second. If limiting is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified text chunk from a knowledge base. The deleted chunk cannot be retrieved or recalled.</p>
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
     * <b>summary</b> : 
     * <p>删除文档</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFileWithOptions(String FileId, String WorkspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <b>summary</b> : 
     * <p>删除文档</p>
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFile(String FileId, String WorkspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFileWithOptions(FileId, WorkspaceId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>If a knowledge base is being called by an application, disassociate the knowledge base before you can delete it. To disassociate the knowledge base, you must use the console. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>.</li>
     * <li>After you delete a knowledge base, it cannot be recovered. We recommend that you proceed with caution.</li>
     * <li>Imported documents are not deleted from the <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> if you call this operation.</li>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified knowledge base permanently.</p>
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
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>If a knowledge base is being called by an application, disassociate the knowledge base before you can delete it. To disassociate the knowledge base, you must use the console. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>.</li>
     * <li>After you delete a knowledge base, it cannot be recovered. We recommend that you proceed with caution.</li>
     * <li>Imported documents are not deleted from the <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> if you call this operation.</li>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified knowledge base permanently.</p>
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
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>Only documents with the INSERT_ERROR and FINISH states can be deleted. To query the status of documents in a specified knowledge base, call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-listindexdocuments">ListIndexDocuments</a> operation.</li>
     * <li>After you delete a document, it cannot be recovered and the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-retrieve">Retrieve</a> operation cannot query information about the document. We recommend that you proceed with caution.</li>
     * <li>Imported documents are not deleted from the <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> if you call this operation.</li>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more documents from a specified unstructured knowledge base permanently.</p>
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
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>Only documents with the INSERT_ERROR and FINISH states can be deleted. To query the status of documents in a specified knowledge base, call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-listindexdocuments">ListIndexDocuments</a> operation.</li>
     * <li>After you delete a document, it cannot be recovered and the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-retrieve">Retrieve</a> operation cannot query information about the document. We recommend that you proceed with caution.</li>
     * <li>Imported documents are not deleted from the <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> if you call this operation.</li>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more documents from a specified unstructured knowledge base permanently.</p>
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
     * <b>summary</b> : 
     * <p>删除memory</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMemoryResponse
     */
    public DeleteMemoryResponse deleteMemoryWithOptions(String workspaceId, String memoryId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <b>summary</b> : 
     * <p>删除memory</p>
     * @return DeleteMemoryResponse
     */
    public DeleteMemoryResponse deleteMemory(String workspaceId, String memoryId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMemoryWithOptions(workspaceId, memoryId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除记忆Node</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMemoryNodeResponse
     */
    public DeleteMemoryNodeResponse deleteMemoryNodeWithOptions(String workspaceId, String memoryId, String memoryNodeId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <p>删除记忆Node</p>
     * @return DeleteMemoryNodeResponse
     */
    public DeleteMemoryNodeResponse deleteMemoryNode(String workspaceId, String memoryId, String memoryNodeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMemoryNodeWithOptions(workspaceId, memoryId, memoryNodeId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a prompt template based on the template ID.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePromptTemplateResponse
     */
    public DeletePromptTemplateResponse deletePromptTemplateWithOptions(String workspaceId, String promptTemplateId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * @return DeletePromptTemplateResponse
     */
    public DeletePromptTemplateResponse deletePromptTemplate(String workspaceId, String promptTemplateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePromptTemplateWithOptions(workspaceId, promptTemplateId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this API, make sure that your document is uploaded to the <a href="https://bailian.console.aliyun.com/knowledge-base#/data-center">Data Management</a> page of Alibaba Cloud Model Studio.</p>
     * <ul>
     * <li>You can also call this operation to query unstructured documents that you upload on the <a href="https://bailian.console.aliyun.com/knowledge-base#/data-center">Data Management</a> page.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong> Make sure that the interval between the two queries is at least 15 seconds. Otherwise, you may trigger system throttling. If throttling is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an unstructured document.</p>
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
     * <b>description</b> :
     * <p>Before you call this API, make sure that your document is uploaded to the <a href="https://bailian.console.aliyun.com/knowledge-base#/data-center">Data Management</a> page of Alibaba Cloud Model Studio.</p>
     * <ul>
     * <li>You can also call this operation to query unstructured documents that you upload on the <a href="https://bailian.console.aliyun.com/knowledge-base#/data-center">Data Management</a> page.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong> Make sure that the interval between the two queries is at least 15 seconds. Otherwise, you may trigger system throttling. If throttling is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an unstructured document.</p>
     * @return DescribeFileResponse
     */
    public DescribeFileResponse describeFile(String WorkspaceId, String FileId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeFileWithOptions(WorkspaceId, FileId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询支付宝打赏状态</p>
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
     * <p>查询支付宝打赏状态</p>
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
     * <p>支付宝打赏链接</p>
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
     * <p>支付宝打赏链接</p>
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
     * <ol>
     * <li>A knowledge base job is running. You can call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-submitindexjob">SubmitIndexJob</a> operation to create a creation job or the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-submitindexadddocumentsjob">SubmitIndexAddDocumentsJob</a> operation to create a add document job. Then, obtain the <code>JobId</code> returned by the operations.</li>
     * <li>We recommend that you call this operation at intervals of more than 5 seconds.</li>
     * <li>This interface is idempotent.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the current status of a specified knowledge base creation or add document job.</p>
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
     * <ol>
     * <li>A knowledge base job is running. You can call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-submitindexjob">SubmitIndexJob</a> operation to create a creation job or the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-submitindexadddocumentsjob">SubmitIndexAddDocumentsJob</a> operation to create a add document job. Then, obtain the <code>JobId</code> returned by the operations.</li>
     * <li>We recommend that you call this operation at intervals of more than 5 seconds.</li>
     * <li>This interface is idempotent.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the current status of a specified knowledge base creation or add document job.</p>
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
     * <b>summary</b> : 
     * <p>获取索引监控情况</p>
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
     * <b>summary</b> : 
     * <p>获取索引监控情况</p>
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
     * <b>summary</b> : 
     * <p>获取memory</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemoryResponse
     */
    public GetMemoryResponse getMemoryWithOptions(String workspaceId, String memoryId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <b>summary</b> : 
     * <p>获取memory</p>
     * @return GetMemoryResponse
     */
    public GetMemoryResponse getMemory(String workspaceId, String memoryId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryWithOptions(workspaceId, memoryId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取记忆Node</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemoryNodeResponse
     */
    public GetMemoryNodeResponse getMemoryNodeWithOptions(String workspaceId, String memoryId, String memoryNodeId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <p>获取记忆Node</p>
     * @return GetMemoryNodeResponse
     */
    public GetMemoryNodeResponse getMemoryNode(String workspaceId, String memoryId, String memoryNodeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryNodeWithOptions(workspaceId, memoryId, memoryNodeId, headers, runtime);
    }

    /**
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
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPromptTemplateResponse
     */
    public GetPromptTemplateResponse getPromptTemplateWithOptions(String workspaceId, String promptTemplateId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * @return GetPromptTemplateResponse
     */
    public GetPromptTemplateResponse getPromptTemplate(String workspaceId, String promptTemplateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPromptTemplateWithOptions(workspaceId, promptTemplateId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取发布态智能体应用</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPublishedAgentResponse
     */
    public GetPublishedAgentResponse getPublishedAgentWithOptions(String workspaceId, String appCode, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * @return GetPublishedAgentResponse
     */
    public GetPublishedAgentResponse getPublishedAgent(String workspaceId, String appCode) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPublishedAgentWithOptions(workspaceId, appCode, headers, runtime);
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
     * <b>summary</b> : 
     * <p>ListCategory</p>
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
     * <b>summary</b> : 
     * <p>ListCategory</p>
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
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>For unstructured knowledge base, obtains the details of all chunks of a specified document; for structured knowledge base, obtains the details of all chunks.</p>
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
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>For unstructured knowledge base, obtains the details of all chunks of a specified document; for structured knowledge base, obtains the details of all chunks.</p>
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
     * <p>  If you are using a RAM user, you must first obtain the OpenAPI management permissions (namely sfm:ListFile) of Model Studio. For more information, see <a href="https://help.aliyun.com/document_detail/2848578.html">Grant OpenAPI permissions to a RAM user</a>. If you are using the Alibaba Cloud account, you do not need permissions. We recommend that you use <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">the latest version of the SDK</a> to call this operation.</p>
     * <ul>
     * <li>During a paged query, set <code>MaxResults</code> to specify the maximum number of entries to return. The return value of <code>NextToken</code> is a pagination token that can be used in the next call to retrieve a new page of results. When you query subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> obtained in the last returned result. You can also set the <code>MaxResults</code> parameter to limit the number of entries to be returned. If no <code>NextToken</code> is returned, the result is completely returned and no more requests are required.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong> Throttling will be triggered if you call this operation frequently. Do not exceed 5 times per second. If throttling is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of one or more documents in a specified category.</p>
     * 
     * @param request ListFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFileResponse
     */
    public ListFileResponse listFileWithOptions(String WorkspaceId, ListFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
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
     * <p>  If you are using a RAM user, you must first obtain the OpenAPI management permissions (namely sfm:ListFile) of Model Studio. For more information, see <a href="https://help.aliyun.com/document_detail/2848578.html">Grant OpenAPI permissions to a RAM user</a>. If you are using the Alibaba Cloud account, you do not need permissions. We recommend that you use <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">the latest version of the SDK</a> to call this operation.</p>
     * <ul>
     * <li>During a paged query, set <code>MaxResults</code> to specify the maximum number of entries to return. The return value of <code>NextToken</code> is a pagination token that can be used in the next call to retrieve a new page of results. When you query subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> obtained in the last returned result. You can also set the <code>MaxResults</code> parameter to limit the number of entries to be returned. If no <code>NextToken</code> is returned, the result is completely returned and no more requests are required.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong> Throttling will be triggered if you call this operation frequently. Do not exceed 5 times per second. If throttling is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of one or more documents in a specified category.</p>
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
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of one or more documents in a specified knowledge base.</p>
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
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of one or more documents in a specified knowledge base.</p>
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
     * <b>summary</b> : 
     * <p>查询Index文件详情</p>
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
     * <b>summary</b> : 
     * <p>查询Index文件详情</p>
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
     * <p>This interface is idempotent.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists knowledge bases in a specified workspace.</p>
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
     * <p>This interface is idempotent.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists knowledge bases in a specified workspace.</p>
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
     * <b>summary</b> : 
     * <p>获取memory</p>
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
     * <b>summary</b> : 
     * <p>获取memory</p>
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
     * <p>获取记忆Node列表</p>
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
     * <p>获取记忆Node列表</p>
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
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>The response time may be long because this operation involves complex retrieval and matching. We recommend that you set appropriate timeout and retry policy for requests.</li>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information from a specified knowledge base.</p>
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
     * <p>  Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</p>
     * <ul>
     * <li>The response time may be long because this operation involves complex retrieval and matching. We recommend that you set appropriate timeout and retry policy for requests.</li>
     * <li>This interface is idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information from a specified knowledge base.</p>
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
     * <p>  You must first upload documents to <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> and obtain the <code>FileId</code>. The documents are the knowledge source of the knowledge base. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/data-import-instructions">Import Data</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</li>
     * <li>After you call this operation, you can call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-getindexjobstatus">GetIndexJobStatus</a> operation to query the status of the job. More than 20 calls to the GetIndexJobStatus operation per minute may trigger throttling.</li>
     * <li>Execution takes a period of time after this operation is called. Do not make new request before the request is returned. This interface is not idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds parsed documents to an unstructured knowledge base.</p>
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
     * <p>  You must first upload documents to <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> and obtain the <code>FileId</code>. The documents are the knowledge source of the knowledge base. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/data-import-instructions">Import Data</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that your knowledge base is created and is not deleted. That is, the primary key ID of the knowledge base <code>IndexId</code> is valid.</li>
     * <li>After you call this operation, you can call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-getindexjobstatus">GetIndexJobStatus</a> operation to query the status of the job. More than 20 calls to the GetIndexJobStatus operation per minute may trigger throttling.</li>
     * <li>Execution takes a period of time after this operation is called. Do not make new request before the request is returned. This interface is not idempotent.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds parsed documents to an unstructured knowledge base.</p>
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
     * <ol>
     * <li>Before you call this operation, you must call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation and obtain the <code>IndexId</code>.</li>
     * <li>Execution takes a period of time after this operation is called. Do not make new request before the request is returned.</li>
     * <li>If you want to query the execution status of the job after you call this operation, call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-getindexjobstatus">GetIndexJobStatus</a> operation.</li>
     * <li>This interface is not idempotent.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Submits a specified CreateIndex job to complete knowledge base creation.</p>
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
     * <ol>
     * <li>Before you call this operation, you must call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation and obtain the <code>IndexId</code>.</li>
     * <li>Execution takes a period of time after this operation is called. Do not make new request before the request is returned.</li>
     * <li>If you want to query the execution status of the job after you call this operation, call the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-getindexjobstatus">GetIndexJobStatus</a> operation.</li>
     * <li>This interface is not idempotent.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Submits a specified CreateIndex job to complete knowledge base creation.</p>
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
     * <p>  <strong>Limits</strong>: This operation supports only knowledge base of the document search type. Data query and image Q\&amp;A types are not supported.</p>
     * <ul>
     * <li><strong>Required permissions</strong>:<ul>
     * <li><strong>RAM users</strong>: Must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> of Model Studio (such as the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:UpdateChunk permission required), and <a href="https://help.aliyun.com/document_detail/2851098.html">become member of a workspace</a>.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has the permission by default, and can call the operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Call method</strong>: We recommend using the latest version of the <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">GenAI Service Platform SDK</a>. The SDK encapsulates complex signature computational logic to simplify the call process.</li>
     * <li><strong>Delay</strong>: The update takes effect immediately. During peak hours, the update may take place in seconds.</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent. If you perform a repeated operation on a chunk that has already been updated, the interface returns a success.
     * <strong>Rate limit:</strong> Rate limiting will be triggered if you call this operation frequently. Do not exceed 10 times per second. If limiting is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the content and title of a specified text chunk in the knowledge base, and sets whether the chunk participates in knowledge base retrieval.</p>
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
     * <p>  <strong>Limits</strong>: This operation supports only knowledge base of the document search type. Data query and image Q\&amp;A types are not supported.</p>
     * <ul>
     * <li><strong>Required permissions</strong>:<ul>
     * <li><strong>RAM users</strong>: Must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> of Model Studio (such as the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:UpdateChunk permission required), and <a href="https://help.aliyun.com/document_detail/2851098.html">become member of a workspace</a>.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has the permission by default, and can call the operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Call method</strong>: We recommend using the latest version of the <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">GenAI Service Platform SDK</a>. The SDK encapsulates complex signature computational logic to simplify the call process.</li>
     * <li><strong>Delay</strong>: The update takes effect immediately. During peak hours, the update may take place in seconds.</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent. If you perform a repeated operation on a chunk that has already been updated, the interface returns a success.
     * <strong>Rate limit:</strong> Rate limiting will be triggered if you call this operation frequently. Do not exceed 10 times per second. If limiting is triggered, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the content and title of a specified text chunk in the knowledge base, and sets whether the chunk participates in knowledge base retrieval.</p>
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
     * <b>summary</b> : 
     * <p>更新文档Tag</p>
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
     * <b>summary</b> : 
     * <p>更新文档Tag</p>
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
     * <b>summary</b> : 
     * <p>更新索引任务</p>
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
     * <b>summary</b> : 
     * <p>更新索引任务</p>
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
     * <b>summary</b> : 
     * <p>更新memory</p>
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
     * <b>summary</b> : 
     * <p>更新memory</p>
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
     * <p>更新记忆Node</p>
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
     * <p>更新记忆Node</p>
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
}
