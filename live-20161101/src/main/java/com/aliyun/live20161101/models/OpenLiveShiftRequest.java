// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class OpenLiveShiftRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("IgnoreTranscode")
    public Boolean ignoreTranscode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("Vision")
    public Integer vision;

    public static OpenLiveShiftRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenLiveShiftRequest self = new OpenLiveShiftRequest();
        return TeaModel.build(map, self);
    }

    public OpenLiveShiftRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OpenLiveShiftRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public OpenLiveShiftRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public OpenLiveShiftRequest setIgnoreTranscode(Boolean ignoreTranscode) {
        this.ignoreTranscode = ignoreTranscode;
        return this;
    }
    public Boolean getIgnoreTranscode() {
        return this.ignoreTranscode;
    }

    public OpenLiveShiftRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OpenLiveShiftRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public OpenLiveShiftRequest setVision(Integer vision) {
        this.vision = vision;
        return this;
    }
    public Integer getVision() {
        return this.vision;
    }

}
