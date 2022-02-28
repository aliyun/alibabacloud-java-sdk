// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSitePairInfoRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SitePairId")
    public String sitePairId;

    public static DescribeSitePairInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSitePairInfoRequest self = new DescribeSitePairInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSitePairInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeSitePairInfoRequest setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

}
