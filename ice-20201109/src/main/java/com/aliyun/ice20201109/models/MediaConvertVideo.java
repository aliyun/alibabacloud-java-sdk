// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertVideo extends TeaModel {
    @NameInMap("Bitrate")
    public Integer bitrate;

    @NameInMap("Bufsize")
    public Integer bufsize;

    @NameInMap("Codec")
    public String codec;

    @NameInMap("Crf")
    public Object crf;

    @NameInMap("Crop")
    public String crop;

    @NameInMap("Fps")
    public Object fps;

    @NameInMap("Gop")
    public Object gop;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("LongShortMode")
    public Boolean longShortMode;

    @NameInMap("MaxFps")
    public Object maxFps;

    @NameInMap("Maxrate")
    public Integer maxrate;

    @NameInMap("Pad")
    public String pad;

    @NameInMap("Profile")
    public String profile;

    @NameInMap("Qscale")
    public Integer qscale;

    @NameInMap("Remove")
    public Boolean remove;

    @NameInMap("ScanMode")
    public String scanMode;

    @NameInMap("Width")
    public Integer width;

    public static MediaConvertVideo build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertVideo self = new MediaConvertVideo();
        return TeaModel.build(map, self);
    }

    public MediaConvertVideo setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Integer getBitrate() {
        return this.bitrate;
    }

    public MediaConvertVideo setBufsize(Integer bufsize) {
        this.bufsize = bufsize;
        return this;
    }
    public Integer getBufsize() {
        return this.bufsize;
    }

    public MediaConvertVideo setCodec(String codec) {
        this.codec = codec;
        return this;
    }
    public String getCodec() {
        return this.codec;
    }

    public MediaConvertVideo setCrf(Object crf) {
        this.crf = crf;
        return this;
    }
    public Object getCrf() {
        return this.crf;
    }

    public MediaConvertVideo setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public MediaConvertVideo setFps(Object fps) {
        this.fps = fps;
        return this;
    }
    public Object getFps() {
        return this.fps;
    }

    public MediaConvertVideo setGop(Object gop) {
        this.gop = gop;
        return this;
    }
    public Object getGop() {
        return this.gop;
    }

    public MediaConvertVideo setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public MediaConvertVideo setLongShortMode(Boolean longShortMode) {
        this.longShortMode = longShortMode;
        return this;
    }
    public Boolean getLongShortMode() {
        return this.longShortMode;
    }

    public MediaConvertVideo setMaxFps(Object maxFps) {
        this.maxFps = maxFps;
        return this;
    }
    public Object getMaxFps() {
        return this.maxFps;
    }

    public MediaConvertVideo setMaxrate(Integer maxrate) {
        this.maxrate = maxrate;
        return this;
    }
    public Integer getMaxrate() {
        return this.maxrate;
    }

    public MediaConvertVideo setPad(String pad) {
        this.pad = pad;
        return this;
    }
    public String getPad() {
        return this.pad;
    }

    public MediaConvertVideo setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public MediaConvertVideo setQscale(Integer qscale) {
        this.qscale = qscale;
        return this;
    }
    public Integer getQscale() {
        return this.qscale;
    }

    public MediaConvertVideo setRemove(Boolean remove) {
        this.remove = remove;
        return this;
    }
    public Boolean getRemove() {
        return this.remove;
    }

    public MediaConvertVideo setScanMode(String scanMode) {
        this.scanMode = scanMode;
        return this;
    }
    public String getScanMode() {
        return this.scanMode;
    }

    public MediaConvertVideo setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
