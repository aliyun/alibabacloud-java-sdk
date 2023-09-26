// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeBlackListsRequest extends TeaModel {
    @NameInMap("BlackType")
    public String blackType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeBlackListsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackListsRequest self = new DescribeBlackListsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlackListsRequest setBlackType(String blackType) {
        this.blackType = blackType;
        return this;
    }
    public String getBlackType() {
        return this.blackType;
    }

    public DescribeBlackListsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBlackListsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBlackListsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
