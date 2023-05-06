// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class DeleteAppGroupImageRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    public static DeleteAppGroupImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppGroupImageRequest self = new DeleteAppGroupImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppGroupImageRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
