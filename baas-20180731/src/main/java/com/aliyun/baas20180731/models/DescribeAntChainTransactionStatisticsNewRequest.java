// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionStatisticsNewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("End")
    public Long end;

    @NameInMap("Start")
    public Long start;

    public static DescribeAntChainTransactionStatisticsNewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionStatisticsNewRequest self = new DescribeAntChainTransactionStatisticsNewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionStatisticsNewRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainTransactionStatisticsNewRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeAntChainTransactionStatisticsNewRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public DescribeAntChainTransactionStatisticsNewRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
