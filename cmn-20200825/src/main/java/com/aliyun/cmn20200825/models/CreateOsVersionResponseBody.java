// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateOsVersionResponseBody extends TeaModel {
    @NameInMap("OsVersionId")
    public String osVersionId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateOsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOsVersionResponseBody self = new CreateOsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOsVersionResponseBody setOsVersionId(String osVersionId) {
        this.osVersionId = osVersionId;
        return this;
    }
    public String getOsVersionId() {
        return this.osVersionId;
    }

    public CreateOsVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
