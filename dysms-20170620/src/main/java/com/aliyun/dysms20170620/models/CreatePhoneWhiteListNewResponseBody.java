// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreatePhoneWhiteListNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static CreatePhoneWhiteListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePhoneWhiteListNewResponseBody self = new CreatePhoneWhiteListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePhoneWhiteListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePhoneWhiteListNewResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
