// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("content")
        public String content;

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
