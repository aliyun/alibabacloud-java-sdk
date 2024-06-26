// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChannelChaincodesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeChannelChaincodesResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeChannelChaincodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelChaincodesResponseBody self = new DescribeChannelChaincodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelChaincodesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeChannelChaincodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChannelChaincodesResponseBody setResult(java.util.List<DescribeChannelChaincodesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeChannelChaincodesResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeChannelChaincodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeChannelChaincodesResponseBodyResult extends TeaModel {
        @NameInMap("Binding")
        public Boolean binding;

        @NameInMap("ChaincodeId")
        public String chaincodeId;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DeployTime")
        public String deployTime;

        @NameInMap("EndorsePolicy")
        public String endorsePolicy;

        @NameInMap("Installed")
        public String installed;

        @NameInMap("Management")
        public Boolean management;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("Version")
        public String version;

        public static DescribeChannelChaincodesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelChaincodesResponseBodyResult self = new DescribeChannelChaincodesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeChannelChaincodesResponseBodyResult setBinding(Boolean binding) {
            this.binding = binding;
            return this;
        }
        public Boolean getBinding() {
            return this.binding;
        }

        public DescribeChannelChaincodesResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public DescribeChannelChaincodesResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeChannelChaincodesResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeChannelChaincodesResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeChannelChaincodesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeChannelChaincodesResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeChannelChaincodesResponseBodyResult setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public DescribeChannelChaincodesResponseBodyResult setEndorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        public DescribeChannelChaincodesResponseBodyResult setInstalled(String installed) {
            this.installed = installed;
            return this;
        }
        public String getInstalled() {
            return this.installed;
        }

        public DescribeChannelChaincodesResponseBodyResult setManagement(Boolean management) {
            this.management = management;
            return this;
        }
        public Boolean getManagement() {
            return this.management;
        }

        public DescribeChannelChaincodesResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeChannelChaincodesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeChannelChaincodesResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeChannelChaincodesResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
