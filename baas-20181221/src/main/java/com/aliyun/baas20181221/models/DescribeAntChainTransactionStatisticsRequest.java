// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionStatisticsRequest extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("Start")
    public Long start;

    @NameInMap("End")
    public Long end;

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

    public DescribeAntChainTransactionStatisticsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public DescribeAntChainTransactionStatisticsRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

}
