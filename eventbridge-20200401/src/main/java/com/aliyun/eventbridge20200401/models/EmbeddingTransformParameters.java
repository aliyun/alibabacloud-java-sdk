// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EmbeddingTransformParameters extends TeaModel {
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("EmbeddingData")
    public EmbeddingTransformParametersEmbeddingData embeddingData;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
