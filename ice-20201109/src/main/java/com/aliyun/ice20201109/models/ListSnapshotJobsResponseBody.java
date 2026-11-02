// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSnapshotJobsResponseBody extends TeaModel {
    /**
     * <p>The list of jobs.</p>
     */
    @NameInMap("Jobs")
    public java.util.List<ListSnapshotJobsResponseBodyJobs> jobs;

    /**
     * <p>The pagination token for querying the next page.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSnapshotJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotJobsResponseBody self = new ListSnapshotJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotJobsResponseBody setJobs(java.util.List<ListSnapshotJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListSnapshotJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListSnapshotJobsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListSnapshotJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSnapshotJobsResponseBodyJobsInput extends TeaModel {
        /**
         * <p>The input media. If Type is set to OSS, enter the OSS URL. If Type is set to Media, enter the media asset ID.
         * The OSS URL must follow these rules:</p>
         * <ul>
         * <li><p>OSS://bucket/object</p>
         * </li>
         * <li><p>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</p>
         * </li>
         * </ul>
         * <p>In the URLs, bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The input type. Valid values:</p>
         * <ol>
         * <li>OSS: URL of an OSS object</li>
         * <li>Media: media asset ID</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListSnapshotJobsResponseBodyJobsInput build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotJobsResponseBodyJobsInput self = new ListSnapshotJobsResponseBodyJobsInput();
            return TeaModel.build(map, self);
        }

        public ListSnapshotJobsResponseBodyJobsInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListSnapshotJobsResponseBodyJobsInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListSnapshotJobsResponseBodyJobsOutput extends TeaModel {
        /**
         * <p>The output media. If Type is set to OSS, enter the OSS URL. If Type is set to Media, enter the media asset ID.
         * The OSS URL must follow these rules:</p>
         * <ul>
         * <li><p>OSS://bucket/object</p>
         * </li>
         * <li><p>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</p>
         * </li>
         * </ul>
         * <p>In the URLs, bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</p>
         * <ul>
         * <li><p>When capturing multiple static snapshots, the object must contain the &quot;{Count}&quot; placeholder.</p>
         * </li>
         * <li><p>When capturing sprite snapshots, the object must contain the &quot;{TileCount}&quot; placeholder.</p>
         * </li>
         * <li><p>For WebVTT snapshots, the object extension must be &quot;.vtt&quot;.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test-bucket.oss-cn-shanghai.aliyuncs.com/output-%7BCount%7D.jpg">http://test-bucket.oss-cn-shanghai.aliyuncs.com/output-{Count}.jpg</a></p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The output type. Valid values:</p>
         * <ol>
         * <li>OSS: URL of an OSS object</li>
         * <li>Media: media asset ID</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListSnapshotJobsResponseBodyJobsOutput build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotJobsResponseBodyJobsOutput self = new ListSnapshotJobsResponseBodyJobsOutput();
            return TeaModel.build(map, self);
        }

        public ListSnapshotJobsResponseBodyJobsOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListSnapshotJobsResponseBodyJobsOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListSnapshotJobsResponseBodyJobs extends TeaModel {
        /**
         * <p>Specifies whether to capture snapshots asynchronously.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Async")
        public Boolean async;

        /**
         * <p>The number of snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The creation time. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:17:54Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the job was completed. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:30:54Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The job input.</p>
         */
        @NameInMap("Input")
        public ListSnapshotJobsResponseBodyJobsInput input;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The last modification time. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:30:54Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleJob</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The job output.</p>
         */
        @NameInMap("Output")
        public ListSnapshotJobsResponseBodyJobsOutput output;

        /**
         * <p>The pipeline ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The job status.</p>
         * <ul>
         * <li><p><strong>Success</strong>: Success.</p>
         * </li>
         * <li><p><strong>Fail</strong>: Failed.</p>
         * </li>
         * <li><p><strong>Init</strong>: Submitted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the job was submitted. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:17:54Z</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The trigger source of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("TriggerSource")
        public String triggerSource;

        /**
         * <p>The job type.</p>
         * 
         * <strong>example:</strong>
         * <p>Sprite</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListSnapshotJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotJobsResponseBodyJobs self = new ListSnapshotJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListSnapshotJobsResponseBodyJobs setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public ListSnapshotJobsResponseBodyJobs setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListSnapshotJobsResponseBodyJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSnapshotJobsResponseBodyJobs setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListSnapshotJobsResponseBodyJobs setInput(ListSnapshotJobsResponseBodyJobsInput input) {
            this.input = input;
            return this;
        }
        public ListSnapshotJobsResponseBodyJobsInput getInput() {
            return this.input;
        }

        public ListSnapshotJobsResponseBodyJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListSnapshotJobsResponseBodyJobs setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListSnapshotJobsResponseBodyJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSnapshotJobsResponseBodyJobs setOutput(ListSnapshotJobsResponseBodyJobsOutput output) {
            this.output = output;
            return this;
        }
        public ListSnapshotJobsResponseBodyJobsOutput getOutput() {
            return this.output;
        }

        public ListSnapshotJobsResponseBodyJobs setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListSnapshotJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSnapshotJobsResponseBodyJobs setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListSnapshotJobsResponseBodyJobs setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListSnapshotJobsResponseBodyJobs setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public ListSnapshotJobsResponseBodyJobs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
