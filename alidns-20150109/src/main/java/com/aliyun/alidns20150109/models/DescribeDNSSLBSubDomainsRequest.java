// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDNSSLBSubDomainsRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeDNSSLBSubDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDNSSLBSubDomainsRequest self = new DescribeDNSSLBSubDomainsRequest();
        return TeaModel.build(map, self);
    }

}
