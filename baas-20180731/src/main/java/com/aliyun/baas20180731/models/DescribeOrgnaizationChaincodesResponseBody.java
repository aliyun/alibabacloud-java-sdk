// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrgnaizationChaincodesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeOrgnaizationChaincodesResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeOrgnaizationChaincodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgnaizationChaincodesResponseBody self = new DescribeOrgnaizationChaincodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrgnaizationChaincodesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeOrgnaizationChaincodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrgnaizationChaincodesResponseBody setResult(java.util.List<DescribeOrgnaizationChaincodesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeOrgnaizationChaincodesResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeOrgnaizationChaincodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOrgnaizationChaincodesResponseBodyResult extends TeaModel {
        @NameInMap("ChaincodeId")
        public String chaincodeId;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelName")
        public String channelName;

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

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("Version")
        public String version;

        public static DescribeOrgnaizationChaincodesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrgnaizationChaincodesResponseBodyResult self = new DescribeOrgnaizationChaincodesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeOrgnaizationChaincodesResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public DescribeOrgnaizationChaincodesResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeOrgnaizationChaincodesResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeOrgnaizationChaincodesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOrgnaizationChaincodesResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeOrgnaizationChaincodesResponseBodyResult setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public DescribeOrgnaizationChaincodesResponseBodyResult setEndorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        public DescribeOrgnaizationChaincodesResponseBodyResult setInstalled(String installed) {
            this.installed = installed;
            return this;
        }
        public String getInstalled() {
            return this.installed;
        }

        public DescribeOrgnaizationChaincodesResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeOrgnaizationChaincodesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOrgnaizationChaincodesResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeOrgnaizationChaincodesResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
