// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListVirtualMFADevicesRequest extends TeaModel {
    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxItems")
    public Integer maxItems;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static ListVirtualMFADevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualMFADevicesRequest self = new ListVirtualMFADevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListVirtualMFADevicesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListVirtualMFADevicesRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public ListVirtualMFADevicesRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
