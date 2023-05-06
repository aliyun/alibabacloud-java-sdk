// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class DeleteAppVersionRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    public static DeleteAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppVersionRequest self = new DeleteAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppVersionRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
