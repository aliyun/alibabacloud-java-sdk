// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainRecordRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("RR")
    @Validation(required = true)
    public String RR;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("Value")
    @Validation(required = true)
    public String value;

    @NameInMap("TTL")
    public Long TTL;

    @NameInMap("Priority")
    public Long priority;

    @NameInMap("Line")
    public String line;

    public static AddDomainRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDomainRecordRequest self = new AddDomainRecordRequest();
        return TeaModel.build(map, self);
    }

}
