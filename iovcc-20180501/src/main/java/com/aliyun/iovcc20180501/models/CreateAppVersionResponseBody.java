// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateAppVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VersionId")
    public String versionId;

    public static CreateAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppVersionResponseBody self = new CreateAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppVersionResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
