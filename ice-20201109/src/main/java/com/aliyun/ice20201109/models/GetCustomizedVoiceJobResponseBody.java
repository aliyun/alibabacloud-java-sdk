// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomizedVoiceJobResponseBody extends TeaModel {
    /**
     * <p>The data returned if the request was successful.</p>
     */
    @NameInMap("Data")
    public GetCustomizedVoiceJobResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCustomizedVoiceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizedVoiceJobResponseBody self = new GetCustomizedVoiceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomizedVoiceJobResponseBody setData(GetCustomizedVoiceJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomizedVoiceJobResponseBodyData getData() {
        return this.data;
    }

    public GetCustomizedVoiceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomizedVoiceJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob extends TeaModel {
        /**
         * <p>The time when the job was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-07T02:27:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The gender. Valid values:</p>
         * <ul>
         * <li>female</li>
         * <li>male</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>female</p>
         */
        @NameInMap("Gender")
        public String gender;

        /**
         * <p>The ID of the human voice cloning job.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The status description.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The scenario. Valid values:</p>
         * <ul>
         * <li>story</li>
         * <li>interaction</li>
         * <li>navigation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>story</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        /**
         * <p>The job state. Valid values:</p>
         * <ul>
         * <li>Initialization</li>
         * <li>AudioDetecting</li>
         * <li>PreTraining</li>
         * <li>Training</li>
         * <li>Success</li>
         * <li>Fail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fail</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the human voice cloning job. Valid values:</p>
         * <ul>
         * <li>Basic</li>
         * <li>Standard</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The voice description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is an exclusive voice</p>
         */
        @NameInMap("VoiceDesc")
        public String voiceDesc;

        /**
         * <p>The voice ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xiaozhuan</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        /**
         * <p>The voice name.</p>
         * 
         * <strong>example:</strong>
         * <p>Xiaozhuan</p>
         */
        @NameInMap("VoiceName")
        public String voiceName;

        public static GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob build(java.util.Map<String, ?> map) throws Exception {
            GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob self = new GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob();
            return TeaModel.build(map, self);
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setVoiceDesc(String voiceDesc) {
            this.voiceDesc = voiceDesc;
            return this;
        }
        public String getVoiceDesc() {
            return this.voiceDesc;
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setVoiceName(String voiceName) {
            this.voiceName = voiceName;
            return this;
        }
        public String getVoiceName() {
            return this.voiceName;
        }

    }

    public static class GetCustomizedVoiceJobResponseBodyData extends TeaModel {
        /**
         * <p>The information about the human voice cloning job.</p>
         */
        @NameInMap("CustomizedVoiceJob")
        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob customizedVoiceJob;

        public static GetCustomizedVoiceJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomizedVoiceJobResponseBodyData self = new GetCustomizedVoiceJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomizedVoiceJobResponseBodyData setCustomizedVoiceJob(GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob customizedVoiceJob) {
            this.customizedVoiceJob = customizedVoiceJob;
            return this;
        }
        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob getCustomizedVoiceJob() {
            return this.customizedVoiceJob;
        }

    }

}
