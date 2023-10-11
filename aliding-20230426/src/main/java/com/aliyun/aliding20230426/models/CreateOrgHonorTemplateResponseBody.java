// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateOrgHonorTemplateResponseBody extends TeaModel {
    @NameInMap("honorId")
    public String honorId;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateOrgHonorTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrgHonorTemplateResponseBody self = new CreateOrgHonorTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrgHonorTemplateResponseBody setHonorId(String honorId) {
        this.honorId = honorId;
        return this;
    }
    public String getHonorId() {
        return this.honorId;
    }

    public CreateOrgHonorTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
