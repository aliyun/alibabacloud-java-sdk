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
         * <p>The media object.</p>
         * <ul>
         * <li>If Type is set to OSS, the URL of an OSS object is returned. Both the OSS and HTTP protocols are supported.</li>
         * <li>If Type is set to Media, set this parameter to the ID of a media asset.</li>
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
         * <p>The information about the input stream file.</p>
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
         * <p>The media object.</p>
         * <ul>
         * <li>If Type is set to OSS, the URL of an OSS object is returned. Both the OSS and HTTP protocols are supported.</li>
         * <li>If Type is set to Media, set this parameter to the ID of a media asset.</li>
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
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
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
         * <p>2022-07-07T14:00:32Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the job was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-07T15:00:32Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The input of the job.</p>
         */
        @NameInMap("Inputs")
        public java.util.List<ListPackageJobsResponseBodyPackageJobListPackageJobsInputs> inputs;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7b38a5d86f1e47838927b6e7ccb11cbe</p>
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
         * <p>2022-07-07T15:00:32Z</p>
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
        public ListPackageJobsResponseBodyPackageJobListPackageJobsOutput output;

        /**
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue that is used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>5b40833e4c3e4d4e95a866abb9a42510</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the job. Valid values: 1 to 10. The greater the value, the higher the priority. Default value: 6.</p>
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
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the job was submitted. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-07T14:00:32Z</p>
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. The token of the next page is returned after you call this operation for the first time.</p>
         * 
         * <strong>example:</strong>
         * <p>019daf5780f74831b0e1a767c9f1c178</p>
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
