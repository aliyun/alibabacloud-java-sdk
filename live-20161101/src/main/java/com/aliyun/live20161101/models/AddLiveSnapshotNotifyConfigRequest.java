// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveSnapshotNotifyConfigRequest extends TeaModel {
    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.yourdomain***.com">www.yourdomain***.com</a></p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The authentication key for the callback. The key must be 16 to 32 characters in length and contain only letters and digits.</p>
     * <blockquote>
     * <p>This parameter is required if you set NotifyReqAuth to <strong>yes</strong>.</p>
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
     * <li><p><strong>yes</strong>: Enables</p>
     * </li>
     * <li><p><strong>no</strong> (Default): Disables</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to yes, NotifyAuthKey is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("NotifyReqAuth")
    public String notifyReqAuth;

    /**
     * <p>The callback URL. The URL must be valid, with a maximum length of 500 characters.</p>
     * <p>This parameter is required.</p>
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

    public static AddLiveSnapshotNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveSnapshotNotifyConfigRequest self = new AddLiveSnapshotNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveSnapshotNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveSnapshotNotifyConfigRequest setNotifyAuthKey(String notifyAuthKey) {
        this.notifyAuthKey = notifyAuthKey;
        return this;
    }
    public String getNotifyAuthKey() {
        return this.notifyAuthKey;
    }

    public AddLiveSnapshotNotifyConfigRequest setNotifyReqAuth(String notifyReqAuth) {
        this.notifyReqAuth = notifyReqAuth;
        return this;
    }
    public String getNotifyReqAuth() {
        return this.notifyReqAuth;
    }

    public AddLiveSnapshotNotifyConfigRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public AddLiveSnapshotNotifyConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveSnapshotNotifyConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
