// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetDemonstrationForCustomizedVoiceJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDemonstrationForCustomizedVoiceJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDemonstrationForCustomizedVoiceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDemonstrationForCustomizedVoiceJobResponseBody self = new GetDemonstrationForCustomizedVoiceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDemonstrationForCustomizedVoiceJobResponseBody setData(GetDemonstrationForCustomizedVoiceJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDemonstrationForCustomizedVoiceJobResponseBodyData getData() {
        return this.data;
    }

    public GetDemonstrationForCustomizedVoiceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDemonstrationForCustomizedVoiceJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDemonstrationForCustomizedVoiceJobResponseBodyDataDemonstrationList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AudioId")
        public Integer audioId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://bucket.oss-cn-shanghai.aliyuncs.com/1.wav">http://bucket.oss-cn-shanghai.aliyuncs.com/1.wav</a></p>
         */
        @NameInMap("DemoAudio")
        public String demoAudio;

        @NameInMap("Text")
        public String text;

        public static GetDemonstrationForCustomizedVoiceJobResponseBodyDataDemonstrationList build(java.util.Map<String, ?> map) throws Exception {
            GetDemonstrationForCustomizedVoiceJobResponseBodyDataDemonstrationList self = new GetDemonstrationForCustomizedVoiceJobResponseBodyDataDemonstrationList();
            return TeaModel.build(map, self);
        }

        public GetDemonstrationForCustomizedVoiceJobResponseBodyDataDemonstrationList setAudioId(Integer audioId) {
            this.audioId = audioId;
            return this;
        }
        public Integer getAudioId() {
            return this.audioId;
        }

        public GetDemonstrationForCustomizedVoiceJobResponseBodyDataDemonstrationList setDemoAudio(String demoAudio) {
            this.demoAudio = demoAudio;
            return this;
        }
        public String getDemoAudio() {
            return this.demoAudio;
        }

        public GetDemonstrationForCustomizedVoiceJobResponseBodyDataDemonstrationList setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetDemonstrationForCustomizedVoiceJobResponseBodyData extends TeaModel {
        @NameInMap("DemonstrationList")
        public java.util.List<GetDemonstrationForCustomizedVoiceJobResponseBodyDataDemonstrationList> demonstrationList;

        public static GetDemonstrationForCustomizedVoiceJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDemonstrationForCustomizedVoiceJobResponseBodyData self = new GetDemonstrationForCustomizedVoiceJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDemonstrationForCustomizedVoiceJobResponseBodyData setDemonstrationList(java.util.List<GetDemonstrationForCustomizedVoiceJobResponseBodyDataDemonstrationList> demonstrationList) {
            this.demonstrationList = demonstrationList;
            return this;
        }
        public java.util.List<GetDemonstrationForCustomizedVoiceJobResponseBodyDataDemonstrationList> getDemonstrationList() {
            return this.demonstrationList;
        }

    }

}
