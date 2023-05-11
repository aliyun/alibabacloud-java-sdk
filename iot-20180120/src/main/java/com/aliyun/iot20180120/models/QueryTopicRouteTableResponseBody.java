// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicRouteTableResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of destination topics returned if the call is successful.</p>
     */
    @NameInMap("DstTopics")
    public QueryTopicRouteTableResponseBodyDstTopics dstTopics;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryTopicRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicRouteTableResponseBody self = new QueryTopicRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopicRouteTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopicRouteTableResponseBody setDstTopics(QueryTopicRouteTableResponseBodyDstTopics dstTopics) {
        this.dstTopics = dstTopics;
        return this;
    }
    public QueryTopicRouteTableResponseBodyDstTopics getDstTopics() {
        return this.dstTopics;
    }

    public QueryTopicRouteTableResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTopicRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopicRouteTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopicRouteTableResponseBodyDstTopics extends TeaModel {
        @NameInMap("Topic")
        public java.util.List<java.util.Map<String, ?>> topic;

        public static QueryTopicRouteTableResponseBodyDstTopics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopicRouteTableResponseBodyDstTopics self = new QueryTopicRouteTableResponseBodyDstTopics();
            return TeaModel.build(map, self);
        }

        public QueryTopicRouteTableResponseBodyDstTopics setTopic(java.util.List<java.util.Map<String, ?>> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTopic() {
            return this.topic;
        }

    }

}
