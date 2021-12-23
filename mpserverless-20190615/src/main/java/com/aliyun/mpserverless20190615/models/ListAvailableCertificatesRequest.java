// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListAvailableCertificatesRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("SpaceId")
    public String spaceId;

    public static ListAvailableCertificatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableCertificatesRequest self = new ListAvailableCertificatesRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableCertificatesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ListAvailableCertificatesRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
