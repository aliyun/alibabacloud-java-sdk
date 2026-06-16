// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417;

import com.aliyun.tea.*;
import com.aliyun.aisearchengine20260417.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aisearchengine", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <h2>Operation description</h2>
     * <p>This operation supports calling two types of search applications on the <a href="https://aisearch.aliyun.com/web-search">CleverSee AI Search platform</a>: <strong>image search applications</strong> (text-to-image, image-to-image, and combined text-and-image search) and <strong>audio/video search applications</strong> (text-to-audio/video, image-to-video, and combined text-and-image-to-video search).</p>
     * <h3>Data sources</h3>
     * <p>Audio and video data is supported. You can upload and update data through the <a href="https://aisearch.aliyun.com/web-search">CleverSee AI Search platform</a> UI or through the <a href="https://www.alibabacloud.com/help/en/document_detail/3038471.html">Dataset Data Add/Update API</a>.</p>
     * <h1>Authentication</h1>
     * <p>Call the CleverSee - Intelligent Search service by using the Alibaba Cloud SDK. For more information, see <a href="https://api.aliyun.com/document/AiSearchEngine/2026-04-17/EngineSearch">AI search engine operation</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Provides a search API operation for the CleverSee AI Search platform. After you create a search application on the platform, you can invoke this search API operation to retrieve images, documents, and audio/video content in datasets. The platform supports text (natural language), image, or combined text-and-image input, enabling fast adaptation to multi-modal large-scale data search scenarios and helping you efficiently locate target content.</p>
     * 
     * @param request EngineSearchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EngineSearchResponse
     */
    public EngineSearchResponse engineSearchWithOptions(EngineSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grey)) {
            body.put("grey", request.grey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            body.put("user", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EngineSearch"),
            new TeaPair("version", "2026-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/platform/app/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EngineSearchResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation supports calling two types of search applications on the <a href="https://aisearch.aliyun.com/web-search">CleverSee AI Search platform</a>: <strong>image search applications</strong> (text-to-image, image-to-image, and combined text-and-image search) and <strong>audio/video search applications</strong> (text-to-audio/video, image-to-video, and combined text-and-image-to-video search).</p>
     * <h3>Data sources</h3>
     * <p>Audio and video data is supported. You can upload and update data through the <a href="https://aisearch.aliyun.com/web-search">CleverSee AI Search platform</a> UI or through the <a href="https://www.alibabacloud.com/help/en/document_detail/3038471.html">Dataset Data Add/Update API</a>.</p>
     * <h1>Authentication</h1>
     * <p>Call the CleverSee - Intelligent Search service by using the Alibaba Cloud SDK. For more information, see <a href="https://api.aliyun.com/document/AiSearchEngine/2026-04-17/EngineSearch">AI search engine operation</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Provides a search API operation for the CleverSee AI Search platform. After you create a search application on the platform, you can invoke this search API operation to retrieve images, documents, and audio/video content in datasets. The platform supports text (natural language), image, or combined text-and-image input, enabling fast adaptation to multi-modal large-scale data search scenarios and helping you efficiently locate target content.</p>
     * 
     * @param request EngineSearchRequest
     * @return EngineSearchResponse
     */
    public EngineSearchResponse engineSearch(EngineSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.engineSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a temporary secure access URL for an underlying media resource (such as audio, video, or image) stored in AI Search Platform, based on the dataset ID and data primary key. The URL can be used directly for frontend display or download.
     * Key use case: When you make a Search API call for a search application created in AI Search Platform, the returned image, audio, and video result URLs are pre-signed links with a validity period of 24 hours. If your application persists these URLs in local storage, subsequent access may fail because the URLs have expired. In this case, invoke this operation with the corresponding dataset ID and data record primary key to retrieve the latest valid access URL for the resource.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a temporary public network access URL for an image, audio, or video resource in your dataset.</p>
     * 
     * @param request GetDatasetResourceUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatasetResourceUrlResponse
     */
    public GetDatasetResourceUrlResponse getDatasetResourceUrlWithOptions(GetDatasetResourceUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            body.put("datasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryKey)) {
            body.put("primaryKey", request.primaryKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatasetResourceUrl"),
            new TeaPair("version", "2026-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/dataset/open/resources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatasetResourceUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a temporary secure access URL for an underlying media resource (such as audio, video, or image) stored in AI Search Platform, based on the dataset ID and data primary key. The URL can be used directly for frontend display or download.
     * Key use case: When you make a Search API call for a search application created in AI Search Platform, the returned image, audio, and video result URLs are pre-signed links with a validity period of 24 hours. If your application persists these URLs in local storage, subsequent access may fail because the URLs have expired. In this case, invoke this operation with the corresponding dataset ID and data record primary key to retrieve the latest valid access URL for the resource.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a temporary public network access URL for an image, audio, or video resource in your dataset.</p>
     * 
     * @param request GetDatasetResourceUrlRequest
     * @return GetDatasetResourceUrlResponse
     */
    public GetDatasetResourceUrlResponse getDatasetResourceUrl(GetDatasetResourceUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatasetResourceUrlWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Common scenarios</em>*</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Scenario</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Real-time data addition</td>
     * <td>Pushes new data to the AI search platform in real time when the business system generates new data.</td>
     * </tr>
     * <tr>
     * <td>Status update</td>
     * <td>Promptly updates data when changes occur on the business side, such as title modifications or delisting.</td>
     * </tr>
     * <tr>
     * <td><strong>Before you begin</strong></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><strong>Primary key handling</strong>: The system determines whether to add or update a record based on the primary key type (user-defined or system-generated) of the target dataset.</li>
     * <li><strong>Batch limit</strong>: A maximum of 100 records can be processed per request.</li>
     * <li><strong>Schema matching</strong>: The <code>records</code> field must strictly follow the schema configured for the target dataset in the console.</li>
     * <li><strong>Permission requirements</strong>: Make sure you have sufficient permissions to write to or update the target dataset.</li>
     * <li><strong>Status check</strong>: Before sending a request, confirm that the target dataset is in a writable state and not in read-only mode.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds or updates data in a specific dataset in real time. The system matches records based on the primary key value of the target dataset and the primary key value of the new data record (such as &quot;pk_id&quot; = &quot;2026aa01&quot;). If a matching primary key value is found, the corresponding data record is updated. If no match is found, a new data record is added.</p>
     * 
     * @param request ImportDatasetDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportDatasetDataResponse
     */
    public ImportDatasetDataResponse importDatasetDataWithOptions(ImportDatasetDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            body.put("datasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.records)) {
            body.put("records", request.records);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportDatasetData"),
            new TeaPair("version", "2026-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/dataset/open/upsert"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportDatasetDataResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Common scenarios</em>*</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Scenario</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Real-time data addition</td>
     * <td>Pushes new data to the AI search platform in real time when the business system generates new data.</td>
     * </tr>
     * <tr>
     * <td>Status update</td>
     * <td>Promptly updates data when changes occur on the business side, such as title modifications or delisting.</td>
     * </tr>
     * <tr>
     * <td><strong>Before you begin</strong></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><strong>Primary key handling</strong>: The system determines whether to add or update a record based on the primary key type (user-defined or system-generated) of the target dataset.</li>
     * <li><strong>Batch limit</strong>: A maximum of 100 records can be processed per request.</li>
     * <li><strong>Schema matching</strong>: The <code>records</code> field must strictly follow the schema configured for the target dataset in the console.</li>
     * <li><strong>Permission requirements</strong>: Make sure you have sufficient permissions to write to or update the target dataset.</li>
     * <li><strong>Status check</strong>: Before sending a request, confirm that the target dataset is in a writable state and not in read-only mode.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds or updates data in a specific dataset in real time. The system matches records based on the primary key value of the target dataset and the primary key value of the new data record (such as &quot;pk_id&quot; = &quot;2026aa01&quot;). If a matching primary key value is found, the corresponding data record is updated. If no match is found, a new data record is added.</p>
     * 
     * @param request ImportDatasetDataRequest
     * @return ImportDatasetDataResponse
     */
    public ImportDatasetDataResponse importDatasetData(ImportDatasetDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importDatasetDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Streaming API for <a href="https://aisearch.aliyun.com/web-search">CleverSee AI Search Platform</a> intelligent Q&amp;A applications, supporting multimodal input (text, images, structured data) and streaming output (text, images, video, sources, etc.). The API uses the SSE (Server-Sent Events) protocol to push response data, where each data stream is a JSON object with different data types identified by the <code>type</code> field.</p>
     * <h3>Integration Guide:</h3>
     * <p>Streaming API for intelligent Q&amp;A, supporting multimodal input (text, images, structured data) and streaming output (text, images, video, sources, etc.). The API uses the SSE (Server-Sent Events) protocol to push response data, where each data stream is a JSON object with different data types identified by the <code>type</code> field.</p>
     * <h3>Data Sources:</h3>
     * <p>Supports video Q&amp;A. Data can be uploaded and updated through the <a href="https://aisearch.aliyun.com/web-search">CleverSee AI Search Platform</a> product interface or via the <a href="https://help.aliyun.com/zh/document_detail/3038471.html?spm=a2c4g.11186623.help-menu-3037946.d_0_2_1_0.54ed1e97NGXVV1&scm=20140722.H_3038471._.OR_help-T_cn~zh-V_1">Dataset Data Add/Update API</a>.</p>
     * <h1>Authentication</h1>
     * <p>Call the CleverSee - Intelligent Q&amp;A service through the Alibaba Cloud SDK. For the detailed calling guide, please refer to: <a href="https://api.aliyun.com/document/AiSearchEngine/2026-04-17/QaChat">AI Q&amp;A Engine API</a></p>
     * 
     * <b>summary</b> : 
     * <p>Build Q&amp;A applications leveraging powerful omni-modal search and comprehension capabilities on the CleverSee AI Search Platform, enabling deep understanding and precise Q&amp;A over images, documents, and video content in datasets. The platform supports flexible customization of the Q&amp;A assistant\&quot;s response style and interaction mode, allowing rapid adaptation to diverse large-scale data Q&amp;A scenarios. Users can ask questions via text, images, or a combination of both, and the platform performs deep semantic understanding across the complete dataset, producing answers in multiple formats including text, images, and video. For video content, the platform also provides template-based output capabilities for generating customized content summaries, information extraction, and video scripts.</p>
     * 
     * @param request QaChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QaChatResponse
     */
    public QaChatResponse qaChatWithOptions(QaChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            body.put("message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QaChat"),
            new TeaPair("version", "2026-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/platform/app/chat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QaChatResponse());
    }

    /**
     * <b>description</b> :
     * <p>Streaming API for <a href="https://aisearch.aliyun.com/web-search">CleverSee AI Search Platform</a> intelligent Q&amp;A applications, supporting multimodal input (text, images, structured data) and streaming output (text, images, video, sources, etc.). The API uses the SSE (Server-Sent Events) protocol to push response data, where each data stream is a JSON object with different data types identified by the <code>type</code> field.</p>
     * <h3>Integration Guide:</h3>
     * <p>Streaming API for intelligent Q&amp;A, supporting multimodal input (text, images, structured data) and streaming output (text, images, video, sources, etc.). The API uses the SSE (Server-Sent Events) protocol to push response data, where each data stream is a JSON object with different data types identified by the <code>type</code> field.</p>
     * <h3>Data Sources:</h3>
     * <p>Supports video Q&amp;A. Data can be uploaded and updated through the <a href="https://aisearch.aliyun.com/web-search">CleverSee AI Search Platform</a> product interface or via the <a href="https://help.aliyun.com/zh/document_detail/3038471.html?spm=a2c4g.11186623.help-menu-3037946.d_0_2_1_0.54ed1e97NGXVV1&scm=20140722.H_3038471._.OR_help-T_cn~zh-V_1">Dataset Data Add/Update API</a>.</p>
     * <h1>Authentication</h1>
     * <p>Call the CleverSee - Intelligent Q&amp;A service through the Alibaba Cloud SDK. For the detailed calling guide, please refer to: <a href="https://api.aliyun.com/document/AiSearchEngine/2026-04-17/QaChat">AI Q&amp;A Engine API</a></p>
     * 
     * <b>summary</b> : 
     * <p>Build Q&amp;A applications leveraging powerful omni-modal search and comprehension capabilities on the CleverSee AI Search Platform, enabling deep understanding and precise Q&amp;A over images, documents, and video content in datasets. The platform supports flexible customization of the Q&amp;A assistant\&quot;s response style and interaction mode, allowing rapid adaptation to diverse large-scale data Q&amp;A scenarios. Users can ask questions via text, images, or a combination of both, and the platform performs deep semantic understanding across the complete dataset, producing answers in multiple formats including text, images, and video. For video content, the platform also provides template-based output capabilities for generating customized content summaries, information extraction, and video scripts.</p>
     * 
     * @param request QaChatRequest
     * @return QaChatResponse
     */
    public QaChatResponse qaChat(QaChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.qaChatWithOptions(request, headers, runtime);
    }
}
