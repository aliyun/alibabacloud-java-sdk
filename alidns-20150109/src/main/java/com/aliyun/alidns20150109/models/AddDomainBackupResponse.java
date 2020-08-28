// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainBackupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("PeriodType")
    @Validation(required = true)
    public String periodType;

    public static AddDomainBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDomainBackupResponse self = new AddDomainBackupResponse();
        return TeaModel.build(map, self);
    }

}
