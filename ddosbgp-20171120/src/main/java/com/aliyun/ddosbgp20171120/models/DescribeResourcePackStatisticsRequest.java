// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeResourcePackStatisticsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeResourcePackStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackStatisticsRequest self = new DescribeResourcePackStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackStatisticsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
