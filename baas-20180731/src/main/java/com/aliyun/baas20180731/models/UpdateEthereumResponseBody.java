// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateEthereumResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateEthereumResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateEthereumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEthereumResponseBody self = new UpdateEthereumResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEthereumResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public UpdateEthereumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEthereumResponseBody setResult(UpdateEthereumResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateEthereumResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateEthereumResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateEthereumResponseBodyResult extends TeaModel {
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

        public static UpdateEthereumResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateEthereumResponseBodyResult self = new UpdateEthereumResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateEthereumResponseBodyResult setConsensus(String consensus) {
            this.consensus = consensus;
            return this;
        }
        public String getConsensus() {
            return this.consensus;
        }

        public UpdateEthereumResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public UpdateEthereumResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateEthereumResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateEthereumResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateEthereumResponseBodyResult setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public UpdateEthereumResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateEthereumResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
