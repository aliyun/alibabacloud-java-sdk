// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddQueueResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7ABFF29F-BD9C-4663-AD5D-E620FA48****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddQueueResponseBody self = new AddQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public AddQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
