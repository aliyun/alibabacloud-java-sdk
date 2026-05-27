// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>EA1320AB-7766-5EC7-B0F6-8B20E2298567</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateMmsTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsTableResponseBody self = new UpdateMmsTableResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMmsTableResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public UpdateMmsTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
