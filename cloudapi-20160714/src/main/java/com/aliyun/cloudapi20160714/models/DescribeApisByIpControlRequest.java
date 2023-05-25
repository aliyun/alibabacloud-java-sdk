// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByIpControlRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("IpControlId")
    public String ipControlId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeApisByIpControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByIpControlRequest self = new DescribeApisByIpControlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisByIpControlRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public DescribeApisByIpControlRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisByIpControlRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisByIpControlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
