// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ModifyHichinaDomainDNSRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static ModifyHichinaDomainDNSRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHichinaDomainDNSRequest self = new ModifyHichinaDomainDNSRequest();
        return TeaModel.build(map, self);
    }

}
