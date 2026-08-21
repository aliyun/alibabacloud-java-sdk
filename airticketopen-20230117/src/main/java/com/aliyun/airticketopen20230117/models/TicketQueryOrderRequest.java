// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketQueryOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DistributorOrderId")
    public String distributorOrderId;

    public static TicketQueryOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketQueryOrderRequest self = new TicketQueryOrderRequest();
        return TeaModel.build(map, self);
    }

    public TicketQueryOrderRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public TicketQueryOrderRequest setDistributorOrderId(String distributorOrderId) {
        this.distributorOrderId = distributorOrderId;
        return this;
    }
    public String getDistributorOrderId() {
        return this.distributorOrderId;
    }

}
