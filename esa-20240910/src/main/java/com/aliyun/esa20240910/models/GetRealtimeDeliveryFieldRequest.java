// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRealtimeDeliveryFieldRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dcdn_log_er</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    public static GetRealtimeDeliveryFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeDeliveryFieldRequest self = new GetRealtimeDeliveryFieldRequest();
        return TeaModel.build(map, self);
    }

    public GetRealtimeDeliveryFieldRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}
