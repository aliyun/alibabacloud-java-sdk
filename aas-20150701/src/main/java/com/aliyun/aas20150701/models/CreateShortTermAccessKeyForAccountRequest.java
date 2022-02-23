// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateShortTermAccessKeyForAccountRequest extends TeaModel {
    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("IsMfaPresent")
    public Boolean isMfaPresent;

    @NameInMap("PK")
    public String PK;

    public static CreateShortTermAccessKeyForAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShortTermAccessKeyForAccountRequest self = new CreateShortTermAccessKeyForAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateShortTermAccessKeyForAccountRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateShortTermAccessKeyForAccountRequest setIsMfaPresent(Boolean isMfaPresent) {
        this.isMfaPresent = isMfaPresent;
        return this;
    }
    public Boolean getIsMfaPresent() {
        return this.isMfaPresent;
    }

    public CreateShortTermAccessKeyForAccountRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
