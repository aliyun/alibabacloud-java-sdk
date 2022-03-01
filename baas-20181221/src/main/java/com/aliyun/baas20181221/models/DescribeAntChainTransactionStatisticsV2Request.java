// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionStatisticsV2Request extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("End")
    public Long end;

    @NameInMap("Start")
    public Long start;

    public static DescribeAntChainTransactionStatisticsV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionStatisticsV2Request self = new DescribeAntChainTransactionStatisticsV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionStatisticsV2Request setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainTransactionStatisticsV2Request setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeAntChainTransactionStatisticsV2Request setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public DescribeAntChainTransactionStatisticsV2Request setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
