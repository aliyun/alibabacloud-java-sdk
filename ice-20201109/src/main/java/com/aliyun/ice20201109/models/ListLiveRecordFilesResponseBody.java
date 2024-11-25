// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveRecordFilesResponseBody extends TeaModel {
    /**
     * <p>The list of index files.</p>
     */
    @NameInMap("Files")
    public java.util.List<ListLiveRecordFilesResponseBodyFiles> files;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DE24625C-7C0F-4020-8448-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sorting order of the index files by creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The total number of files that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The time when the file was created in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-05-27T09:40:56Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The recording length. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The end of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-01T07:36:10Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The format of the recording file.</p>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The height of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>640</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The ID of the recording job.</p>
         * 
         * <strong>example:</strong>
         * <p>c4d7f0a4-b506-43f9-8de3-07732c3f****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of the recording job.</p>
         * 
         * <strong>example:</strong>
         * <p>LiveRecordJob***</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The ID of the index file.</p>
         * 
         * <strong>example:</strong>
         * <p>c4d7f0a4-b506-43f9-8de3-07732c3f****</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <p>The storage information about the recording file.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Type&quot;: &quot;oss&quot;, &quot;Endpoint&quot;:&quot;oss-cn-shanghai.aliyuncs.com&quot;, &quot;Bucket&quot;: &quot;test-bucket&quot; }</p>
         */
        @NameInMap("RecordOutput")
        public String recordOutput;

        /**
         * <p>The URL of the index file.</p>
         */
        @NameInMap("RecordUrl")
        public String recordUrl;

        /**
         * <p>The beginning of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-01T07:36:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>LiveStream***</p>
         */
        @NameInMap("StreamUrl")
        public String streamUrl;

        /**
         * <p>The width of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
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
