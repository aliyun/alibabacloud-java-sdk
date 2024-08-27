// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByVpcAccessRequest extends TeaModel {
    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the VPC access authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>lynkco-iov-uat</p>
     */
    @NameInMap("VpcName")
    public String vpcName;

    public static DescribeApisByVpcAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByVpcAccessRequest self = new DescribeApisByVpcAccessRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisByVpcAccessRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisByVpcAccessRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisByVpcAccessRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeApisByVpcAccessRequest setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

}
