// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeGovernanceTasksResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeGovernanceTasksResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGovernanceTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGovernanceTasksResponseBody self = new DescribeGovernanceTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGovernanceTasksResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeGovernanceTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGovernanceTasksResponseBody setResult(java.util.List<DescribeGovernanceTasksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeGovernanceTasksResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeGovernanceTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsAnchorPeers extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public Integer port;

        public static DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsAnchorPeers build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsAnchorPeers self = new DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsAnchorPeers();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsAnchorPeers setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsAnchorPeers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsOrdererNodes extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Key")
        public String key;

        @NameInMap("Tlsroot")
        public String tlsroot;

        public static DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsOrdererNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsOrdererNodes self = new DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsOrdererNodes();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsOrdererNodes setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsOrdererNodes setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsOrdererNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsOrdererNodes setTlsroot(String tlsroot) {
            this.tlsroot = tlsroot;
            return this;
        }
        public String getTlsroot() {
            return this.tlsroot;
        }

    }

    public static class DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations extends TeaModel {
        @NameInMap("AnchorPeers")
        public java.util.List<DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsAnchorPeers> anchorPeers;

        @NameInMap("Crls")
        public String crls;

        @NameInMap("MspId")
        public String mspId;

        @NameInMap("MspType")
        public String mspType;

        @NameInMap("Orderer")
        public Boolean orderer;

        @NameInMap("OrdererNodes")
        public java.util.List<DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsOrdererNodes> ordererNodes;

        @NameInMap("RootCertificates")
        public String rootCertificates;

        @NameInMap("TlsRootCertificates")
        public String tlsRootCertificates;

        public static DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations self = new DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations setAnchorPeers(java.util.List<DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsAnchorPeers> anchorPeers) {
            this.anchorPeers = anchorPeers;
            return this;
        }
        public java.util.List<DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsAnchorPeers> getAnchorPeers() {
            return this.anchorPeers;
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations setCrls(String crls) {
            this.crls = crls;
            return this;
        }
        public String getCrls() {
            return this.crls;
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations setMspId(String mspId) {
            this.mspId = mspId;
            return this;
        }
        public String getMspId() {
            return this.mspId;
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations setMspType(String mspType) {
            this.mspType = mspType;
            return this;
        }
        public String getMspType() {
            return this.mspType;
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations setOrderer(Boolean orderer) {
            this.orderer = orderer;
            return this;
        }
        public Boolean getOrderer() {
            return this.orderer;
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations setOrdererNodes(java.util.List<DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsOrdererNodes> ordererNodes) {
            this.ordererNodes = ordererNodes;
            return this;
        }
        public java.util.List<DescribeGovernanceTasksResponseBodyResultContentAddedOrganizationsOrdererNodes> getOrdererNodes() {
            return this.ordererNodes;
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations setRootCertificates(String rootCertificates) {
            this.rootCertificates = rootCertificates;
            return this;
        }
        public String getRootCertificates() {
            return this.rootCertificates;
        }

        public DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations setTlsRootCertificates(String tlsRootCertificates) {
            this.tlsRootCertificates = tlsRootCertificates;
            return this;
        }
        public String getTlsRootCertificates() {
            return this.tlsRootCertificates;
        }

    }

    public static class DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkgCs extends TeaModel {
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

        public static DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkgCs build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkgCs self = new DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkgCs();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkgCs setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkgCs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkgCs setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkgCs setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkgCs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkg extends TeaModel {
        @NameInMap("Cs")
        public DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkgCs cs;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Sha256")
        public String sha256;

        public static DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkg build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkg self = new DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkg();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkg setCs(DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkgCs cs) {
            this.cs = cs;
            return this;
        }
        public DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkgCs getCs() {
            return this.cs;
        }

        public DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkg setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkg setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }
        public String getSha256() {
            return this.sha256;
        }

    }

    public static class DescribeGovernanceTasksResponseBodyResultContentOrdererConfig extends TeaModel {
        @NameInMap("BatchTimeout")
        public String batchTimeout;

        @NameInMap("MaxMessageCount")
        public Integer maxMessageCount;

        @NameInMap("PreferredMaxBytes")
        public Integer preferredMaxBytes;

        public static DescribeGovernanceTasksResponseBodyResultContentOrdererConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTasksResponseBodyResultContentOrdererConfig self = new DescribeGovernanceTasksResponseBodyResultContentOrdererConfig();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTasksResponseBodyResultContentOrdererConfig setBatchTimeout(String batchTimeout) {
            this.batchTimeout = batchTimeout;
            return this;
        }
        public String getBatchTimeout() {
            return this.batchTimeout;
        }

        public DescribeGovernanceTasksResponseBodyResultContentOrdererConfig setMaxMessageCount(Integer maxMessageCount) {
            this.maxMessageCount = maxMessageCount;
            return this;
        }
        public Integer getMaxMessageCount() {
            return this.maxMessageCount;
        }

        public DescribeGovernanceTasksResponseBodyResultContentOrdererConfig setPreferredMaxBytes(Integer preferredMaxBytes) {
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

    }

    public static class DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsAnchorPeers extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public Integer port;

        public static DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsAnchorPeers build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsAnchorPeers self = new DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsAnchorPeers();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsAnchorPeers setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsAnchorPeers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsOrdererNodes extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Key")
        public String key;

        @NameInMap("Tlsroot")
        public String tlsroot;

        public static DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsOrdererNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsOrdererNodes self = new DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsOrdererNodes();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsOrdererNodes setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsOrdererNodes setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsOrdererNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsOrdererNodes setTlsroot(String tlsroot) {
            this.tlsroot = tlsroot;
            return this;
        }
        public String getTlsroot() {
            return this.tlsroot;
        }

    }

    public static class DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations extends TeaModel {
        @NameInMap("AnchorPeers")
        public java.util.List<DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsAnchorPeers> anchorPeers;

        @NameInMap("Crls")
        public String crls;

        @NameInMap("MspId")
        public String mspId;

        @NameInMap("MspType")
        public String mspType;

        @NameInMap("Orderer")
        public Boolean orderer;

        @NameInMap("OrdererNodes")
        public java.util.List<DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsOrdererNodes> ordererNodes;

        @NameInMap("RootCertificates")
        public String rootCertificates;

        @NameInMap("TlsRootCertificates")
        public String tlsRootCertificates;

        public static DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations self = new DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations setAnchorPeers(java.util.List<DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsAnchorPeers> anchorPeers) {
            this.anchorPeers = anchorPeers;
            return this;
        }
        public java.util.List<DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsAnchorPeers> getAnchorPeers() {
            return this.anchorPeers;
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations setCrls(String crls) {
            this.crls = crls;
            return this;
        }
        public String getCrls() {
            return this.crls;
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations setMspId(String mspId) {
            this.mspId = mspId;
            return this;
        }
        public String getMspId() {
            return this.mspId;
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations setMspType(String mspType) {
            this.mspType = mspType;
            return this;
        }
        public String getMspType() {
            return this.mspType;
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations setOrderer(Boolean orderer) {
            this.orderer = orderer;
            return this;
        }
        public Boolean getOrderer() {
            return this.orderer;
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations setOrdererNodes(java.util.List<DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsOrdererNodes> ordererNodes) {
            this.ordererNodes = ordererNodes;
            return this;
        }
        public java.util.List<DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizationsOrdererNodes> getOrdererNodes() {
            return this.ordererNodes;
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations setRootCertificates(String rootCertificates) {
            this.rootCertificates = rootCertificates;
            return this;
        }
        public String getRootCertificates() {
            return this.rootCertificates;
        }

        public DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations setTlsRootCertificates(String tlsRootCertificates) {
            this.tlsRootCertificates = tlsRootCertificates;
            return this;
        }
        public String getTlsRootCertificates() {
            return this.tlsRootCertificates;
        }

    }

    public static class DescribeGovernanceTasksResponseBodyResultContent extends TeaModel {
        @NameInMap("AddedOrganizations")
        public java.util.List<DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations> addedOrganizations;

        @NameInMap("ChaincodeSpecPkg")
        public DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkg chaincodeSpecPkg;

        @NameInMap("OrdererConfig")
        public DescribeGovernanceTasksResponseBodyResultContentOrdererConfig ordererConfig;

        @NameInMap("Raw")
        public String raw;

        @NameInMap("RemovedOrganizations")
        public java.util.List<DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations> removedOrganizations;

        @NameInMap("RwSets")
        public String rwSets;

        public static DescribeGovernanceTasksResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTasksResponseBodyResultContent self = new DescribeGovernanceTasksResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTasksResponseBodyResultContent setAddedOrganizations(java.util.List<DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations> addedOrganizations) {
            this.addedOrganizations = addedOrganizations;
            return this;
        }
        public java.util.List<DescribeGovernanceTasksResponseBodyResultContentAddedOrganizations> getAddedOrganizations() {
            return this.addedOrganizations;
        }

        public DescribeGovernanceTasksResponseBodyResultContent setChaincodeSpecPkg(DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkg chaincodeSpecPkg) {
            this.chaincodeSpecPkg = chaincodeSpecPkg;
            return this;
        }
        public DescribeGovernanceTasksResponseBodyResultContentChaincodeSpecPkg getChaincodeSpecPkg() {
            return this.chaincodeSpecPkg;
        }

        public DescribeGovernanceTasksResponseBodyResultContent setOrdererConfig(DescribeGovernanceTasksResponseBodyResultContentOrdererConfig ordererConfig) {
            this.ordererConfig = ordererConfig;
            return this;
        }
        public DescribeGovernanceTasksResponseBodyResultContentOrdererConfig getOrdererConfig() {
            return this.ordererConfig;
        }

        public DescribeGovernanceTasksResponseBodyResultContent setRaw(String raw) {
            this.raw = raw;
            return this;
        }
        public String getRaw() {
            return this.raw;
        }

        public DescribeGovernanceTasksResponseBodyResultContent setRemovedOrganizations(java.util.List<DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations> removedOrganizations) {
            this.removedOrganizations = removedOrganizations;
            return this;
        }
        public java.util.List<DescribeGovernanceTasksResponseBodyResultContentRemovedOrganizations> getRemovedOrganizations() {
            return this.removedOrganizations;
        }

        public DescribeGovernanceTasksResponseBodyResultContent setRwSets(String rwSets) {
            this.rwSets = rwSets;
            return this;
        }
        public String getRwSets() {
            return this.rwSets;
        }

    }

    public static class DescribeGovernanceTasksResponseBodyResult extends TeaModel {
        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("Content")
        public DescribeGovernanceTasksResponseBodyResultContent content;

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

        public static DescribeGovernanceTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeGovernanceTasksResponseBodyResult self = new DescribeGovernanceTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeGovernanceTasksResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeGovernanceTasksResponseBodyResult setContent(DescribeGovernanceTasksResponseBodyResultContent content) {
            this.content = content;
            return this;
        }
        public DescribeGovernanceTasksResponseBodyResultContent getContent() {
            return this.content;
        }

        public DescribeGovernanceTasksResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGovernanceTasksResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeGovernanceTasksResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGovernanceTasksResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGovernanceTasksResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeGovernanceTasksResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
