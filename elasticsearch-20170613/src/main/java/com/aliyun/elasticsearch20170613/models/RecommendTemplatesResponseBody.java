// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RecommendTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>66B060CF-7381-49C7-9B89-7757927FDA16</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<RecommendTemplatesResponseBodyResult> result;

    public static RecommendTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecommendTemplatesResponseBody self = new RecommendTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public RecommendTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecommendTemplatesResponseBody setResult(java.util.List<RecommendTemplatesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<RecommendTemplatesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class RecommendTemplatesResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\n\t\&quot;persistent\&quot;: {\n\t\t\&quot;search\&quot;: {\n\t\t\t\&quot;max_buckets\&quot;: \&quot;10000\&quot;\n\t\t}\n\t}\n}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <ul>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * </ul>
         * <p>**</p>
         * <hr>
         * 
         * <strong>example:</strong>
         * <p>dynamicSettings</p>
         */
        @NameInMap("templateName")
        public String templateName;

        public static RecommendTemplatesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RecommendTemplatesResponseBodyResult self = new RecommendTemplatesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RecommendTemplatesResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RecommendTemplatesResponseBodyResult setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
