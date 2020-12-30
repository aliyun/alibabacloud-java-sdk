// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotSetAbsoluteRemindConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ConfigInfo")
    public String configInfo;

    public static DoIotSetAbsoluteRemindConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DoIotSetAbsoluteRemindConfigRequest self = new DoIotSetAbsoluteRemindConfigRequest();
        return TeaModel.build(map, self);
    }

    public DoIotSetAbsoluteRemindConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DoIotSetAbsoluteRemindConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DoIotSetAbsoluteRemindConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DoIotSetAbsoluteRemindConfigRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DoIotSetAbsoluteRemindConfigRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DoIotSetAbsoluteRemindConfigRequest setConfigInfo(String configInfo) {
        this.configInfo = configInfo;
        return this;
    }
    public String getConfigInfo() {
        return this.configInfo;
    }

}
