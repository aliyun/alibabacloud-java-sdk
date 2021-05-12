// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CheckSLRRequest extends TeaModel {
    @NameInMap("uid")
    public String uid;

    public static CheckSLRRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSLRRequest self = new CheckSLRRequest();
        return TeaModel.build(map, self);
    }

    public CheckSLRRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
