// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBackSourceCidrRequest extends TeaModel {
    /**
     * <p>The IP version of the back-to-origin CIDR block.</p>
     * <ul>
     * <li><strong>Ipv4</strong></li>
     * <li><strong>Ipv6</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The Internet service provider (ISP) line that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>coop-line-001</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeBackSourceCidrRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackSourceCidrRequest self = new DescribeBackSourceCidrRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackSourceCidrRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeBackSourceCidrRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public DescribeBackSourceCidrRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
