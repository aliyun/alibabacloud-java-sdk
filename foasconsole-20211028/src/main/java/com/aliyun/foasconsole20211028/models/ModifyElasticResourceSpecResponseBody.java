// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyElasticResourceSpecResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21147322832****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B21DC47E-8928-199A-9F32-36D45E4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyElasticResourceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticResourceSpecResponseBody self = new ModifyElasticResourceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyElasticResourceSpecResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ModifyElasticResourceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyElasticResourceSpecResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
