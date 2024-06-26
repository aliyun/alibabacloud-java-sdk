// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DestroyEthereumResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DestroyEthereumResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DestroyEthereumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DestroyEthereumResponseBody self = new DestroyEthereumResponseBody();
        return TeaModel.build(map, self);
    }

    public DestroyEthereumResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DestroyEthereumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DestroyEthereumResponseBody setResult(DestroyEthereumResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DestroyEthereumResponseBodyResult getResult() {
        return this.result;
    }

    public DestroyEthereumResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DestroyEthereumResponseBodyResult extends TeaModel {
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

        public static DestroyEthereumResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DestroyEthereumResponseBodyResult self = new DestroyEthereumResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DestroyEthereumResponseBodyResult setConsensus(String consensus) {
            this.consensus = consensus;
            return this;
        }
        public String getConsensus() {
            return this.consensus;
        }

        public DestroyEthereumResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DestroyEthereumResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DestroyEthereumResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DestroyEthereumResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DestroyEthereumResponseBodyResult setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DestroyEthereumResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DestroyEthereumResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
