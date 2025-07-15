// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveSnapshotDetectPornConfigRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. The value of this parameter must be the same as the application name in the ingest URL. Otherwise, the configuration does not take effect. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (<em>). The name cannot start with a hyphen (-) or underscore (</em>). You can also specify an asterisk (\*) as the value to match all applications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The interval at which snapshots are captured from the live stream. Valid values: <strong>5 to 3600</strong>. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>liveBucket****</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <p>The endpoint of the Object Storage Service (OSS) bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-oss-****.aliyuncs.com</p>
     */
    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    /**
     * <p>The name of the snapshot that stores violations such as pornographic content and politically sensitive content.</p>
     * 
     * <strong>example:</strong>
     * <p>{liveApp****}/{liveStream****}/{Date}/{Hour}/{Minute}_{Second}.jpg</p>
     */
    @NameInMap("OssObject")
    public String ossObject;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The moderation scenario array.</p>
     * 
     * <strong>example:</strong>
     * <p>porn</p>
     */
    @NameInMap("Scene")
    public java.util.List<String> scene;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static UpdateLiveSnapshotDetectPornConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveSnapshotDetectPornConfigRequest self = new UpdateLiveSnapshotDetectPornConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveSnapshotDetectPornConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateLiveSnapshotDetectPornConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateLiveSnapshotDetectPornConfigRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateLiveSnapshotDetectPornConfigRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public UpdateLiveSnapshotDetectPornConfigRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public UpdateLiveSnapshotDetectPornConfigRequest setOssObject(String ossObject) {
        this.ossObject = ossObject;
        return this;
    }
    public String getOssObject() {
        return this.ossObject;
    }

    public UpdateLiveSnapshotDetectPornConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveSnapshotDetectPornConfigRequest setScene(java.util.List<String> scene) {
        this.scene = scene;
        return this;
    }
    public java.util.List<String> getScene() {
        return this.scene;
    }

    public UpdateLiveSnapshotDetectPornConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
