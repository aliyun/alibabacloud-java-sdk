// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDeprecatedTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC47D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeDeprecatedTemplateResponseBodyResult result;

    public static DescribeDeprecatedTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeprecatedTemplateResponseBody self = new DescribeDeprecatedTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeprecatedTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeprecatedTemplateResponseBody setResult(DescribeDeprecatedTemplateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDeprecatedTemplateResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDeprecatedTemplateResponseBodyResultTemplate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;{}&quot;</p>
         */
        @NameInMap("aliases")
        public String aliases;

        /**
         * <strong>example:</strong>
         * <p>&quot;{\&quot;properties\&quot;:{\&quot;created_at\&quot;:{\&quot;format\&quot;:\&quot;EEE MMM dd HH:mm:ss Z yyyy\&quot;,\&quot;type\&quot;:\&quot;date\&quot;},\&quot;host_name\&quot;:{\&quot;type\&quot;:\&quot;keyword\&quot;}}}&quot;</p>
         */
        @NameInMap("mappings")
        public String mappings;

        /**
         * <strong>example:</strong>
         * <p>&quot;{\&quot;index.number_of_shards\&quot;:\&quot;1\&quot;}&quot;</p>
         */
        @NameInMap("settings")
        public String settings;

        public static DescribeDeprecatedTemplateResponseBodyResultTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeprecatedTemplateResponseBodyResultTemplate self = new DescribeDeprecatedTemplateResponseBodyResultTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeDeprecatedTemplateResponseBodyResultTemplate setAliases(String aliases) {
            this.aliases = aliases;
            return this;
        }
        public String getAliases() {
            return this.aliases;
        }

        public DescribeDeprecatedTemplateResponseBodyResultTemplate setMappings(String mappings) {
            this.mappings = mappings;
            return this;
        }
        public String getMappings() {
            return this.mappings;
        }

        public DescribeDeprecatedTemplateResponseBodyResultTemplate setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

    }

    public static class DescribeDeprecatedTemplateResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("dataStream")
        public Boolean dataStream;

        @NameInMap("indexPatterns")
        public java.util.List<String> indexPatterns;

        /**
         * <strong>example:</strong>
         * <p>openstore-index-template</p>
         */
        @NameInMap("indexTemplate")
        public String indexTemplate;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("order")
        public Long order;

        @NameInMap("template")
        public DescribeDeprecatedTemplateResponseBodyResultTemplate template;

        /**
         * <strong>example:</strong>
         * <p>70000</p>
         */
        @NameInMap("version")
        public String version;

        public static DescribeDeprecatedTemplateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeprecatedTemplateResponseBodyResult self = new DescribeDeprecatedTemplateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDeprecatedTemplateResponseBodyResult setDataStream(Boolean dataStream) {
            this.dataStream = dataStream;
            return this;
        }
        public Boolean getDataStream() {
            return this.dataStream;
        }

        public DescribeDeprecatedTemplateResponseBodyResult setIndexPatterns(java.util.List<String> indexPatterns) {
            this.indexPatterns = indexPatterns;
            return this;
        }
        public java.util.List<String> getIndexPatterns() {
            return this.indexPatterns;
        }

        public DescribeDeprecatedTemplateResponseBodyResult setIndexTemplate(String indexTemplate) {
            this.indexTemplate = indexTemplate;
            return this;
        }
        public String getIndexTemplate() {
            return this.indexTemplate;
        }

        public DescribeDeprecatedTemplateResponseBodyResult setOrder(Long order) {
            this.order = order;
            return this;
        }
        public Long getOrder() {
            return this.order;
        }

        public DescribeDeprecatedTemplateResponseBodyResult setTemplate(DescribeDeprecatedTemplateResponseBodyResultTemplate template) {
            this.template = template;
            return this;
        }
        public DescribeDeprecatedTemplateResponseBodyResultTemplate getTemplate() {
            return this.template;
        }

        public DescribeDeprecatedTemplateResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
