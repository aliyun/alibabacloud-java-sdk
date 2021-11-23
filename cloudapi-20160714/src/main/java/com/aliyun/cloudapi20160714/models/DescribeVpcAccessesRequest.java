// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeVpcAccessesRequest extends TeaModel {
    @NameInMap("AccurateQuery")
    public Boolean accurateQuery;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeVpcAccessesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcAccessesRequest self = new DescribeVpcAccessesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcAccessesRequest setAccurateQuery(Boolean accurateQuery) {
        this.accurateQuery = accurateQuery;
        return this;
    }
    public Boolean getAccurateQuery() {
        return this.accurateQuery;
    }

    public DescribeVpcAccessesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVpcAccessesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpcAccessesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcAccessesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
