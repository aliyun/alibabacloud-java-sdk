// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsTimerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>EA1320AB-7766-5EC7-B0F6-8B20E2298567</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateMmsTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsTimerResponseBody self = new UpdateMmsTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMmsTimerResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public UpdateMmsTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
