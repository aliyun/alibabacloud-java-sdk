// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageDeliveryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6D7FBF4A-5B95-5760-8B5A-BF8983D4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDataStorageDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStorageDeliveryResponseBody self = new UpdateDataStorageDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataStorageDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
