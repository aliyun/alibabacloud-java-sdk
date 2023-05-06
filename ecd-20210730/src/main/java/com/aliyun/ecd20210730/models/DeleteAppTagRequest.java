// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class DeleteAppTagRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    public static DeleteAppTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppTagRequest self = new DeleteAppTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppTagRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
