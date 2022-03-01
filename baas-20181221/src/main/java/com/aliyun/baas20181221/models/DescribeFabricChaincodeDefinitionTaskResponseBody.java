// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricChaincodeDefinitionTaskResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeFabricChaincodeDefinitionTaskResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricChaincodeDefinitionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChaincodeDefinitionTaskResponseBody self = new DescribeFabricChaincodeDefinitionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChaincodeDefinitionTaskResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricChaincodeDefinitionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricChaincodeDefinitionTaskResponseBody setResult(DescribeFabricChaincodeDefinitionTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFabricChaincodeDefinitionTaskResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeFabricChaincodeDefinitionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition extends TeaModel {
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

        @NameInMap("Uid")
        public String uid;

        @NameInMap("Version")
        public String version;

        public static DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition self = new DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition();
            return TeaModel.build(map, self);
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setChaincodePackageId(String chaincodePackageId) {
            this.chaincodePackageId = chaincodePackageId;
            return this;
        }
        public String getChaincodePackageId() {
            return this.chaincodePackageId;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setCollectionConfig(String collectionConfig) {
            this.collectionConfig = collectionConfig;
            return this;
        }
        public String getCollectionConfig() {
            return this.collectionConfig;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setEndorsementPolicy(String endorsementPolicy) {
            this.endorsementPolicy = endorsementPolicy;
            return this;
        }
        public String getEndorsementPolicy() {
            return this.endorsementPolicy;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setInitRequired(Boolean initRequired) {
            this.initRequired = initRequired;
            return this;
        }
        public Boolean getInitRequired() {
            return this.initRequired;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setSequence(Long sequence) {
            this.sequence = sequence;
            return this;
        }
        public Long getSequence() {
            return this.sequence;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeFabricChaincodeDefinitionTaskResponseBodyResultContent extends TeaModel {
        @NameInMap("ChaincodeDefinition")
        public DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition chaincodeDefinition;

        public static DescribeFabricChaincodeDefinitionTaskResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricChaincodeDefinitionTaskResponseBodyResultContent self = new DescribeFabricChaincodeDefinitionTaskResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResultContent setChaincodeDefinition(DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition chaincodeDefinition) {
            this.chaincodeDefinition = chaincodeDefinition;
            return this;
        }
        public DescribeFabricChaincodeDefinitionTaskResponseBodyResultContentChaincodeDefinition getChaincodeDefinition() {
            return this.chaincodeDefinition;
        }

    }

    public static class DescribeFabricChaincodeDefinitionTaskResponseBodyResult extends TeaModel {
        @NameInMap("Approvers")
        public java.util.List<String> approvers;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("Content")
        public DescribeFabricChaincodeDefinitionTaskResponseBodyResultContent content;

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

        public static DescribeFabricChaincodeDefinitionTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricChaincodeDefinitionTaskResponseBodyResult self = new DescribeFabricChaincodeDefinitionTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResult setApprovers(java.util.List<String> approvers) {
            this.approvers = approvers;
            return this;
        }
        public java.util.List<String> getApprovers() {
            return this.approvers;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResult setContent(DescribeFabricChaincodeDefinitionTaskResponseBodyResultContent content) {
            this.content = content;
            return this;
        }
        public DescribeFabricChaincodeDefinitionTaskResponseBodyResultContent getContent() {
            return this.content;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
