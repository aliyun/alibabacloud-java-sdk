// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListWebHostingCustomDomainsRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static ListWebHostingCustomDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWebHostingCustomDomainsRequest self = new ListWebHostingCustomDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListWebHostingCustomDomainsRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
