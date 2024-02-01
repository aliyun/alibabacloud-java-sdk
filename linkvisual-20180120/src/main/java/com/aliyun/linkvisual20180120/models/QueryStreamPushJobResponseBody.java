// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryStreamPushJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryStreamPushJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryStreamPushJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStreamPushJobResponseBody self = new QueryStreamPushJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStreamPushJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStreamPushJobResponseBody setData(QueryStreamPushJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryStreamPushJobResponseBodyData getData() {
        return this.data;
    }

    public QueryStreamPushJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStreamPushJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStreamPushJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStreamPushJobResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public Integer createTime;

        @NameInMap("JobType")
        public Integer jobType;

        @NameInMap("PushStatus")
        public Integer pushStatus;

        @NameInMap("PushUrl")
        public String pushUrl;

        @NameInMap("StreamType")
        public Integer streamType;

        public static QueryStreamPushJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStreamPushJobResponseBodyData self = new QueryStreamPushJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStreamPushJobResponseBodyData setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public QueryStreamPushJobResponseBodyData setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public QueryStreamPushJobResponseBodyData setPushStatus(Integer pushStatus) {
            this.pushStatus = pushStatus;
            return this;
        }
        public Integer getPushStatus() {
            return this.pushStatus;
        }

        public QueryStreamPushJobResponseBodyData setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
            return this;
        }
        public String getPushUrl() {
            return this.pushUrl;
        }

        public QueryStreamPushJobResponseBodyData setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

    }

}
