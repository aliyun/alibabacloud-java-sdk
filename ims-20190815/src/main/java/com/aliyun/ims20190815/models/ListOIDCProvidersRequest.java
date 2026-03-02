// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListOIDCProvidersRequest extends TeaModel {
    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxItems")
    public Integer maxItems;

    public static ListOIDCProvidersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOIDCProvidersRequest self = new ListOIDCProvidersRequest();
        return TeaModel.build(map, self);
    }

    public ListOIDCProvidersRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListOIDCProvidersRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

}
