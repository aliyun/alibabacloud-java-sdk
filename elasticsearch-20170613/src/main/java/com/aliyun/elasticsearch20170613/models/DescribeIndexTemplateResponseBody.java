// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeIndexTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeIndexTemplateResponseBodyResult result;

    public static DescribeIndexTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIndexTemplateResponseBody self = new DescribeIndexTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIndexTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIndexTemplateResponseBody setResult(DescribeIndexTemplateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeIndexTemplateResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeIndexTemplateResponseBodyResultTemplate extends TeaModel {
        @NameInMap("aliases")
        public String aliases;

        @NameInMap("mappings")
        public String mappings;

        @NameInMap("settings")
        public String settings;

        public static DescribeIndexTemplateResponseBodyResultTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeIndexTemplateResponseBodyResultTemplate self = new DescribeIndexTemplateResponseBodyResultTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeIndexTemplateResponseBodyResultTemplate setAliases(String aliases) {
            this.aliases = aliases;
            return this;
        }
        public String getAliases() {
            return this.aliases;
        }

        public DescribeIndexTemplateResponseBodyResultTemplate setMappings(String mappings) {
            this.mappings = mappings;
            return this;
        }
        public String getMappings() {
            return this.mappings;
        }

        public DescribeIndexTemplateResponseBodyResultTemplate setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

    }

    public static class DescribeIndexTemplateResponseBodyResult extends TeaModel {
        @NameInMap("dataStream")
        public Boolean dataStream;

        @NameInMap("ilmPolicy")
        public String ilmPolicy;

        @NameInMap("indexPatterns")
        public java.util.List<String> indexPatterns;

        @NameInMap("indexTemplate")
        public String indexTemplate;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("template")
        public DescribeIndexTemplateResponseBodyResultTemplate template;

        public static DescribeIndexTemplateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeIndexTemplateResponseBodyResult self = new DescribeIndexTemplateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeIndexTemplateResponseBodyResult setDataStream(Boolean dataStream) {
            this.dataStream = dataStream;
            return this;
        }
        public Boolean getDataStream() {
            return this.dataStream;
        }

        public DescribeIndexTemplateResponseBodyResult setIlmPolicy(String ilmPolicy) {
            this.ilmPolicy = ilmPolicy;
            return this;
        }
        public String getIlmPolicy() {
            return this.ilmPolicy;
        }

        public DescribeIndexTemplateResponseBodyResult setIndexPatterns(java.util.List<String> indexPatterns) {
            this.indexPatterns = indexPatterns;
            return this;
        }
        public java.util.List<String> getIndexPatterns() {
            return this.indexPatterns;
        }

        public DescribeIndexTemplateResponseBodyResult setIndexTemplate(String indexTemplate) {
            this.indexTemplate = indexTemplate;
            return this;
        }
        public String getIndexTemplate() {
            return this.indexTemplate;
        }

        public DescribeIndexTemplateResponseBodyResult setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeIndexTemplateResponseBodyResult setTemplate(DescribeIndexTemplateResponseBodyResultTemplate template) {
            this.template = template;
            return this;
        }
        public DescribeIndexTemplateResponseBodyResultTemplate getTemplate() {
            return this.template;
        }

    }

}
