// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CloneModuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mod-71012916a5a376f265ebc3774</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    /**
     * <strong>example:</strong>
     * <p>78EC2EFB-AED9-5C23-AE98-6DDC6F2F96D6</p>
     */
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
