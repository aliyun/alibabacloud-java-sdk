// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPublishVersionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<String> items;

    public static ListPublishVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishVersionsResponse self = new ListPublishVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishVersionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublishVersionsResponse setItems(java.util.List<String> items) {
        this.items = items;
        return this;
    }
    public java.util.List<String> getItems() {
        return this.items;
    }

}
