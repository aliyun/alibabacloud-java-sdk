// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListVideoAudiosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Audios")
    public java.util.List<ListVideoAudiosResponseBodyAudios> audios;

    @NameInMap("VideoUri")
    public String videoUri;

    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("SetId")
    public String setId;

    public static ListVideoAudiosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVideoAudiosResponseBody self = new ListVideoAudiosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVideoAudiosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVideoAudiosResponseBody setAudios(java.util.List<ListVideoAudiosResponseBodyAudios> audios) {
        this.audios = audios;
        return this;
    }
    public java.util.List<ListVideoAudiosResponseBodyAudios> getAudios() {
        return this.audios;
    }

    public ListVideoAudiosResponseBody setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

    public ListVideoAudiosResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListVideoAudiosResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public static class ListVideoAudiosResponseBodyAudiosAudioTexts extends TeaModel {
        @NameInMap("EndTime")
        public Float endTime;

        @NameInMap("Library")
        public String library;

        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("BeginTime")
        public Float beginTime;

        @NameInMap("ChannelId")
        public Integer channelId;

        @NameInMap("EmotionValue")
        public Float emotionValue;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Text")
        public String text;

        @NameInMap("Person")
        public String person;

        @NameInMap("SilenceDuration")
        public Float silenceDuration;

        public static ListVideoAudiosResponseBodyAudiosAudioTexts build(java.util.Map<String, ?> map) throws Exception {
            ListVideoAudiosResponseBodyAudiosAudioTexts self = new ListVideoAudiosResponseBodyAudiosAudioTexts();
            return TeaModel.build(map, self);
        }

        public ListVideoAudiosResponseBodyAudiosAudioTexts setEndTime(Float endTime) {
            this.endTime = endTime;
            return this;
        }
        public Float getEndTime() {
            return this.endTime;
        }

        public ListVideoAudiosResponseBodyAudiosAudioTexts setLibrary(String library) {
            this.library = library;
            return this;
        }
        public String getLibrary() {
            return this.library;
        }

        public ListVideoAudiosResponseBodyAudiosAudioTexts setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ListVideoAudiosResponseBodyAudiosAudioTexts setBeginTime(Float beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Float getBeginTime() {
            return this.beginTime;
        }

        public ListVideoAudiosResponseBodyAudiosAudioTexts setChannelId(Integer channelId) {
            this.channelId = channelId;
            return this;
        }
        public Integer getChannelId() {
            return this.channelId;
        }

        public ListVideoAudiosResponseBodyAudiosAudioTexts setEmotionValue(Float emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Float getEmotionValue() {
            return this.emotionValue;
        }

        public ListVideoAudiosResponseBodyAudiosAudioTexts setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public ListVideoAudiosResponseBodyAudiosAudioTexts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ListVideoAudiosResponseBodyAudiosAudioTexts setPerson(String person) {
            this.person = person;
            return this;
        }
        public String getPerson() {
            return this.person;
        }

        public ListVideoAudiosResponseBodyAudiosAudioTexts setSilenceDuration(Float silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Float getSilenceDuration() {
            return this.silenceDuration;
        }

    }

    public static class ListVideoAudiosResponseBodyAudios extends TeaModel {
        @NameInMap("SourcePosition")
        public String sourcePosition;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("RemarksC")
        public String remarksC;

        @NameInMap("AudioDuration")
        public Float audioDuration;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("AudioTextsStatus")
        public String audioTextsStatus;

        @NameInMap("AudioFormat")
        public String audioFormat;

        @NameInMap("RemarksD")
        public String remarksD;

        @NameInMap("ProcessModifyTime")
        public String processModifyTime;

        @NameInMap("ProcessFailReason")
        public String processFailReason;

        @NameInMap("AudioUri")
        public String audioUri;

        @NameInMap("AudioRate")
        public Integer audioRate;

        @NameInMap("AudioTextsModifyTime")
        public String audioTextsModifyTime;

        @NameInMap("RemarksA")
        public String remarksA;

        @NameInMap("AudioTexts")
        public java.util.List<ListVideoAudiosResponseBodyAudiosAudioTexts> audioTexts;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("SourceUri")
        public String sourceUri;

        @NameInMap("ProcessStatus")
        public String processStatus;

        @NameInMap("AudioTextsFailReason")
        public String audioTextsFailReason;

        @NameInMap("RemarksB")
        public String remarksB;

        @NameInMap("FileSize")
        public Integer fileSize;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static ListVideoAudiosResponseBodyAudios build(java.util.Map<String, ?> map) throws Exception {
            ListVideoAudiosResponseBodyAudios self = new ListVideoAudiosResponseBodyAudios();
            return TeaModel.build(map, self);
        }

        public ListVideoAudiosResponseBodyAudios setSourcePosition(String sourcePosition) {
            this.sourcePosition = sourcePosition;
            return this;
        }
        public String getSourcePosition() {
            return this.sourcePosition;
        }

        public ListVideoAudiosResponseBodyAudios setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVideoAudiosResponseBodyAudios setRemarksC(String remarksC) {
            this.remarksC = remarksC;
            return this;
        }
        public String getRemarksC() {
            return this.remarksC;
        }

        public ListVideoAudiosResponseBodyAudios setAudioDuration(Float audioDuration) {
            this.audioDuration = audioDuration;
            return this;
        }
        public Float getAudioDuration() {
            return this.audioDuration;
        }

        public ListVideoAudiosResponseBodyAudios setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListVideoAudiosResponseBodyAudios setAudioTextsStatus(String audioTextsStatus) {
            this.audioTextsStatus = audioTextsStatus;
            return this;
        }
        public String getAudioTextsStatus() {
            return this.audioTextsStatus;
        }

        public ListVideoAudiosResponseBodyAudios setAudioFormat(String audioFormat) {
            this.audioFormat = audioFormat;
            return this;
        }
        public String getAudioFormat() {
            return this.audioFormat;
        }

        public ListVideoAudiosResponseBodyAudios setRemarksD(String remarksD) {
            this.remarksD = remarksD;
            return this;
        }
        public String getRemarksD() {
            return this.remarksD;
        }

        public ListVideoAudiosResponseBodyAudios setProcessModifyTime(String processModifyTime) {
            this.processModifyTime = processModifyTime;
            return this;
        }
        public String getProcessModifyTime() {
            return this.processModifyTime;
        }

        public ListVideoAudiosResponseBodyAudios setProcessFailReason(String processFailReason) {
            this.processFailReason = processFailReason;
            return this;
        }
        public String getProcessFailReason() {
            return this.processFailReason;
        }

        public ListVideoAudiosResponseBodyAudios setAudioUri(String audioUri) {
            this.audioUri = audioUri;
            return this;
        }
        public String getAudioUri() {
            return this.audioUri;
        }

        public ListVideoAudiosResponseBodyAudios setAudioRate(Integer audioRate) {
            this.audioRate = audioRate;
            return this;
        }
        public Integer getAudioRate() {
            return this.audioRate;
        }

        public ListVideoAudiosResponseBodyAudios setAudioTextsModifyTime(String audioTextsModifyTime) {
            this.audioTextsModifyTime = audioTextsModifyTime;
            return this;
        }
        public String getAudioTextsModifyTime() {
            return this.audioTextsModifyTime;
        }

        public ListVideoAudiosResponseBodyAudios setRemarksA(String remarksA) {
            this.remarksA = remarksA;
            return this;
        }
        public String getRemarksA() {
            return this.remarksA;
        }

        public ListVideoAudiosResponseBodyAudios setAudioTexts(java.util.List<ListVideoAudiosResponseBodyAudiosAudioTexts> audioTexts) {
            this.audioTexts = audioTexts;
            return this;
        }
        public java.util.List<ListVideoAudiosResponseBodyAudiosAudioTexts> getAudioTexts() {
            return this.audioTexts;
        }

        public ListVideoAudiosResponseBodyAudios setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListVideoAudiosResponseBodyAudios setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

        public ListVideoAudiosResponseBodyAudios setProcessStatus(String processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public String getProcessStatus() {
            return this.processStatus;
        }

        public ListVideoAudiosResponseBodyAudios setAudioTextsFailReason(String audioTextsFailReason) {
            this.audioTextsFailReason = audioTextsFailReason;
            return this;
        }
        public String getAudioTextsFailReason() {
            return this.audioTextsFailReason;
        }

        public ListVideoAudiosResponseBodyAudios setRemarksB(String remarksB) {
            this.remarksB = remarksB;
            return this;
        }
        public String getRemarksB() {
            return this.remarksB;
        }

        public ListVideoAudiosResponseBodyAudios setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public ListVideoAudiosResponseBodyAudios setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
