// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class DeleteAppImageRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Uid")
    public String uid;

    public static DeleteAppImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppImageRequest self = new DeleteAppImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppImageRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteAppImageRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
