// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ConfigVerifySceneAppInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CM")
    public Boolean CM;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CT")
    public Boolean CT;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CU")
    public Boolean CU;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@xxx.com">xxx@xxx.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>112.124.18.99</p>
     */
    @NameInMap("IpWhitelist")
    public String ipWhitelist;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC220000011285006</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    public static ConfigVerifySceneAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigVerifySceneAppInfoRequest self = new ConfigVerifySceneAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public ConfigVerifySceneAppInfoRequest setCM(Boolean CM) {
        this.CM = CM;
        return this;
    }
    public Boolean getCM() {
        return this.CM;
    }

    public ConfigVerifySceneAppInfoRequest setCT(Boolean CT) {
        this.CT = CT;
        return this;
    }
    public Boolean getCT() {
        return this.CT;
    }

    public ConfigVerifySceneAppInfoRequest setCU(Boolean CU) {
        this.CU = CU;
        return this;
    }
    public Boolean getCU() {
        return this.CU;
    }

    public ConfigVerifySceneAppInfoRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ConfigVerifySceneAppInfoRequest setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

    public ConfigVerifySceneAppInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ConfigVerifySceneAppInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ConfigVerifySceneAppInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ConfigVerifySceneAppInfoRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
