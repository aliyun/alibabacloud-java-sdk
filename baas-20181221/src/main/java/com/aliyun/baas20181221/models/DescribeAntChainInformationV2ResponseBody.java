// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainInformationV2ResponseBody extends TeaModel {
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
    public DescribeAntChainInformationV2ResponseBodyResult result;

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

    public static DescribeAntChainInformationV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainInformationV2ResponseBody self = new DescribeAntChainInformationV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainInformationV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainInformationV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainInformationV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainInformationV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainInformationV2ResponseBody setResult(DescribeAntChainInformationV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainInformationV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainInformationV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainInformationV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainInformationV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainInformationV2ResponseBodyResultNodeInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>259988</p>
         */
        @NameInMap("BlockHeight")
        public Long blockHeight;

        /**
         * <strong>example:</strong>
         * <p>8.136.158.115 18130</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        /**
         * <strong>example:</strong>
         * <p>0.10</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeAntChainInformationV2ResponseBodyResultNodeInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainInformationV2ResponseBodyResultNodeInfos self = new DescribeAntChainInformationV2ResponseBodyResultNodeInfos();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainInformationV2ResponseBodyResultNodeInfos setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeAntChainInformationV2ResponseBodyResultNodeInfos setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeAntChainInformationV2ResponseBodyResultNodeInfos setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeAntChainInformationV2ResponseBodyResultNodeInfos setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAntChainInformationV2ResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AbnormalNodes")
        public Integer abnormalNodes;

        /**
         * <strong>example:</strong>
         * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
         */
        @NameInMap("AntChainId")
        public String antChainId;

        /**
         * <strong>example:</strong>
         * <p>259988</p>
         */
        @NameInMap("BlockHeight")
        public Integer blockHeight;

        /**
         * <strong>example:</strong>
         * <p>1609221924000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsRole")
        public Boolean isRole;

        @NameInMap("NodeInfos")
        public java.util.List<DescribeAntChainInformationV2ResponseBodyResultNodeInfos> nodeInfos;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("NodeNumber")
        public Integer nodeNumber;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Normal")
        public Boolean normal;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("TransactionSum")
        public Integer transactionSum;

        /**
         * <strong>example:</strong>
         * <p>0.10</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeAntChainInformationV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainInformationV2ResponseBodyResult self = new DescribeAntChainInformationV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainInformationV2ResponseBodyResult setAbnormalNodes(Integer abnormalNodes) {
            this.abnormalNodes = abnormalNodes;
            return this;
        }
        public Integer getAbnormalNodes() {
            return this.abnormalNodes;
        }

        public DescribeAntChainInformationV2ResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainInformationV2ResponseBodyResult setBlockHeight(Integer blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Integer getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeAntChainInformationV2ResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainInformationV2ResponseBodyResult setIsRole(Boolean isRole) {
            this.isRole = isRole;
            return this;
        }
        public Boolean getIsRole() {
            return this.isRole;
        }

        public DescribeAntChainInformationV2ResponseBodyResult setNodeInfos(java.util.List<DescribeAntChainInformationV2ResponseBodyResultNodeInfos> nodeInfos) {
            this.nodeInfos = nodeInfos;
            return this;
        }
        public java.util.List<DescribeAntChainInformationV2ResponseBodyResultNodeInfos> getNodeInfos() {
            return this.nodeInfos;
        }

        public DescribeAntChainInformationV2ResponseBodyResult setNodeNumber(Integer nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        public DescribeAntChainInformationV2ResponseBodyResult setNormal(Boolean normal) {
            this.normal = normal;
            return this;
        }
        public Boolean getNormal() {
            return this.normal;
        }

        public DescribeAntChainInformationV2ResponseBodyResult setTransactionSum(Integer transactionSum) {
            this.transactionSum = transactionSum;
            return this;
        }
        public Integer getTransactionSum() {
            return this.transactionSum;
        }

        public DescribeAntChainInformationV2ResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
