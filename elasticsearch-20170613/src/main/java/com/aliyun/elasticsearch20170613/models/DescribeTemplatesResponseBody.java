// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public java.util.List<DescribeTemplatesResponseBodyResult> result;

    public static DescribeTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesResponseBody self = new DescribeTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplatesResponseBody setResult(java.util.List<DescribeTemplatesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeTemplatesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeTemplatesResponseBodyResult extends TeaModel {
        /**
         * <p>The template content.</p>
         * 
         * <strong>example:</strong>
         * <p>{\n\t\&quot;persistent\&quot;:{\n\t\t\&quot;search\&quot;:{\n\t\t\t\&quot;max_buckets\&quot;:\&quot;10000\&quot;\n\t\t}\n\t}\n}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The template name. Valid values:</p>
         * <ul>
         * <li>staticSettings: elasticsearch.yml configuration</li>
         * <li>ilmPolicy: index lifecycle configuration</li>
         * <li>indexTemplate: index template configuration</li>
         * <li>dynamicSettings: cluster dynamic configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dynamicSettings</p>
         */
        @NameInMap("templateName")
        public String templateName;

        public static DescribeTemplatesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyResult self = new DescribeTemplatesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeTemplatesResponseBodyResult setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
