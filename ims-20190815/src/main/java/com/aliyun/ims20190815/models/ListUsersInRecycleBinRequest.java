// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUsersInRecycleBinRequest extends TeaModel {
    @NameInMap("Filter")
    public String filter;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxItems")
    public Integer maxItems;

    public static ListUsersInRecycleBinRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersInRecycleBinRequest self = new ListUsersInRecycleBinRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersInRecycleBinRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListUsersInRecycleBinRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUsersInRecycleBinRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

}
