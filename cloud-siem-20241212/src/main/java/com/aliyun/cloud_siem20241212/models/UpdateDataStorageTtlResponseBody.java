// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageTtlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D92E4FCF-4584-5E50-9C02-26B79A9C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDataStorageTtlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStorageTtlResponseBody self = new UpdateDataStorageTtlResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataStorageTtlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
