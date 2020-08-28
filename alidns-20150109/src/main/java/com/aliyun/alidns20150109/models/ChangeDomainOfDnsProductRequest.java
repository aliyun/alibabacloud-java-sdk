// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainOfDnsProductRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("NewDomain")
    public String newDomain;

    @NameInMap("Force")
    public Boolean force;

    public static ChangeDomainOfDnsProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainOfDnsProductRequest self = new ChangeDomainOfDnsProductRequest();
        return TeaModel.build(map, self);
    }

}
