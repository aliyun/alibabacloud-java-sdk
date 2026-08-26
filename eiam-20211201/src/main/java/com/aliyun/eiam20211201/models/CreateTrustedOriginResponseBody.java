// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateTrustedOriginResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-example</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The trusted origin ID.</p>
     * 
     * <strong>example:</strong>
     * <p>to_example</p>
     */
    @NameInMap("TrustedOriginId")
    public String trustedOriginId;

    public static CreateTrustedOriginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustedOriginResponseBody self = new CreateTrustedOriginResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrustedOriginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrustedOriginResponseBody setTrustedOriginId(String trustedOriginId) {
        this.trustedOriginId = trustedOriginId;
        return this;
    }
    public String getTrustedOriginId() {
        return this.trustedOriginId;
    }

}
