// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChaincodeDefinitionTaskResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeChaincodeDefinitionTaskResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeChaincodeDefinitionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChaincodeDefinitionTaskResponseBody self = new DescribeChaincodeDefinitionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChaincodeDefinitionTaskResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeChaincodeDefinitionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChaincodeDefinitionTaskResponseBody setResult(DescribeChaincodeDefinitionTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeChaincodeDefinitionTaskResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeChaincodeDefinitionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition extends TeaModel {
        @NameInMap("ChaincodePackageId")
        public String chaincodePackageId;

        @NameInMap("CollectionConfig")
        public String collectionConfig;

        @NameInMap("EndorsementPolicy")
        public String endorsementPolicy;

        @NameInMap("InitRequired")
        public Boolean initRequired;

        @NameInMap("Name")
        public String name;

        @NameInMap("Sequence")
        public Long sequence;

        @NameInMap("Version")
        public String version;

        public static DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition build(java.util.Map<String, ?> map) throws Exception {
            DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition self = new DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition();
            return TeaModel.build(map, self);
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setChaincodePackageId(String chaincodePackageId) {
            this.chaincodePackageId = chaincodePackageId;
            return this;
        }
        public String getChaincodePackageId() {
            return this.chaincodePackageId;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setCollectionConfig(String collectionConfig) {
            this.collectionConfig = collectionConfig;
            return this;
        }
        public String getCollectionConfig() {
            return this.collectionConfig;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setEndorsementPolicy(String endorsementPolicy) {
            this.endorsementPolicy = endorsementPolicy;
            return this;
        }
        public String getEndorsementPolicy() {
            return this.endorsementPolicy;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setInitRequired(Boolean initRequired) {
            this.initRequired = initRequired;
            return this;
        }
        public Boolean getInitRequired() {
            return this.initRequired;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setSequence(Long sequence) {
            this.sequence = sequence;
            return this;
        }
        public Long getSequence() {
            return this.sequence;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeChaincodeDefinitionTaskResponseBodyResultContent extends TeaModel {
        @NameInMap("ChaincodeDefinition")
        public DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition chaincodeDefinition;

        public static DescribeChaincodeDefinitionTaskResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeChaincodeDefinitionTaskResponseBodyResultContent self = new DescribeChaincodeDefinitionTaskResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResultContent setChaincodeDefinition(DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition chaincodeDefinition) {
            this.chaincodeDefinition = chaincodeDefinition;
            return this;
        }
        public DescribeChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition getChaincodeDefinition() {
            return this.chaincodeDefinition;
        }

    }

    public static class DescribeChaincodeDefinitionTaskResponseBodyResult extends TeaModel {
        @NameInMap("Approvers")
        public java.util.List<String> approvers;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("Content")
        public DescribeChaincodeDefinitionTaskResponseBodyResultContent content;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Type")
        public String type;

        public static DescribeChaincodeDefinitionTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeChaincodeDefinitionTaskResponseBodyResult self = new DescribeChaincodeDefinitionTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResult setApprovers(java.util.List<String> approvers) {
            this.approvers = approvers;
            return this;
        }
        public java.util.List<String> getApprovers() {
            return this.approvers;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResult setContent(DescribeChaincodeDefinitionTaskResponseBodyResultContent content) {
            this.content = content;
            return this;
        }
        public DescribeChaincodeDefinitionTaskResponseBodyResultContent getContent() {
            return this.content;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeChaincodeDefinitionTaskResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
