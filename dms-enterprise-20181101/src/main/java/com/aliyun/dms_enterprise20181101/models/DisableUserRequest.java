// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DisableUserRequest extends TeaModel {
    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The UID of the Alibaba Cloud account.</p>
     * <br>
     * <p>This parameter is required.</p>
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
