// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteMmsDataSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2000015</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <strong>example:</strong>
     * <p>EA1320AB-7766-5EC7-B0F6-8B20E2298567</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteMmsDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMmsDataSourceResponseBody self = new DeleteMmsDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMmsDataSourceResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public DeleteMmsDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
