// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListChunksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Index.InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListChunksResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8F97A63B-55F1-527F-9D6E-467B6A7E8CF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListChunksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChunksResponseBody self = new ListChunksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChunksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChunksResponseBody setData(ListChunksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListChunksResponseBodyData getData() {
        return this.data;
    }

    public ListChunksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChunksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChunksResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListChunksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListChunksResponseBodyDataNodes extends TeaModel {
        @NameInMap("Metadata")
        public Object metadata;

        /**
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("Score")
        public Double score;

        @NameInMap("Text")
        public String text;

        public static ListChunksResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            ListChunksResponseBodyDataNodes self = new ListChunksResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public ListChunksResponseBodyDataNodes setMetadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }
        public Object getMetadata() {
            return this.metadata;
        }

        public ListChunksResponseBodyDataNodes setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public ListChunksResponseBodyDataNodes setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ListChunksResponseBodyData extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<ListChunksResponseBodyDataNodes> nodes;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListChunksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChunksResponseBodyData self = new ListChunksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChunksResponseBodyData setNodes(java.util.List<ListChunksResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListChunksResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public ListChunksResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
