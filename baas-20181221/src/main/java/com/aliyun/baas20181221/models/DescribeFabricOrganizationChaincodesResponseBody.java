// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationChaincodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricOrganizationChaincodesResponseBodyResult> result;

    public static DescribeFabricOrganizationChaincodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationChaincodesResponseBody self = new DescribeFabricOrganizationChaincodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationChaincodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricOrganizationChaincodesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricOrganizationChaincodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricOrganizationChaincodesResponseBody setResult(java.util.List<DescribeFabricOrganizationChaincodesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricOrganizationChaincodesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricOrganizationChaincodesResponseBodyResult extends TeaModel {
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

        @NameInMap("ChaincodeName")
        public String chaincodeName;

        @NameInMap("Installed")
        public String installed;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DeployTime")
        public String deployTime;

        @NameInMap("ChaincodeVersion")
        public String chaincodeVersion;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("ChannelId")
        public String channelId;

        public static DescribeFabricOrganizationChaincodesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationChaincodesResponseBodyResult self = new DescribeFabricOrganizationChaincodesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationChaincodesResponseBodyResult setEndorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        public DescribeFabricOrganizationChaincodesResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFabricOrganizationChaincodesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFabricOrganizationChaincodesResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public DescribeFabricOrganizationChaincodesResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeFabricOrganizationChaincodesResponseBodyResult setChaincodeName(String chaincodeName) {
            this.chaincodeName = chaincodeName;
            return this;
        }
        public String getChaincodeName() {
            return this.chaincodeName;
        }

        public DescribeFabricOrganizationChaincodesResponseBodyResult setInstalled(String installed) {
            this.installed = installed;
            return this;
        }
        public String getInstalled() {
            return this.installed;
        }

        public DescribeFabricOrganizationChaincodesResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeFabricOrganizationChaincodesResponseBodyResult setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public DescribeFabricOrganizationChaincodesResponseBodyResult setChaincodeVersion(String chaincodeVersion) {
            this.chaincodeVersion = chaincodeVersion;
            return this;
        }
        public String getChaincodeVersion() {
            return this.chaincodeVersion;
        }

        public DescribeFabricOrganizationChaincodesResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeFabricOrganizationChaincodesResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricOrganizationChaincodesResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

    }

}
