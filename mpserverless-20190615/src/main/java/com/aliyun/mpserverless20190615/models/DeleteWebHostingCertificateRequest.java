// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteWebHostingCertificateRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DeleteWebHostingCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebHostingCertificateRequest self = new DeleteWebHostingCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWebHostingCertificateRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteWebHostingCertificateRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
