// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class CloseDeliveryResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the threat analysis feature was disabled. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloseDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseDeliveryResponseBody self = new CloseDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseDeliveryResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CloseDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
