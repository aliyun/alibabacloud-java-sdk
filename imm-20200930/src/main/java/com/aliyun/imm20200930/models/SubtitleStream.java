// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SubtitleStream extends TeaModel {
    /**
     * <p>The bitrate. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>74</p>
     */
    @NameInMap("Bitrate")
    public Long bitrate;

    /**
     * <p>The full name of the codec.</p>
     * 
     * <strong>example:</strong>
     * <p>MOV text</p>
     */
    @NameInMap("CodecLongName")
    public String codecLongName;

    /**
     * <p>The abbreviated name of the codec.</p>
     * 
     * <strong>example:</strong>
     * <p>mov_text</p>
     */
    @NameInMap("CodecName")
    public String codecName;

    /**
     * <p>The tag of the codec.</p>
     * 
     * <strong>example:</strong>
     * <p>0x67337874</p>
     */
    @NameInMap("CodecTag")
    public String codecTag;

    /**
     * <p>The description of the codec tag.</p>
     * 
     * <strong>example:</strong>
     * <p>tx3g</p>
     */
    @NameInMap("CodecTagString")
    public String codecTagString;

    /**
     * <p>The subtitle content.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The duration of the subtitle stream in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>71.378</p>
     */
    @NameInMap("Duration")
    public Double duration;

    /**
     * <p>The height of the subtitles. Unit: pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Height")
    public Long height;

    /**
     * <p>The index number of the subtitle stream.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Index")
    public Long index;

    /**
     * <p>The subtitle language in the BCP 47 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The start time of the subtitle stream in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0.000000</p>
     */
    @NameInMap("StartTime")
    public Double startTime;

    /**
     * <p>The width of the subtitles. Unit: pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
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

    public SubtitleStream setDuration(Double duration) {
        this.duration = duration;
        return this;
    }
    public Double getDuration() {
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

    public SubtitleStream setStartTime(Double startTime) {
        this.startTime = startTime;
        return this;
    }
    public Double getStartTime() {
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
