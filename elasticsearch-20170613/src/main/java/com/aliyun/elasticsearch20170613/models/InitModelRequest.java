// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InitModelRequest extends TeaModel {
    /**
     * <p>The API key for the AISearch open platform.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>os-xfdddf*</p>
     */
    @NameInMap("api_key")
    public String apiKey;

    /**
     * <p>The service registration address of the AISearch open platform.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>****.platform-cn-hangzhou-vpc.opensearch.aliyuncs.com</p>
     */
    @NameInMap("host")
    public String host;

    /**
     * <p>The HTTP protocol type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>https</p>
     */
    @NameInMap("http_schema")
    public String httpSchema;

    /**
     * <p>The models to initialize. If this parameter is left empty, all built-in models are initialized.</p>
     */
    @NameInMap("models")
    public java.util.List<InitModelRequestModels> models;

    /**
     * <p>The workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static InitModelRequest build(java.util.Map<String, ?> map) throws Exception {
        InitModelRequest self = new InitModelRequest();
        return TeaModel.build(map, self);
    }

    public InitModelRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public InitModelRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public InitModelRequest setHttpSchema(String httpSchema) {
        this.httpSchema = httpSchema;
        return this;
    }
    public String getHttpSchema() {
        return this.httpSchema;
    }

    public InitModelRequest setModels(java.util.List<InitModelRequestModels> models) {
        this.models = models;
        return this;
    }
    public java.util.List<InitModelRequestModels> getModels() {
        return this.models;
    }

    public InitModelRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class InitModelRequestModels extends TeaModel {
        /**
         * <p>The model type. Valid values:</p>
         * <ul>
         * <li>text_embedding: text embedding</li>
         * <li>rerank: reranking</li>
         * <li>doc_split: document splitting</li>
         * <li>completion: large language model service</li>
         * <li>query_analyze: query analysis</li>
         * <li>doc_analyze: document content parsing</li>
         * <li>img_analyze: image content parsing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text_embedding</p>
         */
        @NameInMap("modelType")
        public String modelType;

        /**
         * <p>The service ID of the AISearch open platform.</p>
         * 
         * <strong>example:</strong>
         * <p>ops-text-embedding-**</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        public static InitModelRequestModels build(java.util.Map<String, ?> map) throws Exception {
            InitModelRequestModels self = new InitModelRequestModels();
            return TeaModel.build(map, self);
        }

        public InitModelRequestModels setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public InitModelRequestModels setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

    }

}
