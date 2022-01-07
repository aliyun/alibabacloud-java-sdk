// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupByGroupIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryConsumerGroupByGroupIdResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("GroupId")
        public String groupId;

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
