// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetServiceQuotaRequest extends TeaModel {
    /**
     * <p>Quota 配额的唯一标识。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceTrialTimes。</p>
     */
    @NameInMap("QuotaType")
    public String quotaType;

    public static GetServiceQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceQuotaRequest self = new GetServiceQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceQuotaRequest setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

}
