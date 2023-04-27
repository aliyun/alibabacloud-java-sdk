// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUserTenantsRequest extends TeaModel {
    /**
     * <p>The name of the tenant.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListUserTenantsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserTenantsRequest self = new ListUserTenantsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserTenantsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
