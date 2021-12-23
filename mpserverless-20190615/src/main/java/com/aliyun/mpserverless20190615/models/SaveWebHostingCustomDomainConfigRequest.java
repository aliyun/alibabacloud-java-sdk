// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveWebHostingCustomDomainConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ForceRedirectType")
    public String forceRedirectType;

    @NameInMap("SpaceId")
    public String spaceId;

    public static SaveWebHostingCustomDomainConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveWebHostingCustomDomainConfigRequest self = new SaveWebHostingCustomDomainConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveWebHostingCustomDomainConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveWebHostingCustomDomainConfigRequest setForceRedirectType(String forceRedirectType) {
        this.forceRedirectType = forceRedirectType;
        return this;
    }
    public String getForceRedirectType() {
        return this.forceRedirectType;
    }

    public SaveWebHostingCustomDomainConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
