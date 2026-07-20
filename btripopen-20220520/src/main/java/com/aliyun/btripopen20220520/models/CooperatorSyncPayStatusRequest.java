// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CooperatorSyncPayStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("cooperator_order_id")
    public String cooperatorOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("cooperator_pay_no")
    public String cooperatorPayNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1017018197205925373</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("pay_status")
    public String payStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1726022215000</p>
     */
    @NameInMap("pay_time")
    public Long payTime;

    public static CooperatorSyncPayStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CooperatorSyncPayStatusRequest self = new CooperatorSyncPayStatusRequest();
        return TeaModel.build(map, self);
    }

    public CooperatorSyncPayStatusRequest setCooperatorOrderId(String cooperatorOrderId) {
        this.cooperatorOrderId = cooperatorOrderId;
        return this;
    }
    public String getCooperatorOrderId() {
        return this.cooperatorOrderId;
    }

    public CooperatorSyncPayStatusRequest setCooperatorPayNo(String cooperatorPayNo) {
        this.cooperatorPayNo = cooperatorPayNo;
        return this;
    }
    public String getCooperatorPayNo() {
        return this.cooperatorPayNo;
    }

    public CooperatorSyncPayStatusRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CooperatorSyncPayStatusRequest setPayStatus(String payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public String getPayStatus() {
        return this.payStatus;
    }

    public CooperatorSyncPayStatusRequest setPayTime(Long payTime) {
        this.payTime = payTime;
        return this;
    }
    public Long getPayTime() {
        return this.payTime;
    }

}
