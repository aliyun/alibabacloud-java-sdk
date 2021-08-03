// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOfficeSitesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OfficeSites")
    public java.util.List<DescribeOfficeSitesResponseBodyOfficeSites> officeSites;

    public static DescribeOfficeSitesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfficeSitesResponseBody self = new DescribeOfficeSitesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOfficeSitesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeOfficeSitesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOfficeSitesResponseBody setOfficeSites(java.util.List<DescribeOfficeSitesResponseBodyOfficeSites> officeSites) {
        this.officeSites = officeSites;
        return this;
    }
    public java.util.List<DescribeOfficeSitesResponseBodyOfficeSites> getOfficeSites() {
        return this.officeSites;
    }

    public static class DescribeOfficeSitesResponseBodyOfficeSitesADConnectors extends TeaModel {
        @NameInMap("ConnectorStatus")
        public String connectorStatus;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ADConnectorAddress")
        public String ADConnectorAddress;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        public static DescribeOfficeSitesResponseBodyOfficeSitesADConnectors build(java.util.Map<String, ?> map) throws Exception {
            DescribeOfficeSitesResponseBodyOfficeSitesADConnectors self = new DescribeOfficeSitesResponseBodyOfficeSitesADConnectors();
            return TeaModel.build(map, self);
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesADConnectors setConnectorStatus(String connectorStatus) {
            this.connectorStatus = connectorStatus;
            return this;
        }
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesADConnectors setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesADConnectors setADConnectorAddress(String ADConnectorAddress) {
            this.ADConnectorAddress = ADConnectorAddress;
            return this;
        }
        public String getADConnectorAddress() {
            return this.ADConnectorAddress;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesADConnectors setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

    }

    public static class DescribeOfficeSitesResponseBodyOfficeSitesLogs extends TeaModel {
        @NameInMap("Step")
        public String step;

        @NameInMap("Message")
        public String message;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Level")
        public String level;

        public static DescribeOfficeSitesResponseBodyOfficeSitesLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeOfficeSitesResponseBodyOfficeSitesLogs self = new DescribeOfficeSitesResponseBodyOfficeSitesLogs();
            return TeaModel.build(map, self);
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesLogs setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesLogs setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesLogs setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class DescribeOfficeSitesResponseBodyOfficeSites extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("EnableAdminAccess")
        public Boolean enableAdminAccess;

        @NameInMap("EnableCrossDesktopAccess")
        public Boolean enableCrossDesktopAccess;

        @NameInMap("DesktopVpcEndpoint")
        public String desktopVpcEndpoint;

        @NameInMap("DesktopAccessType")
        public String desktopAccessType;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("SsoEnabled")
        public Boolean ssoEnabled;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("TrustPassword")
        public String trustPassword;

        @NameInMap("Name")
        public String name;

        @NameInMap("EnableInternetAccess")
        public Boolean enableInternetAccess;

        @NameInMap("DomainPassword")
        public String domainPassword;

        @NameInMap("CustomSecurityGroupId")
        public String customSecurityGroupId;

        @NameInMap("DomainUserName")
        public String domainUserName;

        @NameInMap("SubDomainName")
        public String subDomainName;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("MfaEnabled")
        public Boolean mfaEnabled;

        @NameInMap("NetworkPackageId")
        public String networkPackageId;

        @NameInMap("DnsUserName")
        public String dnsUserName;

        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        @NameInMap("ADConnectors")
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesADConnectors> ADConnectors;

        @NameInMap("Logs")
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesLogs> logs;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("FileSystemIds")
        public java.util.List<String> fileSystemIds;

        @NameInMap("SubDnsAddress")
        public java.util.List<String> subDnsAddress;

        @NameInMap("DnsAddress")
        public java.util.List<String> dnsAddress;

        public static DescribeOfficeSitesResponseBodyOfficeSites build(java.util.Map<String, ?> map) throws Exception {
            DescribeOfficeSitesResponseBodyOfficeSites self = new DescribeOfficeSitesResponseBodyOfficeSites();
            return TeaModel.build(map, self);
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setEnableAdminAccess(Boolean enableAdminAccess) {
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }
        public Boolean getEnableAdminAccess() {
            return this.enableAdminAccess;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setEnableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
            this.enableCrossDesktopAccess = enableCrossDesktopAccess;
            return this;
        }
        public Boolean getEnableCrossDesktopAccess() {
            return this.enableCrossDesktopAccess;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDesktopVpcEndpoint(String desktopVpcEndpoint) {
            this.desktopVpcEndpoint = desktopVpcEndpoint;
            return this;
        }
        public String getDesktopVpcEndpoint() {
            return this.desktopVpcEndpoint;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDesktopAccessType(String desktopAccessType) {
            this.desktopAccessType = desktopAccessType;
            return this;
        }
        public String getDesktopAccessType() {
            return this.desktopAccessType;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setSsoEnabled(Boolean ssoEnabled) {
            this.ssoEnabled = ssoEnabled;
            return this;
        }
        public Boolean getSsoEnabled() {
            return this.ssoEnabled;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setTrustPassword(String trustPassword) {
            this.trustPassword = trustPassword;
            return this;
        }
        public String getTrustPassword() {
            return this.trustPassword;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setEnableInternetAccess(Boolean enableInternetAccess) {
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }
        public Boolean getEnableInternetAccess() {
            return this.enableInternetAccess;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDomainPassword(String domainPassword) {
            this.domainPassword = domainPassword;
            return this;
        }
        public String getDomainPassword() {
            return this.domainPassword;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setCustomSecurityGroupId(String customSecurityGroupId) {
            this.customSecurityGroupId = customSecurityGroupId;
            return this;
        }
        public String getCustomSecurityGroupId() {
            return this.customSecurityGroupId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDomainUserName(String domainUserName) {
            this.domainUserName = domainUserName;
            return this;
        }
        public String getDomainUserName() {
            return this.domainUserName;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setSubDomainName(String subDomainName) {
            this.subDomainName = subDomainName;
            return this;
        }
        public String getSubDomainName() {
            return this.subDomainName;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setMfaEnabled(Boolean mfaEnabled) {
            this.mfaEnabled = mfaEnabled;
            return this;
        }
        public Boolean getMfaEnabled() {
            return this.mfaEnabled;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setNetworkPackageId(String networkPackageId) {
            this.networkPackageId = networkPackageId;
            return this;
        }
        public String getNetworkPackageId() {
            return this.networkPackageId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDnsUserName(String dnsUserName) {
            this.dnsUserName = dnsUserName;
            return this;
        }
        public String getDnsUserName() {
            return this.dnsUserName;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setADConnectors(java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesADConnectors> ADConnectors) {
            this.ADConnectors = ADConnectors;
            return this;
        }
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesADConnectors> getADConnectors() {
            return this.ADConnectors;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setLogs(java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesLogs> getLogs() {
            return this.logs;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setFileSystemIds(java.util.List<String> fileSystemIds) {
            this.fileSystemIds = fileSystemIds;
            return this;
        }
        public java.util.List<String> getFileSystemIds() {
            return this.fileSystemIds;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setSubDnsAddress(java.util.List<String> subDnsAddress) {
            this.subDnsAddress = subDnsAddress;
            return this;
        }
        public java.util.List<String> getSubDnsAddress() {
            return this.subDnsAddress;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDnsAddress(java.util.List<String> dnsAddress) {
            this.dnsAddress = dnsAddress;
            return this;
        }
        public java.util.List<String> getDnsAddress() {
            return this.dnsAddress;
        }

    }

}
