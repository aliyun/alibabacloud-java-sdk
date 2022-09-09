// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateModuleVersionResponseBody extends TeaModel {
    @NameInMap("moduleVersion")
    public String moduleVersion;

    @NameInMap("requestId")
    public String requestId;

    public static CreateModuleVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModuleVersionResponseBody self = new CreateModuleVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModuleVersionResponseBody setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public CreateModuleVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
