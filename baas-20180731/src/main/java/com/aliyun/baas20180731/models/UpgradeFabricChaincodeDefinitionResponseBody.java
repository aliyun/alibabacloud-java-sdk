// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpgradeFabricChaincodeDefinitionResponseBody extends TeaModel {
    @NameInMap("ChaincodeDefinitionId")
    public String chaincodeDefinitionId;

    @NameInMap("ChaincodePackageId")
    public String chaincodePackageId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("InitRequired")
    public Boolean initRequired;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpgradeFabricChaincodeDefinitionResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static UpgradeFabricChaincodeDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeFabricChaincodeDefinitionResponseBody self = new UpgradeFabricChaincodeDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeFabricChaincodeDefinitionResponseBody setChaincodeDefinitionId(String chaincodeDefinitionId) {
        this.chaincodeDefinitionId = chaincodeDefinitionId;
        return this;
    }
    public String getChaincodeDefinitionId() {
        return this.chaincodeDefinitionId;
    }

    public UpgradeFabricChaincodeDefinitionResponseBody setChaincodePackageId(String chaincodePackageId) {
        this.chaincodePackageId = chaincodePackageId;
        return this;
    }
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
    }

    public UpgradeFabricChaincodeDefinitionResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public UpgradeFabricChaincodeDefinitionResponseBody setInitRequired(Boolean initRequired) {
        this.initRequired = initRequired;
        return this;
    }
    public Boolean getInitRequired() {
        return this.initRequired;
    }

    public UpgradeFabricChaincodeDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeFabricChaincodeDefinitionResponseBody setResult(UpgradeFabricChaincodeDefinitionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpgradeFabricChaincodeDefinitionResponseBodyResult getResult() {
        return this.result;
    }

    public UpgradeFabricChaincodeDefinitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpgradeFabricChaincodeDefinitionResponseBodyResult extends TeaModel {
        @NameInMap("ChaincodeId")
        public String chaincodeId;

        @NameInMap("ChaincodeVersion")
        public String chaincodeVersion;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeployTime")
        public String deployTime;

        @NameInMap("EndorsePolicy")
        public String endorsePolicy;

        @NameInMap("Input")
        public String input;

        @NameInMap("Install")
        public Boolean install;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        @NameInMap("ProviderId")
        public String providerId;

        @NameInMap("ProviderName")
        public String providerName;

        @NameInMap("State")
        public String state;

        @NameInMap("Type")
        public Integer type;

        public static UpgradeFabricChaincodeDefinitionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpgradeFabricChaincodeDefinitionResponseBodyResult self = new UpgradeFabricChaincodeDefinitionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setChaincodeVersion(String chaincodeVersion) {
            this.chaincodeVersion = chaincodeVersion;
            return this;
        }
        public String getChaincodeVersion() {
            return this.chaincodeVersion;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setEndorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setInstall(Boolean install) {
            this.install = install;
            return this;
        }
        public Boolean getInstall() {
            return this.install;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpgradeFabricChaincodeDefinitionResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
