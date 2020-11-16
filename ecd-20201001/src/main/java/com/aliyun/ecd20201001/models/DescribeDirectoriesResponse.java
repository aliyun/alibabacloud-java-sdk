// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201001.models;

import com.aliyun.tea.*;

public class DescribeDirectoriesResponse extends TeaModel {
    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Directories")
    @Validation(required = true)
    public java.util.List<DescribeDirectoriesResponseDirectories> directories;

    public static DescribeDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoriesResponse self = new DescribeDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoriesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDirectoriesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDirectoriesResponse setDirectories(java.util.List<DescribeDirectoriesResponseDirectories> directories) {
        this.directories = directories;
        return this;
    }
    public java.util.List<DescribeDirectoriesResponseDirectories> getDirectories() {
        return this.directories;
    }

    public static class DescribeDirectoriesResponseDirectoriesADConnectors extends TeaModel {
        @NameInMap("ADConnectorAddress")
        @Validation(required = true)
        public String ADConnectorAddress;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("ConnectorStatus")
        @Validation(required = true)
        public String connectorStatus;

        public static DescribeDirectoriesResponseDirectoriesADConnectors build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoriesResponseDirectoriesADConnectors self = new DescribeDirectoriesResponseDirectoriesADConnectors();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoriesResponseDirectoriesADConnectors setADConnectorAddress(String ADConnectorAddress) {
            this.ADConnectorAddress = ADConnectorAddress;
            return this;
        }
        public String getADConnectorAddress() {
            return this.ADConnectorAddress;
        }

        public DescribeDirectoriesResponseDirectoriesADConnectors setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDirectoriesResponseDirectoriesADConnectors setConnectorStatus(String connectorStatus) {
            this.connectorStatus = connectorStatus;
            return this;
        }
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

    }

    public static class DescribeDirectoriesResponseDirectories extends TeaModel {
        @NameInMap("DirectoryId")
        @Validation(required = true)
        public String directoryId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("DirectoryType")
        @Validation(required = true)
        public String directoryType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("CustomSecurityGroupId")
        @Validation(required = true)
        public String customSecurityGroupId;

        @NameInMap("DnsUserName")
        @Validation(required = true)
        public String dnsUserName;

        @NameInMap("EnableInternetAccess")
        @Validation(required = true)
        public Boolean enableInternetAccess;

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

        @NameInMap("ADConnectors")
        @Validation(required = true)
        public java.util.List<DescribeDirectoriesResponseDirectoriesADConnectors> ADConnectors;

        @NameInMap("DnsAddress")
        @Validation(required = true)
        public java.util.List<String> dnsAddress;

        public static DescribeDirectoriesResponseDirectories build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoriesResponseDirectories self = new DescribeDirectoriesResponseDirectories();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoriesResponseDirectories setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeDirectoriesResponseDirectories setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDirectoriesResponseDirectories setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public DescribeDirectoriesResponseDirectories setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDirectoriesResponseDirectories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDirectoriesResponseDirectories setCustomSecurityGroupId(String customSecurityGroupId) {
            this.customSecurityGroupId = customSecurityGroupId;
            return this;
        }
        public String getCustomSecurityGroupId() {
            return this.customSecurityGroupId;
        }

        public DescribeDirectoriesResponseDirectories setDnsUserName(String dnsUserName) {
            this.dnsUserName = dnsUserName;
            return this;
        }
        public String getDnsUserName() {
            return this.dnsUserName;
        }

        public DescribeDirectoriesResponseDirectories setEnableInternetAccess(Boolean enableInternetAccess) {
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }
        public Boolean getEnableInternetAccess() {
            return this.enableInternetAccess;
        }

        public DescribeDirectoriesResponseDirectories setTrustPassword(String trustPassword) {
            this.trustPassword = trustPassword;
            return this;
        }
        public String getTrustPassword() {
            return this.trustPassword;
        }

        public DescribeDirectoriesResponseDirectories setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDirectoriesResponseDirectories setDomainUserName(String domainUserName) {
            this.domainUserName = domainUserName;
            return this;
        }
        public String getDomainUserName() {
            return this.domainUserName;
        }

        public DescribeDirectoriesResponseDirectories setDomainPassword(String domainPassword) {
            this.domainPassword = domainPassword;
            return this;
        }
        public String getDomainPassword() {
            return this.domainPassword;
        }

        public DescribeDirectoriesResponseDirectories setADConnectors(java.util.List<DescribeDirectoriesResponseDirectoriesADConnectors> ADConnectors) {
            this.ADConnectors = ADConnectors;
            return this;
        }
        public java.util.List<DescribeDirectoriesResponseDirectoriesADConnectors> getADConnectors() {
            return this.ADConnectors;
        }

        public DescribeDirectoriesResponseDirectories setDnsAddress(java.util.List<String> dnsAddress) {
            this.dnsAddress = dnsAddress;
            return this;
        }
        public java.util.List<String> getDnsAddress() {
            return this.dnsAddress;
        }

    }

}
