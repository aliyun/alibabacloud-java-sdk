// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateModuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mod-518855d9a058cfffcc446d8fe3c99</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    /**
     * <strong>example:</strong>
     * <p>0D797DC3-FF04-5C21-81EB-92C7799512E3</p>
     */
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
