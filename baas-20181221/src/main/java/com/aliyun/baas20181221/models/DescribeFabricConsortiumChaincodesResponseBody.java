// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumChaincodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricConsortiumChaincodesResponseBodyResult> result;

    public static DescribeFabricConsortiumChaincodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumChaincodesResponseBody self = new DescribeFabricConsortiumChaincodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumChaincodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumChaincodesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumChaincodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricConsortiumChaincodesResponseBody setResult(java.util.List<DescribeFabricConsortiumChaincodesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricConsortiumChaincodesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricConsortiumChaincodesResponseBodyResult extends TeaModel {
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

        @NameInMap("Input")
        public String input;

        @NameInMap("Install")
        public Boolean install;

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

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("Path")
        public String path;

        public static DescribeFabricConsortiumChaincodesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumChaincodesResponseBodyResult self = new DescribeFabricConsortiumChaincodesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setEndorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setChaincodeName(String chaincodeName) {
            this.chaincodeName = chaincodeName;
            return this;
        }
        public String getChaincodeName() {
            return this.chaincodeName;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setInstall(Boolean install) {
            this.install = install;
            return this;
        }
        public Boolean getInstall() {
            return this.install;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setChaincodeVersion(String chaincodeVersion) {
            this.chaincodeVersion = chaincodeVersion;
            return this;
        }
        public String getChaincodeVersion() {
            return this.chaincodeVersion;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeFabricConsortiumChaincodesResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
