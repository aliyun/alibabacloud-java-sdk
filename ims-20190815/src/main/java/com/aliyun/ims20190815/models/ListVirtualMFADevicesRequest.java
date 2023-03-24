// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListVirtualMFADevicesRequest extends TeaModel {
    /**
     * <p>The `marker`. If part of a previous response is truncated, you can use this parameter to obtain the truncated part.</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The number of entries to return. If a response is truncated because it reaches the value of `MaxItems`, the value of `IsTruncated` will be `true`.</p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 100.</p>
     */
    @NameInMap("MaxItems")
    public Integer maxItems;

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

}
