// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetDynamicImageJobResponseBody extends TeaModel {
    /**
     * <p>The dynamic image task information.</p>
     */
    @NameInMap("DynamicImageJob")
    public GetDynamicImageJobResponseBodyDynamicImageJob dynamicImageJob;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDynamicImageJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDynamicImageJobResponseBody self = new GetDynamicImageJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDynamicImageJobResponseBody setDynamicImageJob(GetDynamicImageJobResponseBodyDynamicImageJob dynamicImageJob) {
        this.dynamicImageJob = dynamicImageJob;
        return this;
    }
    public GetDynamicImageJobResponseBodyDynamicImageJob getDynamicImageJob() {
        return this.dynamicImageJob;
    }

    public GetDynamicImageJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile extends TeaModel {
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
         * <p>sample-input.mp4</p>
         */
        @NameInMap("Object")
        public String object;

        public static GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile build(java.util.Map<String, ?> map) throws Exception {
            GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile self = new GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile();
            return TeaModel.build(map, self);
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class GetDynamicImageJobResponseBodyDynamicImageJobInput extends TeaModel {
        /**
         * <p>The input media. If Type is set to OSS, enter the URL of the OSS object. If Type is set to Media, enter the ID of the media asset.
         * The URL of the OSS object must be in one of the following formats:</p>
         * <ul>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</li>
         * </ul>
         * <p>In the formats, bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/sample-input.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The OSS triplet.</p>
         */
        @NameInMap("OssFile")
        public GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile ossFile;

        /**
         * <p>The input type. Valid values:</p>
         * <ul>
         * <li>OSS: the URL of an OSS object.</li>
         * <li>Media: the ID of a media asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDynamicImageJobResponseBodyDynamicImageJobInput build(java.util.Map<String, ?> map) throws Exception {
            GetDynamicImageJobResponseBodyDynamicImageJobInput self = new GetDynamicImageJobResponseBodyDynamicImageJobInput();
            return TeaModel.build(map, self);
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobInput setOssFile(GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile ossFile) {
            this.ossFile = ossFile;
            return this;
        }
        public GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile getOssFile() {
            return this.ossFile;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile extends TeaModel {
        /**
         * <p>OSS Bucket</p>
         * 
         * <strong>example:</strong>
         * <p>sample-bucket</p>
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
         * <p>path/to/object</p>
         */
        @NameInMap("Object")
        public String object;

        public static GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile build(java.util.Map<String, ?> map) throws Exception {
            GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile self = new GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile();
            return TeaModel.build(map, self);
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class GetDynamicImageJobResponseBodyDynamicImageJobOutput extends TeaModel {
        /**
         * <p>The output media. If Type is set to OSS, enter the URL of the OSS object. If Type is set to Media, enter the ID of the media asset.
         * The URL of the OSS object must be in one of the following formats:</p>
         * <ul>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</li>
         * </ul>
         * <p>In the formats, bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The OSS triplet.</p>
         */
        @NameInMap("OssFile")
        public GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile ossFile;

        /**
         * <p>The output type. Valid values:</p>
         * <ul>
         * <li>OSS: the URL of an OSS object.</li>
         * <li>Media: the ID of a media asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Media</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDynamicImageJobResponseBodyDynamicImageJobOutput build(java.util.Map<String, ?> map) throws Exception {
            GetDynamicImageJobResponseBodyDynamicImageJobOutput self = new GetDynamicImageJobResponseBodyDynamicImageJobOutput();
            return TeaModel.build(map, self);
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobOutput setOssFile(GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile ossFile) {
            this.ossFile = ossFile;
            return this;
        }
        public GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile getOssFile() {
            return this.ossFile;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDynamicImageJobResponseBodyDynamicImageJob extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceNotFound</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The creation time. The time is in the ISO 8601 format and UTC, ending with Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:17:54Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the task was completed. The time is in the ISO 8601 format and UTC, ending with Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:30:54Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The input of the task.</p>
         */
        @NameInMap("Input")
        public GetDynamicImageJobResponseBodyDynamicImageJobInput input;

        /**
         * <p>The ID of the task.</p>
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
         * <p>The specified resource for &quot;CustomTemplate&quot; could not be found.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The last modification time. The time is in the ISO 8601 format and UTC, ending with Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:30:54Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleJob</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output of the task.</p>
         */
        @NameInMap("Output")
        public GetDynamicImageJobResponseBodyDynamicImageJobOutput output;

        /**
         * <p>The URL of the output dynamic image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test-bucket.oss-cn-shanghai.aliyuncs.com/output.gif">http://test-bucket.oss-cn-shanghai.aliyuncs.com/output.gif</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>The ID of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the task was submitted. The time is in the ISO 8601 format and UTC, ending with Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:17:54Z</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The dynamic image template configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Format&quot;:&quot;gif&quot;,&quot;Fps&quot;:5,&quot;Height&quot;:1080,&quot;Width&quot;:1920}</p>
         */
        @NameInMap("TemplateConfig")
        public String templateConfig;

        /**
         * <p>The ID of the template.</p>
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
         * <p>The custom user data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sampleParam&quot;: &quot;sampleValue&quot;}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetDynamicImageJobResponseBodyDynamicImageJob build(java.util.Map<String, ?> map) throws Exception {
            GetDynamicImageJobResponseBodyDynamicImageJob self = new GetDynamicImageJobResponseBodyDynamicImageJob();
            return TeaModel.build(map, self);
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setInput(GetDynamicImageJobResponseBodyDynamicImageJobInput input) {
            this.input = input;
            return this;
        }
        public GetDynamicImageJobResponseBodyDynamicImageJobInput getInput() {
            return this.input;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setOutput(GetDynamicImageJobResponseBodyDynamicImageJobOutput output) {
            this.output = output;
            return this;
        }
        public GetDynamicImageJobResponseBodyDynamicImageJobOutput getOutput() {
            return this.output;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
