// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainBackupResponseBody extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("PeriodType")
    public String periodType;

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
