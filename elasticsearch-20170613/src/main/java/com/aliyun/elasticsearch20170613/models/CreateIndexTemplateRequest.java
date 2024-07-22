// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateIndexTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E1136AE9-4E49-4585-9358-6FDD2A6D****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataStream")
    public Boolean dataStream;

    /**
     * <strong>example:</strong>
     * <p>policy-1</p>
     */
    @NameInMap("ilmPolicy")
    public String ilmPolicy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("indexPatterns")
    public java.util.List<String> indexPatterns;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>index-template</p>
     */
    @NameInMap("indexTemplate")
    public String indexTemplate;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>{&quot;mydata&quot;: {}}</p>
         */
        @NameInMap("aliases")
        public String aliases;

        /**
         * <strong>example:</strong>
         * <p>{&quot;properties&quot;: {&quot;created_at&quot;: {&quot;type&quot;: &quot;date&quot;,&quot;format&quot;: &quot;EEE MMM dd HH:mm:ss Z yyyy&quot;},&quot;host_name&quot;: {&quot;type&quot;: &quot;keyword&quot;}}}</p>
         */
        @NameInMap("mappings")
        public String mappings;

        /**
         * <strong>example:</strong>
         * <p>{&quot;index.refresh_interval&quot;:&quot;1s&quot;}</p>
         */
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
