// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveRecordFilesResponseBody extends TeaModel {
    @NameInMap("Files")
    public java.util.List<ListLiveRecordFilesResponseBodyFiles> files;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListLiveRecordFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordFilesResponseBody self = new ListLiveRecordFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordFilesResponseBody setFiles(java.util.List<ListLiveRecordFilesResponseBodyFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<ListLiveRecordFilesResponseBodyFiles> getFiles() {
        return this.files;
    }

    public ListLiveRecordFilesResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListLiveRecordFilesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListLiveRecordFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveRecordFilesResponseBody setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveRecordFilesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListLiveRecordFilesResponseBodyFiles extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Format")
        public String format;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("RecordOutput")
        public String recordOutput;

        @NameInMap("RecordUrl")
        public String recordUrl;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StreamUrl")
        public String streamUrl;

        @NameInMap("Width")
        public Integer width;

        public static ListLiveRecordFilesResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordFilesResponseBodyFiles self = new ListLiveRecordFilesResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordFilesResponseBodyFiles setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLiveRecordFilesResponseBodyFiles setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public ListLiveRecordFilesResponseBodyFiles setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListLiveRecordFilesResponseBodyFiles setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListLiveRecordFilesResponseBodyFiles setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ListLiveRecordFilesResponseBodyFiles setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListLiveRecordFilesResponseBodyFiles setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListLiveRecordFilesResponseBodyFiles setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListLiveRecordFilesResponseBodyFiles setRecordOutput(String recordOutput) {
            this.recordOutput = recordOutput;
            return this;
        }
        public String getRecordOutput() {
            return this.recordOutput;
        }

        public ListLiveRecordFilesResponseBodyFiles setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public ListLiveRecordFilesResponseBodyFiles setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListLiveRecordFilesResponseBodyFiles setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public ListLiveRecordFilesResponseBodyFiles setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
