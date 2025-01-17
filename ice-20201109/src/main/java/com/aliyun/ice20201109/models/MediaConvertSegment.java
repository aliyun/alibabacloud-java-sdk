// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertSegment extends TeaModel {
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("ForceSegTime")
    public String forceSegTime;

    public static MediaConvertSegment build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertSegment self = new MediaConvertSegment();
        return TeaModel.build(map, self);
    }

    public MediaConvertSegment setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public MediaConvertSegment setForceSegTime(String forceSegTime) {
        this.forceSegTime = forceSegTime;
        return this;
    }
    public String getForceSegTime() {
        return this.forceSegTime;
    }

}
