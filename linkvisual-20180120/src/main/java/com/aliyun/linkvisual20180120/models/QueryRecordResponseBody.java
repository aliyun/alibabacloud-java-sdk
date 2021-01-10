// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryRecordResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordResponseBody self = new QueryRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordResponseBody setData(QueryRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRecordResponseBodyData getData() {
        return this.data;
    }

    public QueryRecordResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRecordResponseBodyDataList extends TeaModel {
        @NameInMap("SnapshotUrl")
        public String snapshotUrl;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("RecordType")
        public Integer recordType;

        @NameInMap("StreamType")
        public Integer streamType;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("VideoFrameNumber")
        public Integer videoFrameNumber;

        @NameInMap("FileSize")
        public Integer fileSize;

        public static QueryRecordResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordResponseBodyDataList self = new QueryRecordResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryRecordResponseBodyDataList setSnapshotUrl(String snapshotUrl) {
            this.snapshotUrl = snapshotUrl;
            return this;
        }
        public String getSnapshotUrl() {
            return this.snapshotUrl;
        }

        public QueryRecordResponseBodyDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryRecordResponseBodyDataList setRecordType(Integer recordType) {
            this.recordType = recordType;
            return this;
        }
        public Integer getRecordType() {
            return this.recordType;
        }

        public QueryRecordResponseBodyDataList setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

        public QueryRecordResponseBodyDataList setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public QueryRecordResponseBodyDataList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryRecordResponseBodyDataList setVideoFrameNumber(Integer videoFrameNumber) {
            this.videoFrameNumber = videoFrameNumber;
            return this;
        }
        public Integer getVideoFrameNumber() {
            return this.videoFrameNumber;
        }

        public QueryRecordResponseBodyDataList setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

    }

    public static class QueryRecordResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryRecordResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Page")
        public Integer page;

        public static QueryRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordResponseBodyData self = new QueryRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRecordResponseBodyData setList(java.util.List<QueryRecordResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryRecordResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryRecordResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryRecordResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

}
