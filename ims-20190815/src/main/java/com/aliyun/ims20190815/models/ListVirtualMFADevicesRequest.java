// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListVirtualMFADevicesRequest extends TeaModel {
    /**
     * <p>The token for querying the next page of results. You do not need to specify <code>Marker</code> for the first API call.</p>
     * <p>When you call the API for the first time, if the total number of entries exceeds the <code>MaxItems</code> limit, the data is truncated and only <code>MaxItems</code> entries are returned. In this case, the <code>IsTruncated</code> response parameter is <code>true</code> and a <code>Marker</code> is returned. You can use the <code>Marker</code> returned from the previous call to continue calling the API with the same request parameters to query the truncated data. You can repeat this process until <code>IsTruncated</code> is <code>false</code>, which indicates that all data has been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
