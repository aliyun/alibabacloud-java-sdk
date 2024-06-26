// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMySuccessAppliesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeMySuccessAppliesResponseBodyResult> result;

    public static DescribeMySuccessAppliesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMySuccessAppliesResponseBody self = new DescribeMySuccessAppliesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMySuccessAppliesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMySuccessAppliesResponseBody setResult(java.util.List<DescribeMySuccessAppliesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeMySuccessAppliesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeMySuccessAppliesResponseBodyResultNodeInfoList extends TeaModel {
        @NameInMap("BlockHeight")
        public Long blockHeight;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Version")
        public String version;

        public static DescribeMySuccessAppliesResponseBodyResultNodeInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMySuccessAppliesResponseBodyResultNodeInfoList self = new DescribeMySuccessAppliesResponseBodyResultNodeInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeMySuccessAppliesResponseBodyResultNodeInfoList setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeMySuccessAppliesResponseBodyResultNodeInfoList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeMySuccessAppliesResponseBodyResultNodeInfoList setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeMySuccessAppliesResponseBodyResultNodeInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeMySuccessAppliesResponseBodyResult extends TeaModel {
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

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeInfoList")
        public java.util.List<DescribeMySuccessAppliesResponseBodyResultNodeInfoList> nodeInfoList;

        @NameInMap("NodeNumber")
        public Integer nodeNumber;

        @NameInMap("Normal")
        public Boolean normal;

        @NameInMap("TransactionSum")
        public Integer transactionSum;

        @NameInMap("Version")
        public String version;

        public static DescribeMySuccessAppliesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeMySuccessAppliesResponseBodyResult self = new DescribeMySuccessAppliesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeMySuccessAppliesResponseBodyResult setAbnormalNodes(Integer abnormalNodes) {
            this.abnormalNodes = abnormalNodes;
            return this;
        }
        public Integer getAbnormalNodes() {
            return this.abnormalNodes;
        }

        public DescribeMySuccessAppliesResponseBodyResult setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public DescribeMySuccessAppliesResponseBodyResult setBlockHeight(Integer blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Integer getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeMySuccessAppliesResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeMySuccessAppliesResponseBodyResult setIsRole(Boolean isRole) {
            this.isRole = isRole;
            return this;
        }
        public Boolean getIsRole() {
            return this.isRole;
        }

        public DescribeMySuccessAppliesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMySuccessAppliesResponseBodyResult setNodeInfoList(java.util.List<DescribeMySuccessAppliesResponseBodyResultNodeInfoList> nodeInfoList) {
            this.nodeInfoList = nodeInfoList;
            return this;
        }
        public java.util.List<DescribeMySuccessAppliesResponseBodyResultNodeInfoList> getNodeInfoList() {
            return this.nodeInfoList;
        }

        public DescribeMySuccessAppliesResponseBodyResult setNodeNumber(Integer nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        public DescribeMySuccessAppliesResponseBodyResult setNormal(Boolean normal) {
            this.normal = normal;
            return this;
        }
        public Boolean getNormal() {
            return this.normal;
        }

        public DescribeMySuccessAppliesResponseBodyResult setTransactionSum(Integer transactionSum) {
            this.transactionSum = transactionSum;
            return this;
        }
        public Integer getTransactionSum() {
            return this.transactionSum;
        }

        public DescribeMySuccessAppliesResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
