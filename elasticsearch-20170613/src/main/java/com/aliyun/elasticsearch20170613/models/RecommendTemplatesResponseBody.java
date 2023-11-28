// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RecommendTemplatesResponseBody extends TeaModel {
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
        @NameInMap("content")
        public String content;

        /**
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <p>*</p>
         * <br>
         * <p>**</p>
         * <br>
         * <p>****</p>
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
