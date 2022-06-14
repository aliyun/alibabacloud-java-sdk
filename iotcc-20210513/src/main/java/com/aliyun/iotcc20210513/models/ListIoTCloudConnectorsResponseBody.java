// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorsResponseBody extends TeaModel {
    @NameInMap("IoTCloudConnectors")
    public java.util.List<ListIoTCloudConnectorsResponseBodyIoTCloudConnectors> ioTCloudConnectors;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIoTCloudConnectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorsResponseBody self = new ListIoTCloudConnectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorsResponseBody setIoTCloudConnectors(java.util.List<ListIoTCloudConnectorsResponseBodyIoTCloudConnectors> ioTCloudConnectors) {
        this.ioTCloudConnectors = ioTCloudConnectors;
        return this;
    }
    public java.util.List<ListIoTCloudConnectorsResponseBodyIoTCloudConnectors> getIoTCloudConnectors() {
        return this.ioTCloudConnectors;
    }

    public ListIoTCloudConnectorsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIoTCloudConnectorsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIoTCloudConnectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIoTCloudConnectorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIoTCloudConnectorsResponseBodyIoTCloudConnectors extends TeaModel {
        @NameInMap("APN")
        public String APN;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ISP")
        public String ISP;

        @NameInMap("IoTCloudConnectorBusinessStatus")
        public String ioTCloudConnectorBusinessStatus;

        @NameInMap("IoTCloudConnectorDescription")
        public String ioTCloudConnectorDescription;

        @NameInMap("IoTCloudConnectorGroupId")
        public String ioTCloudConnectorGroupId;

        @NameInMap("IoTCloudConnectorId")
        public String ioTCloudConnectorId;

        @NameInMap("IoTCloudConnectorName")
        public String ioTCloudConnectorName;

        @NameInMap("IoTCloudConnectorStatus")
        public String ioTCloudConnectorStatus;

        @NameInMap("IpFeature")
        public String ipFeature;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("RateLimit")
        public Long rateLimit;

        @NameInMap("Type")
        public String type;

        @NameInMap("VSwitchList")
        public java.util.List<String> vSwitchList;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("WildcardDomainEnabled")
        public Boolean wildcardDomainEnabled;

        public static ListIoTCloudConnectorsResponseBodyIoTCloudConnectors build(java.util.Map<String, ?> map) throws Exception {
            ListIoTCloudConnectorsResponseBodyIoTCloudConnectors self = new ListIoTCloudConnectorsResponseBodyIoTCloudConnectors();
            return TeaModel.build(map, self);
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setAPN(String APN) {
            this.APN = APN;
            return this;
        }
        public String getAPN() {
            return this.APN;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setIoTCloudConnectorBusinessStatus(String ioTCloudConnectorBusinessStatus) {
            this.ioTCloudConnectorBusinessStatus = ioTCloudConnectorBusinessStatus;
            return this;
        }
        public String getIoTCloudConnectorBusinessStatus() {
            return this.ioTCloudConnectorBusinessStatus;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setIoTCloudConnectorDescription(String ioTCloudConnectorDescription) {
            this.ioTCloudConnectorDescription = ioTCloudConnectorDescription;
            return this;
        }
        public String getIoTCloudConnectorDescription() {
            return this.ioTCloudConnectorDescription;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
            this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
            return this;
        }
        public String getIoTCloudConnectorGroupId() {
            return this.ioTCloudConnectorGroupId;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setIoTCloudConnectorId(String ioTCloudConnectorId) {
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }
        public String getIoTCloudConnectorId() {
            return this.ioTCloudConnectorId;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setIoTCloudConnectorName(String ioTCloudConnectorName) {
            this.ioTCloudConnectorName = ioTCloudConnectorName;
            return this;
        }
        public String getIoTCloudConnectorName() {
            return this.ioTCloudConnectorName;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setIoTCloudConnectorStatus(String ioTCloudConnectorStatus) {
            this.ioTCloudConnectorStatus = ioTCloudConnectorStatus;
            return this;
        }
        public String getIoTCloudConnectorStatus() {
            return this.ioTCloudConnectorStatus;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setIpFeature(String ipFeature) {
            this.ipFeature = ipFeature;
            return this;
        }
        public String getIpFeature() {
            return this.ipFeature;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setRateLimit(Long rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }
        public Long getRateLimit() {
            return this.rateLimit;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setVSwitchList(java.util.List<String> vSwitchList) {
            this.vSwitchList = vSwitchList;
            return this;
        }
        public java.util.List<String> getVSwitchList() {
            return this.vSwitchList;
        }

        public ListIoTCloudConnectorsResponseBodyIoTCloudConnectors setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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
