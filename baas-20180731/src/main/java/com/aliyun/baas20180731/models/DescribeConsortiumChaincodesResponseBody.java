// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumChaincodesResponseBody extends TeaModel {
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
    public java.util.List<DescribeConsortiumChaincodesResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeConsortiumChaincodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumChaincodesResponseBody self = new DescribeConsortiumChaincodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumChaincodesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeConsortiumChaincodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsortiumChaincodesResponseBody setResult(java.util.List<DescribeConsortiumChaincodesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeConsortiumChaincodesResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeConsortiumChaincodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeConsortiumChaincodesResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>code-sacc-1pr09q7jmo0np</p>
         */
        @NameInMap("ChaincodeId")
        public String chaincodeId;

        /**
         * <strong>example:</strong>
         * <p>chan-channelx-1l1hmckuuisxo</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>cname</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <strong>example:</strong>
         * <p>consortium-lianmenyumingyi-hc5d1bwlulg7</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
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
         * <p>true</p>
         */
        @NameInMap("Install")
        public Boolean install;

        @NameInMap("Management")
        public Boolean management;

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
         * <p>peers-aaaaaa2-1eqnj5o5w9dt3</p>
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
         * <p>Instantiatable</p>
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

        public static DescribeConsortiumChaincodesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsortiumChaincodesResponseBodyResult self = new DescribeConsortiumChaincodesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeConsortiumChaincodesResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setEndorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setInstall(Boolean install) {
            this.install = install;
            return this;
        }
        public Boolean getInstall() {
            return this.install;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setManagement(Boolean management) {
            this.management = management;
            return this;
        }
        public Boolean getManagement() {
            return this.management;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeConsortiumChaincodesResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
