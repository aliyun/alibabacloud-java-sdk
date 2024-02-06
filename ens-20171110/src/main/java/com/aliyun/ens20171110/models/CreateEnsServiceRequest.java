// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsServiceRequest extends TeaModel {
    /**
     * <p>The ID of the resource that you want to obtain. You can specify only one ID in a request.</p>
     */
    @NameInMap("EnsServiceId")
    public String ensServiceId;

    /**
     * <p>The operation to perform after you preview the created edge service. Valid values:</p>
     * <br>
     * <p>*   **Buy**: create</p>
     * <p>*   **Upgrade**: change</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    public static CreateEnsServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsServiceRequest self = new CreateEnsServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnsServiceRequest setEnsServiceId(String ensServiceId) {
        this.ensServiceId = ensServiceId;
        return this;
    }
    public String getEnsServiceId() {
        return this.ensServiceId;
    }

    public CreateEnsServiceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

}
