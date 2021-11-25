// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListVideoAudiosResponseBody extends TeaModel {
    @NameInMap("Audios")
    public java.util.List<ListVideoAudiosResponseBodyAudios> audios;

    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("VideoUri")
    public String videoUri;

    public static ListVideoAudiosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVideoAudiosResponseBody self = new ListVideoAudiosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVideoAudiosResponseBody setAudios(java.util.List<ListVideoAudiosResponseBodyAudios> audios) {
        this.audios = audios;
        return this;
    }
    public java.util.List<ListVideoAudiosResponseBodyAudios> getAudios() {
        return this.audios;
    }

    public ListVideoAudiosResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListVideoAudiosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVideoAudiosResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public ListVideoAudiosResponseBody setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

    public static class ListVideoAudiosResponseBodyAudiosAudioTexts extends TeaModel {
        @NameInMap("BeginTime")
        public Float beginTime;

        @NameInMap("ChannelId")
        public Integer channelId;

        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("EmotionValue")
        public Float emotionValue;

        @NameInMap("EndTime")
        public Float endTime;

        @NameInMap("Library")
        public String library;

        @NameInMap("Person")
        public String person;

        @NameInMap("SilenceDuration")
        public Float silenceDuration;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Text")
        public String text;

        public static ListVideoAudiosResponseBodyAudiosAudioTexts build(java.util.Map<String, ?> map) throws Exception {
            ListVideoAudiosResponseBodyAudiosAudioTexts self = new ListVideoAudiosResponseBodyAudiosAudioTexts();
            return TeaModel.build(map, self);
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

        public ListVideoAudiosResponseBodyAudiosAudioTexts setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ListVideoAudiosResponseBodyAudiosAudioTexts setEmotionValue(Float emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Float getEmotionValue() {
            return this.emotionValue;
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

    }

    public static class ListVideoAudiosResponseBodyAudios extends TeaModel {
        @NameInMap("AudioDuration")
        public Float audioDuration;

        @NameInMap("AudioFormat")
        public String audioFormat;

        @NameInMap("AudioRate")
        public Integer audioRate;

        @NameInMap("AudioTexts")
        public java.util.List<ListVideoAudiosResponseBodyAudiosAudioTexts> audioTexts;

        @NameInMap("AudioTextsFailReason")
        public String audioTextsFailReason;

        @NameInMap("AudioTextsModifyTime")
        public String audioTextsModifyTime;

        @NameInMap("AudioTextsStatus")
        public String audioTextsStatus;

        @NameInMap("AudioUri")
        public String audioUri;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("FileSize")
        public Integer fileSize;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ProcessFailReason")
        public String processFailReason;

        @NameInMap("ProcessModifyTime")
        public String processModifyTime;

        @NameInMap("ProcessStatus")
        public String processStatus;

        @NameInMap("RemarksA")
        public String remarksA;

        @NameInMap("RemarksB")
        public String remarksB;

        @NameInMap("RemarksC")
        public String remarksC;

        @NameInMap("RemarksD")
        public String remarksD;

        @NameInMap("SourcePosition")
        public String sourcePosition;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("SourceUri")
        public String sourceUri;

        public static ListVideoAudiosResponseBodyAudios build(java.util.Map<String, ?> map) throws Exception {
            ListVideoAudiosResponseBodyAudios self = new ListVideoAudiosResponseBodyAudios();
            return TeaModel.build(map, self);
        }

        public ListVideoAudiosResponseBodyAudios setAudioDuration(Float audioDuration) {
            this.audioDuration = audioDuration;
            return this;
        }
        public Float getAudioDuration() {
            return this.audioDuration;
        }

        public ListVideoAudiosResponseBodyAudios setAudioFormat(String audioFormat) {
            this.audioFormat = audioFormat;
            return this;
        }
        public String getAudioFormat() {
            return this.audioFormat;
        }

        public ListVideoAudiosResponseBodyAudios setAudioRate(Integer audioRate) {
            this.audioRate = audioRate;
            return this;
        }
        public Integer getAudioRate() {
            return this.audioRate;
        }

        public ListVideoAudiosResponseBodyAudios setAudioTexts(java.util.List<ListVideoAudiosResponseBodyAudiosAudioTexts> audioTexts) {
            this.audioTexts = audioTexts;
            return this;
        }
        public java.util.List<ListVideoAudiosResponseBodyAudiosAudioTexts> getAudioTexts() {
            return this.audioTexts;
        }

        public ListVideoAudiosResponseBodyAudios setAudioTextsFailReason(String audioTextsFailReason) {
            this.audioTextsFailReason = audioTextsFailReason;
            return this;
        }
        public String getAudioTextsFailReason() {
            return this.audioTextsFailReason;
        }

        public ListVideoAudiosResponseBodyAudios setAudioTextsModifyTime(String audioTextsModifyTime) {
            this.audioTextsModifyTime = audioTextsModifyTime;
            return this;
        }
        public String getAudioTextsModifyTime() {
            return this.audioTextsModifyTime;
        }

        public ListVideoAudiosResponseBodyAudios setAudioTextsStatus(String audioTextsStatus) {
            this.audioTextsStatus = audioTextsStatus;
            return this;
        }
        public String getAudioTextsStatus() {
            return this.audioTextsStatus;
        }

        public ListVideoAudiosResponseBodyAudios setAudioUri(String audioUri) {
            this.audioUri = audioUri;
            return this;
        }
        public String getAudioUri() {
            return this.audioUri;
        }

        public ListVideoAudiosResponseBodyAudios setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVideoAudiosResponseBodyAudios setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
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

        public ListVideoAudiosResponseBodyAudios setProcessFailReason(String processFailReason) {
            this.processFailReason = processFailReason;
            return this;
        }
        public String getProcessFailReason() {
            return this.processFailReason;
        }

        public ListVideoAudiosResponseBodyAudios setProcessModifyTime(String processModifyTime) {
            this.processModifyTime = processModifyTime;
            return this;
        }
        public String getProcessModifyTime() {
            return this.processModifyTime;
        }

        public ListVideoAudiosResponseBodyAudios setProcessStatus(String processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public String getProcessStatus() {
            return this.processStatus;
        }

        public ListVideoAudiosResponseBodyAudios setRemarksA(String remarksA) {
            this.remarksA = remarksA;
            return this;
        }
        public String getRemarksA() {
            return this.remarksA;
        }

        public ListVideoAudiosResponseBodyAudios setRemarksB(String remarksB) {
            this.remarksB = remarksB;
            return this;
        }
        public String getRemarksB() {
            return this.remarksB;
        }

        public ListVideoAudiosResponseBodyAudios setRemarksC(String remarksC) {
            this.remarksC = remarksC;
            return this;
        }
        public String getRemarksC() {
            return this.remarksC;
        }

        public ListVideoAudiosResponseBodyAudios setRemarksD(String remarksD) {
            this.remarksD = remarksD;
            return this;
        }
        public String getRemarksD() {
            return this.remarksD;
        }

        public ListVideoAudiosResponseBodyAudios setSourcePosition(String sourcePosition) {
            this.sourcePosition = sourcePosition;
            return this;
        }
        public String getSourcePosition() {
            return this.sourcePosition;
        }

        public ListVideoAudiosResponseBodyAudios setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListVideoAudiosResponseBodyAudios setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

    }

}
