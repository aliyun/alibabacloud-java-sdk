// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeIpControlPolicyItemsRequest extends TeaModel {
    @NameInMap("IpControlId")
    public String ipControlId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PolicyItemId")
    public String policyItemId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeIpControlPolicyItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpControlPolicyItemsRequest self = new DescribeIpControlPolicyItemsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpControlPolicyItemsRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public DescribeIpControlPolicyItemsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpControlPolicyItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpControlPolicyItemsRequest setPolicyItemId(String policyItemId) {
        this.policyItemId = policyItemId;
        return this;
    }
    public String getPolicyItemId() {
        return this.policyItemId;
    }

    public DescribeIpControlPolicyItemsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
