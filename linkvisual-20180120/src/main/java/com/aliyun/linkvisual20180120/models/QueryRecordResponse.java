// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordResponse extends TeaModel {
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
    public QueryRecordResponseData data;

    public static QueryRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordResponse self = new QueryRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRecordResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordResponse setData(QueryRecordResponseData data) {
        this.data = data;
        return this;
    }
    public QueryRecordResponseData getData() {
        return this.data;
    }

    public static class QueryRecordResponseDataList extends TeaModel {
        @NameInMap("BeginTime")
        @Validation(required = true)
        public String beginTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("RecordType")
        @Validation(required = true)
        public Integer recordType;

        @NameInMap("StreamType")
        @Validation(required = true)
        public Integer streamType;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("FileSize")
        @Validation(required = true)
        public Integer fileSize;

        @NameInMap("VideoFrameNumber")
        @Validation(required = true)
        public Integer videoFrameNumber;

        public static QueryRecordResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordResponseDataList self = new QueryRecordResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryRecordResponseDataList setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public QueryRecordResponseDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryRecordResponseDataList setRecordType(Integer recordType) {
            this.recordType = recordType;
            return this;
        }
        public Integer getRecordType() {
            return this.recordType;
        }

        public QueryRecordResponseDataList setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

        public QueryRecordResponseDataList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryRecordResponseDataList setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public QueryRecordResponseDataList setVideoFrameNumber(Integer videoFrameNumber) {
            this.videoFrameNumber = videoFrameNumber;
            return this;
        }
        public Integer getVideoFrameNumber() {
            return this.videoFrameNumber;
        }

    }

    public static class QueryRecordResponseData extends TeaModel {
        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Page")
        @Validation(required = true)
        public Integer page;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<QueryRecordResponseDataList> list;

        public static QueryRecordResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordResponseData self = new QueryRecordResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRecordResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryRecordResponseData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryRecordResponseData setList(java.util.List<QueryRecordResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryRecordResponseDataList> getList() {
            return this.list;
        }

    }

}
