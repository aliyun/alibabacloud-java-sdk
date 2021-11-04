// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySubtitleJobListResponseBody extends TeaModel {
    @NameInMap("JobList")
    public QuerySubtitleJobListResponseBodyJobList jobList;

    @NameInMap("NonExistJobIds")
    public QuerySubtitleJobListResponseBodyNonExistJobIds nonExistJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySubtitleJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySubtitleJobListResponseBody self = new QuerySubtitleJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySubtitleJobListResponseBody setJobList(QuerySubtitleJobListResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public QuerySubtitleJobListResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public QuerySubtitleJobListResponseBody setNonExistJobIds(QuerySubtitleJobListResponseBodyNonExistJobIds nonExistJobIds) {
        this.nonExistJobIds = nonExistJobIds;
        return this;
    }
    public QuerySubtitleJobListResponseBodyNonExistJobIds getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    public QuerySubtitleJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySubtitleJobListResponseBodyJobListJobMNSMessageResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("MessageId")
        public String messageId;

        public static QuerySubtitleJobListResponseBodyJobListJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            QuerySubtitleJobListResponseBodyJobListJobMNSMessageResult self = new QuerySubtitleJobListResponseBodyJobListJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public QuerySubtitleJobListResponseBodyJobListJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QuerySubtitleJobListResponseBodyJobListJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QuerySubtitleJobListResponseBodyJobListJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class QuerySubtitleJobListResponseBodyJobListJob extends TeaModel {
        @NameInMap("InputConfig")
        public String inputConfig;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MNSMessageResult")
        public QuerySubtitleJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult;

        @NameInMap("OutputConfig")
        public String outputConfig;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        public static QuerySubtitleJobListResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            QuerySubtitleJobListResponseBodyJobListJob self = new QuerySubtitleJobListResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public QuerySubtitleJobListResponseBodyJobListJob setInputConfig(String inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public String getInputConfig() {
            return this.inputConfig;
        }

        public QuerySubtitleJobListResponseBodyJobListJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QuerySubtitleJobListResponseBodyJobListJob setMNSMessageResult(QuerySubtitleJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public QuerySubtitleJobListResponseBodyJobListJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public QuerySubtitleJobListResponseBodyJobListJob setOutputConfig(String outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }
        public String getOutputConfig() {
            return this.outputConfig;
        }

        public QuerySubtitleJobListResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QuerySubtitleJobListResponseBodyJobListJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QuerySubtitleJobListResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QuerySubtitleJobListResponseBodyJobListJob> job;

        public static QuerySubtitleJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QuerySubtitleJobListResponseBodyJobList self = new QuerySubtitleJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QuerySubtitleJobListResponseBodyJobList setJob(java.util.List<QuerySubtitleJobListResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QuerySubtitleJobListResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

    public static class QuerySubtitleJobListResponseBodyNonExistJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QuerySubtitleJobListResponseBodyNonExistJobIds build(java.util.Map<String, ?> map) throws Exception {
            QuerySubtitleJobListResponseBodyNonExistJobIds self = new QuerySubtitleJobListResponseBodyNonExistJobIds();
            return TeaModel.build(map, self);
        }

        public QuerySubtitleJobListResponseBodyNonExistJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
