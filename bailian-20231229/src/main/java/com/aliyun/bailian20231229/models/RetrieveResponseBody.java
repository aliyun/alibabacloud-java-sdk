// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class RetrieveResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Index.InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RetrieveResponseBodyData data;

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
     * <p>17204B98-7734-4F9A-8464-2446A84821CA</p>
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

    public static RetrieveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetrieveResponseBody self = new RetrieveResponseBody();
        return TeaModel.build(map, self);
    }

    public RetrieveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RetrieveResponseBody setData(RetrieveResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetrieveResponseBodyData getData() {
        return this.data;
    }

    public RetrieveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RetrieveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetrieveResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RetrieveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RetrieveResponseBodyDataNodes extends TeaModel {
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

        public static RetrieveResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            RetrieveResponseBodyDataNodes self = new RetrieveResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public RetrieveResponseBodyDataNodes setMetadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }
        public Object getMetadata() {
            return this.metadata;
        }

        public RetrieveResponseBodyDataNodes setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public RetrieveResponseBodyDataNodes setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RetrieveResponseBodyData extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<RetrieveResponseBodyDataNodes> nodes;

        public static RetrieveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetrieveResponseBodyData self = new RetrieveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetrieveResponseBodyData setNodes(java.util.List<RetrieveResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<RetrieveResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
