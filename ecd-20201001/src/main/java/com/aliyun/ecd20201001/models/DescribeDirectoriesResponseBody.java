// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201001.models;

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

    public static class DescribeDirectoriesResponseBodyDirectoriesADConnectors extends TeaModel {
        @NameInMap("ADConnectorAddress")
        public String ADConnectorAddress;

        @NameInMap("ConnectorStatus")
        public String connectorStatus;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeDirectoriesResponseBodyDirectoriesADConnectors build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoriesResponseBodyDirectoriesADConnectors self = new DescribeDirectoriesResponseBodyDirectoriesADConnectors();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoriesResponseBodyDirectoriesADConnectors setADConnectorAddress(String ADConnectorAddress) {
            this.ADConnectorAddress = ADConnectorAddress;
            return this;
        }
        public String getADConnectorAddress() {
            return this.ADConnectorAddress;
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

    }

    public static class DescribeDirectoriesResponseBodyDirectories extends TeaModel {
        @NameInMap("ADConnectors")
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesADConnectors> ADConnectors;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CustomSecurityGroupId")
        public String customSecurityGroupId;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("DirectoryType")
        public String directoryType;

        @NameInMap("DnsAddress")
        public java.util.List<String> dnsAddress;

        @NameInMap("DnsUserName")
        public String dnsUserName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainPassword")
        public String domainPassword;

        @NameInMap("DomainUserName")
        public String domainUserName;

        @NameInMap("EnableInternetAccess")
        public Boolean enableInternetAccess;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("TrustPassword")
        public String trustPassword;

        public static DescribeDirectoriesResponseBodyDirectories build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoriesResponseBodyDirectories self = new DescribeDirectoriesResponseBodyDirectories();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoriesResponseBodyDirectories setADConnectors(java.util.List<DescribeDirectoriesResponseBodyDirectoriesADConnectors> ADConnectors) {
            this.ADConnectors = ADConnectors;
            return this;
        }
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesADConnectors> getADConnectors() {
            return this.ADConnectors;
        }

        public DescribeDirectoriesResponseBodyDirectories setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDirectoriesResponseBodyDirectories setCustomSecurityGroupId(String customSecurityGroupId) {
            this.customSecurityGroupId = customSecurityGroupId;
            return this;
        }
        public String getCustomSecurityGroupId() {
            return this.customSecurityGroupId;
        }

        public DescribeDirectoriesResponseBodyDirectories setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeDirectoriesResponseBodyDirectories setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public DescribeDirectoriesResponseBodyDirectories setDnsAddress(java.util.List<String> dnsAddress) {
            this.dnsAddress = dnsAddress;
            return this;
        }
        public java.util.List<String> getDnsAddress() {
            return this.dnsAddress;
        }

        public DescribeDirectoriesResponseBodyDirectories setDnsUserName(String dnsUserName) {
            this.dnsUserName = dnsUserName;
            return this;
        }
        public String getDnsUserName() {
            return this.dnsUserName;
        }

        public DescribeDirectoriesResponseBodyDirectories setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDirectoriesResponseBodyDirectories setDomainPassword(String domainPassword) {
            this.domainPassword = domainPassword;
            return this;
        }
        public String getDomainPassword() {
            return this.domainPassword;
        }

        public DescribeDirectoriesResponseBodyDirectories setDomainUserName(String domainUserName) {
            this.domainUserName = domainUserName;
            return this;
        }
        public String getDomainUserName() {
            return this.domainUserName;
        }

        public DescribeDirectoriesResponseBodyDirectories setEnableInternetAccess(Boolean enableInternetAccess) {
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }
        public Boolean getEnableInternetAccess() {
            return this.enableInternetAccess;
        }

        public DescribeDirectoriesResponseBodyDirectories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDirectoriesResponseBodyDirectories setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDirectoriesResponseBodyDirectories setTrustPassword(String trustPassword) {
            this.trustPassword = trustPassword;
            return this;
        }
        public String getTrustPassword() {
            return this.trustPassword;
        }

    }

}
