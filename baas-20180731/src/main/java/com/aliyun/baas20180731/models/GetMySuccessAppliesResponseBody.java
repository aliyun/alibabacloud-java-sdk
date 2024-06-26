// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetMySuccessAppliesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetMySuccessAppliesResponseBodyResult> result;

    public static GetMySuccessAppliesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMySuccessAppliesResponseBody self = new GetMySuccessAppliesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMySuccessAppliesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMySuccessAppliesResponseBody setResult(java.util.List<GetMySuccessAppliesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetMySuccessAppliesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetMySuccessAppliesResponseBodyResultNodeInfoList extends TeaModel {
        @NameInMap("BlockHeight")
        public Long blockHeight;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Version")
        public String version;

        public static GetMySuccessAppliesResponseBodyResultNodeInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMySuccessAppliesResponseBodyResultNodeInfoList self = new GetMySuccessAppliesResponseBodyResultNodeInfoList();
            return TeaModel.build(map, self);
        }

        public GetMySuccessAppliesResponseBodyResultNodeInfoList setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public GetMySuccessAppliesResponseBodyResultNodeInfoList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetMySuccessAppliesResponseBodyResultNodeInfoList setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetMySuccessAppliesResponseBodyResultNodeInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetMySuccessAppliesResponseBodyResult extends TeaModel {
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
        public java.util.List<GetMySuccessAppliesResponseBodyResultNodeInfoList> nodeInfoList;

        @NameInMap("NodeNumber")
        public Integer nodeNumber;

        @NameInMap("Normal")
        public Boolean normal;

        @NameInMap("TransactionSum")
        public Integer transactionSum;

        @NameInMap("Version")
        public String version;

        public static GetMySuccessAppliesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMySuccessAppliesResponseBodyResult self = new GetMySuccessAppliesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMySuccessAppliesResponseBodyResult setAbnormalNodes(Integer abnormalNodes) {
            this.abnormalNodes = abnormalNodes;
            return this;
        }
        public Integer getAbnormalNodes() {
            return this.abnormalNodes;
        }

        public GetMySuccessAppliesResponseBodyResult setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public GetMySuccessAppliesResponseBodyResult setBlockHeight(Integer blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Integer getBlockHeight() {
            return this.blockHeight;
        }

        public GetMySuccessAppliesResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMySuccessAppliesResponseBodyResult setIsRole(Boolean isRole) {
            this.isRole = isRole;
            return this;
        }
        public Boolean getIsRole() {
            return this.isRole;
        }

        public GetMySuccessAppliesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMySuccessAppliesResponseBodyResult setNodeInfoList(java.util.List<GetMySuccessAppliesResponseBodyResultNodeInfoList> nodeInfoList) {
            this.nodeInfoList = nodeInfoList;
            return this;
        }
        public java.util.List<GetMySuccessAppliesResponseBodyResultNodeInfoList> getNodeInfoList() {
            return this.nodeInfoList;
        }

        public GetMySuccessAppliesResponseBodyResult setNodeNumber(Integer nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        public GetMySuccessAppliesResponseBodyResult setNormal(Boolean normal) {
            this.normal = normal;
            return this;
        }
        public Boolean getNormal() {
            return this.normal;
        }

        public GetMySuccessAppliesResponseBodyResult setTransactionSum(Integer transactionSum) {
            this.transactionSum = transactionSum;
            return this;
        }
        public Integer getTransactionSum() {
            return this.transactionSum;
        }

        public GetMySuccessAppliesResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
