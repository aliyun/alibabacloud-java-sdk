// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebPreciseAccessRuleRequest extends TeaModel {
    /**
     * <p>An array that consists of the domain names of websites.</p>
     * <blockquote>
     * <p>A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domains")
    public java.util.List<String> domains;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
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

    public DescribeWebPreciseAccessRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
