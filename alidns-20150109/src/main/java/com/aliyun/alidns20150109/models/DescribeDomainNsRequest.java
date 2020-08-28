// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainNsRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DescribeDomainNsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainNsRequest self = new DescribeDomainNsRequest();
        return TeaModel.build(map, self);
    }

}
