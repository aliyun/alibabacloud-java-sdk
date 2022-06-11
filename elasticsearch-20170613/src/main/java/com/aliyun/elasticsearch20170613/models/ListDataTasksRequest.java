// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDataTasksRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static ListDataTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataTasksRequest self = new ListDataTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListDataTasksRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
