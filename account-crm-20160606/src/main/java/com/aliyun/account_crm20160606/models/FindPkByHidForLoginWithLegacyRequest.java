// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindPkByHidForLoginWithLegacyRequest extends TeaModel {
    @NameInMap("Hid")
    public String hid;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static FindPkByHidForLoginWithLegacyRequest build(java.util.Map<String, ?> map) throws Exception {
        FindPkByHidForLoginWithLegacyRequest self = new FindPkByHidForLoginWithLegacyRequest();
        return TeaModel.build(map, self);
    }

    public FindPkByHidForLoginWithLegacyRequest setHid(String hid) {
        this.hid = hid;
        return this;
    }
    public String getHid() {
        return this.hid;
    }

    public FindPkByHidForLoginWithLegacyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
