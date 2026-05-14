// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateWarehouseScheduleTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D3AE84AB-0873-5FC7-A4C4-8CF869D2FA70</p>
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
