// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class ListDataSourcesRequest extends TeaModel {
    @NameInMap("attributeName")
    public String attributeName;

    @NameInMap("filter")
    public java.util.Map<String, ?> filter;

    public static ListDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesRequest self = new ListDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public ListDataSourcesRequest setFilter(java.util.Map<String, ?> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.Map<String, ?> getFilter() {
        return this.filter;
    }

}
