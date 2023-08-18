// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomizedVoiceJobsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListCustomizedVoiceJobsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Gender")
        public String gender;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("Scenario")
        public String scenario;

        @NameInMap("Status")
        public String status;

        @NameInMap("VoiceDesc")
        public String voiceDesc;

        @NameInMap("VoiceId")
        public String voiceId;

        @NameInMap("VoiceName")
        public String voiceName;

        public static ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList build(java.util.Map<String, ?> map) throws Exception {
            ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList self = new ListCustomizedVoiceJobsResponseBodyDataCustomizedVoiceJobList();
            return TeaModel.build(map, self);
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
