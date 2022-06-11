// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListExtendfilesRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static ListExtendfilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExtendfilesRequest self = new ListExtendfilesRequest();
        return TeaModel.build(map, self);
    }

    public ListExtendfilesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
