// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class VerifyAccountProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Success")
    public Boolean success;

    public static VerifyAccountProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyAccountProjectResponseBody self = new VerifyAccountProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyAccountProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyAccountProjectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public VerifyAccountProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
