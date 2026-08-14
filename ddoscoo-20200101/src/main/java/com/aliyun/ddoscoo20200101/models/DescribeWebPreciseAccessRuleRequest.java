// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebPreciseAccessRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domains")
    public java.util.List<String> domains;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeWebPreciseAccessRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebPreciseAccessRuleRequest self = new DescribeWebPreciseAccessRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebPreciseAccessRuleRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public DescribeWebPreciseAccessRuleRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DescribeWebPreciseAccessRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
