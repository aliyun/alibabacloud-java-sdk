// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListGroupsRequest extends TeaModel {
    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxItems")
    public Integer maxItems;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static ListGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsRequest self = new ListGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListGroupsRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public ListGroupsRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
