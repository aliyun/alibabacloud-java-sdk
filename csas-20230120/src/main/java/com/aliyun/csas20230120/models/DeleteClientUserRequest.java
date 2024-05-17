// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteClientUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteClientUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientUserRequest self = new DeleteClientUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientUserRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
