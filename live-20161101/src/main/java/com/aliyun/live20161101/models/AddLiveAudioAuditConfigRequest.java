// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAudioAuditConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("StreamName")
    @Validation(required = true)
    public String streamName;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OssObject")
    public String ossObject;

    @NameInMap("BizType")
    public String bizType;

    public static AddLiveAudioAuditConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAudioAuditConfigRequest self = new AddLiveAudioAuditConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveAudioAuditConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveAudioAuditConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLiveAudioAuditConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public AddLiveAudioAuditConfigRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public AddLiveAudioAuditConfigRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public AddLiveAudioAuditConfigRequest setOssObject(String ossObject) {
        this.ossObject = ossObject;
        return this;
    }
    public String getOssObject() {
        return this.ossObject;
    }

    public AddLiveAudioAuditConfigRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
