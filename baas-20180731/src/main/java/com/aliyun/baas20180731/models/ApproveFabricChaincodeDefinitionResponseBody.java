// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApproveFabricChaincodeDefinitionResponseBody extends TeaModel {
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
    public ApproveFabricChaincodeDefinitionResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static ApproveFabricChaincodeDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApproveFabricChaincodeDefinitionResponseBody self = new ApproveFabricChaincodeDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public ApproveFabricChaincodeDefinitionResponseBody setChaincodeDefinitionId(String chaincodeDefinitionId) {
        this.chaincodeDefinitionId = chaincodeDefinitionId;
        return this;
    }
    public String getChaincodeDefinitionId() {
        return this.chaincodeDefinitionId;
    }

    public ApproveFabricChaincodeDefinitionResponseBody setChaincodePackageId(String chaincodePackageId) {
        this.chaincodePackageId = chaincodePackageId;
        return this;
    }
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
    }

    public ApproveFabricChaincodeDefinitionResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ApproveFabricChaincodeDefinitionResponseBody setInitRequired(Boolean initRequired) {
        this.initRequired = initRequired;
        return this;
    }
    public Boolean getInitRequired() {
        return this.initRequired;
    }

    public ApproveFabricChaincodeDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApproveFabricChaincodeDefinitionResponseBody setResult(ApproveFabricChaincodeDefinitionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ApproveFabricChaincodeDefinitionResponseBodyResult getResult() {
        return this.result;
    }

    public ApproveFabricChaincodeDefinitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApproveFabricChaincodeDefinitionResponseBodyResult extends TeaModel {
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

        public static ApproveFabricChaincodeDefinitionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ApproveFabricChaincodeDefinitionResponseBodyResult self = new ApproveFabricChaincodeDefinitionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setEndorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setInstall(Boolean install) {
            this.install = install;
            return this;
        }
        public Boolean getInstall() {
            return this.install;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ApproveFabricChaincodeDefinitionResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
