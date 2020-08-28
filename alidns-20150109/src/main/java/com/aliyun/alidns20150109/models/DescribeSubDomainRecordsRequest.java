// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSubDomainRecordsRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("SubDomain")
    @Validation(required = true)
    public String subDomain;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Type")
    public String type;

    @NameInMap("Line")
    public String line;

    @NameInMap("DomainName")
    public String domainName;

    public static DescribeSubDomainRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubDomainRecordsRequest self = new DescribeSubDomainRecordsRequest();
        return TeaModel.build(map, self);
    }

}
