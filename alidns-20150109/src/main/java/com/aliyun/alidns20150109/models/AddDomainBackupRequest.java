// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainBackupRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("PeriodType")
    @Validation(required = true)
    public String periodType;

    public static AddDomainBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDomainBackupRequest self = new AddDomainBackupRequest();
        return TeaModel.build(map, self);
    }

}
