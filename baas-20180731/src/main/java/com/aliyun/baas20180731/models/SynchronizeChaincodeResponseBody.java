// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class SynchronizeChaincodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public SynchronizeChaincodeResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SynchronizeChaincodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeChaincodeResponseBody self = new SynchronizeChaincodeResponseBody();
        return TeaModel.build(map, self);
    }

    public SynchronizeChaincodeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public SynchronizeChaincodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SynchronizeChaincodeResponseBody setResult(SynchronizeChaincodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SynchronizeChaincodeResponseBodyResult getResult() {
        return this.result;
    }

    public SynchronizeChaincodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SynchronizeChaincodeResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>code-sacc-1pr09q7jm****</p>
         */
        @NameInMap("ChaincodeId")
        public String chaincodeId;

        /**
         * <strong>example:</strong>
         * <p>chan-channelx-1l1hmckuuisxo</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <strong>example:</strong>
         * <p>consortium-lianmenyumingyi-hc5d1bwl****</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("DeployTime")
        public String deployTime;

        /**
         * <strong>example:</strong>
         * <p>OR (\&quot;aaaaaa1MSP.peer\&quot;)</p>
         */
        @NameInMap("EndorsePolicy")
        public String endorsePolicy;

        /**
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Install")
        public Boolean install;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>sacc</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>go-sdk-demo/chaincode/src</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>provider</p>
         */
        @NameInMap("ProviderId")
        public String providerId;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ProviderName")
        public String providerName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static SynchronizeChaincodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SynchronizeChaincodeResponseBodyResult self = new SynchronizeChaincodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SynchronizeChaincodeResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public SynchronizeChaincodeResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public SynchronizeChaincodeResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public SynchronizeChaincodeResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SynchronizeChaincodeResponseBodyResult setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public SynchronizeChaincodeResponseBodyResult setEndorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        public SynchronizeChaincodeResponseBodyResult setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public SynchronizeChaincodeResponseBodyResult setInstall(Boolean install) {
            this.install = install;
            return this;
        }
        public Boolean getInstall() {
            return this.install;
        }

        public SynchronizeChaincodeResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SynchronizeChaincodeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SynchronizeChaincodeResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public SynchronizeChaincodeResponseBodyResult setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public SynchronizeChaincodeResponseBodyResult setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public SynchronizeChaincodeResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SynchronizeChaincodeResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SynchronizeChaincodeResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
