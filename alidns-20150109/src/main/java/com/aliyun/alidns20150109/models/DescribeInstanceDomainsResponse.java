// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInstanceDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalItems")
    @Validation(required = true)
    public Integer totalItems;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalPages")
    @Validation(required = true)
    public Integer totalPages;

    @NameInMap("InstanceDomains")
    @Validation(required = true)
    public java.util.List<DescribeInstanceDomainsResponseInstanceDomains> instanceDomains;

    public static DescribeInstanceDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDomainsResponse self = new DescribeInstanceDomainsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeInstanceDomainsResponseInstanceDomains extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreateTimestamp")
        @Validation(required = true)
        public Long createTimestamp;

        public static DescribeInstanceDomainsResponseInstanceDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDomainsResponseInstanceDomains self = new DescribeInstanceDomainsResponseInstanceDomains();
            return TeaModel.build(map, self);
        }

    }

}
