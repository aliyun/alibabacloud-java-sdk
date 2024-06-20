// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionStatisticsV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D68D66B6-1964-4073-8714-B49F5EF1AEFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeAntChainTransactionStatisticsV2ResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainTransactionStatisticsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionStatisticsV2ResponseBody self = new DescribeAntChainTransactionStatisticsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionStatisticsV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainTransactionStatisticsV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainTransactionStatisticsV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainTransactionStatisticsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainTransactionStatisticsV2ResponseBody setResult(java.util.List<DescribeAntChainTransactionStatisticsV2ResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeAntChainTransactionStatisticsV2ResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeAntChainTransactionStatisticsV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainTransactionStatisticsV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainTransactionStatisticsV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainTransactionStatisticsV2ResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
         */
        @NameInMap("AntChainId")
        public String antChainId;

        /**
         * <strong>example:</strong>
         * <p>1609258222000</p>
         */
        @NameInMap("CreatTime")
        public Long creatTime;

        /**
         * <strong>example:</strong>
         * <p>1609171200000</p>
         */
        @NameInMap("Dt")
        public Long dt;

        /**
         * <strong>example:</strong>
         * <p>11511</p>
         */
        @NameInMap("LastSumBlockHeight")
        public Long lastSumBlockHeight;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TransCount")
        public Long transCount;

        public static DescribeAntChainTransactionStatisticsV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainTransactionStatisticsV2ResponseBodyResult self = new DescribeAntChainTransactionStatisticsV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainTransactionStatisticsV2ResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainTransactionStatisticsV2ResponseBodyResult setCreatTime(Long creatTime) {
            this.creatTime = creatTime;
            return this;
        }
        public Long getCreatTime() {
            return this.creatTime;
        }

        public DescribeAntChainTransactionStatisticsV2ResponseBodyResult setDt(Long dt) {
            this.dt = dt;
            return this;
        }
        public Long getDt() {
            return this.dt;
        }

        public DescribeAntChainTransactionStatisticsV2ResponseBodyResult setLastSumBlockHeight(Long lastSumBlockHeight) {
            this.lastSumBlockHeight = lastSumBlockHeight;
            return this;
        }
        public Long getLastSumBlockHeight() {
            return this.lastSumBlockHeight;
        }

        public DescribeAntChainTransactionStatisticsV2ResponseBodyResult setTransCount(Long transCount) {
            this.transCount = transCount;
            return this;
        }
        public Long getTransCount() {
            return this.transCount;
        }

    }

}
