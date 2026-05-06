// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class GetSubscriptionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-3pptowd2olrctsvc</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    public static GetSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionRequest self = new GetSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

}
