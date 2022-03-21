// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunvnos20220314.models;

import com.aliyun.tea.*;

public class SetUserSsoSettingsRequest extends TeaModel {
    // endUserUid
    @NameInMap("EndUserUid")
    public Long endUserUid;

    // reserved
    @NameInMap("Reserved")
    public Boolean reserved;

    public static SetUserSsoSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserSsoSettingsRequest self = new SetUserSsoSettingsRequest();
        return TeaModel.build(map, self);
    }

    public SetUserSsoSettingsRequest setEndUserUid(Long endUserUid) {
        this.endUserUid = endUserUid;
        return this;
    }
    public Long getEndUserUid() {
        return this.endUserUid;
    }

    public SetUserSsoSettingsRequest setReserved(Boolean reserved) {
        this.reserved = reserved;
        return this;
    }
    public Boolean getReserved() {
        return this.reserved;
    }

}
