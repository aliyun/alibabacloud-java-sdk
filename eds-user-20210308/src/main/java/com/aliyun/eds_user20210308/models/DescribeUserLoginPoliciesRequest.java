// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUserLoginPoliciesRequest extends TeaModel {
    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>Security audit</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of policy IDs. This is a filter condition for the query.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    public static DescribeUserLoginPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLoginPoliciesRequest self = new DescribeUserLoginPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserLoginPoliciesRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public DescribeUserLoginPoliciesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeUserLoginPoliciesRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

}
