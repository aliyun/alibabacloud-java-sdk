// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CdnMigrateRegisterResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The registration status. Valid values:</p>
     * <br>
     * <p>*   **running**</p>
     * <p>*   **succeed**</p>
     * <p>*   **failed**</p>
     */
    @NameInMap("Status")
    public String status;

    public static CdnMigrateRegisterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CdnMigrateRegisterResponseBody self = new CdnMigrateRegisterResponseBody();
        return TeaModel.build(map, self);
    }

    public CdnMigrateRegisterResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CdnMigrateRegisterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CdnMigrateRegisterResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
