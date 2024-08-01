// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainBackupResponseBody extends TeaModel {
    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>test.aliyun.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The backup cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FD552816-FCC8-4832-B4A2-2DA0C2BA1688</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddDomainBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDomainBackupResponseBody self = new AddDomainBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDomainBackupResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddDomainBackupResponseBody setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public AddDomainBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
