// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GetShortTermAccessKeyForAccountRequest extends TeaModel {
    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("IsMfaPresent")
    public Boolean isMfaPresent;

    @NameInMap("PK")
    public String PK;

    public static GetShortTermAccessKeyForAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetShortTermAccessKeyForAccountRequest self = new GetShortTermAccessKeyForAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetShortTermAccessKeyForAccountRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GetShortTermAccessKeyForAccountRequest setIsMfaPresent(Boolean isMfaPresent) {
        this.isMfaPresent = isMfaPresent;
        return this;
    }
    public Boolean getIsMfaPresent() {
        return this.isMfaPresent;
    }

    public GetShortTermAccessKeyForAccountRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
