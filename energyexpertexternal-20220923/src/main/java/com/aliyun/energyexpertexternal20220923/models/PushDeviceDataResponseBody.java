// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class PushDeviceDataResponseBody extends TeaModel {
    /**
     * <p>Whether the data is pushed successfully. Success is returned.</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PushDeviceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushDeviceDataResponseBody self = new PushDeviceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public PushDeviceDataResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PushDeviceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
