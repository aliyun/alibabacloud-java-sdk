// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsRequest extends TeaModel {
    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    public static ListVpcEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointsRequest self = new ListVpcEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListVpcEndpointsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
