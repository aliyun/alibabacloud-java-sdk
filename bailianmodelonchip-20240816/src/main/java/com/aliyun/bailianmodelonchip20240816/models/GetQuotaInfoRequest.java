// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class GetQuotaInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("recordId")
    public Long recordId;

    public static GetQuotaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaInfoRequest self = new GetQuotaInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaInfoRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

}
