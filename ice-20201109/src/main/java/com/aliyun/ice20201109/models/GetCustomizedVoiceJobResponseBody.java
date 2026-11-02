// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomizedVoiceJobResponseBody extends TeaModel {
    /**
     * <p>The data returned when the call is successful.</p>
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
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed.</li>
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
         * <p>The creation time in UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-07T02:27:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The gender. Valid values:</p>
         * <ul>
         * <li>female: Female.</li>
         * <li>male: Male.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>female</p>
         */
        @NameInMap("Gender")
        public String gender;

        /**
         * <p>The ID of the voice cloning task.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The additional description of the status.</p>
         * 
         * <strong>example:</strong>
         * <p>Training failed</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The scenario. Valid values:</p>
         * <ul>
         * <li>story: Story.</li>
         * <li>interaction: Interaction.</li>
         * <li>navigation: Navigation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>story</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Initialization: Initialized.</li>
         * <li>AudioDetecting: Audio detection is in progress.</li>
         * <li>PreTraining: Submitted for training and pending.</li>
         * <li>Training: Training is in progress.</li>
         * <li>Success: Training succeeded.</li>
         * <li>Fail: Training failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fail</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the voice cloning task. Valid values:</p>
         * <ul>
         * <li>Basic: Basic edition.</li>
         * <li>Standard: Standard edition.</li>
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
         * <p>This is an exclusive human voice</p>
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
         * <p>The voice name.</p>
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
         * <p>The voice cloning task.</p>
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
