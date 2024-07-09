// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnMigrateRegisterStatusResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>64D28B53-5902-409B-94F6-FD46680144FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The registration status. Valid values:</p>
     * <ul>
     * <li><strong>not exist</strong></li>
     * <li><strong>running</strong></li>
     * <li><strong>succeed</strong></li>
     * <li><strong>failed</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>succeed</p>
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
