// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class EngineSearchResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>The business data body.</p>
     */
    @NameInMap("data")
    public EngineSearchResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    public static EngineSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EngineSearchResponseBody self = new EngineSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public EngineSearchResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public EngineSearchResponseBody setData(EngineSearchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EngineSearchResponseBodyData getData() {
        return this.data;
    }

    public EngineSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class EngineSearchResponseBodyDataItems extends TeaModel {
        /**
         * <p>算法内容</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;rankScore&quot;:1.0}</p>
         */
        @NameInMap("algorithm")
        public java.util.Map<String, ?> algorithm;

        /**
         * <p>内容详情对象（详细结构见下文）</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;titile&quot;:&quot;大疆无人机&quot;}</p>
         */
        @NameInMap("content")
        public java.util.Map<String, ?> content;

        /**
         * <p>权益绑定 ID</p>
         * 
         * <strong>example:</strong>
         * <p>iceberg-tbl-b7420156-6d23-4555-8e05-12285b36d6ca</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>相关性得分</p>
         * 
         * <strong>example:</strong>
         * <p>0.005369</p>
         */
        @NameInMap("score")
        public Float score;

        /**
         * <p>回传日志时使用。</p>
         * <p>取值：</p>
         * <p>trace_id=ali。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;traceId&quot;:&quot;12285b36d6ca&quot;}</p>
         */
        @NameInMap("traceInfo")
        public java.util.Map<String, ?> traceInfo;

        public static EngineSearchResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            EngineSearchResponseBodyDataItems self = new EngineSearchResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public EngineSearchResponseBodyDataItems setAlgorithm(java.util.Map<String, ?> algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public java.util.Map<String, ?> getAlgorithm() {
            return this.algorithm;
        }

        public EngineSearchResponseBodyDataItems setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public EngineSearchResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public EngineSearchResponseBodyDataItems setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public EngineSearchResponseBodyDataItems setTraceInfo(java.util.Map<String, ?> traceInfo) {
            this.traceInfo = traceInfo;
            return this;
        }
        public java.util.Map<String, ?> getTraceInfo() {
            return this.traceInfo;
        }

    }

    public static class EngineSearchResponseBodyData extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>搜索词违禁</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The additional metadata. </p>
         * <blockquote>
         * <p>Contains the exclude_ids field, which represents the list of IDs that were actually excluded. The format is <code>Array[String]</code>.</p>
         * <ul>
         * <li>Example: [&quot;id_1&quot;, &quot;id_2&quot;].</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{exclude_ids: [&quot;id_1&quot;, &quot;id_2&quot;]}</p>
         */
        @NameInMap("extra")
        public java.util.Map<String, ?> extra;

        /**
         * <p>搜索结果列表</p>
         */
        @NameInMap("items")
        public java.util.List<EngineSearchResponseBodyDataItems> items;

        /**
         * <p>The search page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        /**
         * <p>The response ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>62CC3999-5380-5344-ABC7-46453625A910</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>The number of results returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("size")
        public Integer size;

        /**
         * <p>The execution status.
         * 200: succeeded.
         * 500: failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>121</p>
         */
        @NameInMap("total")
        public Integer total;

        /**
         * <p>The Tracing Analysis information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;traceId&quot;:&quot;234234324&quot;}</p>
         */
        @NameInMap("traceInfo")
        public java.util.Map<String, ?> traceInfo;

        public static EngineSearchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EngineSearchResponseBodyData self = new EngineSearchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EngineSearchResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public EngineSearchResponseBodyData setExtra(java.util.Map<String, ?> extra) {
            this.extra = extra;
            return this;
        }
        public java.util.Map<String, ?> getExtra() {
            return this.extra;
        }

        public EngineSearchResponseBodyData setItems(java.util.List<EngineSearchResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<EngineSearchResponseBodyDataItems> getItems() {
            return this.items;
        }

        public EngineSearchResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public EngineSearchResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public EngineSearchResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public EngineSearchResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public EngineSearchResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public EngineSearchResponseBodyData setTraceInfo(java.util.Map<String, ?> traceInfo) {
            this.traceInfo = traceInfo;
            return this;
        }
        public java.util.Map<String, ?> getTraceInfo() {
            return this.traceInfo;
        }

    }

}
