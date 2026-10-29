// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EmbeddingTransformParameters extends TeaModel {
    /**
     * <p>The API key used to call the Model Studio embedding model service.</p>
     * 
     * <strong>example:</strong>
     * <p>Q37sQ****</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The input data to be vectorized and its transformation method.</p>
     */
    @NameInMap("EmbeddingData")
    public EmbeddingTransformParametersEmbeddingData embeddingData;

    /**
     * <p>The name of the model used to generate embeddings.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v3</p>
     */
    @NameInMap("EmbeddingModel")
    public String embeddingModel;

    public static EmbeddingTransformParameters build(java.util.Map<String, ?> map) throws Exception {
        EmbeddingTransformParameters self = new EmbeddingTransformParameters();
        return TeaModel.build(map, self);
    }

    public EmbeddingTransformParameters setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public EmbeddingTransformParameters setEmbeddingData(EmbeddingTransformParametersEmbeddingData embeddingData) {
        this.embeddingData = embeddingData;
        return this;
    }
    public EmbeddingTransformParametersEmbeddingData getEmbeddingData() {
        return this.embeddingData;
    }

    public EmbeddingTransformParameters setEmbeddingModel(String embeddingModel) {
        this.embeddingModel = embeddingModel;
        return this;
    }
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    public static class EmbeddingTransformParametersEmbeddingData extends TeaModel {
        /**
         * <p>The method used to generate the input data. JSONPATH indicates that data is extracted from the event by using JSONPath.</p>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template used to build the input data. This parameter is used only when Form is set to TEMPLATE.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The source content of the input data. If Form is set to JSONPATH, specify a JSONPath expression.</p>
         * 
         * <strong>example:</strong>
         * <p>$.data.message</p>
         */
        @NameInMap("Value")
        public String value;

        public static EmbeddingTransformParametersEmbeddingData build(java.util.Map<String, ?> map) throws Exception {
            EmbeddingTransformParametersEmbeddingData self = new EmbeddingTransformParametersEmbeddingData();
            return TeaModel.build(map, self);
        }

        public EmbeddingTransformParametersEmbeddingData setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public EmbeddingTransformParametersEmbeddingData setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public EmbeddingTransformParametersEmbeddingData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
