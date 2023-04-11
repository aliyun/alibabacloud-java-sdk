// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectTaskDetailRequest extends TeaModel {
    /**
     * <p>The ID of the ticket. You can call the [CreateDataCorrectOrder](~~208388~~), [CreateDataImportOrder](~~208387~~), or [CreateFreeLockCorrectOrder](~~208386~~) operation to obtain the ticket ID.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> : To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDataCorrectTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectTaskDetailRequest self = new GetDataCorrectTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectTaskDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataCorrectTaskDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
