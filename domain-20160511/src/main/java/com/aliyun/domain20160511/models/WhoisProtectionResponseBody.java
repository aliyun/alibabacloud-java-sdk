// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class WhoisProtectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Integer result;

    public static WhoisProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WhoisProtectionResponseBody self = new WhoisProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public WhoisProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WhoisProtectionResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

}
