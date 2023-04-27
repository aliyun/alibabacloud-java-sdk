// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteDataCorrectRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ActionDetail")
    public java.util.Map<String, ?> actionDetail;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

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
