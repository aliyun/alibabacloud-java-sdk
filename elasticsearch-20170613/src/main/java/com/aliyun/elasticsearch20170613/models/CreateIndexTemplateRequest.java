// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateIndexTemplateRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataStream")
    public Boolean dataStream;

    @NameInMap("ilmPolicy")
    public String ilmPolicy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("indexPatterns")
    public java.util.List<String> indexPatterns;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("indexTemplate")
    public String indexTemplate;

    @NameInMap("priority")
    public Integer priority;

    @NameInMap("template")
    public CreateIndexTemplateRequestTemplate template;

    public static CreateIndexTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexTemplateRequest self = new CreateIndexTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateIndexTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIndexTemplateRequest setDataStream(Boolean dataStream) {
        this.dataStream = dataStream;
        return this;
    }
    public Boolean getDataStream() {
        return this.dataStream;
    }

    public CreateIndexTemplateRequest setIlmPolicy(String ilmPolicy) {
        this.ilmPolicy = ilmPolicy;
        return this;
    }
    public String getIlmPolicy() {
        return this.ilmPolicy;
    }

    public CreateIndexTemplateRequest setIndexPatterns(java.util.List<String> indexPatterns) {
        this.indexPatterns = indexPatterns;
        return this;
    }
    public java.util.List<String> getIndexPatterns() {
        return this.indexPatterns;
    }

    public CreateIndexTemplateRequest setIndexTemplate(String indexTemplate) {
        this.indexTemplate = indexTemplate;
        return this;
    }
    public String getIndexTemplate() {
        return this.indexTemplate;
    }

    public CreateIndexTemplateRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateIndexTemplateRequest setTemplate(CreateIndexTemplateRequestTemplate template) {
        this.template = template;
        return this;
    }
    public CreateIndexTemplateRequestTemplate getTemplate() {
        return this.template;
    }

    public static class CreateIndexTemplateRequestTemplate extends TeaModel {
        @NameInMap("aliases")
        public String aliases;

        @NameInMap("mappings")
        public String mappings;

        @NameInMap("settings")
        public String settings;

        public static CreateIndexTemplateRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateIndexTemplateRequestTemplate self = new CreateIndexTemplateRequestTemplate();
            return TeaModel.build(map, self);
        }

        public CreateIndexTemplateRequestTemplate setAliases(String aliases) {
            this.aliases = aliases;
            return this;
        }
        public String getAliases() {
            return this.aliases;
        }

        public CreateIndexTemplateRequestTemplate setMappings(String mappings) {
            this.mappings = mappings;
            return this;
        }
        public String getMappings() {
            return this.mappings;
        }

        public CreateIndexTemplateRequestTemplate setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

    }

}
