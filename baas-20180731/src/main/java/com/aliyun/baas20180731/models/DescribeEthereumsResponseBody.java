// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeEthereumsResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEthereumsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumsResponseBody self = new DescribeEthereumsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeEthereumsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEthereumsResponseBody setResult(java.util.List<DescribeEthereumsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeEthereumsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeEthereumsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEthereumsResponseBodyResult extends TeaModel {
        @NameInMap("Consensus")
        public String consensus;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deletable")
        public Boolean deletable;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetworkId")
        public String networkId;

        @NameInMap("NodeNumber")
        public Integer nodeNumber;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("State")
        public String state;

        public static DescribeEthereumsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEthereumsResponseBodyResult self = new DescribeEthereumsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeEthereumsResponseBodyResult setConsensus(String consensus) {
            this.consensus = consensus;
            return this;
        }
        public String getConsensus() {
            return this.consensus;
        }

        public DescribeEthereumsResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeEthereumsResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeEthereumsResponseBodyResult setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

        public DescribeEthereumsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEthereumsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEthereumsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEthereumsResponseBodyResult setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeEthereumsResponseBodyResult setNodeNumber(Integer nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        public DescribeEthereumsResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEthereumsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
