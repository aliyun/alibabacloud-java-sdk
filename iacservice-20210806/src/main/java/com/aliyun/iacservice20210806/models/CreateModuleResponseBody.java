// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateModuleResponseBody extends TeaModel {
    @NameInMap("moduleId")
    public String moduleId;

    @NameInMap("requestId")
    public String requestId;

    public static CreateModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModuleResponseBody self = new CreateModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModuleResponseBody setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public CreateModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
