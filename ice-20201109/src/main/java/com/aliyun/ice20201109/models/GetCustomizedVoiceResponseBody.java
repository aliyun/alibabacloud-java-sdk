// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomizedVoiceResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetCustomizedVoiceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCustomizedVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizedVoiceResponseBody self = new GetCustomizedVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomizedVoiceResponseBody setData(GetCustomizedVoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomizedVoiceResponseBodyData getData() {
        return this.data;
    }

    public GetCustomizedVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomizedVoiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomizedVoiceResponseBodyDataCustomizedVoice extends TeaModel {
        /**
         * <p>The ID of the sample audio media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>42d3c312402982be65975f5b</strong></strong></p>
         */
        @NameInMap("DemoAudioMediaId")
        public String demoAudioMediaId;

        /**
         * <p>The gender. Valid values:</p>
         * <ul>
         * <li><p>female: Female.</p>
         * </li>
         * <li><p>male: Male.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>female</p>
         */
        @NameInMap("Gender")
        public String gender;

        /**
         * <p>The demonstration scenario. Valid values:</p>
         * <ul>
         * <li><strong>story</strong>: Story.</li>
         * <li><strong>interaction</strong>: Interaction.</li>
         * <li><strong>navigation</strong>: Navigation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>interaction</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        /**
         * <p>The voice description.</p>
         * 
         * <strong>example:</strong>
         * <p>It\&quot;s a personalized vocal</p>
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

        public static GetCustomizedVoiceResponseBodyDataCustomizedVoice build(java.util.Map<String, ?> map) throws Exception {
            GetCustomizedVoiceResponseBodyDataCustomizedVoice self = new GetCustomizedVoiceResponseBodyDataCustomizedVoice();
            return TeaModel.build(map, self);
        }

        public GetCustomizedVoiceResponseBodyDataCustomizedVoice setDemoAudioMediaId(String demoAudioMediaId) {
            this.demoAudioMediaId = demoAudioMediaId;
            return this;
        }
        public String getDemoAudioMediaId() {
            return this.demoAudioMediaId;
        }

        public GetCustomizedVoiceResponseBodyDataCustomizedVoice setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetCustomizedVoiceResponseBodyDataCustomizedVoice setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public GetCustomizedVoiceResponseBodyDataCustomizedVoice setVoiceDesc(String voiceDesc) {
            this.voiceDesc = voiceDesc;
            return this;
        }
        public String getVoiceDesc() {
            return this.voiceDesc;
        }

        public GetCustomizedVoiceResponseBodyDataCustomizedVoice setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public GetCustomizedVoiceResponseBodyDataCustomizedVoice setVoiceName(String voiceName) {
            this.voiceName = voiceName;
            return this;
        }
        public String getVoiceName() {
            return this.voiceName;
        }

    }

    public static class GetCustomizedVoiceResponseBodyData extends TeaModel {
        /**
         * <p>The customized voice.</p>
         */
        @NameInMap("CustomizedVoice")
        public GetCustomizedVoiceResponseBodyDataCustomizedVoice customizedVoice;

        public static GetCustomizedVoiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomizedVoiceResponseBodyData self = new GetCustomizedVoiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomizedVoiceResponseBodyData setCustomizedVoice(GetCustomizedVoiceResponseBodyDataCustomizedVoice customizedVoice) {
            this.customizedVoice = customizedVoice;
            return this;
        }
        public GetCustomizedVoiceResponseBodyDataCustomizedVoice getCustomizedVoice() {
            return this.customizedVoice;
        }

    }

}
