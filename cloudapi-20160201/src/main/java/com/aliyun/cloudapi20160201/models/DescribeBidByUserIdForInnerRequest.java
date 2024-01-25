// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeBidByUserIdForInnerRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeBidByUserIdForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBidByUserIdForInnerRequest self = new DescribeBidByUserIdForInnerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBidByUserIdForInnerRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeBidByUserIdForInnerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
