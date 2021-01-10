// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAppSnapshotConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("TimeInterval")
    public Integer timeInterval;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OverwriteOssObject")
    public String overwriteOssObject;

    @NameInMap("SequenceOssObject")
    public String sequenceOssObject;

    @NameInMap("Callback")
    public String callback;

    public static AddLiveAppSnapshotConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAppSnapshotConfigRequest self = new AddLiveAppSnapshotConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveAppSnapshotConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddLiveAppSnapshotConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveAppSnapshotConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveAppSnapshotConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLiveAppSnapshotConfigRequest setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

    public AddLiveAppSnapshotConfigRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public AddLiveAppSnapshotConfigRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public AddLiveAppSnapshotConfigRequest setOverwriteOssObject(String overwriteOssObject) {
        this.overwriteOssObject = overwriteOssObject;
        return this;
    }
    public String getOverwriteOssObject() {
        return this.overwriteOssObject;
    }

    public AddLiveAppSnapshotConfigRequest setSequenceOssObject(String sequenceOssObject) {
        this.sequenceOssObject = sequenceOssObject;
        return this;
    }
    public String getSequenceOssObject() {
        return this.sequenceOssObject;
    }

    public AddLiveAppSnapshotConfigRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

}
