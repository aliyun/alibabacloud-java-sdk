// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorsRequest extends TeaModel {
    @NameInMap("IoTCloudConnectorStatus")
    public java.util.List<String> ioTCloudConnectorStatus;

    @NameInMap("IoTCloudConnectorIds")
    public java.util.List<String> ioTCloudConnectorIds;

    @NameInMap("IoTCloudConnectorName")
    public java.util.List<String> ioTCloudConnectorName;

    @NameInMap("Isps")
    public java.util.List<String> isps;

    @NameInMap("VpcIds")
    public java.util.List<String> vpcIds;

    @NameInMap("Apns")
    public java.util.List<String> apns;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("RegionId")
    public String regionId;

    public static ListIoTCloudConnectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorsRequest self = new ListIoTCloudConnectorsRequest();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorsRequest setIoTCloudConnectorStatus(java.util.List<String> ioTCloudConnectorStatus) {
        this.ioTCloudConnectorStatus = ioTCloudConnectorStatus;
        return this;
    }
    public java.util.List<String> getIoTCloudConnectorStatus() {
        return this.ioTCloudConnectorStatus;
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

    public ListIoTCloudConnectorsRequest setIsps(java.util.List<String> isps) {
        this.isps = isps;
        return this;
    }
    public java.util.List<String> getIsps() {
        return this.isps;
    }

    public ListIoTCloudConnectorsRequest setVpcIds(java.util.List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

    public ListIoTCloudConnectorsRequest setApns(java.util.List<String> apns) {
        this.apns = apns;
        return this;
    }
    public java.util.List<String> getApns() {
        return this.apns;
    }

    public ListIoTCloudConnectorsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIoTCloudConnectorsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIoTCloudConnectorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
