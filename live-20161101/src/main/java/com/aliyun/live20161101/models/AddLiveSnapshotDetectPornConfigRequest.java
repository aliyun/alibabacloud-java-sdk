// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveSnapshotDetectPornConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("OssEndpoint")
    @Validation(required = true)
    public String ossEndpoint;

    @NameInMap("OssBucket")
    @Validation(required = true)
    public String ossBucket;

    @NameInMap("OssObject")
    public String ossObject;

    @NameInMap("Scene")
    public java.util.List<String> scene;

    @NameInMap("Interval")
    public Integer interval;

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

    public AddLiveSnapshotDetectPornConfigRequest setScene(java.util.List<String> scene) {
        this.scene = scene;
        return this;
    }
    public java.util.List<String> getScene() {
        return this.scene;
    }

    public AddLiveSnapshotDetectPornConfigRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

}
