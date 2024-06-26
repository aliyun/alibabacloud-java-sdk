// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AddFabricExternalOrganizationToChannelResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AddFabricExternalOrganizationToChannelResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static AddFabricExternalOrganizationToChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFabricExternalOrganizationToChannelResponseBody self = new AddFabricExternalOrganizationToChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFabricExternalOrganizationToChannelResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public AddFabricExternalOrganizationToChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFabricExternalOrganizationToChannelResponseBody setResult(AddFabricExternalOrganizationToChannelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddFabricExternalOrganizationToChannelResponseBodyResult getResult() {
        return this.result;
    }

    public AddFabricExternalOrganizationToChannelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsAnchorPeers extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public Integer port;

        public static AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsAnchorPeers build(java.util.Map<String, ?> map) throws Exception {
            AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsAnchorPeers self = new AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsAnchorPeers();
            return TeaModel.build(map, self);
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsAnchorPeers setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsAnchorPeers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsOrdererNodes extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Key")
        public String key;

        @NameInMap("Tlsroot")
        public String tlsroot;

        public static AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsOrdererNodes build(java.util.Map<String, ?> map) throws Exception {
            AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsOrdererNodes self = new AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsOrdererNodes();
            return TeaModel.build(map, self);
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsOrdererNodes setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsOrdererNodes setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsOrdererNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsOrdererNodes setTlsroot(String tlsroot) {
            this.tlsroot = tlsroot;
            return this;
        }
        public String getTlsroot() {
            return this.tlsroot;
        }

    }

    public static class AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations extends TeaModel {
        @NameInMap("AnchorPeers")
        public java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsAnchorPeers> anchorPeers;

        @NameInMap("Crls")
        public String crls;

        @NameInMap("MspId")
        public String mspId;

        @NameInMap("MspType")
        public String mspType;

        @NameInMap("Orderer")
        public Boolean orderer;

        @NameInMap("OrdererNodes")
        public java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsOrdererNodes> ordererNodes;

        @NameInMap("RootCertificates")
        public String rootCertificates;

        @NameInMap("TlsRootCertificates")
        public String tlsRootCertificates;

        public static AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations build(java.util.Map<String, ?> map) throws Exception {
            AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations self = new AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations();
            return TeaModel.build(map, self);
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations setAnchorPeers(java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsAnchorPeers> anchorPeers) {
            this.anchorPeers = anchorPeers;
            return this;
        }
        public java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsAnchorPeers> getAnchorPeers() {
            return this.anchorPeers;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations setCrls(String crls) {
            this.crls = crls;
            return this;
        }
        public String getCrls() {
            return this.crls;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations setMspId(String mspId) {
            this.mspId = mspId;
            return this;
        }
        public String getMspId() {
            return this.mspId;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations setMspType(String mspType) {
            this.mspType = mspType;
            return this;
        }
        public String getMspType() {
            return this.mspType;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations setOrderer(Boolean orderer) {
            this.orderer = orderer;
            return this;
        }
        public Boolean getOrderer() {
            return this.orderer;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations setOrdererNodes(java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsOrdererNodes> ordererNodes) {
            this.ordererNodes = ordererNodes;
            return this;
        }
        public java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizationsOrdererNodes> getOrdererNodes() {
            return this.ordererNodes;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations setRootCertificates(String rootCertificates) {
            this.rootCertificates = rootCertificates;
            return this;
        }
        public String getRootCertificates() {
            return this.rootCertificates;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations setTlsRootCertificates(String tlsRootCertificates) {
            this.tlsRootCertificates = tlsRootCertificates;
            return this;
        }
        public String getTlsRootCertificates() {
            return this.tlsRootCertificates;
        }

    }

    public static class AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkgCs extends TeaModel {
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

        public static AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkgCs build(java.util.Map<String, ?> map) throws Exception {
            AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkgCs self = new AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkgCs();
            return TeaModel.build(map, self);
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkgCs setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkgCs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkgCs setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkgCs setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkgCs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkg extends TeaModel {
        @NameInMap("Cs")
        public AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkgCs cs;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Sha256")
        public String sha256;

        public static AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkg build(java.util.Map<String, ?> map) throws Exception {
            AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkg self = new AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkg();
            return TeaModel.build(map, self);
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkg setCs(AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkgCs cs) {
            this.cs = cs;
            return this;
        }
        public AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkgCs getCs() {
            return this.cs;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkg setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkg setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }
        public String getSha256() {
            return this.sha256;
        }

    }

    public static class AddFabricExternalOrganizationToChannelResponseBodyResultContentOrdererConfig extends TeaModel {
        @NameInMap("BatchTimeout")
        public String batchTimeout;

        @NameInMap("MaxMessageCount")
        public Integer maxMessageCount;

        @NameInMap("PreferredMaxBytes")
        public Integer preferredMaxBytes;

        public static AddFabricExternalOrganizationToChannelResponseBodyResultContentOrdererConfig build(java.util.Map<String, ?> map) throws Exception {
            AddFabricExternalOrganizationToChannelResponseBodyResultContentOrdererConfig self = new AddFabricExternalOrganizationToChannelResponseBodyResultContentOrdererConfig();
            return TeaModel.build(map, self);
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentOrdererConfig setBatchTimeout(String batchTimeout) {
            this.batchTimeout = batchTimeout;
            return this;
        }
        public String getBatchTimeout() {
            return this.batchTimeout;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentOrdererConfig setMaxMessageCount(Integer maxMessageCount) {
            this.maxMessageCount = maxMessageCount;
            return this;
        }
        public Integer getMaxMessageCount() {
            return this.maxMessageCount;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentOrdererConfig setPreferredMaxBytes(Integer preferredMaxBytes) {
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

    }

    public static class AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsAnchorPeers extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public Integer port;

        public static AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsAnchorPeers build(java.util.Map<String, ?> map) throws Exception {
            AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsAnchorPeers self = new AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsAnchorPeers();
            return TeaModel.build(map, self);
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsAnchorPeers setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsAnchorPeers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsOrdererNodes extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Key")
        public String key;

        @NameInMap("Tlsroot")
        public String tlsroot;

        public static AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsOrdererNodes build(java.util.Map<String, ?> map) throws Exception {
            AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsOrdererNodes self = new AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsOrdererNodes();
            return TeaModel.build(map, self);
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsOrdererNodes setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsOrdererNodes setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsOrdererNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsOrdererNodes setTlsroot(String tlsroot) {
            this.tlsroot = tlsroot;
            return this;
        }
        public String getTlsroot() {
            return this.tlsroot;
        }

    }

    public static class AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations extends TeaModel {
        @NameInMap("AnchorPeers")
        public java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsAnchorPeers> anchorPeers;

        @NameInMap("Crls")
        public String crls;

        @NameInMap("MspId")
        public String mspId;

        @NameInMap("MspType")
        public String mspType;

        @NameInMap("Orderer")
        public Boolean orderer;

        @NameInMap("OrdererNodes")
        public java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsOrdererNodes> ordererNodes;

        @NameInMap("RootCertificates")
        public String rootCertificates;

        @NameInMap("TlsRootCertificates")
        public String tlsRootCertificates;

        public static AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations build(java.util.Map<String, ?> map) throws Exception {
            AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations self = new AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations();
            return TeaModel.build(map, self);
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations setAnchorPeers(java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsAnchorPeers> anchorPeers) {
            this.anchorPeers = anchorPeers;
            return this;
        }
        public java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsAnchorPeers> getAnchorPeers() {
            return this.anchorPeers;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations setCrls(String crls) {
            this.crls = crls;
            return this;
        }
        public String getCrls() {
            return this.crls;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations setMspId(String mspId) {
            this.mspId = mspId;
            return this;
        }
        public String getMspId() {
            return this.mspId;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations setMspType(String mspType) {
            this.mspType = mspType;
            return this;
        }
        public String getMspType() {
            return this.mspType;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations setOrderer(Boolean orderer) {
            this.orderer = orderer;
            return this;
        }
        public Boolean getOrderer() {
            return this.orderer;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations setOrdererNodes(java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsOrdererNodes> ordererNodes) {
            this.ordererNodes = ordererNodes;
            return this;
        }
        public java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizationsOrdererNodes> getOrdererNodes() {
            return this.ordererNodes;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations setRootCertificates(String rootCertificates) {
            this.rootCertificates = rootCertificates;
            return this;
        }
        public String getRootCertificates() {
            return this.rootCertificates;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations setTlsRootCertificates(String tlsRootCertificates) {
            this.tlsRootCertificates = tlsRootCertificates;
            return this;
        }
        public String getTlsRootCertificates() {
            return this.tlsRootCertificates;
        }

    }

    public static class AddFabricExternalOrganizationToChannelResponseBodyResultContent extends TeaModel {
        @NameInMap("AddedOrganizations")
        public java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations> addedOrganizations;

        @NameInMap("ChaincodeSpecPkg")
        public AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkg chaincodeSpecPkg;

        @NameInMap("OrdererConfig")
        public AddFabricExternalOrganizationToChannelResponseBodyResultContentOrdererConfig ordererConfig;

        @NameInMap("Raw")
        public String raw;

        @NameInMap("RemovedOrganizations")
        public java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations> removedOrganizations;

        @NameInMap("RwSets")
        public String rwSets;

        public static AddFabricExternalOrganizationToChannelResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            AddFabricExternalOrganizationToChannelResponseBodyResultContent self = new AddFabricExternalOrganizationToChannelResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContent setAddedOrganizations(java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations> addedOrganizations) {
            this.addedOrganizations = addedOrganizations;
            return this;
        }
        public java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentAddedOrganizations> getAddedOrganizations() {
            return this.addedOrganizations;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContent setChaincodeSpecPkg(AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkg chaincodeSpecPkg) {
            this.chaincodeSpecPkg = chaincodeSpecPkg;
            return this;
        }
        public AddFabricExternalOrganizationToChannelResponseBodyResultContentChaincodeSpecPkg getChaincodeSpecPkg() {
            return this.chaincodeSpecPkg;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContent setOrdererConfig(AddFabricExternalOrganizationToChannelResponseBodyResultContentOrdererConfig ordererConfig) {
            this.ordererConfig = ordererConfig;
            return this;
        }
        public AddFabricExternalOrganizationToChannelResponseBodyResultContentOrdererConfig getOrdererConfig() {
            return this.ordererConfig;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContent setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContent setRemovedOrganizations(java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations> removedOrganizations) {
            this.removedOrganizations = removedOrganizations;
            return this;
        }
        public java.util.List<AddFabricExternalOrganizationToChannelResponseBodyResultContentRemovedOrganizations> getRemovedOrganizations() {
            return this.removedOrganizations;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResultContent setRwSets(String rwSets) {
            this.rwSets = rwSets;
            return this;
        }
        public String getRwSets() {
            return this.rwSets;
        }

    }

    public static class AddFabricExternalOrganizationToChannelResponseBodyResult extends TeaModel {
        @NameInMap("Content")
        public AddFabricExternalOrganizationToChannelResponseBodyResultContent content;

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

        public static AddFabricExternalOrganizationToChannelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddFabricExternalOrganizationToChannelResponseBodyResult self = new AddFabricExternalOrganizationToChannelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResult setContent(AddFabricExternalOrganizationToChannelResponseBodyResultContent content) {
            this.content = content;
            return this;
        }
        public AddFabricExternalOrganizationToChannelResponseBodyResultContent getContent() {
            return this.content;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public AddFabricExternalOrganizationToChannelResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
