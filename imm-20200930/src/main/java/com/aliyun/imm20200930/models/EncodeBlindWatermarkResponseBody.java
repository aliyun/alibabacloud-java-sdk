// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class EncodeBlindWatermarkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8E0DD64B-28C6-4653-8FF7-93E4C234BCF0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EncodeBlindWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EncodeBlindWatermarkResponseBody self = new EncodeBlindWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public EncodeBlindWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
