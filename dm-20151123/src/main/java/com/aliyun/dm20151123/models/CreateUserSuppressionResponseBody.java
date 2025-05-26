// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateUserSuppressionResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>1A846D66-5EC7-551B-9687-5BF1963DCFC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Invalid address number</p>
     * 
     * <strong>example:</strong>
     * <p>59511</p>
     */
    @NameInMap("SuppressionId")
    public String suppressionId;

    public static CreateUserSuppressionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserSuppressionResponseBody self = new CreateUserSuppressionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserSuppressionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserSuppressionResponseBody setSuppressionId(String suppressionId) {
        this.suppressionId = suppressionId;
        return this;
    }
    public String getSuppressionId() {
        return this.suppressionId;
    }

}
