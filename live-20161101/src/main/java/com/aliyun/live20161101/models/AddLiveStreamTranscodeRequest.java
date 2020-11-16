// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamTranscodeRequest extends TeaModel {
    @NameInMap("Domain")
    @Validation(required = true)
    public String domain;

    @NameInMap("App")
    @Validation(required = true)
    public String app;

    @NameInMap("Template")
    @Validation(required = true)
    public String template;

    @NameInMap("Lazy")
    public String lazy;

    @NameInMap("Watermark")
    public String watermark;

    @NameInMap("Mix")
    public String mix;

    @NameInMap("OnlyAudio")
    public String onlyAudio;

    @NameInMap("WaterPattern")
    public String waterPattern;

    public static AddLiveStreamTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamTranscodeRequest self = new AddLiveStreamTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveStreamTranscodeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddLiveStreamTranscodeRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AddLiveStreamTranscodeRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public AddLiveStreamTranscodeRequest setLazy(String lazy) {
        this.lazy = lazy;
        return this;
    }
    public String getLazy() {
        return this.lazy;
    }

    public AddLiveStreamTranscodeRequest setWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }
    public String getWatermark() {
        return this.watermark;
    }

    public AddLiveStreamTranscodeRequest setMix(String mix) {
        this.mix = mix;
        return this;
    }
    public String getMix() {
        return this.mix;
    }

    public AddLiveStreamTranscodeRequest setOnlyAudio(String onlyAudio) {
        this.onlyAudio = onlyAudio;
        return this;
    }
    public String getOnlyAudio() {
        return this.onlyAudio;
    }

    public AddLiveStreamTranscodeRequest setWaterPattern(String waterPattern) {
        this.waterPattern = waterPattern;
        return this;
    }
    public String getWaterPattern() {
        return this.waterPattern;
    }

}
