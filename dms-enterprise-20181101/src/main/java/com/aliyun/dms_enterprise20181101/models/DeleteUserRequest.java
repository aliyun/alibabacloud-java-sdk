// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteUserRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("Uid")
    public String uid;

    public static DeleteUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserRequest self = new DeleteUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public DeleteUserRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
