// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveIndexRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("TokenId")
    public String tokenId;

    @NameInMap("InputUrl")
    public String inputUrl;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OssUserId")
    public String ossUserId;

    @NameInMap("OssRamRole")
    public String ossRamRole;

    public static StartLiveIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLiveIndexRequest self = new StartLiveIndexRequest();
        return TeaModel.build(map, self);
    }

    public StartLiveIndexRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartLiveIndexRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public StartLiveIndexRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public StartLiveIndexRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public StartLiveIndexRequest setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }
    public String getTokenId() {
        return this.tokenId;
    }

    public StartLiveIndexRequest setInputUrl(String inputUrl) {
        this.inputUrl = inputUrl;
        return this;
    }
    public String getInputUrl() {
        return this.inputUrl;
    }

    public StartLiveIndexRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public StartLiveIndexRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public StartLiveIndexRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public StartLiveIndexRequest setOssUserId(String ossUserId) {
        this.ossUserId = ossUserId;
        return this;
    }
    public String getOssUserId() {
        return this.ossUserId;
    }

    public StartLiveIndexRequest setOssRamRole(String ossRamRole) {
        this.ossRamRole = ossRamRole;
        return this;
    }
    public String getOssRamRole() {
        return this.ossRamRole;
    }

}
