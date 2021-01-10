// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListCorsDomainsRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static ListCorsDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCorsDomainsRequest self = new ListCorsDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListCorsDomainsRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
