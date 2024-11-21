// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CloseManagedIndexResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the index\&quot;s cloud management has been successfully closed:</p>
     * <ul>
     * <li><p>true: Success</p>
     * </li>
     * <li><p>false: Failure</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static CloseManagedIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseManagedIndexResponseBody self = new CloseManagedIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseManagedIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloseManagedIndexResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
