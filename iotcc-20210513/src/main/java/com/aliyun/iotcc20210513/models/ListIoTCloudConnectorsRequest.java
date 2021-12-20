// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorsRequest extends TeaModel {
    @NameInMap("APN")
    public java.util.List<String> APN;

    @NameInMap("ISP")
    public java.util.List<String> ISP;

    @NameInMap("IoTCloudConnectorIds")
    public java.util.List<String> ioTCloudConnectorIds;

    @NameInMap("IoTCloudConnectorName")
    public java.util.List<String> ioTCloudConnectorName;

    @NameInMap("IoTCloudConnectorStatus")
    public java.util.List<String> ioTCloudConnectorStatus;

    @NameInMap("IsInGroup")
    public Boolean isInGroup;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VpcId")
    public java.util.List<String> vpcId;

    public static ListIoTCloudConnectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorsRequest self = new ListIoTCloudConnectorsRequest();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorsRequest setAPN(java.util.List<String> APN) {
        this.APN = APN;
        return this;
    }
    public java.util.List<String> getAPN() {
        return this.APN;
    }

    public ListIoTCloudConnectorsRequest setISP(java.util.List<String> ISP) {
        this.ISP = ISP;
        return this;
    }
    public java.util.List<String> getISP() {
        return this.ISP;
    }

    public ListIoTCloudConnectorsRequest setIoTCloudConnectorIds(java.util.List<String> ioTCloudConnectorIds) {
        this.ioTCloudConnectorIds = ioTCloudConnectorIds;
        return this;
    }
    public java.util.List<String> getIoTCloudConnectorIds() {
        return this.ioTCloudConnectorIds;
    }

    public ListIoTCloudConnectorsRequest setIoTCloudConnectorName(java.util.List<String> ioTCloudConnectorName) {
        this.ioTCloudConnectorName = ioTCloudConnectorName;
        return this;
    }
    public java.util.List<String> getIoTCloudConnectorName() {
        return this.ioTCloudConnectorName;
    }

    public ListIoTCloudConnectorsRequest setIoTCloudConnectorStatus(java.util.List<String> ioTCloudConnectorStatus) {
        this.ioTCloudConnectorStatus = ioTCloudConnectorStatus;
        return this;
    }
    public java.util.List<String> getIoTCloudConnectorStatus() {
        return this.ioTCloudConnectorStatus;
    }

    public ListIoTCloudConnectorsRequest setIsInGroup(Boolean isInGroup) {
        this.isInGroup = isInGroup;
        return this;
    }
    public Boolean getIsInGroup() {
        return this.isInGroup;
    }

    public ListIoTCloudConnectorsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIoTCloudConnectorsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIoTCloudConnectorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIoTCloudConnectorsRequest setVpcId(java.util.List<String> vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public java.util.List<String> getVpcId() {
        return this.vpcId;
    }

}
