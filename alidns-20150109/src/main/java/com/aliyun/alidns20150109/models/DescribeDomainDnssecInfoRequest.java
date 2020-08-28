// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainDnssecInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DescribeDomainDnssecInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDnssecInfoRequest self = new DescribeDomainDnssecInfoRequest();
        return TeaModel.build(map, self);
    }

}
