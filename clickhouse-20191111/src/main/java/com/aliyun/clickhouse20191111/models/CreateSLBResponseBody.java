// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateSLBResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A23C87D-87DF-4DA0-A50E-CB13F4F7923D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSLBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSLBResponseBody self = new CreateSLBResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSLBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
