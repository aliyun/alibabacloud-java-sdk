// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSnapshotJobResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The snapshot job information.</p>
     */
    @NameInMap("SnapshotJob")
    public GetSnapshotJobResponseBodySnapshotJob snapshotJob;

    public static GetSnapshotJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotJobResponseBody self = new GetSnapshotJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSnapshotJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSnapshotJobResponseBody setSnapshotJob(GetSnapshotJobResponseBodySnapshotJob snapshotJob) {
        this.snapshotJob = snapshotJob;
        return this;
    }
    public GetSnapshotJobResponseBodySnapshotJob getSnapshotJob() {
        return this.snapshotJob;
    }

    public static class GetSnapshotJobResponseBodySnapshotJobInputOssFile extends TeaModel {
        /**
         * <p>OSS Bucket</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>OSS Location</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>OSS Object</p>
         * 
         * <strong>example:</strong>
         * <p>object.mp4</p>
         */
        @NameInMap("Object")
        public String object;

        public static GetSnapshotJobResponseBodySnapshotJobInputOssFile build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotJobResponseBodySnapshotJobInputOssFile self = new GetSnapshotJobResponseBodySnapshotJobInputOssFile();
            return TeaModel.build(map, self);
        }

        public GetSnapshotJobResponseBodySnapshotJobInputOssFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetSnapshotJobResponseBodySnapshotJobInputOssFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetSnapshotJobResponseBodySnapshotJobInputOssFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class GetSnapshotJobResponseBodySnapshotJobInput extends TeaModel {
        /**
         * <p>The input media. If Type is set to OSS, enter the OSS object URL. If Type is set to Media, enter the media asset ID.
         * The OSS object URL must be in one of the following formats:</p>
         * <ul>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object
         * In the URLs, bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/object.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The OSS triplet.</p>
         */
        @NameInMap("OssFile")
        public GetSnapshotJobResponseBodySnapshotJobInputOssFile ossFile;

        /**
         * <p>The input type. Valid values:</p>
         * <ul>
         * <li>OSS: the URL of an OSS object.</li>
         * <li>Media: the media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetSnapshotJobResponseBodySnapshotJobInput build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotJobResponseBodySnapshotJobInput self = new GetSnapshotJobResponseBodySnapshotJobInput();
            return TeaModel.build(map, self);
        }

        public GetSnapshotJobResponseBodySnapshotJobInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetSnapshotJobResponseBodySnapshotJobInput setOssFile(GetSnapshotJobResponseBodySnapshotJobInputOssFile ossFile) {
            this.ossFile = ossFile;
            return this;
        }
        public GetSnapshotJobResponseBodySnapshotJobInputOssFile getOssFile() {
            return this.ossFile;
        }

        public GetSnapshotJobResponseBodySnapshotJobInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetSnapshotJobResponseBodySnapshotJobOutputOssFile extends TeaModel {
        /**
         * <p>OSS Bucket</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>OSS Location</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>OSS Object</p>
         * 
         * <strong>example:</strong>
         * <p>output-{Count}.jpg</p>
         */
        @NameInMap("Object")
        public String object;

        public static GetSnapshotJobResponseBodySnapshotJobOutputOssFile build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotJobResponseBodySnapshotJobOutputOssFile self = new GetSnapshotJobResponseBodySnapshotJobOutputOssFile();
            return TeaModel.build(map, self);
        }

        public GetSnapshotJobResponseBodySnapshotJobOutputOssFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetSnapshotJobResponseBodySnapshotJobOutputOssFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetSnapshotJobResponseBodySnapshotJobOutputOssFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class GetSnapshotJobResponseBodySnapshotJobOutput extends TeaModel {
        /**
         * <p>The output media. If Type is set to OSS, enter the OSS object URL. If Type is set to Media, enter the media asset ID.
         * The OSS object URL must be in one of the following formats:</p>
         * <ul>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</li>
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
         * <p>The OSS triplet.</p>
         */
        @NameInMap("OssFile")
        public GetSnapshotJobResponseBodySnapshotJobOutputOssFile ossFile;

        /**
         * <p>The output type. Valid values:</p>
         * <ul>
         * <li>OSS: the URL of an OSS object.</li>
         * <li>Media: the media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetSnapshotJobResponseBodySnapshotJobOutput build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotJobResponseBodySnapshotJobOutput self = new GetSnapshotJobResponseBodySnapshotJobOutput();
            return TeaModel.build(map, self);
        }

        public GetSnapshotJobResponseBodySnapshotJobOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetSnapshotJobResponseBodySnapshotJobOutput setOssFile(GetSnapshotJobResponseBodySnapshotJobOutputOssFile ossFile) {
            this.ossFile = ossFile;
            return this;
        }
        public GetSnapshotJobResponseBodySnapshotJobOutputOssFile getOssFile() {
            return this.ossFile;
        }

        public GetSnapshotJobResponseBodySnapshotJobOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetSnapshotJobResponseBodySnapshotJob extends TeaModel {
        /**
         * <p>Specifies whether to capture snapshots asynchronously. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Async")
        public Boolean async;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceNotFound</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The number of snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The creation time. The time follows the ISO 8601 standard in UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:17:54Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the job was completed. The time follows the ISO 8601 standard in UTC (ending with Z).</p>
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
        public GetSnapshotJobResponseBodySnapshotJobInput input;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource for &quot;Pipeline&quot; could not be found.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The last modification time. The time follows the ISO 8601 standard in UTC (ending with Z).</p>
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
         * <p>Test job</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The job output.</p>
         */
        @NameInMap("Output")
        public GetSnapshotJobResponseBodySnapshotJobOutput output;

        /**
         * <p>The pipeline ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The job status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the job was submitted. The time follows the ISO 8601 standard in UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:17:54Z</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The snapshot template configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Type&quot;:&quot;Normal&quot;,&quot;FrameType&quot;:&quot;normal&quot;,&quot;Time&quot;:0,&quot;Count&quot;:10}</p>
         */
        @NameInMap("TemplateConfig")
        public String templateConfig;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
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
         * <p>The snapshot type.</p>
         * 
         * <strong>example:</strong>
         * <p>Sprite</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The custom user data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test parameter&quot;: &quot;test value&quot;}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetSnapshotJobResponseBodySnapshotJob build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotJobResponseBodySnapshotJob self = new GetSnapshotJobResponseBodySnapshotJob();
            return TeaModel.build(map, self);
        }

        public GetSnapshotJobResponseBodySnapshotJob setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public GetSnapshotJobResponseBodySnapshotJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetSnapshotJobResponseBodySnapshotJob setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetSnapshotJobResponseBodySnapshotJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSnapshotJobResponseBodySnapshotJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetSnapshotJobResponseBodySnapshotJob setInput(GetSnapshotJobResponseBodySnapshotJobInput input) {
            this.input = input;
            return this;
        }
        public GetSnapshotJobResponseBodySnapshotJobInput getInput() {
            return this.input;
        }

        public GetSnapshotJobResponseBodySnapshotJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetSnapshotJobResponseBodySnapshotJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetSnapshotJobResponseBodySnapshotJob setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetSnapshotJobResponseBodySnapshotJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSnapshotJobResponseBodySnapshotJob setOutput(GetSnapshotJobResponseBodySnapshotJobOutput output) {
            this.output = output;
            return this;
        }
        public GetSnapshotJobResponseBodySnapshotJobOutput getOutput() {
            return this.output;
        }

        public GetSnapshotJobResponseBodySnapshotJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public GetSnapshotJobResponseBodySnapshotJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSnapshotJobResponseBodySnapshotJob setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetSnapshotJobResponseBodySnapshotJob setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetSnapshotJobResponseBodySnapshotJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetSnapshotJobResponseBodySnapshotJob setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public GetSnapshotJobResponseBodySnapshotJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetSnapshotJobResponseBodySnapshotJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
