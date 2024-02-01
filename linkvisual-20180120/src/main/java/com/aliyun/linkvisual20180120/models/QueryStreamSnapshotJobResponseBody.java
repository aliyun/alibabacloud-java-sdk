// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryStreamSnapshotJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryStreamSnapshotJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryStreamSnapshotJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStreamSnapshotJobResponseBody self = new QueryStreamSnapshotJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStreamSnapshotJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStreamSnapshotJobResponseBody setData(QueryStreamSnapshotJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryStreamSnapshotJobResponseBodyData getData() {
        return this.data;
    }

    public QueryStreamSnapshotJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStreamSnapshotJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStreamSnapshotJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStreamSnapshotJobResponseBodyDataJobList extends TeaModel {
        @NameInMap("SnapshotInterval")
        public Integer snapshotInterval;

        @NameInMap("StreamType")
        public Integer streamType;

        public static QueryStreamSnapshotJobResponseBodyDataJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryStreamSnapshotJobResponseBodyDataJobList self = new QueryStreamSnapshotJobResponseBodyDataJobList();
            return TeaModel.build(map, self);
        }

        public QueryStreamSnapshotJobResponseBodyDataJobList setSnapshotInterval(Integer snapshotInterval) {
            this.snapshotInterval = snapshotInterval;
            return this;
        }
        public Integer getSnapshotInterval() {
            return this.snapshotInterval;
        }

        public QueryStreamSnapshotJobResponseBodyDataJobList setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

    }

    public static class QueryStreamSnapshotJobResponseBodyData extends TeaModel {
        @NameInMap("JobList")
        public java.util.List<QueryStreamSnapshotJobResponseBodyDataJobList> jobList;

        public static QueryStreamSnapshotJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStreamSnapshotJobResponseBodyData self = new QueryStreamSnapshotJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStreamSnapshotJobResponseBodyData setJobList(java.util.List<QueryStreamSnapshotJobResponseBodyDataJobList> jobList) {
            this.jobList = jobList;
            return this;
        }
        public java.util.List<QueryStreamSnapshotJobResponseBodyDataJobList> getJobList() {
            return this.jobList;
        }

    }

}
