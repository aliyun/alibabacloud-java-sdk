// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateNodeQuotaResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNodeQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeQuotaResponseBody self = new UpdateNodeQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNodeQuotaResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateNodeQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
