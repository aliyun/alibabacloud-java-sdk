// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateOsVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VersionId")
    public String versionId;

    public static CreateOsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOsVersionResponseBody self = new CreateOsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOsVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOsVersionResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
