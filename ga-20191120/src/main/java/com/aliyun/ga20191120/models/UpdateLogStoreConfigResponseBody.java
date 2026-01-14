// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateLogStoreConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLogStoreConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogStoreConfigResponseBody self = new UpdateLogStoreConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLogStoreConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
