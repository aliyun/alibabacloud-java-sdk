// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryStreamPushJobListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryStreamPushJobListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryStreamPushJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStreamPushJobListResponseBody self = new QueryStreamPushJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStreamPushJobListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStreamPushJobListResponseBody setData(QueryStreamPushJobListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryStreamPushJobListResponseBodyData getData() {
        return this.data;
    }

    public QueryStreamPushJobListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStreamPushJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStreamPushJobListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStreamPushJobListResponseBodyDataJobList extends TeaModel {
        @NameInMap("CreateTime")
        public Integer createTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobType")
        public Integer jobType;

        @NameInMap("PushStatus")
        public Integer pushStatus;

        @NameInMap("PushUrl")
        public String pushUrl;

        @NameInMap("StreamType")
        public Integer streamType;

        public static QueryStreamPushJobListResponseBodyDataJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryStreamPushJobListResponseBodyDataJobList self = new QueryStreamPushJobListResponseBodyDataJobList();
            return TeaModel.build(map, self);
        }

        public QueryStreamPushJobListResponseBodyDataJobList setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public QueryStreamPushJobListResponseBodyDataJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryStreamPushJobListResponseBodyDataJobList setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public QueryStreamPushJobListResponseBodyDataJobList setPushStatus(Integer pushStatus) {
            this.pushStatus = pushStatus;
            return this;
        }
        public Integer getPushStatus() {
            return this.pushStatus;
        }

        public QueryStreamPushJobListResponseBodyDataJobList setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
            return this;
        }
        public String getPushUrl() {
            return this.pushUrl;
        }

        public QueryStreamPushJobListResponseBodyDataJobList setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

    }

    public static class QueryStreamPushJobListResponseBodyData extends TeaModel {
        @NameInMap("JobList")
        public java.util.List<QueryStreamPushJobListResponseBodyDataJobList> jobList;

        @NameInMap("Total")
        public Integer total;

        public static QueryStreamPushJobListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStreamPushJobListResponseBodyData self = new QueryStreamPushJobListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStreamPushJobListResponseBodyData setJobList(java.util.List<QueryStreamPushJobListResponseBodyDataJobList> jobList) {
            this.jobList = jobList;
            return this;
        }
        public java.util.List<QueryStreamPushJobListResponseBodyDataJobList> getJobList() {
            return this.jobList;
        }

        public QueryStreamPushJobListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
