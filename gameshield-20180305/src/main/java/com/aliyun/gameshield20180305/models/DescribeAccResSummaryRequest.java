// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAccResSummaryRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeAccResSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccResSummaryRequest self = new DescribeAccResSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccResSummaryRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
