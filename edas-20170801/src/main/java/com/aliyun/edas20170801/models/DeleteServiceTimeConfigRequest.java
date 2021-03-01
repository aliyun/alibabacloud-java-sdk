// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteServiceTimeConfigRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteServiceTimeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceTimeConfigRequest self = new DeleteServiceTimeConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceTimeConfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
