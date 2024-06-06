// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class PushItemDataResponseBody extends TeaModel {
    /**
     * <p>Whether the data is pushed successfully.</p>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PushItemDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushItemDataResponseBody self = new PushItemDataResponseBody();
        return TeaModel.build(map, self);
    }

    public PushItemDataResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public PushItemDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
