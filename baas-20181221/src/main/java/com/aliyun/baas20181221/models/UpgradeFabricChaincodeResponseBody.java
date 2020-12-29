// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpgradeFabricChaincodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public UpgradeFabricChaincodeResponseBodyResult result;

    public static UpgradeFabricChaincodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeFabricChaincodeResponseBody self = new UpgradeFabricChaincodeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeFabricChaincodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeFabricChaincodeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public UpgradeFabricChaincodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpgradeFabricChaincodeResponseBody setResult(UpgradeFabricChaincodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpgradeFabricChaincodeResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpgradeFabricChaincodeResponseBodyResult extends TeaModel {
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

        public static UpgradeFabricChaincodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpgradeFabricChaincodeResponseBodyResult self = new UpgradeFabricChaincodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpgradeFabricChaincodeResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public UpgradeFabricChaincodeResponseBodyResult setEndorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        public UpgradeFabricChaincodeResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpgradeFabricChaincodeResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpgradeFabricChaincodeResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public UpgradeFabricChaincodeResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpgradeFabricChaincodeResponseBodyResult setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public UpgradeFabricChaincodeResponseBodyResult setChaincodeName(String chaincodeName) {
            this.chaincodeName = chaincodeName;
            return this;
        }
        public String getChaincodeName() {
            return this.chaincodeName;
        }

        public UpgradeFabricChaincodeResponseBodyResult setInstall(Boolean install) {
            this.install = install;
            return this;
        }
        public Boolean getInstall() {
            return this.install;
        }

        public UpgradeFabricChaincodeResponseBodyResult setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public UpgradeFabricChaincodeResponseBodyResult setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public UpgradeFabricChaincodeResponseBodyResult setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public UpgradeFabricChaincodeResponseBodyResult setChaincodeVersion(String chaincodeVersion) {
            this.chaincodeVersion = chaincodeVersion;
            return this;
        }
        public String getChaincodeVersion() {
            return this.chaincodeVersion;
        }

        public UpgradeFabricChaincodeResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public UpgradeFabricChaincodeResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public UpgradeFabricChaincodeResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
