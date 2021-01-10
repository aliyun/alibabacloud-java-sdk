// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AddCorsDomainRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("SpaceId")
    public String spaceId;

    public static AddCorsDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCorsDomainRequest self = new AddCorsDomainRequest();
        return TeaModel.build(map, self);
    }

    public AddCorsDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddCorsDomainRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
