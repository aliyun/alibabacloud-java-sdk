// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSummaryDataRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeSummaryDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryDataRequest self = new DescribeSummaryDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryDataRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
