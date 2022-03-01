// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionStatisticsRequest extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("End")
    public Long end;

    @NameInMap("Start")
    public Long start;

    public static DescribeAntChainTransactionStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionStatisticsRequest self = new DescribeAntChainTransactionStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionStatisticsRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainTransactionStatisticsRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public DescribeAntChainTransactionStatisticsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
