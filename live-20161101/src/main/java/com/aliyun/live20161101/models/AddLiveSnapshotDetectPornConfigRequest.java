// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveSnapshotDetectPornConfigRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testApp</p>
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
     * <p>10</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The name of the OSS bucket.</p>
     * <p>After the review is complete, you can search for specific violations in the OSS console based on the callback information. You must create the OSS bucket in advance. For more information, see <a href="https://help.aliyun.com/document_detail/199449.html">Configure content moderation</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>livebucket</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <p>The endpoint of the Object Storage Service (OSS) bucket.</p>
     * <p>After the review is complete, you can search for specific violations in the OSS console based on the callback information. You must configure the OSS endpoint in advance. For more information, see <a href="https://help.aliyun.com/document_detail/199449.html">Configure content moderation</a>.</p>
     * <p>This parameter is required.</p>
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
     * <p>record/{AppName}/{StreamName}/{Sequence}.jpg</p>
     */
    @NameInMap("OssObject")
    public String ossObject;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Scene list detection.</p>
     * 
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("Scene")
    public java.util.List<String> scene;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static AddLiveSnapshotDetectPornConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveSnapshotDetectPornConfigRequest self = new AddLiveSnapshotDetectPornConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveSnapshotDetectPornConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLiveSnapshotDetectPornConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveSnapshotDetectPornConfigRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public AddLiveSnapshotDetectPornConfigRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public AddLiveSnapshotDetectPornConfigRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public AddLiveSnapshotDetectPornConfigRequest setOssObject(String ossObject) {
        this.ossObject = ossObject;
        return this;
    }
    public String getOssObject() {
        return this.ossObject;
    }

    public AddLiveSnapshotDetectPornConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveSnapshotDetectPornConfigRequest setScene(java.util.List<String> scene) {
        this.scene = scene;
        return this;
    }
    public java.util.List<String> getScene() {
        return this.scene;
    }

    public AddLiveSnapshotDetectPornConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
