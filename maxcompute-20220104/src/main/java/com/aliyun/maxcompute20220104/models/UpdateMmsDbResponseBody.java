// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsDbResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>0b87b7e716665825896565060e87a4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateMmsDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsDbResponseBody self = new UpdateMmsDbResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMmsDbResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public UpdateMmsDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
