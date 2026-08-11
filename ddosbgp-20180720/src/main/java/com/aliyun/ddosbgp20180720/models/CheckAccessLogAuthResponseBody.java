// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CheckAccessLogAuthResponseBody extends TeaModel {
    /**
     * <p>Indicates whether Anti-DDoS Origin is authorized to access Simple Log Service. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Authorized.</li>
     * <li><strong>false</strong>: Not authorized.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AccessLogAuth")
    public Boolean accessLogAuth;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>864FE2F4-CB2E-4024-B9EF-D59FD08ABD41</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckAccessLogAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAccessLogAuthResponseBody self = new CheckAccessLogAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAccessLogAuthResponseBody setAccessLogAuth(Boolean accessLogAuth) {
        this.accessLogAuth = accessLogAuth;
        return this;
    }
    public Boolean getAccessLogAuth() {
        return this.accessLogAuth;
    }

    public CheckAccessLogAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
