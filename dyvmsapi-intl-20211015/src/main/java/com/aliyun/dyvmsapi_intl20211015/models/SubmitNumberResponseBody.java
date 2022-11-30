// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitNumberResponseBody extends TeaModel {
    @NameInMap("ApplyId")
    public String applyId;

    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitNumberResponseBody self = new SubmitNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitNumberResponseBody setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public SubmitNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
