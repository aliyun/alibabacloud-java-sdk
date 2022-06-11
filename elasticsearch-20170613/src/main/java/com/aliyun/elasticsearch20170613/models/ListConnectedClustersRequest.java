// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListConnectedClustersRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static ListConnectedClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectedClustersRequest self = new ListConnectedClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectedClustersRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
