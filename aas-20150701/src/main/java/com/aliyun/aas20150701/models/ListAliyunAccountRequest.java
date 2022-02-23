// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class ListAliyunAccountRequest extends TeaModel {
    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxItems")
    public Integer maxItems;

    public static ListAliyunAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAliyunAccountRequest self = new ListAliyunAccountRequest();
        return TeaModel.build(map, self);
    }

    public ListAliyunAccountRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListAliyunAccountRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

}
