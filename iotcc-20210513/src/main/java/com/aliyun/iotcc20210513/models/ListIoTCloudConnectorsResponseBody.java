// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IoTCloudConnectors")
    public java.util.List<ListIoTCloudConnectorsResponseBodyIoTCloudConnectors> ioTCloudConnectors;

    public static ListIoTCloudConnectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorsResponseBody self = new ListIoTCloudConnectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListIoTCloudConnectorsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIoTCloudConnectorsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIoTCloudConnectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIoTCloudConnectorsResponseBody setIoTCloudConnectors(java.util.List<ListIoTCloudConnectorsResponseBodyIoTCloudConnectors> ioTCloudConnectors) {
        this.ioTCloudConnectors = ioTCloudConnectors;
        return this;
    }
    public java.util.List<ListIoTCloudConnectorsResponseBodyIoTCloudConnectors> getIoTCloudConnectors() {
        return this.ioTCloudConnectors;
    }

    public static class ListIoTCloudConnectorsResponseBodyIoTCloudConnectors extends TeaModel {
        @NameInMap("IoTCloudConnectorId")
        public String ioTCloudConnectorId;

        @NameInMap("IoTCloudConnectorStatus")
        public String ioTCloudConnectorStatus;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("IoTCloudConnectorBusinessStatus")
        public String ioTCloudConnectorBusinessStatus;

        @NameInMap("Apn")
        public String apn;

        @NameInMap("RateLimit")
        public Long rateLimit;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("IoTCloudConnectorName")
        public String ioTCloudConnectorName;

        @NameInMap("IoTCloudConnectorDescription")
        public String ioTCloudConnectorDescription;

        @NameInMap("WildcardDomainEnabled")
        public Boolean wildcardDomainEnabled;

        public static ListIoTCloudConnectorsResponseBodyIoTCloudConnectors build(java.util.Map<String, ?> map) throws Exception {
            ListIoTCloudConnectorsResponseBodyIoTCloudConnectors self = new ListIoTCloudConnectorsResponseBodyIoTCloudConnectors();
            return TeaModel.build(map, self);
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setIoTCloudConnectorId(String ioTCloudConnectorId) {
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }
        public String getIoTCloudConnectorId() {
            return this.ioTCloudConnectorId;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setIoTCloudConnectorStatus(String ioTCloudConnectorStatus) {
            this.ioTCloudConnectorStatus = ioTCloudConnectorStatus;
            return this;
        }
        public String getIoTCloudConnectorStatus() {
            return this.ioTCloudConnectorStatus;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setIoTCloudConnectorBusinessStatus(String ioTCloudConnectorBusinessStatus) {
            this.ioTCloudConnectorBusinessStatus = ioTCloudConnectorBusinessStatus;
            return this;
        }
        public String getIoTCloudConnectorBusinessStatus() {
            return this.ioTCloudConnectorBusinessStatus;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setApn(String apn) {
            this.apn = apn;
            return this;
        }
        public String getApn() {
            return this.apn;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setRateLimit(Long rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }
        public Long getRateLimit() {
            return this.rateLimit;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setIoTCloudConnectorName(String ioTCloudConnectorName) {
            this.ioTCloudConnectorName = ioTCloudConnectorName;
            return this;
        }
        public String getIoTCloudConnectorName() {
            return this.ioTCloudConnectorName;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setIoTCloudConnectorDescription(String ioTCloudConnectorDescription) {
            this.ioTCloudConnectorDescription = ioTCloudConnectorDescription;
            return this;
        }
        public String getIoTCloudConnectorDescription() {
            return this.ioTCloudConnectorDescription;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setWildcardDomainEnabled(Boolean wildcardDomainEnabled) {
            this.wildcardDomainEnabled = wildcardDomainEnabled;
            return this;
        }
        public Boolean getWildcardDomainEnabled() {
            return this.wildcardDomainEnabled;
        }

    }

}
