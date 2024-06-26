// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DeleteGovernanceTaskResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteGovernanceTaskResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteGovernanceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGovernanceTaskResponseBody self = new DeleteGovernanceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGovernanceTaskResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DeleteGovernanceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteGovernanceTaskResponseBody setResult(DeleteGovernanceTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteGovernanceTaskResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteGovernanceTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public Integer port;

        public static DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers build(java.util.Map<String, ?> map) throws Exception {
            DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers self = new DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers();
            return TeaModel.build(map, self);
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Key")
        public String key;

        @NameInMap("Tlsroot")
        public String tlsroot;

        public static DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes build(java.util.Map<String, ?> map) throws Exception {
            DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes self = new DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes();
            return TeaModel.build(map, self);
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes setTlsroot(String tlsroot) {
            this.tlsroot = tlsroot;
            return this;
        }
        public String getTlsroot() {
            return this.tlsroot;
        }

    }

    public static class DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations extends TeaModel {
        @NameInMap("AnchorPeers")
        public java.util.List<DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers> anchorPeers;

        @NameInMap("Crls")
        public String crls;

        @NameInMap("MspId")
        public String mspId;

        @NameInMap("MspType")
        public String mspType;

        @NameInMap("Orderer")
        public Boolean orderer;

        @NameInMap("OrdererNodes")
        public java.util.List<DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes> ordererNodes;

        @NameInMap("RootCertificates")
        public String rootCertificates;

        @NameInMap("TlsRootCertificates")
        public String tlsRootCertificates;

        public static DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations build(java.util.Map<String, ?> map) throws Exception {
            DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations self = new DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations();
            return TeaModel.build(map, self);
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations setAnchorPeers(java.util.List<DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers> anchorPeers) {
            this.anchorPeers = anchorPeers;
            return this;
        }
        public java.util.List<DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers> getAnchorPeers() {
            return this.anchorPeers;
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations setCrls(String crls) {
            this.crls = crls;
            return this;
        }
        public String getCrls() {
            return this.crls;
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations setMspId(String mspId) {
            this.mspId = mspId;
            return this;
        }
        public String getMspId() {
            return this.mspId;
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations setMspType(String mspType) {
            this.mspType = mspType;
            return this;
        }
        public String getMspType() {
            return this.mspType;
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations setOrderer(Boolean orderer) {
            this.orderer = orderer;
            return this;
        }
        public Boolean getOrderer() {
            return this.orderer;
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations setOrdererNodes(java.util.List<DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes> ordererNodes) {
            this.ordererNodes = ordererNodes;
            return this;
        }
        public java.util.List<DeleteGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes> getOrdererNodes() {
            return this.ordererNodes;
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations setRootCertificates(String rootCertificates) {
            this.rootCertificates = rootCertificates;
            return this;
        }
        public String getRootCertificates() {
            return this.rootCertificates;
        }

        public DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations setTlsRootCertificates(String tlsRootCertificates) {
            this.tlsRootCertificates = tlsRootCertificates;
            return this;
        }
        public String getTlsRootCertificates() {
            return this.tlsRootCertificates;
        }

    }

    public static class DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs extends TeaModel {
        @NameInMap("Input")
        public String input;

        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Version")
        public String version;

        public static DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs build(java.util.Map<String, ?> map) throws Exception {
            DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs self = new DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs();
            return TeaModel.build(map, self);
        }

        public DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkg extends TeaModel {
        @NameInMap("Cs")
        public DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs cs;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Sha256")
        public String sha256;

        public static DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkg build(java.util.Map<String, ?> map) throws Exception {
            DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkg self = new DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkg();
            return TeaModel.build(map, self);
        }

        public DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkg setCs(DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs cs) {
            this.cs = cs;
            return this;
        }
        public DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs getCs() {
            return this.cs;
        }

        public DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkg setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkg setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }
        public String getSha256() {
            return this.sha256;
        }

    }

    public static class DeleteGovernanceTaskResponseBodyResultContentOrdererConfig extends TeaModel {
        @NameInMap("BatchTimeout")
        public String batchTimeout;

        @NameInMap("MaxMessageCount")
        public Integer maxMessageCount;

        @NameInMap("PreferredMaxBytes")
        public Integer preferredMaxBytes;

        public static DeleteGovernanceTaskResponseBodyResultContentOrdererConfig build(java.util.Map<String, ?> map) throws Exception {
            DeleteGovernanceTaskResponseBodyResultContentOrdererConfig self = new DeleteGovernanceTaskResponseBodyResultContentOrdererConfig();
            return TeaModel.build(map, self);
        }

        public DeleteGovernanceTaskResponseBodyResultContentOrdererConfig setBatchTimeout(String batchTimeout) {
            this.batchTimeout = batchTimeout;
            return this;
        }
        public String getBatchTimeout() {
            return this.batchTimeout;
        }

        public DeleteGovernanceTaskResponseBodyResultContentOrdererConfig setMaxMessageCount(Integer maxMessageCount) {
            this.maxMessageCount = maxMessageCount;
            return this;
        }
        public Integer getMaxMessageCount() {
            return this.maxMessageCount;
        }

        public DeleteGovernanceTaskResponseBodyResultContentOrdererConfig setPreferredMaxBytes(Integer preferredMaxBytes) {
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

    }

    public static class DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public Integer port;

        public static DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers build(java.util.Map<String, ?> map) throws Exception {
            DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers self = new DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers();
            return TeaModel.build(map, self);
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Key")
        public String key;

        @NameInMap("Tlsroot")
        public String tlsroot;

        public static DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes build(java.util.Map<String, ?> map) throws Exception {
            DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes self = new DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes();
            return TeaModel.build(map, self);
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes setTlsroot(String tlsroot) {
            this.tlsroot = tlsroot;
            return this;
        }
        public String getTlsroot() {
            return this.tlsroot;
        }

    }

    public static class DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations extends TeaModel {
        @NameInMap("AnchorPeers")
        public java.util.List<DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers> anchorPeers;

        @NameInMap("Crls")
        public String crls;

        @NameInMap("MspId")
        public String mspId;

        @NameInMap("MspType")
        public String mspType;

        @NameInMap("Orderer")
        public Boolean orderer;

        @NameInMap("OrdererNodes")
        public java.util.List<DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes> ordererNodes;

        @NameInMap("RootCertificates")
        public String rootCertificates;

        @NameInMap("TlsRootCertificates")
        public String tlsRootCertificates;

        public static DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations build(java.util.Map<String, ?> map) throws Exception {
            DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations self = new DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations();
            return TeaModel.build(map, self);
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations setAnchorPeers(java.util.List<DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers> anchorPeers) {
            this.anchorPeers = anchorPeers;
            return this;
        }
        public java.util.List<DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers> getAnchorPeers() {
            return this.anchorPeers;
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations setCrls(String crls) {
            this.crls = crls;
            return this;
        }
        public String getCrls() {
            return this.crls;
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations setMspId(String mspId) {
            this.mspId = mspId;
            return this;
        }
        public String getMspId() {
            return this.mspId;
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations setMspType(String mspType) {
            this.mspType = mspType;
            return this;
        }
        public String getMspType() {
            return this.mspType;
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations setOrderer(Boolean orderer) {
            this.orderer = orderer;
            return this;
        }
        public Boolean getOrderer() {
            return this.orderer;
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations setOrdererNodes(java.util.List<DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes> ordererNodes) {
            this.ordererNodes = ordererNodes;
            return this;
        }
        public java.util.List<DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes> getOrdererNodes() {
            return this.ordererNodes;
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations setRootCertificates(String rootCertificates) {
            this.rootCertificates = rootCertificates;
            return this;
        }
        public String getRootCertificates() {
            return this.rootCertificates;
        }

        public DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations setTlsRootCertificates(String tlsRootCertificates) {
            this.tlsRootCertificates = tlsRootCertificates;
            return this;
        }
        public String getTlsRootCertificates() {
            return this.tlsRootCertificates;
        }

    }

    public static class DeleteGovernanceTaskResponseBodyResultContent extends TeaModel {
        @NameInMap("AddedOrganizations")
        public java.util.List<DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations> addedOrganizations;

        @NameInMap("ChaincodeSpecPkg")
        public DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkg chaincodeSpecPkg;

        @NameInMap("OrdererConfig")
        public DeleteGovernanceTaskResponseBodyResultContentOrdererConfig ordererConfig;

        @NameInMap("Raw")
        public String raw;

        @NameInMap("RemovedOrganizations")
        public java.util.List<DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations> removedOrganizations;

        @NameInMap("RwSets")
        public String rwSets;

        public static DeleteGovernanceTaskResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteGovernanceTaskResponseBodyResultContent self = new DeleteGovernanceTaskResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteGovernanceTaskResponseBodyResultContent setAddedOrganizations(java.util.List<DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations> addedOrganizations) {
            this.addedOrganizations = addedOrganizations;
            return this;
        }
        public java.util.List<DeleteGovernanceTaskResponseBodyResultContentAddedOrganizations> getAddedOrganizations() {
            return this.addedOrganizations;
        }

        public DeleteGovernanceTaskResponseBodyResultContent setChaincodeSpecPkg(DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkg chaincodeSpecPkg) {
            this.chaincodeSpecPkg = chaincodeSpecPkg;
            return this;
        }
        public DeleteGovernanceTaskResponseBodyResultContentChaincodeSpecPkg getChaincodeSpecPkg() {
            return this.chaincodeSpecPkg;
        }

        public DeleteGovernanceTaskResponseBodyResultContent setOrdererConfig(DeleteGovernanceTaskResponseBodyResultContentOrdererConfig ordererConfig) {
            this.ordererConfig = ordererConfig;
            return this;
        }
        public DeleteGovernanceTaskResponseBodyResultContentOrdererConfig getOrdererConfig() {
            return this.ordererConfig;
        }

        public DeleteGovernanceTaskResponseBodyResultContent setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public DeleteGovernanceTaskResponseBodyResultContent setRemovedOrganizations(java.util.List<DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations> removedOrganizations) {
            this.removedOrganizations = removedOrganizations;
            return this;
        }
        public java.util.List<DeleteGovernanceTaskResponseBodyResultContentRemovedOrganizations> getRemovedOrganizations() {
            return this.removedOrganizations;
        }

        public DeleteGovernanceTaskResponseBodyResultContent setRwSets(String rwSets) {
            this.rwSets = rwSets;
            return this;
        }
        public String getRwSets() {
            return this.rwSets;
        }

    }

    public static class DeleteGovernanceTaskResponseBodyResult extends TeaModel {
        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("Content")
        public DeleteGovernanceTaskResponseBodyResultContent content;

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

        public static DeleteGovernanceTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteGovernanceTaskResponseBodyResult self = new DeleteGovernanceTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteGovernanceTaskResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DeleteGovernanceTaskResponseBodyResult setContent(DeleteGovernanceTaskResponseBodyResultContent content) {
            this.content = content;
            return this;
        }
        public DeleteGovernanceTaskResponseBodyResultContent getContent() {
            return this.content;
        }

        public DeleteGovernanceTaskResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DeleteGovernanceTaskResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DeleteGovernanceTaskResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteGovernanceTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteGovernanceTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DeleteGovernanceTaskResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
