// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotUserStopResumeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("OptionType")
    public String optionType;

    public static DoIotUserStopResumeRequest build(java.util.Map<String, ?> map) throws Exception {
        DoIotUserStopResumeRequest self = new DoIotUserStopResumeRequest();
        return TeaModel.build(map, self);
    }

    public DoIotUserStopResumeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DoIotUserStopResumeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DoIotUserStopResumeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DoIotUserStopResumeRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public DoIotUserStopResumeRequest setOptionType(String optionType) {
        this.optionType = optionType;
        return this;
    }
    public String getOptionType() {
        return this.optionType;
    }

}
