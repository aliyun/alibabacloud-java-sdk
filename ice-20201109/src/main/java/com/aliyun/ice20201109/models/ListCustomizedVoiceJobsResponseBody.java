// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomizedVoiceJobsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListCustomizedVoiceJobsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>female</p>
         */
        @NameInMap("Gender")
        public String gender;

        /**
         * <strong>example:</strong>
         * <p>2022-06-27T02:42:28Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2245ab99a7fd4116a4fd3f499b7a56c5</p>
         */
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>story</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("VoiceDesc")
        public String voiceDesc;

        /**
         * <strong>example:</strong>
         * <p>xiaozhuan</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

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
        @NameInMap("CustomizedVoiceJobList")
        public java.util.List<ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList> customizedVoiceJobList;

        /**
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
