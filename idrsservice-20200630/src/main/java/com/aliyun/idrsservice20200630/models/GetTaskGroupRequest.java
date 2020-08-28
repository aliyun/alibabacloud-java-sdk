// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetTaskGroupRequest extends TeaModel {
    @NameInMap("Id")
    @Validation(required = true)
    public String id;

    public static GetTaskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskGroupRequest self = new GetTaskGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
