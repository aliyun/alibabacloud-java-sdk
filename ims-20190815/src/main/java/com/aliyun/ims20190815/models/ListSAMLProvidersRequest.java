// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListSAMLProvidersRequest extends TeaModel {
    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxItems")
    public Integer maxItems;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static ListSAMLProvidersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSAMLProvidersRequest self = new ListSAMLProvidersRequest();
        return TeaModel.build(map, self);
    }

    public ListSAMLProvidersRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListSAMLProvidersRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public ListSAMLProvidersRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
