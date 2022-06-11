// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDataStreamsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("isManaged")
    public Boolean isManaged;

    @NameInMap("name")
    public String name;

    public static ListDataStreamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataStreamsRequest self = new ListDataStreamsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataStreamsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ListDataStreamsRequest setIsManaged(Boolean isManaged) {
        this.isManaged = isManaged;
        return this;
    }
    public Boolean getIsManaged() {
        return this.isManaged;
    }

    public ListDataStreamsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
