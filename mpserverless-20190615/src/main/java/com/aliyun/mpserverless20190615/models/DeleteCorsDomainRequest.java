// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteCorsDomainRequest extends TeaModel {
    @NameInMap("DomainId")
    public String domainId;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DeleteCorsDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCorsDomainRequest self = new DeleteCorsDomainRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCorsDomainRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public DeleteCorsDomainRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
