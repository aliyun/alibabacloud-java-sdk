// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeComponentIndexResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC47D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeComponentIndexResponseBodyResult result;

    public static DescribeComponentIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentIndexResponseBody self = new DescribeComponentIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComponentIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComponentIndexResponseBody setResult(DescribeComponentIndexResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeComponentIndexResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeComponentIndexResponseBodyResultTemplate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("aliases")
        public java.util.Map<String, ?> aliases;

        /**
         * <strong>example:</strong>
         * <p>{ &quot;properties&quot;: { &quot;@timestamp&quot;: { &quot;type&quot;: &quot;date&quot; } } }</p>
         */
        @NameInMap("mappings")
        public java.util.Map<String, ?> mappings;

        /**
         * <strong>example:</strong>
         * <p>{ &quot;index.number_of_replicas&quot;: 0 }</p>
         */
        @NameInMap("settings")
        public java.util.Map<String, ?> settings;

        public static DescribeComponentIndexResponseBodyResultTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeComponentIndexResponseBodyResultTemplate self = new DescribeComponentIndexResponseBodyResultTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeComponentIndexResponseBodyResultTemplate setAliases(java.util.Map<String, ?> aliases) {
            this.aliases = aliases;
            return this;
        }
        public java.util.Map<String, ?> getAliases() {
            return this.aliases;
        }

        public DescribeComponentIndexResponseBodyResultTemplate setMappings(java.util.Map<String, ?> mappings) {
            this.mappings = mappings;
            return this;
        }
        public java.util.Map<String, ?> getMappings() {
            return this.mappings;
        }

        public DescribeComponentIndexResponseBodyResultTemplate setSettings(java.util.Map<String, ?> settings) {
            this.settings = settings;
            return this;
        }
        public java.util.Map<String, ?> getSettings() {
            return this.settings;
        }

    }

    public static class DescribeComponentIndexResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{ &quot;description&quot;: &quot;set number of shards to one&quot; }</p>
         */
        @NameInMap("_meta")
        public java.util.Map<String, ?> meta;

        @NameInMap("template")
        public DescribeComponentIndexResponseBodyResultTemplate template;

        public static DescribeComponentIndexResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeComponentIndexResponseBodyResult self = new DescribeComponentIndexResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeComponentIndexResponseBodyResult setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public DescribeComponentIndexResponseBodyResult setTemplate(DescribeComponentIndexResponseBodyResultTemplate template) {
            this.template = template;
            return this;
        }
        public DescribeComponentIndexResponseBodyResultTemplate getTemplate() {
            return this.template;
        }

    }

}
