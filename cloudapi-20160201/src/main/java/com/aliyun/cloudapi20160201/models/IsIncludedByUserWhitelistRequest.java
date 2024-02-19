// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class IsIncludedByUserWhitelistRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Type")
    public String type;

    public static IsIncludedByUserWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        IsIncludedByUserWhitelistRequest self = new IsIncludedByUserWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public IsIncludedByUserWhitelistRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public IsIncludedByUserWhitelistRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
