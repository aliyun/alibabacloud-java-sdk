// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAppSnapshotConfigRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Callback")
    public String callback;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OverwriteOssObject")
    public String overwriteOssObject;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SequenceOssObject")
    public String sequenceOssObject;

    @NameInMap("TimeInterval")
    public Integer timeInterval;

    public static UpdateLiveAppSnapshotConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAppSnapshotConfigRequest self = new UpdateLiveAppSnapshotConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAppSnapshotConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateLiveAppSnapshotConfigRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public UpdateLiveAppSnapshotConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateLiveAppSnapshotConfigRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public UpdateLiveAppSnapshotConfigRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public UpdateLiveAppSnapshotConfigRequest setOverwriteOssObject(String overwriteOssObject) {
        this.overwriteOssObject = overwriteOssObject;
        return this;
    }
    public String getOverwriteOssObject() {
        return this.overwriteOssObject;
    }

    public UpdateLiveAppSnapshotConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveAppSnapshotConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdateLiveAppSnapshotConfigRequest setSequenceOssObject(String sequenceOssObject) {
        this.sequenceOssObject = sequenceOssObject;
        return this;
    }
    public String getSequenceOssObject() {
        return this.sequenceOssObject;
    }

    public UpdateLiveAppSnapshotConfigRequest setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

}
