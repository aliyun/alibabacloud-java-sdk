// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSiteRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SiteId")
    public String siteId;

    @NameInMap("UserUid")
    public Long userUid;

    public static DescribeSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteRequest self = new DescribeSiteRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeSiteRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public DescribeSiteRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
