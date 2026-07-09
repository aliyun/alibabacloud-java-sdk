// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDeliveryTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9335D7CB-2725-53DD-A2B3-187821C8F1B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateDeliveryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeliveryTaskResponseBody self = new UpdateDeliveryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeliveryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
