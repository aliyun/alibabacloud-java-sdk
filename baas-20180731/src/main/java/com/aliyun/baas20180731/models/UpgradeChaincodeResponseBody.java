// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpgradeChaincodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>A6CC6C63-2D71-4D0C-AEBE-E95F0127C514</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpgradeChaincodeResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpgradeChaincodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeChaincodeResponseBody self = new UpgradeChaincodeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeChaincodeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public UpgradeChaincodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeChaincodeResponseBody setResult(UpgradeChaincodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpgradeChaincodeResponseBodyResult getResult() {
        return this.result;
    }

    public UpgradeChaincodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpgradeChaincodeResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>code-sacc-fk9z4r97****</p>
         */
        @NameInMap("ChaincodeId")
        public String chaincodeId;

        /**
         * <strong>example:</strong>
         * <p>cc</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <strong>example:</strong>
         * <p>consortium-supplychain-1pxzsp5tb****</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p>1545215617000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1545215617000</p>
         */
        @NameInMap("DeployTime")
        public String deployTime;

        /**
         * <strong>example:</strong>
         * <p>OR (&quot;wholesalerMSP.peer&quot;)</p>
         */
        @NameInMap("EndorsePolicy")
        public String endorsePolicy;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Install")
        public Boolean install;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
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
         * <p>github.com/sacc</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>1928592</p>
         */
        @NameInMap("ProviderId")
        public String providerId;

        /**
         * <strong>example:</strong>
         * <p>uid-1928592</p>
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

        public static UpgradeChaincodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpgradeChaincodeResponseBodyResult self = new UpgradeChaincodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpgradeChaincodeResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public UpgradeChaincodeResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public UpgradeChaincodeResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public UpgradeChaincodeResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpgradeChaincodeResponseBodyResult setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public UpgradeChaincodeResponseBodyResult setEndorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        public UpgradeChaincodeResponseBodyResult setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public UpgradeChaincodeResponseBodyResult setInstall(Boolean install) {
            this.install = install;
            return this;
        }
        public Boolean getInstall() {
            return this.install;
        }

        public UpgradeChaincodeResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpgradeChaincodeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpgradeChaincodeResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpgradeChaincodeResponseBodyResult setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public UpgradeChaincodeResponseBodyResult setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public UpgradeChaincodeResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpgradeChaincodeResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public UpgradeChaincodeResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
