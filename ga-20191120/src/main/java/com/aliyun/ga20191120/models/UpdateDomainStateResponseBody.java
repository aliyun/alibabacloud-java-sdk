// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateDomainStateResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ICP filing status of the accelerated domain name. Valid values:</p>
     * <ul>
     * <li><strong>illegal:</strong> The domain name is illegal.</li>
     * <li><strong>inactive:</strong> The domain name has not completed ICP filing.</li>
     * <li><strong>active:</strong> The domain name has a valid ICP number.</li>
     * <li><strong>unknown:</strong> The ICP filing status is unknown.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
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
