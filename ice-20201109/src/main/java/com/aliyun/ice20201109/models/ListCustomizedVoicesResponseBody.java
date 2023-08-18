// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomizedVoicesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListCustomizedVoicesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCustomizedVoicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizedVoicesResponseBody self = new ListCustomizedVoicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomizedVoicesResponseBody setData(ListCustomizedVoicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCustomizedVoicesResponseBodyData getData() {
        return this.data;
    }

    public ListCustomizedVoicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomizedVoicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCustomizedVoicesResponseBodyDataCustomizedVoiceList extends TeaModel {
        @NameInMap("DemoAudioMediaId")
        public String demoAudioMediaId;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("Scenario")
        public String scenario;

        @NameInMap("VoiceDesc")
        public String voiceDesc;

        @NameInMap("VoiceId")
        public String voiceId;

        @NameInMap("VoiceName")
        public String voiceName;

        public static ListCustomizedVoicesResponseBodyDataCustomizedVoiceList build(java.util.Map<String, ?> map) throws Exception {
            ListCustomizedVoicesResponseBodyDataCustomizedVoiceList self = new ListCustomizedVoicesResponseBodyDataCustomizedVoiceList();
            return TeaModel.build(map, self);
        }

        public ListCustomizedVoicesResponseBodyDataCustomizedVoiceList setDemoAudioMediaId(String demoAudioMediaId) {
            this.demoAudioMediaId = demoAudioMediaId;
            return this;
        }
        public String getDemoAudioMediaId() {
            return this.demoAudioMediaId;
        }

        public ListCustomizedVoicesResponseBodyDataCustomizedVoiceList setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListCustomizedVoicesResponseBodyDataCustomizedVoiceList setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public ListCustomizedVoicesResponseBodyDataCustomizedVoiceList setVoiceDesc(String voiceDesc) {
            this.voiceDesc = voiceDesc;
            return this;
        }
        public String getVoiceDesc() {
            return this.voiceDesc;
        }

        public ListCustomizedVoicesResponseBodyDataCustomizedVoiceList setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public ListCustomizedVoicesResponseBodyDataCustomizedVoiceList setVoiceName(String voiceName) {
            this.voiceName = voiceName;
            return this;
        }
        public String getVoiceName() {
            return this.voiceName;
        }

    }

    public static class ListCustomizedVoicesResponseBodyData extends TeaModel {
        @NameInMap("CustomizedVoiceList")
        public java.util.List<ListCustomizedVoicesResponseBodyDataCustomizedVoiceList> customizedVoiceList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCustomizedVoicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomizedVoicesResponseBodyData self = new ListCustomizedVoicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomizedVoicesResponseBodyData setCustomizedVoiceList(java.util.List<ListCustomizedVoicesResponseBodyDataCustomizedVoiceList> customizedVoiceList) {
            this.customizedVoiceList = customizedVoiceList;
            return this;
        }
        public java.util.List<ListCustomizedVoicesResponseBodyDataCustomizedVoiceList> getCustomizedVoiceList() {
            return this.customizedVoiceList;
        }

        public ListCustomizedVoicesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
