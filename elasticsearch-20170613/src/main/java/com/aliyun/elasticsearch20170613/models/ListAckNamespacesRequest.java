// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAckNamespacesRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    public static ListAckNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAckNamespacesRequest self = new ListAckNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public ListAckNamespacesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ListAckNamespacesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListAckNamespacesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
