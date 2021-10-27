// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckRdsSuperAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckRdsSuperAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckRdsSuperAccountResponseBody self = new CheckRdsSuperAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckRdsSuperAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckRdsSuperAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
