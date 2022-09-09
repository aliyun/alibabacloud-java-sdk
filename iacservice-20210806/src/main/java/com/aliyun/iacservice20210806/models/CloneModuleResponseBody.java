// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CloneModuleResponseBody extends TeaModel {
    @NameInMap("moduleId")
    public String moduleId;

    @NameInMap("requestId")
    public String requestId;

    public static CloneModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneModuleResponseBody self = new CloneModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneModuleResponseBody setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public CloneModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
