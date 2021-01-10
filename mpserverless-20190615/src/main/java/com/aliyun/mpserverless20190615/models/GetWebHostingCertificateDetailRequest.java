// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingCertificateDetailRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("CustomDomain")
    public String customDomain;

    public static GetWebHostingCertificateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingCertificateDetailRequest self = new GetWebHostingCertificateDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetWebHostingCertificateDetailRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public GetWebHostingCertificateDetailRequest setCustomDomain(String customDomain) {
        this.customDomain = customDomain;
        return this;
    }
    public String getCustomDomain() {
        return this.customDomain;
    }

}
