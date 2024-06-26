// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionStatisticsNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeAntChainTransactionStatisticsNewResponseBodyResult> result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainTransactionStatisticsNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionStatisticsNewResponseBody self = new DescribeAntChainTransactionStatisticsNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionStatisticsNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainTransactionStatisticsNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainTransactionStatisticsNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainTransactionStatisticsNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainTransactionStatisticsNewResponseBody setResult(java.util.List<DescribeAntChainTransactionStatisticsNewResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeAntChainTransactionStatisticsNewResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeAntChainTransactionStatisticsNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainTransactionStatisticsNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainTransactionStatisticsNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainTransactionStatisticsNewResponseBodyResult extends TeaModel {
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

        public static DescribeAntChainTransactionStatisticsNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainTransactionStatisticsNewResponseBodyResult self = new DescribeAntChainTransactionStatisticsNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainTransactionStatisticsNewResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainTransactionStatisticsNewResponseBodyResult setCreatTime(Long creatTime) {
            this.creatTime = creatTime;
            return this;
        }
        public Long getCreatTime() {
            return this.creatTime;
        }

        public DescribeAntChainTransactionStatisticsNewResponseBodyResult setDt(Long dt) {
            this.dt = dt;
            return this;
        }
        public Long getDt() {
            return this.dt;
        }

        public DescribeAntChainTransactionStatisticsNewResponseBodyResult setLastSumBlockHeight(Long lastSumBlockHeight) {
            this.lastSumBlockHeight = lastSumBlockHeight;
            return this;
        }
        public Long getLastSumBlockHeight() {
            return this.lastSumBlockHeight;
        }

        public DescribeAntChainTransactionStatisticsNewResponseBodyResult setTransCount(Long transCount) {
            this.transCount = transCount;
            return this;
        }
        public Long getTransCount() {
            return this.transCount;
        }

    }

}
