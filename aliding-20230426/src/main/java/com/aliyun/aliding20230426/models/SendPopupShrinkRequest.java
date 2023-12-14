// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SendPopupShrinkRequest extends TeaModel {
    @NameInMap("Content")
    public String contentShrink;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("StartTime")
    public Long startTime;

    public static SendPopupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendPopupShrinkRequest self = new SendPopupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendPopupShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public SendPopupShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SendPopupShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
