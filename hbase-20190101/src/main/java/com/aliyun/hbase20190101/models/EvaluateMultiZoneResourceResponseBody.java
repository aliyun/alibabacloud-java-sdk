// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EvaluateMultiZoneResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EvaluateMultiZoneResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EvaluateMultiZoneResourceResponseBody self = new EvaluateMultiZoneResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public EvaluateMultiZoneResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EvaluateMultiZoneResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
