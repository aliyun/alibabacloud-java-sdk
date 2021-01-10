// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteAppRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppRequest self = new DeleteAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
