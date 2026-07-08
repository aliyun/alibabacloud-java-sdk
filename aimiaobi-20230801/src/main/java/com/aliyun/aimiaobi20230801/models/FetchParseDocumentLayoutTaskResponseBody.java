// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchParseDocumentLayoutTaskResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business data</p>
     */
    @NameInMap("Data")
    public FetchParseDocumentLayoutTaskResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static FetchParseDocumentLayoutTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchParseDocumentLayoutTaskResponseBody self = new FetchParseDocumentLayoutTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchParseDocumentLayoutTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FetchParseDocumentLayoutTaskResponseBody setData(FetchParseDocumentLayoutTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FetchParseDocumentLayoutTaskResponseBodyData getData() {
        return this.data;
    }

    public FetchParseDocumentLayoutTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FetchParseDocumentLayoutTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FetchParseDocumentLayoutTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchParseDocumentLayoutTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FetchParseDocumentLayoutTaskResponseBodyDataLayoutResultElements extends TeaModel {
        /**
         * <p>Content</p>
         * 
         * <strong>example:</strong>
         * <p>一、本月主要工作进展\n</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>For headings, content with heading numbers removed</p>
         * 
         * <strong>example:</strong>
         * <p>本月主要工作进展</p>
         */
        @NameInMap("FormatContent")
        public String formatContent;

        /**
         * <p>Index order of each element</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Float index;

        /**
         * <p>Type</p>
         * 
         * <strong>example:</strong>
         * <p>支持的类型如下
         *     HEADING(&quot;标题&quot;),
         *     H1(&quot;一级标题&quot;),
         *     H2(&quot;二级标题&quot;),
         *     H3(&quot;三级标题&quot;),
         *     H4(&quot;四级标题&quot;),
         *     H5(&quot;五级标题&quot;),
         *     H6(&quot;六级标题&quot;),
         *     PARAGRAPH(&quot;段落&quot;),
         *     SIGNATURE(&quot;落款&quot;),
         *     FOOTNOTE(&quot;脚注&quot;),
         *     TABLE(&quot;表格&quot;),
         *     CODE_BLOCK(&quot;代码块&quot;),
         *     ATTACHMENT(&quot;附件&quot;),
         *     BLOCKQUOTE(&quot;引用&quot;);</p>
         */
        @NameInMap("Type")
        public String type;

        public static FetchParseDocumentLayoutTaskResponseBodyDataLayoutResultElements build(java.util.Map<String, ?> map) throws Exception {
            FetchParseDocumentLayoutTaskResponseBodyDataLayoutResultElements self = new FetchParseDocumentLayoutTaskResponseBodyDataLayoutResultElements();
            return TeaModel.build(map, self);
        }

        public FetchParseDocumentLayoutTaskResponseBodyDataLayoutResultElements setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FetchParseDocumentLayoutTaskResponseBodyDataLayoutResultElements setFormatContent(String formatContent) {
            this.formatContent = formatContent;
            return this;
        }
        public String getFormatContent() {
            return this.formatContent;
        }

        public FetchParseDocumentLayoutTaskResponseBodyDataLayoutResultElements setIndex(Float index) {
            this.index = index;
            return this;
        }
        public Float getIndex() {
            return this.index;
        }

        public FetchParseDocumentLayoutTaskResponseBodyDataLayoutResultElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class FetchParseDocumentLayoutTaskResponseBodyDataLayoutResult extends TeaModel {
        /**
         * <p>Returned element data</p>
         */
        @NameInMap("Elements")
        public java.util.List<FetchParseDocumentLayoutTaskResponseBodyDataLayoutResultElements> elements;

        public static FetchParseDocumentLayoutTaskResponseBodyDataLayoutResult build(java.util.Map<String, ?> map) throws Exception {
            FetchParseDocumentLayoutTaskResponseBodyDataLayoutResult self = new FetchParseDocumentLayoutTaskResponseBodyDataLayoutResult();
            return TeaModel.build(map, self);
        }

        public FetchParseDocumentLayoutTaskResponseBodyDataLayoutResult setElements(java.util.List<FetchParseDocumentLayoutTaskResponseBodyDataLayoutResultElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<FetchParseDocumentLayoutTaskResponseBodyDataLayoutResultElements> getElements() {
            return this.elements;
        }

    }

    public static class FetchParseDocumentLayoutTaskResponseBodyData extends TeaModel {
        /**
         * <p>Structured content after formatting</p>
         */
        @NameInMap("LayoutResult")
        public FetchParseDocumentLayoutTaskResponseBodyDataLayoutResult layoutResult;

        /**
         * <p>Task status</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING-待执行、RUNNING-执行中、SUCCESSED-成功、SUSPENDED-暂停、FAILED-失败、CANCELLED-取消</p>
         */
        @NameInMap("TaskStats")
        public String taskStats;

        public static FetchParseDocumentLayoutTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FetchParseDocumentLayoutTaskResponseBodyData self = new FetchParseDocumentLayoutTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FetchParseDocumentLayoutTaskResponseBodyData setLayoutResult(FetchParseDocumentLayoutTaskResponseBodyDataLayoutResult layoutResult) {
            this.layoutResult = layoutResult;
            return this;
        }
        public FetchParseDocumentLayoutTaskResponseBodyDataLayoutResult getLayoutResult() {
            return this.layoutResult;
        }

        public FetchParseDocumentLayoutTaskResponseBodyData setTaskStats(String taskStats) {
            this.taskStats = taskStats;
            return this;
        }
        public String getTaskStats() {
            return this.taskStats;
        }

    }

}
