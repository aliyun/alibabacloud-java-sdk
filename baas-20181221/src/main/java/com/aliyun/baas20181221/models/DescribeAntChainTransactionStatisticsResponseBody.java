// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E93884AC-6C21-4FEA-8E3A-7377D33B194F</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>pYogqb9v</p>
         */
        @NameInMap("AntChainId")
        public String antChainId;

        /**
         * <strong>example:</strong>
         * <p>1563294007000</p>
         */
        @NameInMap("CreatTime")
        public Long creatTime;

        /**
         * <strong>example:</strong>
         * <p>2019-07-16</p>
         */
        @NameInMap("Dt")
        public String dt;

        /**
         * <strong>example:</strong>
         * <p>148018</p>
         */
        @NameInMap("LastSumBlockHeight")
        public Long lastSumBlockHeight;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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

        public DescribeAntChainTransactionStatisticsResponseBodyResult setDt(String dt) {
            this.dt = dt;
            return this;
        }
        public String getDt() {
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
