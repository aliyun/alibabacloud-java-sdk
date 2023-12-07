// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CheckCdnDomainICPResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the resource plan. Valid value:</p>
     * <br>
     * <p>*   **DomainIsRegistration**: An ICP filing is obtained for the domain name.</p>
     * <p>*   **DomainNotRegistration**: No ICP filing is obtained for the domain name.</p>
     */
    @NameInMap("Status")
    public String status;

    public static CheckCdnDomainICPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCdnDomainICPResponseBody self = new CheckCdnDomainICPResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCdnDomainICPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckCdnDomainICPResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
