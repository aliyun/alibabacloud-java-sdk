// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListIndexTemplatesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The index template list information.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListIndexTemplatesResponseBodyResult> result;

    public static ListIndexTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIndexTemplatesResponseBody self = new ListIndexTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIndexTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIndexTemplatesResponseBody setResult(java.util.List<ListIndexTemplatesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListIndexTemplatesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListIndexTemplatesResponseBodyResultTemplate extends TeaModel {
        /**
         * <p>The aliases configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;index.number_of_shards\&quot;:\&quot;1\&quot;}</p>
         */
        @NameInMap("aliases")
        public String aliases;

        /**
         * <p>The mappings configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;properties\&quot;:{\&quot;created_at\&quot;:{\&quot;format\&quot;:\&quot;EEE MMM dd HH:mm:ss Z yyyy\&quot;,\&quot;type\&quot;:\&quot;date\&quot;},\&quot;host_name\&quot;:{\&quot;type\&quot;:\&quot;keyword\&quot;}}}</p>
         */
        @NameInMap("mappings")
        public String mappings;

        /**
         * <p>The settings configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;mydata\&quot;:{}}</p>
         */
        @NameInMap("settings")
        public String settings;

        public static ListIndexTemplatesResponseBodyResultTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListIndexTemplatesResponseBodyResultTemplate self = new ListIndexTemplatesResponseBodyResultTemplate();
            return TeaModel.build(map, self);
        }

        public ListIndexTemplatesResponseBodyResultTemplate setAliases(String aliases) {
            this.aliases = aliases;
            return this;
        }
        public String getAliases() {
            return this.aliases;
        }

        public ListIndexTemplatesResponseBodyResultTemplate setMappings(String mappings) {
            this.mappings = mappings;
            return this;
        }
        public String getMappings() {
            return this.mappings;
        }

        public ListIndexTemplatesResponseBodyResultTemplate setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

    }

    public static class ListIndexTemplatesResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the data stream is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: enabled.</p>
         * </li>
         * <li><p>false (default): not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("dataStream")
        public Boolean dataStream;

        /**
         * <p>The index lifecycle policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>my_ilm_policy</p>
         */
        @NameInMap("ilmPolicy")
        public String ilmPolicy;

        /**
         * <p>The index pattern information.</p>
         */
        @NameInMap("indexPatterns")
        public java.util.List<String> indexPatterns;

        /**
         * <p>The index template name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-template</p>
         */
        @NameInMap("indexTemplate")
        public String indexTemplate;

        /**
         * <p>The index template priority.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("priority")
        public Integer priority;

        /**
         * <p>The component template.</p>
         */
        @NameInMap("template")
        public ListIndexTemplatesResponseBodyResultTemplate template;

        public static ListIndexTemplatesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListIndexTemplatesResponseBodyResult self = new ListIndexTemplatesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListIndexTemplatesResponseBodyResult setDataStream(Boolean dataStream) {
            this.dataStream = dataStream;
            return this;
        }
        public Boolean getDataStream() {
            return this.dataStream;
        }

        public ListIndexTemplatesResponseBodyResult setIlmPolicy(String ilmPolicy) {
            this.ilmPolicy = ilmPolicy;
            return this;
        }
        public String getIlmPolicy() {
            return this.ilmPolicy;
        }

        public ListIndexTemplatesResponseBodyResult setIndexPatterns(java.util.List<String> indexPatterns) {
            this.indexPatterns = indexPatterns;
            return this;
        }
        public java.util.List<String> getIndexPatterns() {
            return this.indexPatterns;
        }

        public ListIndexTemplatesResponseBodyResult setIndexTemplate(String indexTemplate) {
            this.indexTemplate = indexTemplate;
            return this;
        }
        public String getIndexTemplate() {
            return this.indexTemplate;
        }

        public ListIndexTemplatesResponseBodyResult setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListIndexTemplatesResponseBodyResult setTemplate(ListIndexTemplatesResponseBodyResultTemplate template) {
            this.template = template;
            return this;
        }
        public ListIndexTemplatesResponseBodyResultTemplate getTemplate() {
            return this.template;
        }

    }

}
