// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSQLReviewCheckResultStatusRequest extends TeaModel {
    /**
     * <p>The ID of the ticket. You can obtain the ticket ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/257777.html">CreateSQLReviewOrder</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123321</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetSQLReviewCheckResultStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSQLReviewCheckResultStatusRequest self = new GetSQLReviewCheckResultStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetSQLReviewCheckResultStatusRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetSQLReviewCheckResultStatusRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
