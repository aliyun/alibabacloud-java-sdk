// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyElasticResourceSpecResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>211473228320700</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p>B21DC47E-8928-199A-9F32-36D45E4693B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
