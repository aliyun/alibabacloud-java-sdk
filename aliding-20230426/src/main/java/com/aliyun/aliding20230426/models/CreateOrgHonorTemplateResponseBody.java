// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateOrgHonorTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>21660610</p>
     */
    @NameInMap("honorId")
    public String honorId;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
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
