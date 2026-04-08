// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteMmsTimerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>0a06dd4516687375802853481ec9fd</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteMmsTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMmsTimerResponseBody self = new DeleteMmsTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMmsTimerResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public DeleteMmsTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
