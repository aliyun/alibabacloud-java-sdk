// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetNotifyConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>771A1414-27BF-53E6-AB73-EFCB*****ACF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetNotifyConfigResponseBody self = new SetNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
