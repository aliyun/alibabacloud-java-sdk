// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetSparkSubmitInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkSubmitInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkSubmitInfoResponseBody self = new GetSparkSubmitInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkSubmitInfoResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetSparkSubmitInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
