// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class StopDumpMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static StopDumpMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDumpMetaResponseBody self = new StopDumpMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDumpMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopDumpMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
