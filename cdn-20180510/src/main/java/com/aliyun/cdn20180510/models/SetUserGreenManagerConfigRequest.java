// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetUserGreenManagerConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Quota")
    public String quota;

    @NameInMap("Ratio")
    public String ratio;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetUserGreenManagerConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserGreenManagerConfigRequest self = new SetUserGreenManagerConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetUserGreenManagerConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetUserGreenManagerConfigRequest setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

    public SetUserGreenManagerConfigRequest setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public SetUserGreenManagerConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
