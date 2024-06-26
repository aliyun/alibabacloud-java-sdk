// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeBlockchainInfoResponseBodyResult result;

    public static DescribeBlockchainInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainInfoResponseBody self = new DescribeBlockchainInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlockchainInfoResponseBody setResult(DescribeBlockchainInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeBlockchainInfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeBlockchainInfoResponseBodyResultNodeInfoList extends TeaModel {
        @NameInMap("BlockHeight")
        public Long blockHeight;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Version")
        public String version;

        public static DescribeBlockchainInfoResponseBodyResultNodeInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainInfoResponseBodyResultNodeInfoList self = new DescribeBlockchainInfoResponseBodyResultNodeInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainInfoResponseBodyResultNodeInfoList setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeBlockchainInfoResponseBodyResultNodeInfoList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeBlockchainInfoResponseBodyResultNodeInfoList setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeBlockchainInfoResponseBodyResultNodeInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeBlockchainInfoResponseBodyResult extends TeaModel {
        @NameInMap("AbnormalNodes")
        public Integer abnormalNodes;

        @NameInMap("Bizid")
        public String bizid;

        @NameInMap("BlockHeight")
        public Integer blockHeight;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("IsRole")
        public Boolean isRole;

        @NameInMap("NodeInfoList")
        public java.util.List<DescribeBlockchainInfoResponseBodyResultNodeInfoList> nodeInfoList;

        @NameInMap("NodeNumber")
        public Integer nodeNumber;

        @NameInMap("Normal")
        public Boolean normal;

        @NameInMap("TransactionSum")
        public Integer transactionSum;

        @NameInMap("Version")
        public String version;

        public static DescribeBlockchainInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainInfoResponseBodyResult self = new DescribeBlockchainInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainInfoResponseBodyResult setAbnormalNodes(Integer abnormalNodes) {
            this.abnormalNodes = abnormalNodes;
            return this;
        }
        public Integer getAbnormalNodes() {
            return this.abnormalNodes;
        }

        public DescribeBlockchainInfoResponseBodyResult setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public DescribeBlockchainInfoResponseBodyResult setBlockHeight(Integer blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Integer getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeBlockchainInfoResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeBlockchainInfoResponseBodyResult setIsRole(Boolean isRole) {
            this.isRole = isRole;
            return this;
        }
        public Boolean getIsRole() {
            return this.isRole;
        }

        public DescribeBlockchainInfoResponseBodyResult setNodeInfoList(java.util.List<DescribeBlockchainInfoResponseBodyResultNodeInfoList> nodeInfoList) {
            this.nodeInfoList = nodeInfoList;
            return this;
        }
        public java.util.List<DescribeBlockchainInfoResponseBodyResultNodeInfoList> getNodeInfoList() {
            return this.nodeInfoList;
        }

        public DescribeBlockchainInfoResponseBodyResult setNodeNumber(Integer nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        public DescribeBlockchainInfoResponseBodyResult setNormal(Boolean normal) {
            this.normal = normal;
            return this;
        }
        public Boolean getNormal() {
            return this.normal;
        }

        public DescribeBlockchainInfoResponseBodyResult setTransactionSum(Integer transactionSum) {
            this.transactionSum = transactionSum;
            return this;
        }
        public Integer getTransactionSum() {
            return this.transactionSum;
        }

        public DescribeBlockchainInfoResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
