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
     * <p>The information about the snapshot job.</p>
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
         * <p>The OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS location.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The OSS object.</p>
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
         * <p>The input file. If Type is set to OSS, the URL of an OSS object is returned. If Type is set to Media, the ID of a media asset is returned. The URL of an OSS object can be in one of the following formats:</p>
         * <ol>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object In the URL, bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object URL in OSS.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/object.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The three key elements of OSS.</p>
         */
        @NameInMap("OssFile")
        public GetSnapshotJobResponseBodySnapshotJobInputOssFile ossFile;

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
         * <p>The OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS location.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The OSS object.</p>
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
         * <p>The output file. If Type is set to OSS, the URL of an OSS object is returned. If Type is set to Media, the ID of a media asset is returned. The URL of an OSS object can be in one of the following formats:</p>
         * <ol>
         * <li>oss://bucket/object</li>
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
         * <p>The three key elements of OSS.</p>
         */
        @NameInMap("OssFile")
        public GetSnapshotJobResponseBodySnapshotJobOutputOssFile ossFile;

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
         * <p>Indicates whether the snapshots were captured in asynchronous mode. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Async")
        public Boolean async;

        /**
         * <p>Error codes</p>
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
         * <p>The error message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource for &quot;Pipeline&quot; could not be found.</p>
         */
        @NameInMap("Message")
        public String message;

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
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output of the job.</p>
         */
        @NameInMap("Output")
        public GetSnapshotJobResponseBodySnapshotJobOutput output;

        /**
         * <p>The ID of the MPS queue to which the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The state of the job.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Init: The job is submitted.</li>
         * <li>Success: The job is successful.</li>
         * <li>Fail: The job failed.</li>
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
         * <p>Snapshot types</p>
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

        /**
         * <p>The user-defined parameters.</p>
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
