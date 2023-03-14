// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeBackSourceCidrRequest extends TeaModel {
    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("Line")
    public String line;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SourceIp")
    public String sourceIp;

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

    public DescribeBackSourceCidrRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
