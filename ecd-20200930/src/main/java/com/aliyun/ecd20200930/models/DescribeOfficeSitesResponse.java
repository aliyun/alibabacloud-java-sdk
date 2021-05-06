// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOfficeSitesResponse extends TeaModel {
    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OfficeSites")
    @Validation(required = true)
    public java.util.List<DescribeOfficeSitesResponseOfficeSites> officeSites;

    public static DescribeOfficeSitesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfficeSitesResponse self = new DescribeOfficeSitesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOfficeSitesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeOfficeSitesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOfficeSitesResponse setOfficeSites(java.util.List<DescribeOfficeSitesResponseOfficeSites> officeSites) {
        this.officeSites = officeSites;
        return this;
    }
    public java.util.List<DescribeOfficeSitesResponseOfficeSites> getOfficeSites() {
        return this.officeSites;
    }

    public static class DescribeOfficeSitesResponseOfficeSitesADConnectors extends TeaModel {
        @NameInMap("ADConnectorAddress")
        @Validation(required = true)
        public String ADConnectorAddress;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("ConnectorStatus")
        @Validation(required = true)
        public String connectorStatus;

        @NameInMap("NetworkInterfaceId")
        @Validation(required = true)
        public String networkInterfaceId;

        public static DescribeOfficeSitesResponseOfficeSitesADConnectors build(java.util.Map<String, ?> map) throws Exception {
            DescribeOfficeSitesResponseOfficeSitesADConnectors self = new DescribeOfficeSitesResponseOfficeSitesADConnectors();
            return TeaModel.build(map, self);
        }

        public DescribeOfficeSitesResponseOfficeSitesADConnectors setADConnectorAddress(String ADConnectorAddress) {
            this.ADConnectorAddress = ADConnectorAddress;
            return this;
        }
        public String getADConnectorAddress() {
            return this.ADConnectorAddress;
        }

        public DescribeOfficeSitesResponseOfficeSitesADConnectors setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeOfficeSitesResponseOfficeSitesADConnectors setConnectorStatus(String connectorStatus) {
            this.connectorStatus = connectorStatus;
            return this;
        }
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

        public DescribeOfficeSitesResponseOfficeSitesADConnectors setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

    }

    public static class DescribeOfficeSitesResponseOfficeSitesLogs extends TeaModel {
        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Step")
        @Validation(required = true)
        public String step;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static DescribeOfficeSitesResponseOfficeSitesLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeOfficeSitesResponseOfficeSitesLogs self = new DescribeOfficeSitesResponseOfficeSitesLogs();
            return TeaModel.build(map, self);
        }

        public DescribeOfficeSitesResponseOfficeSitesLogs setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeOfficeSitesResponseOfficeSitesLogs setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeOfficeSitesResponseOfficeSitesLogs setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeOfficeSitesResponseOfficeSitesLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribeOfficeSitesResponseOfficeSites extends TeaModel {
        @NameInMap("OfficeSiteId")
        @Validation(required = true)
        public String officeSiteId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("OfficeSiteType")
        @Validation(required = true)
        public String officeSiteType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("CustomSecurityGroupId")
        @Validation(required = true)
        public String customSecurityGroupId;

        @NameInMap("DnsUserName")
        @Validation(required = true)
        public String dnsUserName;

        @NameInMap("EnableInternetAccess")
        @Validation(required = true)
        public Boolean enableInternetAccess;

        @NameInMap("EnableAdminAccess")
        @Validation(required = true)
        public Boolean enableAdminAccess;

        @NameInMap("DesktopAccessType")
        @Validation(required = true)
        public String desktopAccessType;

        @NameInMap("DesktopVpcEndpoint")
        @Validation(required = true)
        public String desktopVpcEndpoint;

        @NameInMap("TrustPassword")
        @Validation(required = true)
        public String trustPassword;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("DomainUserName")
        @Validation(required = true)
        public String domainUserName;

        @NameInMap("DomainPassword")
        @Validation(required = true)
        public String domainPassword;

        @NameInMap("SubDomainName")
        @Validation(required = true)
        public String subDomainName;

        @NameInMap("MfaEnabled")
        @Validation(required = true)
        public Boolean mfaEnabled;

        @NameInMap("SsoEnabled")
        @Validation(required = true)
        public Boolean ssoEnabled;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public Integer bandwidth;

        @NameInMap("CenId")
        @Validation(required = true)
        public String cenId;

        @NameInMap("NetworkPackageId")
        @Validation(required = true)
        public String networkPackageId;

        @NameInMap("CidrBlock")
        @Validation(required = true)
        public String cidrBlock;

        @NameInMap("ADConnectors")
        @Validation(required = true)
        public java.util.List<DescribeOfficeSitesResponseOfficeSitesADConnectors> ADConnectors;

        @NameInMap("Logs")
        @Validation(required = true)
        public java.util.List<DescribeOfficeSitesResponseOfficeSitesLogs> logs;

        @NameInMap("DnsAddress")
        @Validation(required = true)
        public java.util.List<String> dnsAddress;

        @NameInMap("SubDnsAddress")
        @Validation(required = true)
        public java.util.List<String> subDnsAddress;

        @NameInMap("VSwitchIds")
        @Validation(required = true)
        public java.util.List<String> vSwitchIds;

        @NameInMap("FileSystemIds")
        @Validation(required = true)
        public java.util.List<String> fileSystemIds;

        public static DescribeOfficeSitesResponseOfficeSites build(java.util.Map<String, ?> map) throws Exception {
            DescribeOfficeSitesResponseOfficeSites self = new DescribeOfficeSitesResponseOfficeSites();
            return TeaModel.build(map, self);
        }

        public DescribeOfficeSitesResponseOfficeSites setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeOfficeSitesResponseOfficeSites setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOfficeSitesResponseOfficeSites setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeOfficeSitesResponseOfficeSites setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeOfficeSitesResponseOfficeSites setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOfficeSitesResponseOfficeSites setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeOfficeSitesResponseOfficeSites setCustomSecurityGroupId(String customSecurityGroupId) {
            this.customSecurityGroupId = customSecurityGroupId;
            return this;
        }
        public String getCustomSecurityGroupId() {
            return this.customSecurityGroupId;
        }

        public DescribeOfficeSitesResponseOfficeSites setDnsUserName(String dnsUserName) {
            this.dnsUserName = dnsUserName;
            return this;
        }
        public String getDnsUserName() {
            return this.dnsUserName;
        }

        public DescribeOfficeSitesResponseOfficeSites setEnableInternetAccess(Boolean enableInternetAccess) {
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }
        public Boolean getEnableInternetAccess() {
            return this.enableInternetAccess;
        }

        public DescribeOfficeSitesResponseOfficeSites setEnableAdminAccess(Boolean enableAdminAccess) {
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }
        public Boolean getEnableAdminAccess() {
            return this.enableAdminAccess;
        }

        public DescribeOfficeSitesResponseOfficeSites setDesktopAccessType(String desktopAccessType) {
            this.desktopAccessType = desktopAccessType;
            return this;
        }
        public String getDesktopAccessType() {
            return this.desktopAccessType;
        }

        public DescribeOfficeSitesResponseOfficeSites setDesktopVpcEndpoint(String desktopVpcEndpoint) {
            this.desktopVpcEndpoint = desktopVpcEndpoint;
            return this;
        }
        public String getDesktopVpcEndpoint() {
            return this.desktopVpcEndpoint;
        }

        public DescribeOfficeSitesResponseOfficeSites setTrustPassword(String trustPassword) {
            this.trustPassword = trustPassword;
            return this;
        }
        public String getTrustPassword() {
            return this.trustPassword;
        }

        public DescribeOfficeSitesResponseOfficeSites setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeOfficeSitesResponseOfficeSites setDomainUserName(String domainUserName) {
            this.domainUserName = domainUserName;
            return this;
        }
        public String getDomainUserName() {
            return this.domainUserName;
        }

        public DescribeOfficeSitesResponseOfficeSites setDomainPassword(String domainPassword) {
            this.domainPassword = domainPassword;
            return this;
        }
        public String getDomainPassword() {
            return this.domainPassword;
        }

        public DescribeOfficeSitesResponseOfficeSites setSubDomainName(String subDomainName) {
            this.subDomainName = subDomainName;
            return this;
        }
        public String getSubDomainName() {
            return this.subDomainName;
        }

        public DescribeOfficeSitesResponseOfficeSites setMfaEnabled(Boolean mfaEnabled) {
            this.mfaEnabled = mfaEnabled;
            return this;
        }
        public Boolean getMfaEnabled() {
            return this.mfaEnabled;
        }

        public DescribeOfficeSitesResponseOfficeSites setSsoEnabled(Boolean ssoEnabled) {
            this.ssoEnabled = ssoEnabled;
            return this;
        }
        public Boolean getSsoEnabled() {
            return this.ssoEnabled;
        }

        public DescribeOfficeSitesResponseOfficeSites setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeOfficeSitesResponseOfficeSites setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeOfficeSitesResponseOfficeSites setNetworkPackageId(String networkPackageId) {
            this.networkPackageId = networkPackageId;
            return this;
        }
        public String getNetworkPackageId() {
            return this.networkPackageId;
        }

        public DescribeOfficeSitesResponseOfficeSites setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeOfficeSitesResponseOfficeSites setADConnectors(java.util.List<DescribeOfficeSitesResponseOfficeSitesADConnectors> ADConnectors) {
            this.ADConnectors = ADConnectors;
            return this;
        }
        public java.util.List<DescribeOfficeSitesResponseOfficeSitesADConnectors> getADConnectors() {
            return this.ADConnectors;
        }

        public DescribeOfficeSitesResponseOfficeSites setLogs(java.util.List<DescribeOfficeSitesResponseOfficeSitesLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribeOfficeSitesResponseOfficeSitesLogs> getLogs() {
            return this.logs;
        }

        public DescribeOfficeSitesResponseOfficeSites setDnsAddress(java.util.List<String> dnsAddress) {
            this.dnsAddress = dnsAddress;
            return this;
        }
        public java.util.List<String> getDnsAddress() {
            return this.dnsAddress;
        }

        public DescribeOfficeSitesResponseOfficeSites setSubDnsAddress(java.util.List<String> subDnsAddress) {
            this.subDnsAddress = subDnsAddress;
            return this;
        }
        public java.util.List<String> getSubDnsAddress() {
            return this.subDnsAddress;
        }

        public DescribeOfficeSitesResponseOfficeSites setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeOfficeSitesResponseOfficeSites setFileSystemIds(java.util.List<String> fileSystemIds) {
            this.fileSystemIds = fileSystemIds;
            return this;
        }
        public java.util.List<String> getFileSystemIds() {
            return this.fileSystemIds;
        }

    }

}
