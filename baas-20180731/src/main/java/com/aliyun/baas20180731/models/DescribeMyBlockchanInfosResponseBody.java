// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMyBlockchanInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeMyBlockchanInfosResponseBodyResult> result;

    public static DescribeMyBlockchanInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMyBlockchanInfosResponseBody self = new DescribeMyBlockchanInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMyBlockchanInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMyBlockchanInfosResponseBody setResult(java.util.List<DescribeMyBlockchanInfosResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeMyBlockchanInfosResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeMyBlockchanInfosResponseBodyResultNodeInfoList extends TeaModel {
        @NameInMap("BlockHeight")
        public Long blockHeight;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Version")
        public String version;

        public static DescribeMyBlockchanInfosResponseBodyResultNodeInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyBlockchanInfosResponseBodyResultNodeInfoList self = new DescribeMyBlockchanInfosResponseBodyResultNodeInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeMyBlockchanInfosResponseBodyResultNodeInfoList setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeMyBlockchanInfosResponseBodyResultNodeInfoList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeMyBlockchanInfosResponseBodyResultNodeInfoList setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeMyBlockchanInfosResponseBodyResultNodeInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeMyBlockchanInfosResponseBodyResult extends TeaModel {
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
        public java.util.List<DescribeMyBlockchanInfosResponseBodyResultNodeInfoList> nodeInfoList;

        @NameInMap("NodeNumber")
        public Integer nodeNumber;

        @NameInMap("Normal")
        public Boolean normal;

        @NameInMap("TransactionSum")
        public Integer transactionSum;

        @NameInMap("Version")
        public String version;

        public static DescribeMyBlockchanInfosResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyBlockchanInfosResponseBodyResult self = new DescribeMyBlockchanInfosResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeMyBlockchanInfosResponseBodyResult setAbnormalNodes(Integer abnormalNodes) {
            this.abnormalNodes = abnormalNodes;
            return this;
        }
        public Integer getAbnormalNodes() {
            return this.abnormalNodes;
        }

        public DescribeMyBlockchanInfosResponseBodyResult setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public DescribeMyBlockchanInfosResponseBodyResult setBlockHeight(Integer blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Integer getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeMyBlockchanInfosResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeMyBlockchanInfosResponseBodyResult setIsRole(Boolean isRole) {
            this.isRole = isRole;
            return this;
        }
        public Boolean getIsRole() {
            return this.isRole;
        }

        public DescribeMyBlockchanInfosResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMyBlockchanInfosResponseBodyResult setNodeInfoList(java.util.List<DescribeMyBlockchanInfosResponseBodyResultNodeInfoList> nodeInfoList) {
            this.nodeInfoList = nodeInfoList;
            return this;
        }
        public java.util.List<DescribeMyBlockchanInfosResponseBodyResultNodeInfoList> getNodeInfoList() {
            return this.nodeInfoList;
        }

        public DescribeMyBlockchanInfosResponseBodyResult setNodeNumber(Integer nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        public DescribeMyBlockchanInfosResponseBodyResult setNormal(Boolean normal) {
            this.normal = normal;
            return this;
        }
        public Boolean getNormal() {
            return this.normal;
        }

        public DescribeMyBlockchanInfosResponseBodyResult setTransactionSum(Integer transactionSum) {
            this.transactionSum = transactionSum;
            return this;
        }
        public Integer getTransactionSum() {
            return this.transactionSum;
        }

        public DescribeMyBlockchanInfosResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
