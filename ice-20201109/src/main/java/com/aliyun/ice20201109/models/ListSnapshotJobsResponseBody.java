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
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
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
         * <p>The input file. If Type is set to OSS, the URL of an OSS object is returned. If Type is set to Media, the ID of a media asset is returned. The URL of an OSS object can be in one of the following formats: 1. OSS://bucket/object 2. http(s)://bucket.oss-[RegionId].aliyuncs.com/object In the URL, bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object URL in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input file. Valid values:</p>
         * <ol>
         * <li>OSS: an Object Storage Service (OSS) object.</li>
         * <li>Media: a media asset.</li>
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
         * <p>The output file. If Type is set to OSS, the URL of an OSS object is returned. If Type is set to Media, the ID of a media asset is returned. The URL of an OSS object can be in one of the following formats:</p>
         * <ol>
         * <li>OSS://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</li>
         * </ol>
         * <p>In the URL, bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object URL in OSS. If multiple static snapshots were captured, the object must contain the &quot;{Count}&quot; placeholder. In the case of a sprite, the object must contain the &quot;{TileCount}&quot; placeholder. The suffix of the WebVTT snapshot objects must be &quot;.vtt&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test-bucket.oss-cn-shanghai.aliyuncs.com/output-%7BCount%7D.jpg">http://test-bucket.oss-cn-shanghai.aliyuncs.com/output-{Count}.jpg</a></p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the output file. Valid values:</p>
         * <ol>
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
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
         * <p>Indicates whether the snapshots were captured in asynchronous mode.</p>
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
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:17:54Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the job was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:30:54Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The input of the job.</p>
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
         * <p>The time when the job was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:30:54Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleJob</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output of the job.</p>
         */
        @NameInMap("Output")
        public ListSnapshotJobsResponseBodyJobsOutput output;

        /**
         * <p>The ID of the MPS queue to which the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The state of the job.</p>
         * <ul>
         * <li><strong>Success</strong>: The job is successful.</li>
         * <li><strong>Fail</strong>: The job failed.</li>
         * <li><strong>Init</strong>: The job is submitted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the job was submitted.</p>
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
         * <p>The request trigger source.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Console</li>
         * <li>Workflow</li>
         * <li>API</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("TriggerSource")
        public String triggerSource;

        /**
         * <p>The type of the job.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>WebVtt</li>
         * <li>Sprite</li>
         * <li>Normal</li>
         * </ul>
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
