// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetMainDomainNameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("RR")
    @Validation(required = true)
    public String RR;

    @NameInMap("DomainLevel")
    @Validation(required = true)
    public Long domainLevel;

    public static GetMainDomainNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMainDomainNameResponse self = new GetMainDomainNameResponse();
        return TeaModel.build(map, self);
    }

}
