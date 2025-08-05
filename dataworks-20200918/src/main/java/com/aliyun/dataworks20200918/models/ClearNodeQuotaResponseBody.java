// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ClearNodeQuotaResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static ClearNodeQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearNodeQuotaResponseBody self = new ClearNodeQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearNodeQuotaResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ClearNodeQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
