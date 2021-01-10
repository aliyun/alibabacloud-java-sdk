// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveSnapshotDetectPornConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssObject")
    public String ossObject;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("Scene")
    public java.util.List<String> scene;

    public static AddLiveSnapshotDetectPornConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveSnapshotDetectPornConfigRequest self = new AddLiveSnapshotDetectPornConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveSnapshotDetectPornConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddLiveSnapshotDetectPornConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveSnapshotDetectPornConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveSnapshotDetectPornConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLiveSnapshotDetectPornConfigRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public AddLiveSnapshotDetectPornConfigRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public AddLiveSnapshotDetectPornConfigRequest setOssObject(String ossObject) {
        this.ossObject = ossObject;
        return this;
    }
    public String getOssObject() {
        return this.ossObject;
    }

    public AddLiveSnapshotDetectPornConfigRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public AddLiveSnapshotDetectPornConfigRequest setScene(java.util.List<String> scene) {
        this.scene = scene;
        return this;
    }
    public java.util.List<String> getScene() {
        return this.scene;
    }

}
