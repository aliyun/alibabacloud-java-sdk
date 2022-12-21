// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowRequest extends TeaModel {
    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    public static ListTaskFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowRequest self = new ListTaskFlowRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
