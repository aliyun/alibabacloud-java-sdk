// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsTablesResponseBody extends TeaModel {
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

    public static UpdateMmsTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsTablesResponseBody self = new UpdateMmsTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMmsTablesResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public UpdateMmsTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
