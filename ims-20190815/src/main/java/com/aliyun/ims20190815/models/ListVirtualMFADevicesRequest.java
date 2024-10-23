// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListVirtualMFADevicesRequest extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.``</p>
     * <p>When you call the operation for the first time, if the total number of returned entries exceeds the value of <code>MaxItems</code>, the entries are truncated. The system returns entries based on the value of <code>MaxItems</code> and does not return the excess entries. In this case, the value of the response parameter <code>IsTruncated</code> is <code>true</code>, and <code>Marker</code> is returned. In the next call, you can use the value of <code>Marker</code> and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of the <code>IsTruncated</code> parameter becomes <code>false</code>. This way, all entries are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The number of entries per page.</p>
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
