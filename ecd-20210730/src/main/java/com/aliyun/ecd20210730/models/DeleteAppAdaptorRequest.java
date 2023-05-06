// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class DeleteAppAdaptorRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    public static DeleteAppAdaptorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppAdaptorRequest self = new DeleteAppAdaptorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppAdaptorRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
