// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainInformationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainInformationResponseBodyResult result;

    public static DescribeAntChainInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainInformationResponseBody self = new DescribeAntChainInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainInformationResponseBody setResult(DescribeAntChainInformationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainInformationResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainInformationResponseBodyResultNodeInfos extends TeaModel {
        @NameInMap("Status")
        public Boolean status;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Version")
        public String version;

        @NameInMap("BlockHeight")
        public Long blockHeight;

        public static DescribeAntChainInformationResponseBodyResultNodeInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainInformationResponseBodyResultNodeInfos self = new DescribeAntChainInformationResponseBodyResultNodeInfos();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainInformationResponseBodyResultNodeInfos setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeAntChainInformationResponseBodyResultNodeInfos setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeAntChainInformationResponseBodyResultNodeInfos setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeAntChainInformationResponseBodyResultNodeInfos setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

    }

    public static class DescribeAntChainInformationResponseBodyResult extends TeaModel {
        @NameInMap("TransactionSum")
        public Integer transactionSum;

        @NameInMap("Version")
        public String version;

        @NameInMap("BlockHeight")
        public Integer blockHeight;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("NodeNumber")
        public Integer nodeNumber;

        @NameInMap("AbnormalNodes")
        public Integer abnormalNodes;

        @NameInMap("NodeInfos")
        public java.util.List<DescribeAntChainInformationResponseBodyResultNodeInfos> nodeInfos;

        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("Normal")
        public Boolean normal;

        public static DescribeAntChainInformationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainInformationResponseBodyResult self = new DescribeAntChainInformationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainInformationResponseBodyResult setTransactionSum(Integer transactionSum) {
            this.transactionSum = transactionSum;
            return this;
        }
        public Integer getTransactionSum() {
            return this.transactionSum;
        }

        public DescribeAntChainInformationResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeAntChainInformationResponseBodyResult setBlockHeight(Integer blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Integer getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeAntChainInformationResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainInformationResponseBodyResult setNodeNumber(Integer nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        public DescribeAntChainInformationResponseBodyResult setAbnormalNodes(Integer abnormalNodes) {
            this.abnormalNodes = abnormalNodes;
            return this;
        }
        public Integer getAbnormalNodes() {
            return this.abnormalNodes;
        }

        public DescribeAntChainInformationResponseBodyResult setNodeInfos(java.util.List<DescribeAntChainInformationResponseBodyResultNodeInfos> nodeInfos) {
            this.nodeInfos = nodeInfos;
            return this;
        }
        public java.util.List<DescribeAntChainInformationResponseBodyResultNodeInfos> getNodeInfos() {
            return this.nodeInfos;
        }

        public DescribeAntChainInformationResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainInformationResponseBodyResult setNormal(Boolean normal) {
            this.normal = normal;
            return this;
        }
        public Boolean getNormal() {
            return this.normal;
        }

    }

}
