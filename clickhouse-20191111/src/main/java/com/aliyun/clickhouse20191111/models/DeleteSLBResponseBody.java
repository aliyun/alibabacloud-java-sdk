// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteSLBResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSLBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSLBResponseBody self = new DeleteSLBResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSLBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
