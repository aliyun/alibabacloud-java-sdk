// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class StopMmsJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>88</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>8023D058-62B7-5C49-8EB6-AD9BA7942BC5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static StopMmsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopMmsJobResponseBody self = new StopMmsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StopMmsJobResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public StopMmsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
