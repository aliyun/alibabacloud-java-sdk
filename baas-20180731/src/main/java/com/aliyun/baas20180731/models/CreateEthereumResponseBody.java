// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateEthereumResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateEthereumResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateEthereumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEthereumResponseBody self = new CreateEthereumResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEthereumResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateEthereumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEthereumResponseBody setResult(CreateEthereumResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateEthereumResponseBodyResult getResult() {
        return this.result;
    }

    public CreateEthereumResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEthereumResponseBodyResult extends TeaModel {
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

        public static CreateEthereumResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateEthereumResponseBodyResult self = new CreateEthereumResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateEthereumResponseBodyResult setConsensus(String consensus) {
            this.consensus = consensus;
            return this;
        }
        public String getConsensus() {
            return this.consensus;
        }

        public CreateEthereumResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateEthereumResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEthereumResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateEthereumResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEthereumResponseBodyResult setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public CreateEthereumResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateEthereumResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
