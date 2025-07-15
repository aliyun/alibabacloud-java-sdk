// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetSnapshotCallbackAuthRequest extends TeaModel {
    /**
     * <p>The custom key that is used for callback authentication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourkey</p>
     */
    @NameInMap("CallbackAuthKey")
    public String callbackAuthKey;

    /**
     * <p>Specifies whether to enable callback authentication. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: enables callback authentication.</li>
     * <li><strong>no</strong>: disables callback authentication.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("CallbackReqAuth")
    public String callbackReqAuth;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static SetSnapshotCallbackAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSnapshotCallbackAuthRequest self = new SetSnapshotCallbackAuthRequest();
        return TeaModel.build(map, self);
    }

    public SetSnapshotCallbackAuthRequest setCallbackAuthKey(String callbackAuthKey) {
        this.callbackAuthKey = callbackAuthKey;
        return this;
    }
    public String getCallbackAuthKey() {
        return this.callbackAuthKey;
    }

    public SetSnapshotCallbackAuthRequest setCallbackReqAuth(String callbackReqAuth) {
        this.callbackReqAuth = callbackReqAuth;
        return this;
    }
    public String getCallbackReqAuth() {
        return this.callbackReqAuth;
    }

    public SetSnapshotCallbackAuthRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetSnapshotCallbackAuthRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetSnapshotCallbackAuthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
