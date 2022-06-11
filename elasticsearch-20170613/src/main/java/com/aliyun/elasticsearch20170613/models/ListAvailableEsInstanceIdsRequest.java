// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAvailableEsInstanceIdsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static ListAvailableEsInstanceIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableEsInstanceIdsRequest self = new ListAvailableEsInstanceIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableEsInstanceIdsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
