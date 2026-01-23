// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteScanRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Request Id</p>
     * 
     * <strong>example:</strong>
     * <p>12589EF7-96E2-4554-AAD7-F7209E88CAD3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScanRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScanRuleResponseBody self = new DeleteScanRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScanRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteScanRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
