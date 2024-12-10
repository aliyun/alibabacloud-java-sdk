// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class PushDeviceNotificationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>908FA068-529C-0C20-8DB5-63B0EF7CFF1F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PushDeviceNotificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushDeviceNotificationResponseBody self = new PushDeviceNotificationResponseBody();
        return TeaModel.build(map, self);
    }

    public PushDeviceNotificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
