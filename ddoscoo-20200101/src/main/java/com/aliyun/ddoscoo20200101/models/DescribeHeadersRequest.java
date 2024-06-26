// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHeadersRequest extends TeaModel {
    /**
     * <p>The domain name that you want to query.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all the domain names that are added to Anti-DDoS Pro or Anti-DDoS Premium.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek3cmuvpia****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeHeadersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHeadersRequest self = new DescribeHeadersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHeadersRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeHeadersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
