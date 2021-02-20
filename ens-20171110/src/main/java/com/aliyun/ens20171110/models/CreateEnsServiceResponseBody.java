// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateEnsServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsServiceResponseBody self = new CreateEnsServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnsServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateEnsServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
