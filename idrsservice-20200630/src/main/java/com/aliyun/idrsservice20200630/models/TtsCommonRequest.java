// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class TtsCommonRequest extends TeaModel {
    @NameInMap("TtsRequest")
    public TtsCommonRequestTtsRequest ttsRequest;

    public static TtsCommonRequest build(java.util.Map<String, ?> map) throws Exception {
        TtsCommonRequest self = new TtsCommonRequest();
        return TeaModel.build(map, self);
    }

    public TtsCommonRequest setTtsRequest(TtsCommonRequestTtsRequest ttsRequest) {
        this.ttsRequest = ttsRequest;
        return this;
    }
    public TtsCommonRequestTtsRequest getTtsRequest() {
        return this.ttsRequest;
    }

    public static class TtsCommonRequestTtsRequest extends TeaModel {
        /**
         * <p>appid</p>
         */
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Format")
        public String format;

        @NameInMap("PitchRate")
        public Integer pitchRate;

        @NameInMap("SampleRate")
        public Integer sampleRate;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Text")
        public String text;

        @NameInMap("Voice")
        public String voice;

        @NameInMap("Volume")
        public Integer volume;

        public static TtsCommonRequestTtsRequest build(java.util.Map<String, ?> map) throws Exception {
            TtsCommonRequestTtsRequest self = new TtsCommonRequestTtsRequest();
            return TeaModel.build(map, self);
        }

        public TtsCommonRequestTtsRequest setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public TtsCommonRequestTtsRequest setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public TtsCommonRequestTtsRequest setPitchRate(Integer pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        public TtsCommonRequestTtsRequest setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Integer getSampleRate() {
            return this.sampleRate;
        }

        public TtsCommonRequestTtsRequest setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public TtsCommonRequestTtsRequest setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public TtsCommonRequestTtsRequest setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public TtsCommonRequestTtsRequest setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

}
