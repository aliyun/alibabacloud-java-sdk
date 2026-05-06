// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class DisableSubscriptionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-3pptowd2olrctsvc</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    public static DisableSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSubscriptionRequest self = new DisableSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public DisableSubscriptionRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

}
