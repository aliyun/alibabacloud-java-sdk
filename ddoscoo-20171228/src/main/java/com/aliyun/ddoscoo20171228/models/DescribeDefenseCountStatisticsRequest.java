// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDefenseCountStatisticsRequest extends TeaModel {
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDefenseCountStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseCountStatisticsRequest self = new DescribeDefenseCountStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseCountStatisticsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDefenseCountStatisticsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
