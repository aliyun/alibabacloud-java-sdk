// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DisableUserRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>You can call this operation to disable a user that is temporarily not used in Data Management (DMS) Enterprise.</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static DisableUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableUserRequest self = new DisableUserRequest();
        return TeaModel.build(map, self);
    }

    public DisableUserRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public DisableUserRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
