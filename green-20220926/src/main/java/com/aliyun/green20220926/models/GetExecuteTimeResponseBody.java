// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetExecuteTimeResponseBody extends TeaModel {
    /**
     * <p>Returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>02:24:30</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>ID assigned by the backend, used to uniquely identify a request. Can be used for troubleshooting.</p>
     * 
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
