// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListPackageJobsResponseBody extends TeaModel {
    /**
     * <p>The list of packaging jobs.</p>
     */
    @NameInMap("PackageJobList")
    public ListPackageJobsResponseBodyPackageJobList packageJobList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31E30781-9495-5E2D-A84D-759B0A01E262</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPackageJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPackageJobsResponseBody self = new ListPackageJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPackageJobsResponseBody setPackageJobList(ListPackageJobsResponseBodyPackageJobList packageJobList) {
        this.packageJobList = packageJobList;
        return this;
    }
    public ListPackageJobsResponseBodyPackageJobList getPackageJobList() {
        return this.packageJobList;
    }

    public ListPackageJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput extends TeaModel {
        /**
         * <p>The media value:</p>
         * <ul>
         * <li><p>If type is set to OSS, this parameter specifies a URL that supports the OSS protocol and HTTP protocol.</p>
         * </li>
         * <li><p>If type is set to Media, this parameter specifies a media asset ID.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The media object type. Valid values:</p>
         * <ul>
         * <li>OSS: an OSS file.</li>
         * <li>Media: a media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput build(java.util.Map<String, ?> map) throws Exception {
            ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput self = new ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput();
            return TeaModel.build(map, self);
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPackageJobsResponseBodyPackageJobListPackageJobsInputs extends TeaModel {
        /**
         * <p>The packaging stream file information.</p>
         */
        @NameInMap("Input")
        public ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput input;

        public static ListPackageJobsResponseBodyPackageJobListPackageJobsInputs build(java.util.Map<String, ?> map) throws Exception {
            ListPackageJobsResponseBodyPackageJobListPackageJobsInputs self = new ListPackageJobsResponseBodyPackageJobListPackageJobsInputs();
            return TeaModel.build(map, self);
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobsInputs setInput(ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput input) {
            this.input = input;
            return this;
        }
        public ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput getInput() {
            return this.input;
        }

    }

    public static class ListPackageJobsResponseBodyPackageJobListPackageJobsOutput extends TeaModel {
        /**
         * <p>The media value:</p>
         * <ul>
         * <li>If type is set to OSS, this parameter specifies a URL that supports the OSS protocol and HTTP protocol.</li>
         * <li>If type is set to Media, this parameter specifies a media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The media object type. Valid values:</p>
         * <ul>
         * <li>OSS: an OSS file.</li>
         * <li>Media: a media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListPackageJobsResponseBodyPackageJobListPackageJobsOutput build(java.util.Map<String, ?> map) throws Exception {
            ListPackageJobsResponseBodyPackageJobListPackageJobsOutput self = new ListPackageJobsResponseBodyPackageJobListPackageJobsOutput();
            return TeaModel.build(map, self);
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobsOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobsOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPackageJobsResponseBodyPackageJobListPackageJobs extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was created. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-07T14:00:32Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the job was completed. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-07T15:00:32Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The job inputs.</p>
         */
        @NameInMap("Inputs")
        public java.util.List<ListPackageJobsResponseBodyPackageJobListPackageJobsInputs> inputs;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7b38a5d86f1e47838927b6e7ccb1****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource content bad.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The time when the job was last modified. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-07T15:00:32Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>job-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The job output.</p>
         */
        @NameInMap("Output")
        public ListPackageJobsResponseBodyPackageJobListPackageJobsOutput output;

        /**
         * <p>The pipeline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5b40833e4c3e4d4e95a866abb9a4****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The job priority. A larger value indicates a higher priority. Valid values: 1 to 10. Default value: 6.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The job status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the job was submitted. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-07T14:00:32Z</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The job source. Valid values: </p>
         * <ul>
         * <li>API: API.</li>
         * <li>WorkFlow: Workflow.</li>
         * <li>Console: Console.</li>
         * </ul>
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
         * <p>{&quot;param&quot;: &quot;value&quot;}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static ListPackageJobsResponseBodyPackageJobListPackageJobs build(java.util.Map<String, ?> map) throws Exception {
            ListPackageJobsResponseBodyPackageJobListPackageJobs self = new ListPackageJobsResponseBodyPackageJobListPackageJobs();
            return TeaModel.build(map, self);
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setInputs(java.util.List<ListPackageJobsResponseBodyPackageJobListPackageJobsInputs> inputs) {
            this.inputs = inputs;
            return this;
        }
        public java.util.List<ListPackageJobsResponseBodyPackageJobListPackageJobsInputs> getInputs() {
            return this.inputs;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setOutput(ListPackageJobsResponseBodyPackageJobListPackageJobsOutput output) {
            this.output = output;
            return this;
        }
        public ListPackageJobsResponseBodyPackageJobListPackageJobsOutput getOutput() {
            return this.output;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class ListPackageJobsResponseBodyPackageJobList extends TeaModel {
        /**
         * <p>The pagination token for the next page. Leave this parameter empty for the first request. The token is returned after the first query.</p>
         * 
         * <strong>example:</strong>
         * <p>019daf5780f74831b0e1a767c9f1****</p>
         */
        @NameInMap("NextPageToken")
        public String nextPageToken;

        /**
         * <p>The list of packaging jobs.</p>
         */
        @NameInMap("PackageJobs")
        public java.util.List<ListPackageJobsResponseBodyPackageJobListPackageJobs> packageJobs;

        public static ListPackageJobsResponseBodyPackageJobList build(java.util.Map<String, ?> map) throws Exception {
            ListPackageJobsResponseBodyPackageJobList self = new ListPackageJobsResponseBodyPackageJobList();
            return TeaModel.build(map, self);
        }

        public ListPackageJobsResponseBodyPackageJobList setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public ListPackageJobsResponseBodyPackageJobList setPackageJobs(java.util.List<ListPackageJobsResponseBodyPackageJobListPackageJobs> packageJobs) {
            this.packageJobs = packageJobs;
            return this;
        }
        public java.util.List<ListPackageJobsResponseBodyPackageJobListPackageJobs> getPackageJobs() {
            return this.packageJobs;
        }

    }

}
