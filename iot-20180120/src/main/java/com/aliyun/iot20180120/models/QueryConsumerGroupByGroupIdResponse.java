// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupByGroupIdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryConsumerGroupByGroupIdResponseData data;

    public static QueryConsumerGroupByGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupByGroupIdResponse self = new QueryConsumerGroupByGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupByGroupIdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConsumerGroupByGroupIdResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryConsumerGroupByGroupIdResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryConsumerGroupByGroupIdResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryConsumerGroupByGroupIdResponse setData(QueryConsumerGroupByGroupIdResponseData data) {
        this.data = data;
        return this;
    }
    public QueryConsumerGroupByGroupIdResponseData getData() {
        return this.data;
    }

    public static class QueryConsumerGroupByGroupIdResponseData extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static QueryConsumerGroupByGroupIdResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerGroupByGroupIdResponseData self = new QueryConsumerGroupByGroupIdResponseData();
            return TeaModel.build(map, self);
        }

        public QueryConsumerGroupByGroupIdResponseData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryConsumerGroupByGroupIdResponseData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryConsumerGroupByGroupIdResponseData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
