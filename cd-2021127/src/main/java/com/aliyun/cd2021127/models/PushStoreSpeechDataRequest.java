// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class PushStoreSpeechDataRequest extends TeaModel {
    @NameInMap("Speech")
    public java.util.List<PushStoreSpeechDataRequestSpeech> speech;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("country")
    public String country;

    public static PushStoreSpeechDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushStoreSpeechDataRequest self = new PushStoreSpeechDataRequest();
        return TeaModel.build(map, self);
    }

    public PushStoreSpeechDataRequest setSpeech(java.util.List<PushStoreSpeechDataRequestSpeech> speech) {
        this.speech = speech;
        return this;
    }
    public java.util.List<PushStoreSpeechDataRequestSpeech> getSpeech() {
        return this.speech;
    }

    public PushStoreSpeechDataRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public PushStoreSpeechDataRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public static class PushStoreSpeechDataRequestSpeechContents extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Placeholder")
        public String placeholder;

        public static PushStoreSpeechDataRequestSpeechContents build(java.util.Map<String, ?> map) throws Exception {
            PushStoreSpeechDataRequestSpeechContents self = new PushStoreSpeechDataRequestSpeechContents();
            return TeaModel.build(map, self);
        }

        public PushStoreSpeechDataRequestSpeechContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public PushStoreSpeechDataRequestSpeechContents setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
            return this;
        }
        public String getPlaceholder() {
            return this.placeholder;
        }

    }

    public static class PushStoreSpeechDataRequestSpeech extends TeaModel {
        @NameInMap("Contents")
        public java.util.List<PushStoreSpeechDataRequestSpeechContents> contents;

        @NameInMap("Speech")
        public Boolean speech;

        @NameInMap("Speed")
        public String speed;

        @NameInMap("Type")
        public String type;

        @NameInMap("Voice")
        public String voice;

        @NameInMap("Volume")
        public Integer volume;

        public static PushStoreSpeechDataRequestSpeech build(java.util.Map<String, ?> map) throws Exception {
            PushStoreSpeechDataRequestSpeech self = new PushStoreSpeechDataRequestSpeech();
            return TeaModel.build(map, self);
        }

        public PushStoreSpeechDataRequestSpeech setContents(java.util.List<PushStoreSpeechDataRequestSpeechContents> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<PushStoreSpeechDataRequestSpeechContents> getContents() {
            return this.contents;
        }

        public PushStoreSpeechDataRequestSpeech setSpeech(Boolean speech) {
            this.speech = speech;
            return this;
        }
        public Boolean getSpeech() {
            return this.speech;
        }

        public PushStoreSpeechDataRequestSpeech setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public PushStoreSpeechDataRequestSpeech setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PushStoreSpeechDataRequestSpeech setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public PushStoreSpeechDataRequestSpeech setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

}
