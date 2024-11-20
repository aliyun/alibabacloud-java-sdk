// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomizedVoiceJobsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListCustomizedVoiceJobsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true false</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCustomizedVoiceJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizedVoiceJobsResponseBody self = new ListCustomizedVoiceJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomizedVoiceJobsResponseBody setData(ListCustomizedVoiceJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCustomizedVoiceJobsResponseBodyData getData() {
        return this.data;
    }

    public ListCustomizedVoiceJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomizedVoiceJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList extends TeaModel {
        /**
         * <ul>
         * <li>The time when the job was created.</li>
         * <li>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T06:23:59Z</p>
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
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-27T02:42:28Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The ID of the human voice cloning job.</p>
         * 
         * <strong>example:</strong>
         * <p>2245ab99a7fd4116a4fd3f499b7a56c5</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The returned message.</p>
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
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <ul>
         * <li><p>The voice type. Valid values:</p>
         * <ul>
         * <li>Basic</li>
         * <li>Standard</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The voice description.</p>
         * <ul>
         * <li>The description can be up to 256 characters in length.</li>
         * </ul>
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
         * <ul>
         * <li>The name can be up to 32 characters in length.</li>
         * </ul>
         */
        @NameInMap("VoiceName")
        public String voiceName;

        public static ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList build(java.util.Map<String, ?> map) throws Exception {
            ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList self = new ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList();
            return TeaModel.build(map, self);
        }

        public ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList setVoiceDesc(String voiceDesc) {
            this.voiceDesc = voiceDesc;
            return this;
        }
        public String getVoiceDesc() {
            return this.voiceDesc;
        }

        public ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList setVoiceName(String voiceName) {
            this.voiceName = voiceName;
            return this;
        }
        public String getVoiceName() {
            return this.voiceName;
        }

    }

    public static class ListCustomizedVoiceJobsResponseBodyData extends TeaModel {
        /**
         * <p>The queried human voice cloning jobs.</p>
         */
        @NameInMap("CustomizedVoiceJobList")
        public java.util.List<ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList> customizedVoiceJobList;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>271</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCustomizedVoiceJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomizedVoiceJobsResponseBodyData self = new ListCustomizedVoiceJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomizedVoiceJobsResponseBodyData setCustomizedVoiceJobList(java.util.List<ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList> customizedVoiceJobList) {
            this.customizedVoiceJobList = customizedVoiceJobList;
            return this;
        }
        public java.util.List<ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList> getCustomizedVoiceJobList() {
            return this.customizedVoiceJobList;
        }

        public ListCustomizedVoiceJobsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
