// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertTransConfig extends TeaModel {
    @NameInMap("AdjDarMethod")
    public String adjDarMethod;

    @NameInMap("IsCheckAudioBitrate")
    public Boolean isCheckAudioBitrate;

    @NameInMap("IsCheckAudioBitrateFail")
    public Boolean isCheckAudioBitrateFail;

    @NameInMap("IsCheckReso")
    public Boolean isCheckReso;

    @NameInMap("IsCheckResoFail")
    public Boolean isCheckResoFail;

    @NameInMap("IsCheckVideoBitrate")
    public Boolean isCheckVideoBitrate;

    @NameInMap("IsCheckVideoBitrateFail")
    public Boolean isCheckVideoBitrateFail;

    @NameInMap("TransMode")
    public String transMode;

    public static MediaConvertTransConfig build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertTransConfig self = new MediaConvertTransConfig();
        return TeaModel.build(map, self);
    }

    public MediaConvertTransConfig setAdjDarMethod(String adjDarMethod) {
        this.adjDarMethod = adjDarMethod;
        return this;
    }
    public String getAdjDarMethod() {
        return this.adjDarMethod;
    }

    public MediaConvertTransConfig setIsCheckAudioBitrate(Boolean isCheckAudioBitrate) {
        this.isCheckAudioBitrate = isCheckAudioBitrate;
        return this;
    }
    public Boolean getIsCheckAudioBitrate() {
        return this.isCheckAudioBitrate;
    }

    public MediaConvertTransConfig setIsCheckAudioBitrateFail(Boolean isCheckAudioBitrateFail) {
        this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
        return this;
    }
    public Boolean getIsCheckAudioBitrateFail() {
        return this.isCheckAudioBitrateFail;
    }

    public MediaConvertTransConfig setIsCheckReso(Boolean isCheckReso) {
        this.isCheckReso = isCheckReso;
        return this;
    }
    public Boolean getIsCheckReso() {
        return this.isCheckReso;
    }

    public MediaConvertTransConfig setIsCheckResoFail(Boolean isCheckResoFail) {
        this.isCheckResoFail = isCheckResoFail;
        return this;
    }
    public Boolean getIsCheckResoFail() {
        return this.isCheckResoFail;
    }

    public MediaConvertTransConfig setIsCheckVideoBitrate(Boolean isCheckVideoBitrate) {
        this.isCheckVideoBitrate = isCheckVideoBitrate;
        return this;
    }
    public Boolean getIsCheckVideoBitrate() {
        return this.isCheckVideoBitrate;
    }

    public MediaConvertTransConfig setIsCheckVideoBitrateFail(Boolean isCheckVideoBitrateFail) {
        this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
        return this;
    }
    public Boolean getIsCheckVideoBitrateFail() {
        return this.isCheckVideoBitrateFail;
    }

    public MediaConvertTransConfig setTransMode(String transMode) {
        this.transMode = transMode;
        return this;
    }
    public String getTransMode() {
        return this.transMode;
    }

}
