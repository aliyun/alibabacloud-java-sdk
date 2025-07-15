// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAppSnapshotConfigRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The callback URL that is used to receive notifications about snapshot capture.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://learn.aliyundoc.com">https://learn.aliyundoc.com</a></p>
     */
    @NameInMap("Callback")
    public String callback;

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
     * <p>The name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>liveBucket****</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <p>The endpoint of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-oss-****.aliyuncs.com</p>
     */
    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    /**
     * <p>The naming format of snapshots that are stored in the overwrite mode, which means that a new snapshot overwrites the previous snapshot.</p>
     * <ul>
     * <li>The name must be less than 256 bytes in length.</li>
     * <li>Only JPG images are supported.</li>
     * <li>The name can contain variables such as {AppName} and {StreamName}.</li>
     * <li>A value of hyphen (-) indicates that this parameter is deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{liveApp****}/{liveStream****}.jpg</p>
     */
    @NameInMap("OverwriteOssObject")
    public String overwriteOssObject;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The naming format of snapshots that are stored in sequence, which means that a new snapshot does not overwrite the previous snapshot. You can call the <a href="https://help.aliyun.com/document_detail/2847902.html">DescribeLiveStreamSnapshotInfo</a> operation to query the snapshots that were captured within a specific time period.</p>
     * <ul>
     * <li>The name must be less than 256 bytes in length.</li>
     * <li>Only JPG images are supported.</li>
     * <li>The name can contain variables such as {AppName}, {StreamName}, {UnixTimestamp}, and {Sequence}. The name must contain at least one of the {UnixTimestamp} and {Sequence} variables.</li>
     * <li>A value of hyphen (-) indicates that this parameter is deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>snapshot/{liveApp****}/{liveStream****}/{UnixTimestamp****}.jpg</p>
     */
    @NameInMap("SequenceOssObject")
    public String sequenceOssObject;

    /**
     * <p>The interval at which snapshots are captured. Valid values: <strong>5 to 3600</strong>. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
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
