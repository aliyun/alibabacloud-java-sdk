// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMySuccessfulApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeMySuccessfulApplicationResponseBodyResult> result;

    public static DescribeMySuccessfulApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMySuccessfulApplicationResponseBody self = new DescribeMySuccessfulApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMySuccessfulApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMySuccessfulApplicationResponseBody setResult(java.util.List<DescribeMySuccessfulApplicationResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeMySuccessfulApplicationResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeMySuccessfulApplicationResponseBodyResultNodeInfoList extends TeaModel {
        @NameInMap("BlockHeight")
        public Long blockHeight;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Version")
        public String version;

        public static DescribeMySuccessfulApplicationResponseBodyResultNodeInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMySuccessfulApplicationResponseBodyResultNodeInfoList self = new DescribeMySuccessfulApplicationResponseBodyResultNodeInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeMySuccessfulApplicationResponseBodyResultNodeInfoList setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeMySuccessfulApplicationResponseBodyResultNodeInfoList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeMySuccessfulApplicationResponseBodyResultNodeInfoList setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeMySuccessfulApplicationResponseBodyResultNodeInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeMySuccessfulApplicationResponseBodyResult extends TeaModel {
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
        public java.util.List<DescribeMySuccessfulApplicationResponseBodyResultNodeInfoList> nodeInfoList;

        @NameInMap("NodeNumber")
        public Integer nodeNumber;

        @NameInMap("Normal")
        public Boolean normal;

        @NameInMap("TransactionSum")
        public Integer transactionSum;

        @NameInMap("Version")
        public String version;

        public static DescribeMySuccessfulApplicationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeMySuccessfulApplicationResponseBodyResult self = new DescribeMySuccessfulApplicationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeMySuccessfulApplicationResponseBodyResult setAbnormalNodes(Integer abnormalNodes) {
            this.abnormalNodes = abnormalNodes;
            return this;
        }
        public Integer getAbnormalNodes() {
            return this.abnormalNodes;
        }

        public DescribeMySuccessfulApplicationResponseBodyResult setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public DescribeMySuccessfulApplicationResponseBodyResult setBlockHeight(Integer blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Integer getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeMySuccessfulApplicationResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeMySuccessfulApplicationResponseBodyResult setIsRole(Boolean isRole) {
            this.isRole = isRole;
            return this;
        }
        public Boolean getIsRole() {
            return this.isRole;
        }

        public DescribeMySuccessfulApplicationResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMySuccessfulApplicationResponseBodyResult setNodeInfoList(java.util.List<DescribeMySuccessfulApplicationResponseBodyResultNodeInfoList> nodeInfoList) {
            this.nodeInfoList = nodeInfoList;
            return this;
        }
        public java.util.List<DescribeMySuccessfulApplicationResponseBodyResultNodeInfoList> getNodeInfoList() {
            return this.nodeInfoList;
        }

        public DescribeMySuccessfulApplicationResponseBodyResult setNodeNumber(Integer nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        public DescribeMySuccessfulApplicationResponseBodyResult setNormal(Boolean normal) {
            this.normal = normal;
            return this;
        }
        public Boolean getNormal() {
            return this.normal;
        }

        public DescribeMySuccessfulApplicationResponseBodyResult setTransactionSum(Integer transactionSum) {
            this.transactionSum = transactionSum;
            return this;
        }
        public Integer getTransactionSum() {
            return this.transactionSum;
        }

        public DescribeMySuccessfulApplicationResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
