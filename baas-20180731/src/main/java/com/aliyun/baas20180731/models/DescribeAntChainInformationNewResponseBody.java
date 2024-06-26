// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainInformationNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainInformationNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainInformationNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainInformationNewResponseBody self = new DescribeAntChainInformationNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainInformationNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainInformationNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainInformationNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainInformationNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainInformationNewResponseBody setResult(DescribeAntChainInformationNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainInformationNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainInformationNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainInformationNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainInformationNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainInformationNewResponseBodyResultNodeInfos extends TeaModel {
        @NameInMap("BlockHeight")
        public Long blockHeight;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Version")
        public String version;

        public static DescribeAntChainInformationNewResponseBodyResultNodeInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainInformationNewResponseBodyResultNodeInfos self = new DescribeAntChainInformationNewResponseBodyResultNodeInfos();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainInformationNewResponseBodyResultNodeInfos setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeAntChainInformationNewResponseBodyResultNodeInfos setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeAntChainInformationNewResponseBodyResultNodeInfos setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeAntChainInformationNewResponseBodyResultNodeInfos setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAntChainInformationNewResponseBodyResult extends TeaModel {
        @NameInMap("AbnormalNodes")
        public Integer abnormalNodes;

        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("BlockHeight")
        public Integer blockHeight;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("IsRole")
        public Boolean isRole;

        @NameInMap("NodeInfos")
        public java.util.List<DescribeAntChainInformationNewResponseBodyResultNodeInfos> nodeInfos;

        @NameInMap("NodeNumber")
        public Integer nodeNumber;

        @NameInMap("Normal")
        public Boolean normal;

        @NameInMap("TransactionSum")
        public Integer transactionSum;

        @NameInMap("Version")
        public String version;

        public static DescribeAntChainInformationNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainInformationNewResponseBodyResult self = new DescribeAntChainInformationNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainInformationNewResponseBodyResult setAbnormalNodes(Integer abnormalNodes) {
            this.abnormalNodes = abnormalNodes;
            return this;
        }
        public Integer getAbnormalNodes() {
            return this.abnormalNodes;
        }

        public DescribeAntChainInformationNewResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainInformationNewResponseBodyResult setBlockHeight(Integer blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Integer getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeAntChainInformationNewResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainInformationNewResponseBodyResult setIsRole(Boolean isRole) {
            this.isRole = isRole;
            return this;
        }
        public Boolean getIsRole() {
            return this.isRole;
        }

        public DescribeAntChainInformationNewResponseBodyResult setNodeInfos(java.util.List<DescribeAntChainInformationNewResponseBodyResultNodeInfos> nodeInfos) {
            this.nodeInfos = nodeInfos;
            return this;
        }
        public java.util.List<DescribeAntChainInformationNewResponseBodyResultNodeInfos> getNodeInfos() {
            return this.nodeInfos;
        }

        public DescribeAntChainInformationNewResponseBodyResult setNodeNumber(Integer nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        public DescribeAntChainInformationNewResponseBodyResult setNormal(Boolean normal) {
            this.normal = normal;
            return this;
        }
        public Boolean getNormal() {
            return this.normal;
        }

        public DescribeAntChainInformationNewResponseBodyResult setTransactionSum(Integer transactionSum) {
            this.transactionSum = transactionSum;
            return this;
        }
        public Integer getTransactionSum() {
            return this.transactionSum;
        }

        public DescribeAntChainInformationNewResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
