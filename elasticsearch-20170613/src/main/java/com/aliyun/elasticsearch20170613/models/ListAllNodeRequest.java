// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAllNodeRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("extended")
    public Boolean extended;

    public static ListAllNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllNodeRequest self = new ListAllNodeRequest();
        return TeaModel.build(map, self);
    }

    public ListAllNodeRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ListAllNodeRequest setExtended(Boolean extended) {
        this.extended = extended;
        return this;
    }
    public Boolean getExtended() {
        return this.extended;
    }

}
