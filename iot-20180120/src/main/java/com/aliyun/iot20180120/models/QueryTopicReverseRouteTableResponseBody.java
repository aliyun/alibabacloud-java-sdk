// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicReverseRouteTableResponseBody extends TeaModel {
    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SrcTopics")
    public QueryTopicReverseRouteTableResponseBodySrcTopics srcTopics;

    /**
     * <p>The list of source topics returned if the call is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryTopicReverseRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicReverseRouteTableResponseBody self = new QueryTopicReverseRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopicReverseRouteTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopicReverseRouteTableResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTopicReverseRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopicReverseRouteTableResponseBody setSrcTopics(QueryTopicReverseRouteTableResponseBodySrcTopics srcTopics) {
        this.srcTopics = srcTopics;
        return this;
    }
    public QueryTopicReverseRouteTableResponseBodySrcTopics getSrcTopics() {
        return this.srcTopics;
    }

    public QueryTopicReverseRouteTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopicReverseRouteTableResponseBodySrcTopics extends TeaModel {
        @NameInMap("Topic")
        public java.util.List<java.util.Map<String, ?>> topic;

        public static QueryTopicReverseRouteTableResponseBodySrcTopics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopicReverseRouteTableResponseBodySrcTopics self = new QueryTopicReverseRouteTableResponseBodySrcTopics();
            return TeaModel.build(map, self);
        }

        public QueryTopicReverseRouteTableResponseBodySrcTopics setTopic(java.util.List<java.util.Map<String, ?>> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTopic() {
            return this.topic;
        }

    }

}
