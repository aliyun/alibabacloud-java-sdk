// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class SubmitFabricChaincodeDefinitionResponseBody extends TeaModel {
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
    public SubmitFabricChaincodeDefinitionResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitFabricChaincodeDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitFabricChaincodeDefinitionResponseBody self = new SubmitFabricChaincodeDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitFabricChaincodeDefinitionResponseBody setChaincodeDefinitionId(String chaincodeDefinitionId) {
        this.chaincodeDefinitionId = chaincodeDefinitionId;
        return this;
    }
    public String getChaincodeDefinitionId() {
        return this.chaincodeDefinitionId;
    }

    public SubmitFabricChaincodeDefinitionResponseBody setChaincodePackageId(String chaincodePackageId) {
        this.chaincodePackageId = chaincodePackageId;
        return this;
    }
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
    }

    public SubmitFabricChaincodeDefinitionResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public SubmitFabricChaincodeDefinitionResponseBody setInitRequired(Boolean initRequired) {
        this.initRequired = initRequired;
        return this;
    }
    public Boolean getInitRequired() {
        return this.initRequired;
    }

    public SubmitFabricChaincodeDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitFabricChaincodeDefinitionResponseBody setResult(SubmitFabricChaincodeDefinitionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SubmitFabricChaincodeDefinitionResponseBodyResult getResult() {
        return this.result;
    }

    public SubmitFabricChaincodeDefinitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitFabricChaincodeDefinitionResponseBodyResult extends TeaModel {
        @NameInMap("ChaincodeId")
        public String chaincodeId;

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

        @NameInMap("Version")
        public String version;

        public static SubmitFabricChaincodeDefinitionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitFabricChaincodeDefinitionResponseBodyResult self = new SubmitFabricChaincodeDefinitionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setEndorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setInstall(Boolean install) {
            this.install = install;
            return this;
        }
        public Boolean getInstall() {
            return this.install;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SubmitFabricChaincodeDefinitionResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
