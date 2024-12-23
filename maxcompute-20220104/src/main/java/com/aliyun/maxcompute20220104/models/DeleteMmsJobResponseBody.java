// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteMmsJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>88</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>31BE216F-AEF7-581E-B9C9-DECEB5424AC4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteMmsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMmsJobResponseBody self = new DeleteMmsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMmsJobResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public DeleteMmsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
