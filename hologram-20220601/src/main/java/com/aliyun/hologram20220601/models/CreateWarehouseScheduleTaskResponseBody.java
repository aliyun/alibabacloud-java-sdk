// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateWarehouseScheduleTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the created warehouse schedule task.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWarehouseScheduleTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWarehouseScheduleTaskResponseBody self = new CreateWarehouseScheduleTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWarehouseScheduleTaskResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateWarehouseScheduleTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
