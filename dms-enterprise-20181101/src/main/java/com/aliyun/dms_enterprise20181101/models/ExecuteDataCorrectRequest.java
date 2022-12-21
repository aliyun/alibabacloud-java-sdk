// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteDataCorrectRequest extends TeaModel {
    // The parameters that are required to perform the data change.
    // 
    // ```
    // 
    // json
    // "actionDetail" : {
    //     "startTime" :"2021-07-01 00:00:00", // Specify the start time to change data. If you want to immediately change data, you do not need to set this parameter. 
    //     "endTime" : "2021-07-01 01:00:00", // Specify the end time to change data. If you want to immediately change data, you do not need to set this parameter. 
    //     "transaction" : false, // Specify whether to change data as a transaction. 
    //     "backupData" : true // Specify whether to back up data. 
    //   }
    // ```
    @NameInMap("ActionDetail")
    public java.util.Map<String, ?> actionDetail;

    // The ID of the ticket. You can call the [ListOrders](~~144643~~) operation to query the ID of the ticket.
    @NameInMap("OrderId")
    public Long orderId;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
    @NameInMap("Tid")
    public String tid;

    public static ExecuteDataCorrectRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDataCorrectRequest self = new ExecuteDataCorrectRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteDataCorrectRequest setActionDetail(java.util.Map<String, ?> actionDetail) {
        this.actionDetail = actionDetail;
        return this;
    }
    public java.util.Map<String, ?> getActionDetail() {
        return this.actionDetail;
    }

    public ExecuteDataCorrectRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ExecuteDataCorrectRequest setTid(String tid) {
        this.tid = tid;
        return this;
    }
    public String getTid() {
        return this.tid;
    }

}
