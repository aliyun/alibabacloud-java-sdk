// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreatePreCheckResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, Boolean> data;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePreCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePreCheckResponseBody self = new CreatePreCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePreCheckResponseBody setData(java.util.Map<String, Boolean> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, Boolean> getData() {
        return this.data;
    }

    public CreatePreCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
