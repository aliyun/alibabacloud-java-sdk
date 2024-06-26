// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumInvitaionResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeEthereumInvitaionResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEthereumInvitaionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumInvitaionResponseBody self = new DescribeEthereumInvitaionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumInvitaionResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeEthereumInvitaionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEthereumInvitaionResponseBody setResult(DescribeEthereumInvitaionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeEthereumInvitaionResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeEthereumInvitaionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEthereumInvitaionResponseBodyResult extends TeaModel {
        @NameInMap("Consensus")
        public String consensus;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetworkId")
        public String networkId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("State")
        public String state;

        public static DescribeEthereumInvitaionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEthereumInvitaionResponseBodyResult self = new DescribeEthereumInvitaionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeEthereumInvitaionResponseBodyResult setConsensus(String consensus) {
            this.consensus = consensus;
            return this;
        }
        public String getConsensus() {
            return this.consensus;
        }

        public DescribeEthereumInvitaionResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeEthereumInvitaionResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeEthereumInvitaionResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEthereumInvitaionResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEthereumInvitaionResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEthereumInvitaionResponseBodyResult setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeEthereumInvitaionResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEthereumInvitaionResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
