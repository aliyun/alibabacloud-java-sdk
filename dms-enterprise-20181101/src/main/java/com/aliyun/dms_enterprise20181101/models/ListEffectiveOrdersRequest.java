// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListEffectiveOrdersRequest extends TeaModel {
    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> : To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListEffectiveOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEffectiveOrdersRequest self = new ListEffectiveOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListEffectiveOrdersRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
