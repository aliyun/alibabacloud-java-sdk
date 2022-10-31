// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeToutiaoLivePlayRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Stream")
    public String stream;

    public static DescribeToutiaoLivePlayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeToutiaoLivePlayRequest self = new DescribeToutiaoLivePlayRequest();
        return TeaModel.build(map, self);
    }

    public DescribeToutiaoLivePlayRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DescribeToutiaoLivePlayRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeToutiaoLivePlayRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeToutiaoLivePlayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeToutiaoLivePlayRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeToutiaoLivePlayRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

}
