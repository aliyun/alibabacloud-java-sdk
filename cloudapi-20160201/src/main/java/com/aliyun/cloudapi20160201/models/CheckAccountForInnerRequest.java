// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CheckAccountForInnerRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CheckAccountForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountForInnerRequest self = new CheckAccountForInnerRequest();
        return TeaModel.build(map, self);
    }

    public CheckAccountForInnerRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public CheckAccountForInnerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
