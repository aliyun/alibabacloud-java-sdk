// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSummaryRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryRequest self = new DescribeSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
