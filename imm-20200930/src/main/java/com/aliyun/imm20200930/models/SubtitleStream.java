// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SubtitleStream extends TeaModel {
    // Bitrate
    @NameInMap("Bitrate")
    public Long bitrate;

    // CodecLongName
    @NameInMap("CodecLongName")
    public String codecLongName;

    // CodecName
    @NameInMap("CodecName")
    public String codecName;

    // CodecTag
    @NameInMap("CodecTag")
    public String codecTag;

    // CodecTagString
    @NameInMap("CodecTagString")
    public String codecTagString;

    // Content
    @NameInMap("Content")
    public String content;

    // Duration
    @NameInMap("Duration")
    public Float duration;

    // Height
    @NameInMap("Height")
    public Long height;

    // Index
    @NameInMap("Index")
    public Long index;

    // Language
    @NameInMap("Language")
    public String language;

    // StartTime
    @NameInMap("StartTime")
    public Float startTime;

    // Width
    @NameInMap("Width")
    public Long width;

    public static SubtitleStream build(java.util.Map<String, ?> map) throws Exception {
        SubtitleStream self = new SubtitleStream();
        return TeaModel.build(map, self);
    }

    public SubtitleStream setBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Long getBitrate() {
        return this.bitrate;
    }

    public SubtitleStream setCodecLongName(String codecLongName) {
        this.codecLongName = codecLongName;
        return this;
    }
    public String getCodecLongName() {
        return this.codecLongName;
    }

    public SubtitleStream setCodecName(String codecName) {
        this.codecName = codecName;
        return this;
    }
    public String getCodecName() {
        return this.codecName;
    }

    public SubtitleStream setCodecTag(String codecTag) {
        this.codecTag = codecTag;
        return this;
    }
    public String getCodecTag() {
        return this.codecTag;
    }

    public SubtitleStream setCodecTagString(String codecTagString) {
        this.codecTagString = codecTagString;
        return this;
    }
    public String getCodecTagString() {
        return this.codecTagString;
    }

    public SubtitleStream setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SubtitleStream setDuration(Float duration) {
        this.duration = duration;
        return this;
    }
    public Float getDuration() {
        return this.duration;
    }

    public SubtitleStream setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public SubtitleStream setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

    public SubtitleStream setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SubtitleStream setStartTime(Float startTime) {
        this.startTime = startTime;
        return this;
    }
    public Float getStartTime() {
        return this.startTime;
    }

    public SubtitleStream setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

}
