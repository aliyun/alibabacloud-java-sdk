// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetExecuteTimeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>02:24:30</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetExecuteTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExecuteTimeResponseBody self = new GetExecuteTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExecuteTimeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetExecuteTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
