// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupByGroupIdResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details about the consumer group. This parameter is returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryConsumerGroupByGroupIdResponseBodyData data;

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

    public static QueryConsumerGroupByGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupByGroupIdResponseBody self = new QueryConsumerGroupByGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupByGroupIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryConsumerGroupByGroupIdResponseBody setData(QueryConsumerGroupByGroupIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryConsumerGroupByGroupIdResponseBodyData getData() {
        return this.data;
    }

    public QueryConsumerGroupByGroupIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryConsumerGroupByGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConsumerGroupByGroupIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryConsumerGroupByGroupIdResponseBodyData extends TeaModel {
        /**
         * <p>The time when the consumer group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ss.SSSZ format. The time is displayed in UTC and accurate to milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the consumer group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the consumer group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static QueryConsumerGroupByGroupIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerGroupByGroupIdResponseBodyData self = new QueryConsumerGroupByGroupIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryConsumerGroupByGroupIdResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryConsumerGroupByGroupIdResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryConsumerGroupByGroupIdResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

}
