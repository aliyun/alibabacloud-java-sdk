// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListAddressRequest extends TeaModel {
    /**
     * <p>Specifies the number of migration addresses to be returned.\
     * Valid values: 0 - 1000 (excluding 0).\
     * Default value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The marker after which the migration addresses are listed.\
     * By default, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>test_marker</p>
     */
    @NameInMap("marker")
    public String marker;

    public static ListAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAddressRequest self = new ListAddressRequest();
        return TeaModel.build(map, self);
    }

    public ListAddressRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListAddressRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

}
