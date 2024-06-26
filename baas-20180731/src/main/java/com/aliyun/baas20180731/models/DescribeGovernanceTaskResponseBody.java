// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeGovernanceTaskResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeGovernanceTaskResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGovernanceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGovernanceTaskResponseBody self = new DescribeGovernanceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGovernanceTaskResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeGovernanceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGovernanceTaskResponseBody setResult(DescribeGovernanceTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeGovernanceTaskResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeGovernanceTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public Integer port;

        public static DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers self = new DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Key")
        public String key;

        @NameInMap("Tlsroot")
        public String tlsroot;

        public static DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes self = new DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes setTlsroot(String tlsroot) {
            this.tlsroot = tlsroot;
            return this;
        }
        public String getTlsroot() {
            return this.tlsroot;
        }

    }

    public static class DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations extends TeaModel {
        @NameInMap("AnchorPeers")
        public java.util.List<DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers> anchorPeers;

        @NameInMap("Crls")
        public String crls;

        @NameInMap("MspId")
        public String mspId;

        @NameInMap("MspType")
        public String mspType;

        @NameInMap("Orderer")
        public Boolean orderer;

        @NameInMap("OrdererNodes")
        public java.util.List<DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes> ordererNodes;

        @NameInMap("RootCertificates")
        public String rootCertificates;

        @NameInMap("TlsRootCertificates")
        public String tlsRootCertificates;

        public static DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations self = new DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations setAnchorPeers(java.util.List<DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers> anchorPeers) {
            this.anchorPeers = anchorPeers;
            return this;
        }
        public java.util.List<DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsAnchorPeers> getAnchorPeers() {
            return this.anchorPeers;
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations setCrls(String crls) {
            this.crls = crls;
            return this;
        }
        public String getCrls() {
            return this.crls;
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations setMspId(String mspId) {
            this.mspId = mspId;
            return this;
        }
        public String getMspId() {
            return this.mspId;
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations setMspType(String mspType) {
            this.mspType = mspType;
            return this;
        }
        public String getMspType() {
            return this.mspType;
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations setOrderer(Boolean orderer) {
            this.orderer = orderer;
            return this;
        }
        public Boolean getOrderer() {
            return this.orderer;
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations setOrdererNodes(java.util.List<DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes> ordererNodes) {
            this.ordererNodes = ordererNodes;
            return this;
        }
        public java.util.List<DescribeGovernanceTaskResponseBodyResultContentAddedOrganizationsOrdererNodes> getOrdererNodes() {
            return this.ordererNodes;
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations setRootCertificates(String rootCertificates) {
            this.rootCertificates = rootCertificates;
            return this;
        }
        public String getRootCertificates() {
            return this.rootCertificates;
        }

        public DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations setTlsRootCertificates(String tlsRootCertificates) {
            this.tlsRootCertificates = tlsRootCertificates;
            return this;
        }
        public String getTlsRootCertificates() {
            return this.tlsRootCertificates;
        }

    }

    public static class DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs extends TeaModel {
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

        public static DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs self = new DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkg extends TeaModel {
        @NameInMap("Cs")
        public DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs cs;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Sha256")
        public String sha256;

        public static DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkg build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkg self = new DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkg();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkg setCs(DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs cs) {
            this.cs = cs;
            return this;
        }
        public DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkgCs getCs() {
            return this.cs;
        }

        public DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkg setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkg setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }
        public String getSha256() {
            return this.sha256;
        }

    }

    public static class DescribeGovernanceTaskResponseBodyResultContentOrdererConfig extends TeaModel {
        @NameInMap("BatchTimeout")
        public String batchTimeout;

        @NameInMap("MaxMessageCount")
        public Integer maxMessageCount;

        @NameInMap("PreferredMaxBytes")
        public Integer preferredMaxBytes;

        public static DescribeGovernanceTaskResponseBodyResultContentOrdererConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTaskResponseBodyResultContentOrdererConfig self = new DescribeGovernanceTaskResponseBodyResultContentOrdererConfig();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTaskResponseBodyResultContentOrdererConfig setBatchTimeout(String batchTimeout) {
            this.batchTimeout = batchTimeout;
            return this;
        }
        public String getBatchTimeout() {
            return this.batchTimeout;
        }

        public DescribeGovernanceTaskResponseBodyResultContentOrdererConfig setMaxMessageCount(Integer maxMessageCount) {
            this.maxMessageCount = maxMessageCount;
            return this;
        }
        public Integer getMaxMessageCount() {
            return this.maxMessageCount;
        }

        public DescribeGovernanceTaskResponseBodyResultContentOrdererConfig setPreferredMaxBytes(Integer preferredMaxBytes) {
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

    }

    public static class DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public Integer port;

        public static DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers self = new DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Key")
        public String key;

        @NameInMap("Tlsroot")
        public String tlsroot;

        public static DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes self = new DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes setTlsroot(String tlsroot) {
            this.tlsroot = tlsroot;
            return this;
        }
        public String getTlsroot() {
            return this.tlsroot;
        }

    }

    public static class DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations extends TeaModel {
        @NameInMap("AnchorPeers")
        public java.util.List<DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers> anchorPeers;

        @NameInMap("Crls")
        public String crls;

        @NameInMap("MspId")
        public String mspId;

        @NameInMap("MspType")
        public String mspType;

        @NameInMap("Orderer")
        public Boolean orderer;

        @NameInMap("OrdererNodes")
        public java.util.List<DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes> ordererNodes;

        @NameInMap("RootCertificates")
        public String rootCertificates;

        @NameInMap("TlsRootCertificates")
        public String tlsRootCertificates;

        public static DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations self = new DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations setAnchorPeers(java.util.List<DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers> anchorPeers) {
            this.anchorPeers = anchorPeers;
            return this;
        }
        public java.util.List<DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsAnchorPeers> getAnchorPeers() {
            return this.anchorPeers;
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations setCrls(String crls) {
            this.crls = crls;
            return this;
        }
        public String getCrls() {
            return this.crls;
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations setMspId(String mspId) {
            this.mspId = mspId;
            return this;
        }
        public String getMspId() {
            return this.mspId;
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations setMspType(String mspType) {
            this.mspType = mspType;
            return this;
        }
        public String getMspType() {
            return this.mspType;
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations setOrderer(Boolean orderer) {
            this.orderer = orderer;
            return this;
        }
        public Boolean getOrderer() {
            return this.orderer;
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations setOrdererNodes(java.util.List<DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes> ordererNodes) {
            this.ordererNodes = ordererNodes;
            return this;
        }
        public java.util.List<DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizationsOrdererNodes> getOrdererNodes() {
            return this.ordererNodes;
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations setRootCertificates(String rootCertificates) {
            this.rootCertificates = rootCertificates;
            return this;
        }
        public String getRootCertificates() {
            return this.rootCertificates;
        }

        public DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations setTlsRootCertificates(String tlsRootCertificates) {
            this.tlsRootCertificates = tlsRootCertificates;
            return this;
        }
        public String getTlsRootCertificates() {
            return this.tlsRootCertificates;
        }

    }

    public static class DescribeGovernanceTaskResponseBodyResultContent extends TeaModel {
        @NameInMap("AddedOrganizations")
        public java.util.List<DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations> addedOrganizations;

        @NameInMap("ChaincodeSpecPkg")
        public DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkg chaincodeSpecPkg;

        @NameInMap("OrdererConfig")
        public DescribeGovernanceTaskResponseBodyResultContentOrdererConfig ordererConfig;

        @NameInMap("Raw")
        public String raw;

        @NameInMap("RemovedOrganizations")
        public java.util.List<DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations> removedOrganizations;

        @NameInMap("RwSets")
        public String rwSets;

        public static DescribeGovernanceTaskResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTaskResponseBodyResultContent self = new DescribeGovernanceTaskResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTaskResponseBodyResultContent setAddedOrganizations(java.util.List<DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations> addedOrganizations) {
            this.addedOrganizations = addedOrganizations;
            return this;
        }
        public java.util.List<DescribeGovernanceTaskResponseBodyResultContentAddedOrganizations> getAddedOrganizations() {
            return this.addedOrganizations;
        }

        public DescribeGovernanceTaskResponseBodyResultContent setChaincodeSpecPkg(DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkg chaincodeSpecPkg) {
            this.chaincodeSpecPkg = chaincodeSpecPkg;
            return this;
        }
        public DescribeGovernanceTaskResponseBodyResultContentChaincodeSpecPkg getChaincodeSpecPkg() {
            return this.chaincodeSpecPkg;
        }

        public DescribeGovernanceTaskResponseBodyResultContent setOrdererConfig(DescribeGovernanceTaskResponseBodyResultContentOrdererConfig ordererConfig) {
            this.ordererConfig = ordererConfig;
            return this;
        }
        public DescribeGovernanceTaskResponseBodyResultContentOrdererConfig getOrdererConfig() {
            return this.ordererConfig;
        }

        public DescribeGovernanceTaskResponseBodyResultContent setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public DescribeGovernanceTaskResponseBodyResultContent setRemovedOrganizations(java.util.List<DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations> removedOrganizations) {
            this.removedOrganizations = removedOrganizations;
            return this;
        }
        public java.util.List<DescribeGovernanceTaskResponseBodyResultContentRemovedOrganizations> getRemovedOrganizations() {
            return this.removedOrganizations;
        }

        public DescribeGovernanceTaskResponseBodyResultContent setRwSets(String rwSets) {
            this.rwSets = rwSets;
            return this;
        }
        public String getRwSets() {
            return this.rwSets;
        }

    }

    public static class DescribeGovernanceTaskResponseBodyResult extends TeaModel {
        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("Content")
        public DescribeGovernanceTaskResponseBodyResultContent content;

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

        public static DescribeGovernanceTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTaskResponseBodyResult self = new DescribeGovernanceTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTaskResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeGovernanceTaskResponseBodyResult setContent(DescribeGovernanceTaskResponseBodyResultContent content) {
            this.content = content;
            return this;
        }
        public DescribeGovernanceTaskResponseBodyResultContent getContent() {
            return this.content;
        }

        public DescribeGovernanceTaskResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGovernanceTaskResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeGovernanceTaskResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGovernanceTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGovernanceTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeGovernanceTaskResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
