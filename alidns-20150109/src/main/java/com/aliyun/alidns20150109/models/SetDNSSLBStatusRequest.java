// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDNSSLBStatusRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("SubDomain")
    @Validation(required = true)
    public String subDomain;

    @NameInMap("Open")
    public Boolean open;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Type")
    public String type;

    public static SetDNSSLBStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDNSSLBStatusRequest self = new SetDNSSLBStatusRequest();
        return TeaModel.build(map, self);
    }

}
