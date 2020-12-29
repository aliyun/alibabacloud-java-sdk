// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricChaincodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public CreateFabricChaincodeResponseBodyResult result;

    public static CreateFabricChaincodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricChaincodeResponseBody self = new CreateFabricChaincodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFabricChaincodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFabricChaincodeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateFabricChaincodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateFabricChaincodeResponseBody setResult(CreateFabricChaincodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateFabricChaincodeResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateFabricChaincodeResponseBodyResult extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("EndorsePolicy")
        public String endorsePolicy;

        @NameInMap("State")
        public String state;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ChaincodeId")
        public String chaincodeId;

        @NameInMap("Message")
        public String message;

        @NameInMap("ProviderName")
        public String providerName;

        @NameInMap("ChaincodeName")
        public String chaincodeName;

        @NameInMap("Install")
        public Boolean install;

        @NameInMap("Input")
        public String input;

        @NameInMap("ProviderId")
        public String providerId;

        @NameInMap("DeployTime")
        public String deployTime;

        @NameInMap("ChaincodeVersion")
        public String chaincodeVersion;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("Path")
        public String path;

        public static CreateFabricChaincodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateFabricChaincodeResponseBodyResult self = new CreateFabricChaincodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateFabricChaincodeResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public CreateFabricChaincodeResponseBodyResult setEndorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        public CreateFabricChaincodeResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateFabricChaincodeResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateFabricChaincodeResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public CreateFabricChaincodeResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateFabricChaincodeResponseBodyResult setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public CreateFabricChaincodeResponseBodyResult setChaincodeName(String chaincodeName) {
            this.chaincodeName = chaincodeName;
            return this;
        }
        public String getChaincodeName() {
            return this.chaincodeName;
        }

        public CreateFabricChaincodeResponseBodyResult setInstall(Boolean install) {
            this.install = install;
            return this;
        }
        public Boolean getInstall() {
            return this.install;
        }

        public CreateFabricChaincodeResponseBodyResult setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public CreateFabricChaincodeResponseBodyResult setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public CreateFabricChaincodeResponseBodyResult setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public CreateFabricChaincodeResponseBodyResult setChaincodeVersion(String chaincodeVersion) {
            this.chaincodeVersion = chaincodeVersion;
            return this;
        }
        public String getChaincodeVersion() {
            return this.chaincodeVersion;
        }

        public CreateFabricChaincodeResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public CreateFabricChaincodeResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public CreateFabricChaincodeResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
