// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateTtsQuestionGroupRequest extends TeaModel {
    @NameInMap("Request")
    public CreateTtsQuestionGroupRequestRequest request;

    public static CreateTtsQuestionGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTtsQuestionGroupRequest self = new CreateTtsQuestionGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateTtsQuestionGroupRequest setRequest(CreateTtsQuestionGroupRequestRequest request) {
        this.request = request;
        return this;
    }
    public CreateTtsQuestionGroupRequestRequest getRequest() {
        return this.request;
    }

    public static class CreateTtsQuestionGroupRequestRequest extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("PitchRate")
        public Integer pitchRate;

        @NameInMap("SampleRate")
        public Integer sampleRate;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Voice")
        public String voice;

        @NameInMap("Volume")
        public Integer volume;

        public static CreateTtsQuestionGroupRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateTtsQuestionGroupRequestRequest self = new CreateTtsQuestionGroupRequestRequest();
            return TeaModel.build(map, self);
        }

        public CreateTtsQuestionGroupRequestRequest setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateTtsQuestionGroupRequestRequest setPitchRate(Integer pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        public CreateTtsQuestionGroupRequestRequest setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Integer getSampleRate() {
            return this.sampleRate;
        }

        public CreateTtsQuestionGroupRequestRequest setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public CreateTtsQuestionGroupRequestRequest setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public CreateTtsQuestionGroupRequestRequest setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

}
