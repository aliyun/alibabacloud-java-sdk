// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateDomainStateResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ICP filing status of the accelerated domain name. Valid values:</p>
     * <br>
     * <p>*   **illegal:** The domain name is illegal.</p>
     * <p>*   **inactive:** The domain name has not completed ICP filing.</p>
     * <p>*   **active:** The domain name has a valid ICP number.</p>
     * <p>*   **unknown:** The ICP filing status is unknown.</p>
     */
    @NameInMap("State")
    public String state;

    public static UpdateDomainStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainStateResponseBody self = new UpdateDomainStateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDomainStateResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateDomainStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDomainStateResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
