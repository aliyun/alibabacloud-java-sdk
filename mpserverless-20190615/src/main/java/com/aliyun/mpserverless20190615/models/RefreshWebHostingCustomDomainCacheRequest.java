// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RefreshWebHostingCustomDomainCacheRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("SpaceId")
    public String spaceId;

    public static RefreshWebHostingCustomDomainCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshWebHostingCustomDomainCacheRequest self = new RefreshWebHostingCustomDomainCacheRequest();
        return TeaModel.build(map, self);
    }

    public RefreshWebHostingCustomDomainCacheRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RefreshWebHostingCustomDomainCacheRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
