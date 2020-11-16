// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ForbidLiveStreamRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("StreamName")
    @Validation(required = true)
    public String streamName;

    @NameInMap("LiveStreamType")
    @Validation(required = true)
    public String liveStreamType;

    @NameInMap("Oneshot")
    public String oneshot;

    @NameInMap("ResumeTime")
    public String resumeTime;

    public static ForbidLiveStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        ForbidLiveStreamRequest self = new ForbidLiveStreamRequest();
        return TeaModel.build(map, self);
    }

    public ForbidLiveStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ForbidLiveStreamRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ForbidLiveStreamRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public ForbidLiveStreamRequest setLiveStreamType(String liveStreamType) {
        this.liveStreamType = liveStreamType;
        return this;
    }
    public String getLiveStreamType() {
        return this.liveStreamType;
    }

    public ForbidLiveStreamRequest setOneshot(String oneshot) {
        this.oneshot = oneshot;
        return this;
    }
    public String getOneshot() {
        return this.oneshot;
    }

    public ForbidLiveStreamRequest setResumeTime(String resumeTime) {
        this.resumeTime = resumeTime;
        return this;
    }
    public String getResumeTime() {
        return this.resumeTime;
    }

}
