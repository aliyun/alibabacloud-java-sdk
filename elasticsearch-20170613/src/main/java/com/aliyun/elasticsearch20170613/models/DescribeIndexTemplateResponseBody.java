// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeIndexTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>25DB38F8-82E4-4D16-82BB-FF077C7F****</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>{\&quot;mydata\&quot;:{}}</p>
         */
        @NameInMap("aliases")
        public String aliases;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;properties\&quot;:{\&quot;created_at\&quot;:{\&quot;format\&quot;:\&quot;EEE MMM dd HH:mm:ss Z yyyy\&quot;,\&quot;type\&quot;:\&quot;date\&quot;},\&quot;host_name\&quot;:{\&quot;type\&quot;:\&quot;keyword\&quot;}}}</p>
         */
        @NameInMap("mappings")
        public String mappings;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;index.refresh_interval\&quot;:\&quot;1s\&quot;}</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("dataStream")
        public Boolean dataStream;

        /**
         * <strong>example:</strong>
         * <p>cube_default_ilm_policy</p>
         */
        @NameInMap("ilmPolicy")
        public String ilmPolicy;

        @NameInMap("indexPatterns")
        public java.util.List<String> indexPatterns;

        /**
         * <strong>example:</strong>
         * <p>data-stream-default</p>
         */
        @NameInMap("indexTemplate")
        public String indexTemplate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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
