// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class BindWebHostingCustomDomainRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("CustomDomain")
    public String customDomain;

    public static BindWebHostingCustomDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        BindWebHostingCustomDomainRequest self = new BindWebHostingCustomDomainRequest();
        return TeaModel.build(map, self);
    }

    public BindWebHostingCustomDomainRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public BindWebHostingCustomDomainRequest setCustomDomain(String customDomain) {
        this.customDomain = customDomain;
        return this;
    }
    public String getCustomDomain() {
        return this.customDomain;
    }

}
