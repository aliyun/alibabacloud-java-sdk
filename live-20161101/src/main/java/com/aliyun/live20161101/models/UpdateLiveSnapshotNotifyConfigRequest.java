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
     * <p>The callback authentication key. The key can be 16 to 32 characters in length and can contain only letters and digits.</p>
     * <blockquote>
     * <p> This parameter is required if you set the NotifyReqAuth parameter to <strong>yes</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>yourkey</p>
     */
    @NameInMap("NotifyAuthKey")
    public String notifyAuthKey;

    /**
     * <p>Specifies whether to enable callback authentication. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: enables callback authentication</li>
     * <li><strong>no</strong>: disables callback authentication</li>
     * </ul>
     * <blockquote>
     * <p> Default value: <strong>no</strong>. If you set this parameter to <strong>yes</strong>, the NotifyAuthKey parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("NotifyReqAuth")
    public String notifyReqAuth;

    /**
     * <p>The callback URL. Specify a valid URL that is up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://callback.yourdomain***.com">http://callback.yourdomain***.com</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

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
