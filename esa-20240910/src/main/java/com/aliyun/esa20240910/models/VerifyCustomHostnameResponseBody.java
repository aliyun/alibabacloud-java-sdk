// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class VerifyCustomHostnameResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the verification is passed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Passed")
    public Boolean passed;

    /**
     * <p>The request ID. A unique identifier that Alibaba Cloud generates for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyCustomHostnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyCustomHostnameResponseBody self = new VerifyCustomHostnameResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyCustomHostnameResponseBody setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

    public VerifyCustomHostnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
