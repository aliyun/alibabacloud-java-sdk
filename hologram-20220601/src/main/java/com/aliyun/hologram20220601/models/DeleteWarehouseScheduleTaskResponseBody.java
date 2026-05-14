// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DeleteWarehouseScheduleTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D1303CD4-AA70-5998-8025-F55B22C50840</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWarehouseScheduleTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWarehouseScheduleTaskResponseBody self = new DeleteWarehouseScheduleTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWarehouseScheduleTaskResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteWarehouseScheduleTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
