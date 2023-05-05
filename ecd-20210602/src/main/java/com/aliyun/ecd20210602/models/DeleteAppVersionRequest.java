// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteAppVersionRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DeleteAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppVersionRequest self = new DeleteAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppVersionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
