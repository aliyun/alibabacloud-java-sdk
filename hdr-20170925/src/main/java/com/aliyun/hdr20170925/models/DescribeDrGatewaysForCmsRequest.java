// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDrGatewaysForCmsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UserUid")
    public Long userUid;

    public static DescribeDrGatewaysForCmsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrGatewaysForCmsRequest self = new DescribeDrGatewaysForCmsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrGatewaysForCmsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDrGatewaysForCmsRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
