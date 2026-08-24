// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvusknowledgebase20260604;

import com.aliyun.tea.*;
import com.aliyun.milvusknowledgebase20260604.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("milvusknowledgebase", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Registers files that are uploaded to the knowledge base storage as knowledge base documents and <strong>automatically triggers parsing</strong> (chunking and embedding). Two import types are supported:</p>
     * <ul>
     * <li><code>LOCAL_UPLOAD</code>: Works with the <code>GetKnowledgeBasePreSignedUrl</code> direct upload flow. This operation only registers the file and does not verify whether the file is actually uploaded. Therefore, you must complete the PUT upload before calling this operation.</li>
     * <li><code>OSS_IMPORT</code>: Imports files from an external OSS bucket. The operation creates an asynchronous import task and returns a <code>knowledge_import_task_id</code>. The system downloads and registers the files in the background.
     * A maximum of 100 files can be registered in a single request.</li>
     * </ul>
     * 
     * @param request AddDocumentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDocumentsResponse
     */
    public AddDocumentsResponse addDocumentsWithOptions(String datasetId, AddDocumentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedup)) {
            body.put("Dedup", request.dedup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documents)) {
            body.put("Documents", request.documents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importType)) {
            body.put("ImportType", request.importType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeBaseId)) {
            body.put("KnowledgeBaseId", request.knowledgeBaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaFields)) {
            body.put("MetaFields", request.metaFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyId)) {
            body.put("StrategyId", request.strategyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingTalkConfiguration)) {
            body.put("dingTalkConfiguration", request.dingTalkConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("parentId", request.parentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDocuments"),
            new TeaPair("version", "2026-06-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasets/" + com.aliyun.openapiutil.Client.getEncodeParam(datasetId) + "/documents/addDocuments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDocumentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Registers files that are uploaded to the knowledge base storage as knowledge base documents and <strong>automatically triggers parsing</strong> (chunking and embedding). Two import types are supported:</p>
     * <ul>
     * <li><code>LOCAL_UPLOAD</code>: Works with the <code>GetKnowledgeBasePreSignedUrl</code> direct upload flow. This operation only registers the file and does not verify whether the file is actually uploaded. Therefore, you must complete the PUT upload before calling this operation.</li>
     * <li><code>OSS_IMPORT</code>: Imports files from an external OSS bucket. The operation creates an asynchronous import task and returns a <code>knowledge_import_task_id</code>. The system downloads and registers the files in the background.
     * A maximum of 100 files can be registered in a single request.</li>
     * </ul>
     * 
     * @param request AddDocumentsRequest
     * @return AddDocumentsResponse
     */
    public AddDocumentsResponse addDocuments(String datasetId, AddDocumentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDocumentsWithOptions(datasetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates an <strong>OSS pre-signed PUT URL</strong> pointing to the knowledge base dedicated storage for each file in <code>Documents</code>. The caller uses the URL to upload file content directly to Object Storage Service (OSS), and then calls <code>AddDocuments</code> to register the files. A maximum of 100 files can be processed per request.</p>
     * 
     * @param request GetKnowledgeBasePreSignedUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKnowledgeBasePreSignedUrlResponse
     */
    public GetKnowledgeBasePreSignedUrlResponse getKnowledgeBasePreSignedUrlWithOptions(String datasetId, GetKnowledgeBasePreSignedUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documents)) {
            body.put("Documents", request.documents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiresIn)) {
            body.put("ExpiresIn", request.expiresIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeBaseId)) {
            body.put("KnowledgeBaseId", request.knowledgeBaseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKnowledgeBasePreSignedUrl"),
            new TeaPair("version", "2026-06-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasets/" + com.aliyun.openapiutil.Client.getEncodeParam(datasetId) + "/getKnowledgeBasePreSignedUrl"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKnowledgeBasePreSignedUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates an <strong>OSS pre-signed PUT URL</strong> pointing to the knowledge base dedicated storage for each file in <code>Documents</code>. The caller uses the URL to upload file content directly to Object Storage Service (OSS), and then calls <code>AddDocuments</code> to register the files. A maximum of 100 files can be processed per request.</p>
     * 
     * @param request GetKnowledgeBasePreSignedUrlRequest
     * @return GetKnowledgeBasePreSignedUrlResponse
     */
    public GetKnowledgeBasePreSignedUrlResponse getKnowledgeBasePreSignedUrl(String datasetId, GetKnowledgeBasePreSignedUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getKnowledgeBasePreSignedUrlWithOptions(datasetId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves documents from a specified knowledge base by question or image. Use DRAFT, LATEST_PUBLISHED, or vN display names for the version. Pass tag filter conditions using the actual backend operators.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves documents from a knowledge base.</p>
     * 
     * @param request SearchKnowledgeBaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchKnowledgeBaseResponse
     */
    public SearchKnowledgeBaseResponse searchKnowledgeBaseWithOptions(String knowledgeBaseId, SearchKnowledgeBaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentIds)) {
            body.put("documentIds", request.documentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableKnowledgeGraph)) {
            body.put("enableKnowledgeGraph", request.enableKnowledgeGraph);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            body.put("image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankModelId)) {
            body.put("rerankModelId", request.rerankModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankModelName)) {
            body.put("rerankModelName", request.rerankModelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retrievalConfig)) {
            body.put("retrievalConfig", request.retrievalConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagFilter)) {
            body.put("tagFilter", request.tagFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchKnowledgeBase"),
            new TeaPair("version", "2026-06-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/knowledge-bases/" + com.aliyun.openapiutil.Client.getEncodeParam(knowledgeBaseId) + "/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchKnowledgeBaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves documents from a specified knowledge base by question or image. Use DRAFT, LATEST_PUBLISHED, or vN display names for the version. Pass tag filter conditions using the actual backend operators.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves documents from a knowledge base.</p>
     * 
     * @param request SearchKnowledgeBaseRequest
     * @return SearchKnowledgeBaseResponse
     */
    public SearchKnowledgeBaseResponse searchKnowledgeBase(String knowledgeBaseId, SearchKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchKnowledgeBaseWithOptions(knowledgeBaseId, request, headers, runtime);
    }
}
