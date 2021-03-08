// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDirectoriesResponseBody extends TeaModel {
    @NameInMap("Directories")
    public java.util.List<DescribeDirectoriesResponseBodyDirectories> directories;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoriesResponseBody self = new DescribeDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoriesResponseBody setDirectories(java.util.List<DescribeDirectoriesResponseBodyDirectories> directories) {
        this.directories = directories;
        return this;
    }
    public java.util.List<DescribeDirectoriesResponseBodyDirectories> getDirectories() {
        return this.directories;
    }

    public DescribeDirectoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDirectoriesResponseBodyDirectoriesLogs extends TeaModel {
        @NameInMap("Step")
        public String step;

        @NameInMap("Message")
        public String message;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Level")
        public String level;

        public static DescribeDirectoriesResponseBodyDirectoriesLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoriesResponseBodyDirectoriesLogs self = new DescribeDirectoriesResponseBodyDirectoriesLogs();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoriesResponseBodyDirectoriesLogs setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeDirectoriesResponseBodyDirectoriesLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeDirectoriesResponseBodyDirectoriesLogs setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDirectoriesResponseBodyDirectoriesLogs setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class DescribeDirectoriesResponseBodyDirectoriesADConnectors extends TeaModel {
        @NameInMap("ConnectorStatus")
        public String connectorStatus;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("ADConnectorAddress")
        public String ADConnectorAddress;

        public static DescribeDirectoriesResponseBodyDirectoriesADConnectors build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoriesResponseBodyDirectoriesADConnectors self = new DescribeDirectoriesResponseBodyDirectoriesADConnectors();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoriesResponseBodyDirectoriesADConnectors setConnectorStatus(String connectorStatus) {
            this.connectorStatus = connectorStatus;
            return this;
        }
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

        public DescribeDirectoriesResponseBodyDirectoriesADConnectors setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDirectoriesResponseBodyDirectoriesADConnectors setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeDirectoriesResponseBodyDirectoriesADConnectors setADConnectorAddress(String ADConnectorAddress) {
            this.ADConnectorAddress = ADConnectorAddress;
            return this;
        }
        public String getADConnectorAddress() {
            return this.ADConnectorAddress;
        }

    }

    public static class DescribeDirectoriesResponseBodyDirectories extends TeaModel {
        @NameInMap("EnableInternetAccess")
        public Boolean enableInternetAccess;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("DomainPassword")
        public String domainPassword;

        @NameInMap("CustomSecurityGroupId")
        public String customSecurityGroupId;

        @NameInMap("DomainUserName")
        public String domainUserName;

        @NameInMap("DesktopVpcEndpoint")
        public String desktopVpcEndpoint;

        @NameInMap("DesktopAccessType")
        public String desktopAccessType;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DirectoryType")
        public String directoryType;

        @NameInMap("DnsUserName")
        public String dnsUserName;

        @NameInMap("Logs")
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesLogs> logs;

        @NameInMap("TrustPassword")
        public String trustPassword;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("Name")
        public String name;

        @NameInMap("ADConnectors")
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesADConnectors> ADConnectors;

        @NameInMap("DnsAddress")
        public java.util.List<String> dnsAddress;

        @NameInMap("DirectoryId")
        public String directoryId;

        public static DescribeDirectoriesResponseBodyDirectories build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoriesResponseBodyDirectories self = new DescribeDirectoriesResponseBodyDirectories();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoriesResponseBodyDirectories setEnableInternetAccess(Boolean enableInternetAccess) {
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }
        public Boolean getEnableInternetAccess() {
            return this.enableInternetAccess;
        }

        public DescribeDirectoriesResponseBodyDirectories setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDirectoriesResponseBodyDirectories setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDirectoriesResponseBodyDirectories setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDirectoriesResponseBodyDirectories setDomainPassword(String domainPassword) {
            this.domainPassword = domainPassword;
            return this;
        }
        public String getDomainPassword() {
            return this.domainPassword;
        }

        public DescribeDirectoriesResponseBodyDirectories setCustomSecurityGroupId(String customSecurityGroupId) {
            this.customSecurityGroupId = customSecurityGroupId;
            return this;
        }
        public String getCustomSecurityGroupId() {
            return this.customSecurityGroupId;
        }

        public DescribeDirectoriesResponseBodyDirectories setDomainUserName(String domainUserName) {
            this.domainUserName = domainUserName;
            return this;
        }
        public String getDomainUserName() {
            return this.domainUserName;
        }

        public DescribeDirectoriesResponseBodyDirectories setDesktopVpcEndpoint(String desktopVpcEndpoint) {
            this.desktopVpcEndpoint = desktopVpcEndpoint;
            return this;
        }
        public String getDesktopVpcEndpoint() {
            return this.desktopVpcEndpoint;
        }

        public DescribeDirectoriesResponseBodyDirectories setDesktopAccessType(String desktopAccessType) {
            this.desktopAccessType = desktopAccessType;
            return this;
        }
        public String getDesktopAccessType() {
            return this.desktopAccessType;
        }

        public DescribeDirectoriesResponseBodyDirectories setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDirectoriesResponseBodyDirectories setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public DescribeDirectoriesResponseBodyDirectories setDnsUserName(String dnsUserName) {
            this.dnsUserName = dnsUserName;
            return this;
        }
        public String getDnsUserName() {
            return this.dnsUserName;
        }

        public DescribeDirectoriesResponseBodyDirectories setLogs(java.util.List<DescribeDirectoriesResponseBodyDirectoriesLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesLogs> getLogs() {
            return this.logs;
        }

        public DescribeDirectoriesResponseBodyDirectories setTrustPassword(String trustPassword) {
            this.trustPassword = trustPassword;
            return this;
        }
        public String getTrustPassword() {
            return this.trustPassword;
        }

        public DescribeDirectoriesResponseBodyDirectories setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeDirectoriesResponseBodyDirectories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDirectoriesResponseBodyDirectories setADConnectors(java.util.List<DescribeDirectoriesResponseBodyDirectoriesADConnectors> ADConnectors) {
            this.ADConnectors = ADConnectors;
            return this;
        }
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesADConnectors> getADConnectors() {
            return this.ADConnectors;
        }

        public DescribeDirectoriesResponseBodyDirectories setDnsAddress(java.util.List<String> dnsAddress) {
            this.dnsAddress = dnsAddress;
            return this;
        }
        public java.util.List<String> getDnsAddress() {
            return this.dnsAddress;
        }

        public DescribeDirectoriesResponseBodyDirectories setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

    }

}
