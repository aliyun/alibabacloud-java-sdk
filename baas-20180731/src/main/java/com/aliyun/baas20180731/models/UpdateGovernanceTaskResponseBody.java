// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateGovernanceTaskResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateGovernanceTaskResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateGovernanceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGovernanceTaskResponseBody self = new UpdateGovernanceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGovernanceTaskResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public UpdateGovernanceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGovernanceTaskResponseBody setResult(UpdateGovernanceTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateGovernanceTaskResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateGovernanceTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public Integer port;

        public static UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers build(java.util.Map<String, ?> map) throws Exception {
            UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers self = new UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers();
            return TeaModel.build(map, self);
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Key")
        public String key;

        @NameInMap("Tlsroot")
        public String tlsroot;

        public static UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes self = new UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes();
            return TeaModel.build(map, self);
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes setTlsroot(String tlsroot) {
            this.tlsroot = tlsroot;
            return this;
        }
        public String getTlsroot() {
            return this.tlsroot;
        }

    }

    public static class UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations extends TeaModel {
        @NameInMap("AnchorPeers")
        public java.util.List<UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers> anchorPeers;

        @NameInMap("Crls")
        public String crls;

        @NameInMap("MspId")
        public String mspId;

        @NameInMap("MspType")
        public String mspType;

        @NameInMap("Orderer")
        public Boolean orderer;

        @NameInMap("OrdererNodes")
        public java.util.List<UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes> ordererNodes;

        @NameInMap("RootCertificates")
        public String rootCertificates;

        @NameInMap("TlsRootCertificates")
        public String tlsRootCertificates;

        public static UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations build(java.util.Map<String, ?> map) throws Exception {
            UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations self = new UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations();
            return TeaModel.build(map, self);
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations setAnchorPeers(java.util.List<UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers> anchorPeers) {
            this.anchorPeers = anchorPeers;
            return this;
        }
        public java.util.List<UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers> getAnchorPeers() {
            return this.anchorPeers;
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations setCrls(String crls) {
            this.crls = crls;
            return this;
        }
        public String getCrls() {
            return this.crls;
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations setMspId(String mspId) {
            this.mspId = mspId;
            return this;
        }
        public String getMspId() {
            return this.mspId;
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations setMspType(String mspType) {
            this.mspType = mspType;
            return this;
        }
        public String getMspType() {
            return this.mspType;
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations setOrderer(Boolean orderer) {
            this.orderer = orderer;
            return this;
        }
        public Boolean getOrderer() {
            return this.orderer;
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations setOrdererNodes(java.util.List<UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes> ordererNodes) {
            this.ordererNodes = ordererNodes;
            return this;
        }
        public java.util.List<UpdateGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes> getOrdererNodes() {
            return this.ordererNodes;
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations setRootCertificates(String rootCertificates) {
            this.rootCertificates = rootCertificates;
            return this;
        }
        public String getRootCertificates() {
            return this.rootCertificates;
        }

        public UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations setTlsRootCertificates(String tlsRootCertificates) {
            this.tlsRootCertificates = tlsRootCertificates;
            return this;
        }
        public String getTlsRootCertificates() {
            return this.tlsRootCertificates;
        }

    }

    public static class UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs extends TeaModel {
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

        public static UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs build(java.util.Map<String, ?> map) throws Exception {
            UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs self = new UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs();
            return TeaModel.build(map, self);
        }

        public UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkg extends TeaModel {
        @NameInMap("Cs")
        public UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs cs;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Sha256")
        public String sha256;

        public static UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkg build(java.util.Map<String, ?> map) throws Exception {
            UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkg self = new UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkg();
            return TeaModel.build(map, self);
        }

        public UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkg setCs(UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs cs) {
            this.cs = cs;
            return this;
        }
        public UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs getCs() {
            return this.cs;
        }

        public UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkg setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkg setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }
        public String getSha256() {
            return this.sha256;
        }

    }

    public static class UpdateGovernanceTaskResponseBodyResultContentOrdererConfig extends TeaModel {
        @NameInMap("BatchTimeout")
        public String batchTimeout;

        @NameInMap("MaxMessageCount")
        public Integer maxMessageCount;

        @NameInMap("PreferredMaxBytes")
        public Integer preferredMaxBytes;

        public static UpdateGovernanceTaskResponseBodyResultContentOrdererConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateGovernanceTaskResponseBodyResultContentOrdererConfig self = new UpdateGovernanceTaskResponseBodyResultContentOrdererConfig();
            return TeaModel.build(map, self);
        }

        public UpdateGovernanceTaskResponseBodyResultContentOrdererConfig setBatchTimeout(String batchTimeout) {
            this.batchTimeout = batchTimeout;
            return this;
        }
        public String getBatchTimeout() {
            return this.batchTimeout;
        }

        public UpdateGovernanceTaskResponseBodyResultContentOrdererConfig setMaxMessageCount(Integer maxMessageCount) {
            this.maxMessageCount = maxMessageCount;
            return this;
        }
        public Integer getMaxMessageCount() {
            return this.maxMessageCount;
        }

        public UpdateGovernanceTaskResponseBodyResultContentOrdererConfig setPreferredMaxBytes(Integer preferredMaxBytes) {
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

    }

    public static class UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public Integer port;

        public static UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers build(java.util.Map<String, ?> map) throws Exception {
            UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers self = new UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers();
            return TeaModel.build(map, self);
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Key")
        public String key;

        @NameInMap("Tlsroot")
        public String tlsroot;

        public static UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes self = new UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes();
            return TeaModel.build(map, self);
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes setTlsroot(String tlsroot) {
            this.tlsroot = tlsroot;
            return this;
        }
        public String getTlsroot() {
            return this.tlsroot;
        }

    }

    public static class UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations extends TeaModel {
        @NameInMap("AnchorPeers")
        public java.util.List<UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers> anchorPeers;

        @NameInMap("Crls")
        public String crls;

        @NameInMap("MspId")
        public String mspId;

        @NameInMap("MspType")
        public String mspType;

        @NameInMap("Orderer")
        public Boolean orderer;

        @NameInMap("OrdererNodes")
        public java.util.List<UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes> ordererNodes;

        @NameInMap("RootCertificates")
        public String rootCertificates;

        @NameInMap("TlsRootCertificates")
        public String tlsRootCertificates;

        public static UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations build(java.util.Map<String, ?> map) throws Exception {
            UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations self = new UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations();
            return TeaModel.build(map, self);
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations setAnchorPeers(java.util.List<UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers> anchorPeers) {
            this.anchorPeers = anchorPeers;
            return this;
        }
        public java.util.List<UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers> getAnchorPeers() {
            return this.anchorPeers;
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations setCrls(String crls) {
            this.crls = crls;
            return this;
        }
        public String getCrls() {
            return this.crls;
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations setMspId(String mspId) {
            this.mspId = mspId;
            return this;
        }
        public String getMspId() {
            return this.mspId;
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations setMspType(String mspType) {
            this.mspType = mspType;
            return this;
        }
        public String getMspType() {
            return this.mspType;
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations setOrderer(Boolean orderer) {
            this.orderer = orderer;
            return this;
        }
        public Boolean getOrderer() {
            return this.orderer;
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations setOrdererNodes(java.util.List<UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes> ordererNodes) {
            this.ordererNodes = ordererNodes;
            return this;
        }
        public java.util.List<UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes> getOrdererNodes() {
            return this.ordererNodes;
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations setRootCertificates(String rootCertificates) {
            this.rootCertificates = rootCertificates;
            return this;
        }
        public String getRootCertificates() {
            return this.rootCertificates;
        }

        public UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations setTlsRootCertificates(String tlsRootCertificates) {
            this.tlsRootCertificates = tlsRootCertificates;
            return this;
        }
        public String getTlsRootCertificates() {
            return this.tlsRootCertificates;
        }

    }

    public static class UpdateGovernanceTaskResponseBodyResultContent extends TeaModel {
        @NameInMap("AddedOrganizations")
        public java.util.List<UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations> addedOrganizations;

        @NameInMap("ChaincodeSpecPkg")
        public UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkg chaincodeSpecPkg;

        @NameInMap("OrdererConfig")
        public UpdateGovernanceTaskResponseBodyResultContentOrdererConfig ordererConfig;

        @NameInMap("Raw")
        public String raw;

        @NameInMap("RemovedOrganizations")
        public java.util.List<UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations> removedOrganizations;

        @NameInMap("RwSets")
        public String rwSets;

        public static UpdateGovernanceTaskResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateGovernanceTaskResponseBodyResultContent self = new UpdateGovernanceTaskResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UpdateGovernanceTaskResponseBodyResultContent setAddedOrganizations(java.util.List<UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations> addedOrganizations) {
            this.addedOrganizations = addedOrganizations;
            return this;
        }
        public java.util.List<UpdateGovernanceTaskResponseBodyResultContentAddedOrganizations> getAddedOrganizations() {
            return this.addedOrganizations;
        }

        public UpdateGovernanceTaskResponseBodyResultContent setChaincodeSpecPkg(UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkg chaincodeSpecPkg) {
            this.chaincodeSpecPkg = chaincodeSpecPkg;
            return this;
        }
        public UpdateGovernanceTaskResponseBodyResultContentChaincodeSpecPkg getChaincodeSpecPkg() {
            return this.chaincodeSpecPkg;
        }

        public UpdateGovernanceTaskResponseBodyResultContent setOrdererConfig(UpdateGovernanceTaskResponseBodyResultContentOrdererConfig ordererConfig) {
            this.ordererConfig = ordererConfig;
            return this;
        }
        public UpdateGovernanceTaskResponseBodyResultContentOrdererConfig getOrdererConfig() {
            return this.ordererConfig;
        }

        public UpdateGovernanceTaskResponseBodyResultContent setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public UpdateGovernanceTaskResponseBodyResultContent setRemovedOrganizations(java.util.List<UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations> removedOrganizations) {
            this.removedOrganizations = removedOrganizations;
            return this;
        }
        public java.util.List<UpdateGovernanceTaskResponseBodyResultContentRemovedOrganizations> getRemovedOrganizations() {
            return this.removedOrganizations;
        }

        public UpdateGovernanceTaskResponseBodyResultContent setRwSets(String rwSets) {
            this.rwSets = rwSets;
            return this;
        }
        public String getRwSets() {
            return this.rwSets;
        }

    }

    public static class UpdateGovernanceTaskResponseBodyResult extends TeaModel {
        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("Content")
        public UpdateGovernanceTaskResponseBodyResultContent content;

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

        public static UpdateGovernanceTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateGovernanceTaskResponseBodyResult self = new UpdateGovernanceTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateGovernanceTaskResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public UpdateGovernanceTaskResponseBodyResult setContent(UpdateGovernanceTaskResponseBodyResultContent content) {
            this.content = content;
            return this;
        }
        public UpdateGovernanceTaskResponseBodyResultContent getContent() {
            return this.content;
        }

        public UpdateGovernanceTaskResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateGovernanceTaskResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public UpdateGovernanceTaskResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateGovernanceTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateGovernanceTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateGovernanceTaskResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
