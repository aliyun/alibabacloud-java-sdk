// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11792</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <strong>example:</strong>
     * <p>4F6AB6B3-41FB-5EBB-AFB2-0C98D49DA2BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDIJobResponseBody self = new CreateDIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDIJobResponseBody setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public CreateDIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
