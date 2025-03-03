// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CancelFundAccountLowAvailableAmountAlarmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>DFC1F7F9-3BA9-BA4D-2F2E653</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelFundAccountLowAvailableAmountAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelFundAccountLowAvailableAmountAlarmResponseBody self = new CancelFundAccountLowAvailableAmountAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelFundAccountLowAvailableAmountAlarmResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CancelFundAccountLowAvailableAmountAlarmResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public CancelFundAccountLowAvailableAmountAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
