// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomizedVoicesResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListCustomizedVoicesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
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
        /**
         * <p>The media asset ID of the sample audio file.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>4d5e829d498aaf966b119348</strong></strong></p>
         */
        @NameInMap("DemoAudioMediaId")
        public String demoAudioMediaId;

        /**
         * <p>The gender. Valid values:</p>
         * <ul>
         * <li>female</li>
         * <li>male</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>male</p>
         */
        @NameInMap("Gender")
        public String gender;

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
         */
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

        public ListCustomizedVoicesResponseBodyDataCustomizedVoiceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
        /**
         * <p>The queried personalized human voices.</p>
         */
        @NameInMap("CustomizedVoiceList")
        public java.util.List<ListCustomizedVoicesResponseBodyDataCustomizedVoiceList> customizedVoiceList;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>41</p>
         */
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
