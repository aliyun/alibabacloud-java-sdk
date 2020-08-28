// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeTransferDomainsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TransferType")
    @Validation(required = true)
    public String transferType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("FromUserId")
    public Long fromUserId;

    @NameInMap("TargetUserId")
    public Long targetUserId;

    public static DescribeTransferDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransferDomainsRequest self = new DescribeTransferDomainsRequest();
        return TeaModel.build(map, self);
    }

}
