// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsServiceRequest extends TeaModel {
    /**
     * <p>The required resource ID. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ens-20190806****</p>
     */
    @NameInMap("EnsServiceId")
    public String ensServiceId;

    /**
     * <p>The operation to perform after previewing the creation of the edge service. Valid values:</p>
     * <ul>
     * <li><p><strong>Buy</strong>: Create.</p>
     * </li>
     * <li><p><strong>Upgrade</strong>: Update.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Buy</p>
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
