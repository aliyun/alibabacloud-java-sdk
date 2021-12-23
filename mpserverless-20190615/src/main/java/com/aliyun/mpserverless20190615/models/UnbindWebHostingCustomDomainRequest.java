// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UnbindWebHostingCustomDomainRequest extends TeaModel {
    @NameInMap("CustomDomain")
    public String customDomain;

    @NameInMap("SpaceId")
    public String spaceId;

    public static UnbindWebHostingCustomDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindWebHostingCustomDomainRequest self = new UnbindWebHostingCustomDomainRequest();
        return TeaModel.build(map, self);
    }

    public UnbindWebHostingCustomDomainRequest setCustomDomain(String customDomain) {
        this.customDomain = customDomain;
        return this;
    }
    public String getCustomDomain() {
        return this.customDomain;
    }

    public UnbindWebHostingCustomDomainRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
