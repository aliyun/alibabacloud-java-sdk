// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDeprecatedTemplatesResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListDeprecatedTemplatesResponseBodyHeaders headers;

    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC47D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListDeprecatedTemplatesResponseBodyResult> result;

    public static ListDeprecatedTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeprecatedTemplatesResponseBody self = new ListDeprecatedTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeprecatedTemplatesResponseBody setHeaders(ListDeprecatedTemplatesResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListDeprecatedTemplatesResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListDeprecatedTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeprecatedTemplatesResponseBody setResult(java.util.List<ListDeprecatedTemplatesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDeprecatedTemplatesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDeprecatedTemplatesResponseBodyHeaders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("X-Total-Count")
        public Long xTotalCount;

        public static ListDeprecatedTemplatesResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListDeprecatedTemplatesResponseBodyHeaders self = new ListDeprecatedTemplatesResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListDeprecatedTemplatesResponseBodyHeaders setXTotalCount(Long xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Long getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListDeprecatedTemplatesResponseBodyResultTemplate extends TeaModel {
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

        public static ListDeprecatedTemplatesResponseBodyResultTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListDeprecatedTemplatesResponseBodyResultTemplate self = new ListDeprecatedTemplatesResponseBodyResultTemplate();
            return TeaModel.build(map, self);
        }

        public ListDeprecatedTemplatesResponseBodyResultTemplate setAliases(String aliases) {
            this.aliases = aliases;
            return this;
        }
        public String getAliases() {
            return this.aliases;
        }

        public ListDeprecatedTemplatesResponseBodyResultTemplate setMappings(String mappings) {
            this.mappings = mappings;
            return this;
        }
        public String getMappings() {
            return this.mappings;
        }

        public ListDeprecatedTemplatesResponseBodyResultTemplate setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

    }

    public static class ListDeprecatedTemplatesResponseBodyResult extends TeaModel {
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
        public ListDeprecatedTemplatesResponseBodyResultTemplate template;

        /**
         * <strong>example:</strong>
         * <p>70000</p>
         */
        @NameInMap("version")
        public String version;

        public static ListDeprecatedTemplatesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDeprecatedTemplatesResponseBodyResult self = new ListDeprecatedTemplatesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDeprecatedTemplatesResponseBodyResult setDataStream(Boolean dataStream) {
            this.dataStream = dataStream;
            return this;
        }
        public Boolean getDataStream() {
            return this.dataStream;
        }

        public ListDeprecatedTemplatesResponseBodyResult setIndexPatterns(java.util.List<String> indexPatterns) {
            this.indexPatterns = indexPatterns;
            return this;
        }
        public java.util.List<String> getIndexPatterns() {
            return this.indexPatterns;
        }

        public ListDeprecatedTemplatesResponseBodyResult setIndexTemplate(String indexTemplate) {
            this.indexTemplate = indexTemplate;
            return this;
        }
        public String getIndexTemplate() {
            return this.indexTemplate;
        }

        public ListDeprecatedTemplatesResponseBodyResult setOrder(Long order) {
            this.order = order;
            return this;
        }
        public Long getOrder() {
            return this.order;
        }

        public ListDeprecatedTemplatesResponseBodyResult setTemplate(ListDeprecatedTemplatesResponseBodyResultTemplate template) {
            this.template = template;
            return this;
        }
        public ListDeprecatedTemplatesResponseBodyResultTemplate getTemplate() {
            return this.template;
        }

        public ListDeprecatedTemplatesResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
