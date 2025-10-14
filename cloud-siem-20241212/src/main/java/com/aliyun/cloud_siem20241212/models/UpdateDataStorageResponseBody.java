// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EA7FC160-8D86-5ABE-A08A-7962FDC1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDataStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStorageResponseBody self = new UpdateDataStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
