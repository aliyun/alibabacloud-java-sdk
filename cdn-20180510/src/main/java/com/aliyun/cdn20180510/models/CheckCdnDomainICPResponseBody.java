// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CheckCdnDomainICPResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the resource plan. Valid value:</p>
     * <ul>
     * <li><strong>DomainIsRegistration</strong>: An ICP filing is obtained for the domain name.</li>
     * <li><strong>DomainNotRegistration</strong>: No ICP filing is obtained for the domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DomainIsRegistration</p>
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
