// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeNetworkInsightsAnalysisResultResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("DestinationIp")
    public String destinationIp;

    @NameInMap("DestinationPort")
    public String destinationPort;

    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("NetworkInsightsAnalysisComponents")
    public NetworkInsightsAnalysisComponents networkInsightsAnalysisComponents;

    @NameInMap("NetworkInsightsAnalysisId")
    public String networkInsightsAnalysisId;

    @NameInMap("NetworkInsightsPathId")
    public String networkInsightsPathId;

    @NameInMap("NetworkPathFound")
    public String networkPathFound;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Status")
    public String status;

    public static DescribeNetworkInsightsAnalysisResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInsightsAnalysisResultResponseBody self = new DescribeNetworkInsightsAnalysisResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
        return this;
    }
    public String getDestinationIp() {
        return this.destinationIp;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }
    public String getDestinationPort() {
        return this.destinationPort;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setNetworkInsightsAnalysisComponents(NetworkInsightsAnalysisComponents networkInsightsAnalysisComponents) {
        this.networkInsightsAnalysisComponents = networkInsightsAnalysisComponents;
        return this;
    }
    public NetworkInsightsAnalysisComponents getNetworkInsightsAnalysisComponents() {
        return this.networkInsightsAnalysisComponents;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setNetworkInsightsAnalysisId(String networkInsightsAnalysisId) {
        this.networkInsightsAnalysisId = networkInsightsAnalysisId;
        return this;
    }
    public String getNetworkInsightsAnalysisId() {
        return this.networkInsightsAnalysisId;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setNetworkInsightsPathId(String networkInsightsPathId) {
        this.networkInsightsPathId = networkInsightsPathId;
        return this;
    }
    public String getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setNetworkPathFound(String networkPathFound) {
        this.networkPathFound = networkPathFound;
        return this;
    }
    public String getNetworkPathFound() {
        return this.networkPathFound;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DescribeNetworkInsightsAnalysisResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class NetworkAclEntry extends TeaModel {
        @NameInMap("Direction")
        public String direction;

        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        @NameInMap("NetworkAclId")
        public String networkAclId;

        @NameInMap("NetworkAclName")
        public String networkAclName;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Port")
        public String port;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("VpcId")
        public String vpcId;

        public static NetworkAclEntry build(java.util.Map<String, ?> map) throws Exception {
            NetworkAclEntry self = new NetworkAclEntry();
            return TeaModel.build(map, self);
        }

        public NetworkAclEntry setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public NetworkAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public NetworkAclEntry setNetworkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        public NetworkAclEntry setNetworkAclName(String networkAclName) {
            this.networkAclName = networkAclName;
            return this;
        }
        public String getNetworkAclName() {
            return this.networkAclName;
        }

        public NetworkAclEntry setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public NetworkAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public NetworkAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public NetworkAclEntry setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public NetworkAclEntry setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class RelativeGroupIds extends TeaModel {
        @NameInMap("RelativeGroupId")
        public java.util.List<String> relativeGroupId;

        public static RelativeGroupIds build(java.util.Map<String, ?> map) throws Exception {
            RelativeGroupIds self = new RelativeGroupIds();
            return TeaModel.build(map, self);
        }

        public RelativeGroupIds setRelativeGroupId(java.util.List<String> relativeGroupId) {
            this.relativeGroupId = relativeGroupId;
            return this;
        }
        public java.util.List<String> getRelativeGroupId() {
            return this.relativeGroupId;
        }

    }

    public static class SecurityGroupAcl extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("DestGroupId")
        public String destGroupId;

        @NameInMap("DestPortRange")
        public String destPortRange;

        @NameInMap("InnerAccessPolicy")
        public String innerAccessPolicy;

        @NameInMap("NicType")
        public String nicType;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static SecurityGroupAcl build(java.util.Map<String, ?> map) throws Exception {
            SecurityGroupAcl self = new SecurityGroupAcl();
            return TeaModel.build(map, self);
        }

        public SecurityGroupAcl setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SecurityGroupAcl setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SecurityGroupAcl setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public SecurityGroupAcl setDestGroupId(String destGroupId) {
            this.destGroupId = destGroupId;
            return this;
        }
        public String getDestGroupId() {
            return this.destGroupId;
        }

        public SecurityGroupAcl setDestPortRange(String destPortRange) {
            this.destPortRange = destPortRange;
            return this;
        }
        public String getDestPortRange() {
            return this.destPortRange;
        }

        public SecurityGroupAcl setInnerAccessPolicy(String innerAccessPolicy) {
            this.innerAccessPolicy = innerAccessPolicy;
            return this;
        }
        public String getInnerAccessPolicy() {
            return this.innerAccessPolicy;
        }

        public SecurityGroupAcl setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public SecurityGroupAcl setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public SecurityGroupAcl setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public SecurityGroupAcl setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

    public static class TopProcesses extends TeaModel {
        @NameInMap("TopProcess")
        public java.util.List<String> topProcess;

        public static TopProcesses build(java.util.Map<String, ?> map) throws Exception {
            TopProcesses self = new TopProcesses();
            return TeaModel.build(map, self);
        }

        public TopProcesses setTopProcess(java.util.List<String> topProcess) {
            this.topProcess = topProcess;
            return this;
        }
        public java.util.List<String> getTopProcess() {
            return this.topProcess;
        }

    }

    public static class Explanations extends TeaModel {
        @NameInMap("ActualIP")
        public String actualIP;

        @NameInMap("ActualPort")
        public Long actualPort;

        @NameInMap("ExpectIP")
        public String expectIP;

        @NameInMap("ExpectPort")
        public Long expectPort;

        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Header")
        public String header;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("MissingFiles")
        public String missingFiles;

        @NameInMap("Netmask")
        public String netmask;

        @NameInMap("NetworkAclEntry")
        public NetworkAclEntry networkAclEntry;

        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        @NameInMap("Port")
        public Long port;

        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("RelativeGroupIds")
        public RelativeGroupIds relativeGroupIds;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("SecurityGroupAcl")
        public SecurityGroupAcl securityGroupAcl;

        @NameInMap("TopProcesses")
        public TopProcesses topProcesses;

        @NameInMap("UsePercent")
        public String usePercent;

        public static Explanations build(java.util.Map<String, ?> map) throws Exception {
            Explanations self = new Explanations();
            return TeaModel.build(map, self);
        }

        public Explanations setActualIP(String actualIP) {
            this.actualIP = actualIP;
            return this;
        }
        public String getActualIP() {
            return this.actualIP;
        }

        public Explanations setActualPort(Long actualPort) {
            this.actualPort = actualPort;
            return this;
        }
        public Long getActualPort() {
            return this.actualPort;
        }

        public Explanations setExpectIP(String expectIP) {
            this.expectIP = expectIP;
            return this;
        }
        public String getExpectIP() {
            return this.expectIP;
        }

        public Explanations setExpectPort(Long expectPort) {
            this.expectPort = expectPort;
            return this;
        }
        public Long getExpectPort() {
            return this.expectPort;
        }

        public Explanations setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public Explanations setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public Explanations setHeader(String header) {
            this.header = header;
            return this;
        }
        public String getHeader() {
            return this.header;
        }

        public Explanations setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public Explanations setMissingFiles(String missingFiles) {
            this.missingFiles = missingFiles;
            return this;
        }
        public String getMissingFiles() {
            return this.missingFiles;
        }

        public Explanations setNetmask(String netmask) {
            this.netmask = netmask;
            return this;
        }
        public String getNetmask() {
            return this.netmask;
        }

        public Explanations setNetworkAclEntry(NetworkAclEntry networkAclEntry) {
            this.networkAclEntry = networkAclEntry;
            return this;
        }
        public NetworkAclEntry getNetworkAclEntry() {
            return this.networkAclEntry;
        }

        public Explanations setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public Explanations setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public Explanations setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public Explanations setRelativeGroupIds(RelativeGroupIds relativeGroupIds) {
            this.relativeGroupIds = relativeGroupIds;
            return this;
        }
        public RelativeGroupIds getRelativeGroupIds() {
            return this.relativeGroupIds;
        }

        public Explanations setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public Explanations setSecurityGroupAcl(SecurityGroupAcl securityGroupAcl) {
            this.securityGroupAcl = securityGroupAcl;
            return this;
        }
        public SecurityGroupAcl getSecurityGroupAcl() {
            return this.securityGroupAcl;
        }

        public Explanations setTopProcesses(TopProcesses topProcesses) {
            this.topProcesses = topProcesses;
            return this;
        }
        public TopProcesses getTopProcesses() {
            return this.topProcesses;
        }

        public Explanations setUsePercent(String usePercent) {
            this.usePercent = usePercent;
            return this;
        }
        public String getUsePercent() {
            return this.usePercent;
        }

    }

    public static class CategoryItem extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Explanations")
        public Explanations explanations;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("Reachable")
        public String reachable;

        public static CategoryItem build(java.util.Map<String, ?> map) throws Exception {
            CategoryItem self = new CategoryItem();
            return TeaModel.build(map, self);
        }

        public CategoryItem setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CategoryItem setExplanations(Explanations explanations) {
            this.explanations = explanations;
            return this;
        }
        public Explanations getExplanations() {
            return this.explanations;
        }

        public CategoryItem setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public CategoryItem setReachable(String reachable) {
            this.reachable = reachable;
            return this;
        }
        public String getReachable() {
            return this.reachable;
        }

    }

    public static class CategoryItems extends TeaModel {
        @NameInMap("CategoryItem")
        public java.util.List<CategoryItem> categoryItem;

        public static CategoryItems build(java.util.Map<String, ?> map) throws Exception {
            CategoryItems self = new CategoryItems();
            return TeaModel.build(map, self);
        }

        public CategoryItems setCategoryItem(java.util.List<CategoryItem> categoryItem) {
            this.categoryItem = categoryItem;
            return this;
        }
        public java.util.List<CategoryItem> getCategoryItem() {
            return this.categoryItem;
        }

    }

    public static class DiagnoseCategory extends TeaModel {
        @NameInMap("CategoryItems")
        public CategoryItems categoryItems;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Reachable")
        public String reachable;

        public static DiagnoseCategory build(java.util.Map<String, ?> map) throws Exception {
            DiagnoseCategory self = new DiagnoseCategory();
            return TeaModel.build(map, self);
        }

        public DiagnoseCategory setCategoryItems(CategoryItems categoryItems) {
            this.categoryItems = categoryItems;
            return this;
        }
        public CategoryItems getCategoryItems() {
            return this.categoryItems;
        }

        public DiagnoseCategory setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DiagnoseCategory setReachable(String reachable) {
            this.reachable = reachable;
            return this;
        }
        public String getReachable() {
            return this.reachable;
        }

    }

    public static class DiagnoseCategories extends TeaModel {
        @NameInMap("DiagnoseCategory")
        public java.util.List<DiagnoseCategory> diagnoseCategory;

        public static DiagnoseCategories build(java.util.Map<String, ?> map) throws Exception {
            DiagnoseCategories self = new DiagnoseCategories();
            return TeaModel.build(map, self);
        }

        public DiagnoseCategories setDiagnoseCategory(java.util.List<DiagnoseCategory> diagnoseCategory) {
            this.diagnoseCategory = diagnoseCategory;
            return this;
        }
        public java.util.List<DiagnoseCategory> getDiagnoseCategory() {
            return this.diagnoseCategory;
        }

    }

    public static class NetworkInsightsAnalysisComponentNetworkAclEntry extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DestinationCidrIp")
        public String destinationCidrIp;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        @NameInMap("NetworkAclId")
        public String networkAclId;

        @NameInMap("NetworkAclName")
        public String networkAclName;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Port")
        public String port;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("VpcId")
        public String vpcId;

        public static NetworkInsightsAnalysisComponentNetworkAclEntry build(java.util.Map<String, ?> map) throws Exception {
            NetworkInsightsAnalysisComponentNetworkAclEntry self = new NetworkInsightsAnalysisComponentNetworkAclEntry();
            return TeaModel.build(map, self);
        }

        public NetworkInsightsAnalysisComponentNetworkAclEntry setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public NetworkInsightsAnalysisComponentNetworkAclEntry setDestinationCidrIp(String destinationCidrIp) {
            this.destinationCidrIp = destinationCidrIp;
            return this;
        }
        public String getDestinationCidrIp() {
            return this.destinationCidrIp;
        }

        public NetworkInsightsAnalysisComponentNetworkAclEntry setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public NetworkInsightsAnalysisComponentNetworkAclEntry setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public NetworkInsightsAnalysisComponentNetworkAclEntry setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public NetworkInsightsAnalysisComponentNetworkAclEntry setNetworkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        public NetworkInsightsAnalysisComponentNetworkAclEntry setNetworkAclName(String networkAclName) {
            this.networkAclName = networkAclName;
            return this;
        }
        public String getNetworkAclName() {
            return this.networkAclName;
        }

        public NetworkInsightsAnalysisComponentNetworkAclEntry setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public NetworkInsightsAnalysisComponentNetworkAclEntry setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public NetworkInsightsAnalysisComponentNetworkAclEntry setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public NetworkInsightsAnalysisComponentNetworkAclEntry setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public NetworkInsightsAnalysisComponentNetworkAclEntry setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class NetworkInsightsAnalysisComponentRelativeGroupIds extends TeaModel {
        @NameInMap("RelativeGroupId")
        public java.util.List<String> relativeGroupId;

        public static NetworkInsightsAnalysisComponentRelativeGroupIds build(java.util.Map<String, ?> map) throws Exception {
            NetworkInsightsAnalysisComponentRelativeGroupIds self = new NetworkInsightsAnalysisComponentRelativeGroupIds();
            return TeaModel.build(map, self);
        }

        public NetworkInsightsAnalysisComponentRelativeGroupIds setRelativeGroupId(java.util.List<String> relativeGroupId) {
            this.relativeGroupId = relativeGroupId;
            return this;
        }
        public java.util.List<String> getRelativeGroupId() {
            return this.relativeGroupId;
        }

    }

    public static class NetworkInsightsAnalysisComponentSecurityGroupAcl extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("DestGroupId")
        public String destGroupId;

        @NameInMap("DestGroupName")
        public String destGroupName;

        @NameInMap("DestPortRange")
        public String destPortRange;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("InnerAccessPolicy")
        public String innerAccessPolicy;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        @NameInMap("NicType")
        public String nicType;

        @NameInMap("PermissionDescription")
        public String permissionDescription;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("SourceGroupId")
        public String sourceGroupId;

        @NameInMap("SourceGroupName")
        public String sourceGroupName;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static NetworkInsightsAnalysisComponentSecurityGroupAcl build(java.util.Map<String, ?> map) throws Exception {
            NetworkInsightsAnalysisComponentSecurityGroupAcl self = new NetworkInsightsAnalysisComponentSecurityGroupAcl();
            return TeaModel.build(map, self);
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setDestGroupId(String destGroupId) {
            this.destGroupId = destGroupId;
            return this;
        }
        public String getDestGroupId() {
            return this.destGroupId;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setDestGroupName(String destGroupName) {
            this.destGroupName = destGroupName;
            return this;
        }
        public String getDestGroupName() {
            return this.destGroupName;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setDestPortRange(String destPortRange) {
            this.destPortRange = destPortRange;
            return this;
        }
        public String getDestPortRange() {
            return this.destPortRange;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setInnerAccessPolicy(String innerAccessPolicy) {
            this.innerAccessPolicy = innerAccessPolicy;
            return this;
        }
        public String getInnerAccessPolicy() {
            return this.innerAccessPolicy;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setIpv6DestCidrIp(String ipv6DestCidrIp) {
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setPermissionDescription(String permissionDescription) {
            this.permissionDescription = permissionDescription;
            return this;
        }
        public String getPermissionDescription() {
            return this.permissionDescription;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setSourceGroupId(String sourceGroupId) {
            this.sourceGroupId = sourceGroupId;
            return this;
        }
        public String getSourceGroupId() {
            return this.sourceGroupId;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setSourceGroupName(String sourceGroupName) {
            this.sourceGroupName = sourceGroupName;
            return this;
        }
        public String getSourceGroupName() {
            return this.sourceGroupName;
        }

        public NetworkInsightsAnalysisComponentSecurityGroupAcl setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

    public static class NetworkInsightsAnalysisComponent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DiagnoseCategories")
        public DiagnoseCategories diagnoseCategories;

        @NameInMap("Message")
        public String message;

        @NameInMap("NetworkAclEntry")
        public NetworkInsightsAnalysisComponentNetworkAclEntry networkAclEntry;

        @NameInMap("Reachable")
        public String reachable;

        @NameInMap("RelativeGroupIds")
        public NetworkInsightsAnalysisComponentRelativeGroupIds relativeGroupIds;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SecurityGroupAcl")
        public NetworkInsightsAnalysisComponentSecurityGroupAcl securityGroupAcl;

        @NameInMap("Sequence")
        public Integer sequence;

        public static NetworkInsightsAnalysisComponent build(java.util.Map<String, ?> map) throws Exception {
            NetworkInsightsAnalysisComponent self = new NetworkInsightsAnalysisComponent();
            return TeaModel.build(map, self);
        }

        public NetworkInsightsAnalysisComponent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public NetworkInsightsAnalysisComponent setDiagnoseCategories(DiagnoseCategories diagnoseCategories) {
            this.diagnoseCategories = diagnoseCategories;
            return this;
        }
        public DiagnoseCategories getDiagnoseCategories() {
            return this.diagnoseCategories;
        }

        public NetworkInsightsAnalysisComponent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public NetworkInsightsAnalysisComponent setNetworkAclEntry(NetworkInsightsAnalysisComponentNetworkAclEntry networkAclEntry) {
            this.networkAclEntry = networkAclEntry;
            return this;
        }
        public NetworkInsightsAnalysisComponentNetworkAclEntry getNetworkAclEntry() {
            return this.networkAclEntry;
        }

        public NetworkInsightsAnalysisComponent setReachable(String reachable) {
            this.reachable = reachable;
            return this;
        }
        public String getReachable() {
            return this.reachable;
        }

        public NetworkInsightsAnalysisComponent setRelativeGroupIds(NetworkInsightsAnalysisComponentRelativeGroupIds relativeGroupIds) {
            this.relativeGroupIds = relativeGroupIds;
            return this;
        }
        public NetworkInsightsAnalysisComponentRelativeGroupIds getRelativeGroupIds() {
            return this.relativeGroupIds;
        }

        public NetworkInsightsAnalysisComponent setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public NetworkInsightsAnalysisComponent setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public NetworkInsightsAnalysisComponent setSecurityGroupAcl(NetworkInsightsAnalysisComponentSecurityGroupAcl securityGroupAcl) {
            this.securityGroupAcl = securityGroupAcl;
            return this;
        }
        public NetworkInsightsAnalysisComponentSecurityGroupAcl getSecurityGroupAcl() {
            return this.securityGroupAcl;
        }

        public NetworkInsightsAnalysisComponent setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

    }

    public static class NetworkInsightsAnalysisComponents extends TeaModel {
        @NameInMap("NetworkInsightsAnalysisComponent")
        public java.util.List<NetworkInsightsAnalysisComponent> networkInsightsAnalysisComponent;

        public static NetworkInsightsAnalysisComponents build(java.util.Map<String, ?> map) throws Exception {
            NetworkInsightsAnalysisComponents self = new NetworkInsightsAnalysisComponents();
            return TeaModel.build(map, self);
        }

        public NetworkInsightsAnalysisComponents setNetworkInsightsAnalysisComponent(java.util.List<NetworkInsightsAnalysisComponent> networkInsightsAnalysisComponent) {
            this.networkInsightsAnalysisComponent = networkInsightsAnalysisComponent;
            return this;
        }
        public java.util.List<NetworkInsightsAnalysisComponent> getNetworkInsightsAnalysisComponent() {
            return this.networkInsightsAnalysisComponent;
        }

    }

}
