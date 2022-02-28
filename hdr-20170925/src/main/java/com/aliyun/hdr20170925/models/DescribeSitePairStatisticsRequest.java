// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSitePairStatisticsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SitePairId")
    public String sitePairId;

    public static DescribeSitePairStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSitePairStatisticsRequest self = new DescribeSitePairStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSitePairStatisticsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeSitePairStatisticsRequest setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

}
