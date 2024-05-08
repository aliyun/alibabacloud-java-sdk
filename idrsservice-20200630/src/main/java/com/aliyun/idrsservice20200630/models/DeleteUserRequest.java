// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteUserRequest extends TeaModel {
    /**
     * <p>ID</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserRequest self = new DeleteUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
