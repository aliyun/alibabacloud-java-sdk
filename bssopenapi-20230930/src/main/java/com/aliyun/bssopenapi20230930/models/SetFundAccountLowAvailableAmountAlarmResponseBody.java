// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SetFundAccountLowAvailableAmountAlarmResponseBody extends TeaModel {
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
     * <p>08108BF5-1AA3-518E-9986-95A3616E8DA9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetFundAccountLowAvailableAmountAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetFundAccountLowAvailableAmountAlarmResponseBody self = new SetFundAccountLowAvailableAmountAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public SetFundAccountLowAvailableAmountAlarmResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SetFundAccountLowAvailableAmountAlarmResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public SetFundAccountLowAvailableAmountAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
