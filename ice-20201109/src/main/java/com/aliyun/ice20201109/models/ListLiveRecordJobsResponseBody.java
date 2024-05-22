// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveRecordJobsResponseBody extends TeaModel {
    @NameInMap("LiveRecordJobs")
    public java.util.List<ListLiveRecordJobsResponseBodyLiveRecordJobs> liveRecordJobs;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLiveRecordJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordJobsResponseBody self = new ListLiveRecordJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordJobsResponseBody setLiveRecordJobs(java.util.List<ListLiveRecordJobsResponseBodyLiveRecordJobs> liveRecordJobs) {
        this.liveRecordJobs = liveRecordJobs;
        return this;
    }
    public java.util.List<ListLiveRecordJobsResponseBodyLiveRecordJobs> getLiveRecordJobs() {
        return this.liveRecordJobs;
    }

    public ListLiveRecordJobsResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListLiveRecordJobsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLiveRecordJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveRecordJobsResponseBody setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveRecordJobsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListLiveRecordJobsResponseBodyLiveRecordJobsRecordOutput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Type")
        public String type;

        public static ListLiveRecordJobsResponseBodyLiveRecordJobsRecordOutput build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordJobsResponseBodyLiveRecordJobsRecordOutput self = new ListLiveRecordJobsResponseBodyLiveRecordJobsRecordOutput();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobsRecordOutput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobsRecordOutput setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobsRecordOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListLiveRecordJobsResponseBodyLiveRecordJobsStreamInput extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static ListLiveRecordJobsResponseBodyLiveRecordJobsStreamInput build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordJobsResponseBodyLiveRecordJobsStreamInput self = new ListLiveRecordJobsResponseBodyLiveRecordJobsStreamInput();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobsStreamInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobsStreamInput setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListLiveRecordJobsResponseBodyLiveRecordJobs extends TeaModel {
        /**
         * <p>代表创建时间的资源属性字段</p>
         * <br>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>代表资源名称的资源属性字段</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>回调地址</p>
         */
        @NameInMap("NotifyUrl")
        public String notifyUrl;

        @NameInMap("RecordOutput")
        public ListLiveRecordJobsResponseBodyLiveRecordJobsRecordOutput recordOutput;

        @NameInMap("Status")
        public String status;

        @NameInMap("StreamInput")
        public ListLiveRecordJobsResponseBodyLiveRecordJobsStreamInput streamInput;

        /**
         * <p>录制模板ID</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        public static ListLiveRecordJobsResponseBodyLiveRecordJobs build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordJobsResponseBodyLiveRecordJobs self = new ListLiveRecordJobsResponseBodyLiveRecordJobs();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobs setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobs setRecordOutput(ListLiveRecordJobsResponseBodyLiveRecordJobsRecordOutput recordOutput) {
            this.recordOutput = recordOutput;
            return this;
        }
        public ListLiveRecordJobsResponseBodyLiveRecordJobsRecordOutput getRecordOutput() {
            return this.recordOutput;
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobs setStreamInput(ListLiveRecordJobsResponseBodyLiveRecordJobsStreamInput streamInput) {
            this.streamInput = streamInput;
            return this;
        }
        public ListLiveRecordJobsResponseBodyLiveRecordJobsStreamInput getStreamInput() {
            return this.streamInput;
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobs setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListLiveRecordJobsResponseBodyLiveRecordJobs setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
