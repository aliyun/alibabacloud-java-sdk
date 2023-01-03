// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SaveTraceAppConfigResponseBody extends TeaModel {
    // Indicates whether the call was successful.
    @NameInMap("Data")
    public String data;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static SaveTraceAppConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveTraceAppConfigResponseBody self = new SaveTraceAppConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveTraceAppConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SaveTraceAppConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
