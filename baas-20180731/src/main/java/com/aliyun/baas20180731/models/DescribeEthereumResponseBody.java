// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeEthereumResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEthereumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumResponseBody self = new DescribeEthereumResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeEthereumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEthereumResponseBody setResult(DescribeEthereumResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeEthereumResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeEthereumResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEthereumResponseBodyResult extends TeaModel {
        @NameInMap("Consensus")
        public String consensus;

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

        public static DescribeEthereumResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEthereumResponseBodyResult self = new DescribeEthereumResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeEthereumResponseBodyResult setConsensus(String consensus) {
            this.consensus = consensus;
            return this;
        }
        public String getConsensus() {
            return this.consensus;
        }

        public DescribeEthereumResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeEthereumResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEthereumResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEthereumResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEthereumResponseBodyResult setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeEthereumResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEthereumResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
