// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDRAppliancesRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDRAppliancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDRAppliancesRequest self = new DescribeDRAppliancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDRAppliancesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
