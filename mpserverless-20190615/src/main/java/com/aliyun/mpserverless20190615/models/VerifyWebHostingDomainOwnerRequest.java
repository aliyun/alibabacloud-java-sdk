// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class VerifyWebHostingDomainOwnerRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("VerifyType")
    public String verifyType;

    public static VerifyWebHostingDomainOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyWebHostingDomainOwnerRequest self = new VerifyWebHostingDomainOwnerRequest();
        return TeaModel.build(map, self);
    }

    public VerifyWebHostingDomainOwnerRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public VerifyWebHostingDomainOwnerRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public VerifyWebHostingDomainOwnerRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
