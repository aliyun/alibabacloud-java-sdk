// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPackageJobResponseBody extends TeaModel {
    /**
     * <p>The information about the packaging job.</p>
     */
    @NameInMap("PackageJob")
    public GetPackageJobResponseBodyPackageJob packageJob;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31E30781-9495-5E2D-A84D-759B0A01E262</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPackageJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPackageJobResponseBody self = new GetPackageJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPackageJobResponseBody setPackageJob(GetPackageJobResponseBodyPackageJob packageJob) {
        this.packageJob = packageJob;
        return this;
    }
    public GetPackageJobResponseBodyPackageJob getPackageJob() {
        return this.packageJob;
    }

    public GetPackageJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPackageJobResponseBodyPackageJobInputsInput extends TeaModel {
        /**
         * <p>The media object.</p>
         * <ul>
         * <li>If Type is set to OSS, the URL of an OSS object is returned. Both the OSS and HTTP protocols are supported.</li>
         * <li>If Type is set to Media, the ID of a media asset is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the media object. Valid values:</p>
         * <ul>
         * <li>OSS: an Object Storage Service (OSS) object.</li>
         * <li>Media: a media asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetPackageJobResponseBodyPackageJobInputsInput build(java.util.Map<String, ?> map) throws Exception {
            GetPackageJobResponseBodyPackageJobInputsInput self = new GetPackageJobResponseBodyPackageJobInputsInput();
            return TeaModel.build(map, self);
        }

        public GetPackageJobResponseBodyPackageJobInputsInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetPackageJobResponseBodyPackageJobInputsInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPackageJobResponseBodyPackageJobInputs extends TeaModel {
        /**
         * <p>The information about the input stream file.</p>
         */
        @NameInMap("Input")
        public GetPackageJobResponseBodyPackageJobInputsInput input;

        public static GetPackageJobResponseBodyPackageJobInputs build(java.util.Map<String, ?> map) throws Exception {
            GetPackageJobResponseBodyPackageJobInputs self = new GetPackageJobResponseBodyPackageJobInputs();
            return TeaModel.build(map, self);
        }

        public GetPackageJobResponseBodyPackageJobInputs setInput(GetPackageJobResponseBodyPackageJobInputsInput input) {
            this.input = input;
            return this;
        }
        public GetPackageJobResponseBodyPackageJobInputsInput getInput() {
            return this.input;
        }

    }

    public static class GetPackageJobResponseBodyPackageJobOutput extends TeaModel {
        /**
         * <p>The media object.</p>
         * <ul>
         * <li>If Type is set to OSS, the URL of an OSS object is returned. Both the OSS and HTTP protocols are supported.</li>
         * <li>If Type is set to Media, the ID of a media asset is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.m3u8</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the media object. Valid values:</p>
         * <ul>
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetPackageJobResponseBodyPackageJobOutput build(java.util.Map<String, ?> map) throws Exception {
            GetPackageJobResponseBodyPackageJobOutput self = new GetPackageJobResponseBodyPackageJobOutput();
            return TeaModel.build(map, self);
        }

        public GetPackageJobResponseBodyPackageJobOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetPackageJobResponseBodyPackageJobOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPackageJobResponseBodyPackageJob extends TeaModel {
        /**
         * <p>The error code returned if the job fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-08T11:34:05Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the job was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-08T11:44:05Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The input of the job.</p>
         */
        @NameInMap("Inputs")
        public java.util.List<GetPackageJobResponseBodyPackageJobInputs> inputs;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ab4802364a2e49208c99efab82dfa8e8</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The error message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource content bad.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The time when the job was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-08T11:44:05Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>job-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output of the job.</p>
         */
        @NameInMap("Output")
        public GetPackageJobResponseBodyPackageJobOutput output;

        /**
         * <p>The URL of the output file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://bucket.oss-cn-shanghai.aliyuncs.com/output.m3u8">http://bucket.oss-cn-shanghai.aliyuncs.com/output.m3u8</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>The ID of the MPS queue to which the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>36f3fee40aa047c0b067d0fb85edc12b</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the job. Valid values: 1 to 10. The greater the value, the higher the priority.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The state of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>Init</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the job was submitted. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-08T11:34:05Z</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The source of the job. Valid values:</p>
         * <ul>
         * <li>API</li>
         * <li>WorkFlow</li>
         * <li>Console</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("TriggerSource")
        public String triggerSource;

        /**
         * <p>The user-defined data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;param&quot;: &quot;value&quot;}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetPackageJobResponseBodyPackageJob build(java.util.Map<String, ?> map) throws Exception {
            GetPackageJobResponseBodyPackageJob self = new GetPackageJobResponseBodyPackageJob();
            return TeaModel.build(map, self);
        }

        public GetPackageJobResponseBodyPackageJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetPackageJobResponseBodyPackageJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPackageJobResponseBodyPackageJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetPackageJobResponseBodyPackageJob setInputs(java.util.List<GetPackageJobResponseBodyPackageJobInputs> inputs) {
            this.inputs = inputs;
            return this;
        }
        public java.util.List<GetPackageJobResponseBodyPackageJobInputs> getInputs() {
            return this.inputs;
        }

        public GetPackageJobResponseBodyPackageJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetPackageJobResponseBodyPackageJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetPackageJobResponseBodyPackageJob setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetPackageJobResponseBodyPackageJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPackageJobResponseBodyPackageJob setOutput(GetPackageJobResponseBodyPackageJobOutput output) {
            this.output = output;
            return this;
        }
        public GetPackageJobResponseBodyPackageJobOutput getOutput() {
            return this.output;
        }

        public GetPackageJobResponseBodyPackageJob setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public GetPackageJobResponseBodyPackageJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public GetPackageJobResponseBodyPackageJob setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetPackageJobResponseBodyPackageJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPackageJobResponseBodyPackageJob setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetPackageJobResponseBodyPackageJob setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public GetPackageJobResponseBodyPackageJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
