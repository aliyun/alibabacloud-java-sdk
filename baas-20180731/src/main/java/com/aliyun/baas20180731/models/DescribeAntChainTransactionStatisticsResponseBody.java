// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeAntChainTransactionStatisticsResponseBodyResult> result;

    public static DescribeAntChainTransactionStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionStatisticsResponseBody self = new DescribeAntChainTransactionStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainTransactionStatisticsResponseBody setResult(java.util.List<DescribeAntChainTransactionStatisticsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeAntChainTransactionStatisticsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeAntChainTransactionStatisticsResponseBodyResult extends TeaModel {
        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("CreatTime")
        public Long creatTime;

        @NameInMap("Dt")
        public Long dt;

        @NameInMap("LastSumBlockHeight")
        public Long lastSumBlockHeight;

        @NameInMap("TransCount")
        public Long transCount;

        public static DescribeAntChainTransactionStatisticsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainTransactionStatisticsResponseBodyResult self = new DescribeAntChainTransactionStatisticsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainTransactionStatisticsResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainTransactionStatisticsResponseBodyResult setCreatTime(Long creatTime) {
            this.creatTime = creatTime;
            return this;
        }
        public Long getCreatTime() {
            return this.creatTime;
        }

        public DescribeAntChainTransactionStatisticsResponseBodyResult setDt(Long dt) {
            this.dt = dt;
            return this;
        }
        public Long getDt() {
            return this.dt;
        }

        public DescribeAntChainTransactionStatisticsResponseBodyResult setLastSumBlockHeight(Long lastSumBlockHeight) {
            this.lastSumBlockHeight = lastSumBlockHeight;
            return this;
        }
        public Long getLastSumBlockHeight() {
            return this.lastSumBlockHeight;
        }

        public DescribeAntChainTransactionStatisticsResponseBodyResult setTransCount(Long transCount) {
            this.transCount = transCount;
            return this;
        }
        public Long getTransCount() {
            return this.transCount;
        }

    }

}
