// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class EnableSupportAccountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <strong>example:</strong>
     * <p>2023-03-24 11:19:05</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("password")
    public String password;

    public static EnableSupportAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSupportAccountRequest self = new EnableSupportAccountRequest();
        return TeaModel.build(map, self);
    }

    public EnableSupportAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableSupportAccountRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public EnableSupportAccountRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public EnableSupportAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
