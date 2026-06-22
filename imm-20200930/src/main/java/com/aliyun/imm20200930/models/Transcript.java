// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Transcript extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("SpeakerId")
    public String speakerId;

    @NameInMap("TimeRange")
    public java.util.List<Long> timeRange;

    @NameInMap("Type")
    public String type;

    public static Transcript build(java.util.Map<String, ?> map) throws Exception {
        Transcript self = new Transcript();
        return TeaModel.build(map, self);
    }

    public Transcript setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Transcript setSpeakerId(String speakerId) {
        this.speakerId = speakerId;
        return this;
    }
    public String getSpeakerId() {
        return this.speakerId;
    }

    public Transcript setTimeRange(java.util.List<Long> timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public java.util.List<Long> getTimeRange() {
        return this.timeRange;
    }

    public Transcript setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
