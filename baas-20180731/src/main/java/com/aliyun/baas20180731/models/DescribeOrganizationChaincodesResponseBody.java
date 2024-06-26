// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationChaincodesResponseBody extends TeaModel {
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
    public java.util.List<DescribeOrganizationChaincodesResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeOrganizationChaincodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationChaincodesResponseBody self = new DescribeOrganizationChaincodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationChaincodesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeOrganizationChaincodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrganizationChaincodesResponseBody setResult(java.util.List<DescribeOrganizationChaincodesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeOrganizationChaincodesResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeOrganizationChaincodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOrganizationChaincodesResponseBodyResult extends TeaModel {
        @NameInMap("Binding")
        public Boolean binding;

        /**
         * <strong>example:</strong>
         * <p>code-sacc-1pr09q7jmo0np</p>
         */
        @NameInMap("ChaincodeId")
        public String chaincodeId;

        @NameInMap("ChaincodePackageId")
        public String chaincodePackageId;

        /**
         * <strong>example:</strong>
         * <p>chan-first-channel-31hlgpen5k5lig</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>first-channel</p>
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
         * <p>1533025590</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>uid-23425</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("DeployTime")
        public String deployTime;

        /**
         * <strong>example:</strong>
         * <p>OR (&#39;perf9141MSP.member&#39;)</p>
         */
        @NameInMap("EndorsePolicy")
        public String endorsePolicy;

        /**
         * <strong>example:</strong>
         * <p>Installed</p>
         */
        @NameInMap("Installed")
        public String installed;

        @NameInMap("Management")
        public Boolean management;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>mycc</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeOrganizationChaincodesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationChaincodesResponseBodyResult self = new DescribeOrganizationChaincodesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationChaincodesResponseBodyResult setBinding(Boolean binding) {
            this.binding = binding;
            return this;
        }
        public Boolean getBinding() {
            return this.binding;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setChaincodePackageId(String chaincodePackageId) {
            this.chaincodePackageId = chaincodePackageId;
            return this;
        }
        public String getChaincodePackageId() {
            return this.chaincodePackageId;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setEndorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }
        public String getEndorsePolicy() {
            return this.endorsePolicy;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setInstalled(String installed) {
            this.installed = installed;
            return this;
        }
        public String getInstalled() {
            return this.installed;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setManagement(Boolean management) {
            this.management = management;
            return this;
        }
        public Boolean getManagement() {
            return this.management;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeOrganizationChaincodesResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
