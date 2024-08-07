// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class OpenDeliveryResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the log delivery feature is enabled. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15FD134E-D69B-51E8-B052-73F97BD8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenDeliveryResponseBody self = new OpenDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenDeliveryResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public OpenDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
