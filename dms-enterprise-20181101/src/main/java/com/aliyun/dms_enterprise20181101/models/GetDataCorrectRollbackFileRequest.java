// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectRollbackFileRequest extends TeaModel {
    /**
     * <p>The ID of the ticket. You can call the [ListOrders](~~144643~~) operation to query the ticket ID.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> : To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDataCorrectRollbackFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectRollbackFileRequest self = new GetDataCorrectRollbackFileRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectRollbackFileRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataCorrectRollbackFileRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
