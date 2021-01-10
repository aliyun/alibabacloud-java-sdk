// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLivePullStreamInfoConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("SourceUrl")
    public String sourceUrl;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PullAlways")
    public String pullAlways;

    public static AddLivePullStreamInfoConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLivePullStreamInfoConfigRequest self = new AddLivePullStreamInfoConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLivePullStreamInfoConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLivePullStreamInfoConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLivePullStreamInfoConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLivePullStreamInfoConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public AddLivePullStreamInfoConfigRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public AddLivePullStreamInfoConfigRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AddLivePullStreamInfoConfigRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public AddLivePullStreamInfoConfigRequest setPullAlways(String pullAlways) {
        this.pullAlways = pullAlways;
        return this;
    }
    public String getPullAlways() {
        return this.pullAlways;
    }

}
