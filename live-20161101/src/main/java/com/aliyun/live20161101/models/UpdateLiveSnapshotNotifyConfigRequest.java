// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveSnapshotNotifyConfigRequest extends TeaModel {
    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ww.yourdomain***.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The callback authentication key. The key must be 16 to 32 characters in length and can contain letters and digits.</p>
     * <blockquote>
     * <p>This parameter is required when NotifyReqAuth is set to <strong>yes</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testkeyyourkey12</p>
     */
    @NameInMap("NotifyAuthKey")
    public String notifyAuthKey;

    /**
     * <p>Specifies whether to enable authentication for callback notifications. Valid values:</p>
     * <ul>
     * <li><p><strong>yes</strong>: Enables</p>
     * </li>
     * <li><p><strong>no</strong>: Disables</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The default value is <strong>no</strong>. If you set this parameter to <strong>yes</strong>, NotifyAuthKey is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("NotifyReqAuth")
    public String notifyReqAuth;

    /**
     * <p>The callback URL. The URL must be valid and cannot exceed 500 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://callback.yourdomain***.com">http://callback.yourdomain***.com</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateLiveSnapshotNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveSnapshotNotifyConfigRequest self = new UpdateLiveSnapshotNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveSnapshotNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateLiveSnapshotNotifyConfigRequest setNotifyAuthKey(String notifyAuthKey) {
        this.notifyAuthKey = notifyAuthKey;
        return this;
    }
    public String getNotifyAuthKey() {
        return this.notifyAuthKey;
    }

    public UpdateLiveSnapshotNotifyConfigRequest setNotifyReqAuth(String notifyReqAuth) {
        this.notifyReqAuth = notifyReqAuth;
        return this;
    }
    public String getNotifyReqAuth() {
        return this.notifyReqAuth;
    }

    public UpdateLiveSnapshotNotifyConfigRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public UpdateLiveSnapshotNotifyConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveSnapshotNotifyConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
