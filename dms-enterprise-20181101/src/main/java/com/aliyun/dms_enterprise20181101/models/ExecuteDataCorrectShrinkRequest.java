// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteDataCorrectShrinkRequest extends TeaModel {
    /**
     * <p>The parameters that are required to perform the data change.</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>json</p>
     * <p>"actionDetail" : {</p>
     * <p>    "startTime" :"2021-07-01 00:00:00", // Specify the start time to change data. If you want to immediately change data, you do not need to set this parameter. </p>
     * <p>    "endTime" : "2021-07-01 01:00:00", // Specify the end time to change data. If you want to immediately change data, you do not need to set this parameter. </p>
     * <p>    "transaction" : false, // Specify whether to change data as a transaction. </p>
     * <p>    "backupData" : true // Specify whether to back up data. </p>
     * <p>  }</p>
     * <p>```</p>
     */
    @NameInMap("ActionDetail")
    public String actionDetailShrink;

    /**
     * <p>The ID of the ticket. You can call the [ListOrders](https://help.aliyun.com/document_detail/144643.html) operation to query the ID of the ticket.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public String tid;

    public static ExecuteDataCorrectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDataCorrectShrinkRequest self = new ExecuteDataCorrectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteDataCorrectShrinkRequest setActionDetailShrink(String actionDetailShrink) {
        this.actionDetailShrink = actionDetailShrink;
        return this;
    }
    public String getActionDetailShrink() {
        return this.actionDetailShrink;
    }

    public ExecuteDataCorrectShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ExecuteDataCorrectShrinkRequest setTid(String tid) {
        this.tid = tid;
        return this;
    }
    public String getTid() {
        return this.tid;
    }

}
