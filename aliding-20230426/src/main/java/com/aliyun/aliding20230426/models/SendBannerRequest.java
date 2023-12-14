// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SendBannerRequest extends TeaModel {
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("StartTime")
    public Long startTime;

    public static SendBannerRequest build(java.util.Map<String, ?> map) throws Exception {
        SendBannerRequest self = new SendBannerRequest();
        return TeaModel.build(map, self);
    }

    public SendBannerRequest setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public SendBannerRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SendBannerRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
