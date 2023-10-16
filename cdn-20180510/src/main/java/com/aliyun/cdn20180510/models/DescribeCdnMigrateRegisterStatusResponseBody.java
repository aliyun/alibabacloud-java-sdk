// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnMigrateRegisterStatusResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The registration status. Valid values:</p>
     * <br>
     * <p>*   **not exist**</p>
     * <p>*   **running**</p>
     * <p>*   **succeed**</p>
     * <p>*   **failed**</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeCdnMigrateRegisterStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnMigrateRegisterStatusResponseBody self = new DescribeCdnMigrateRegisterStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnMigrateRegisterStatusResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCdnMigrateRegisterStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnMigrateRegisterStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
