// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class StartMmsJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>88</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>5CA6292A-E301-5CD8-B4E2-AF060F99147B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static StartMmsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartMmsJobResponseBody self = new StartMmsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StartMmsJobResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public StartMmsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
