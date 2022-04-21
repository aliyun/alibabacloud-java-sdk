// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorAccessSessionLogsRequest extends TeaModel {
    @NameInMap("Destinations")
    public java.util.List<String> destinations;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceIps")
    public java.util.List<String> sourceIps;

    @NameInMap("StartTime")
    public Long startTime;

    public static ListIoTCloudConnectorAccessSessionLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorAccessSessionLogsRequest self = new ListIoTCloudConnectorAccessSessionLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorAccessSessionLogsRequest setDestinations(java.util.List<String> destinations) {
        this.destinations = destinations;
        return this;
    }
    public java.util.List<String> getDestinations() {
        return this.destinations;
    }

    public ListIoTCloudConnectorAccessSessionLogsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListIoTCloudConnectorAccessSessionLogsRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public ListIoTCloudConnectorAccessSessionLogsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIoTCloudConnectorAccessSessionLogsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIoTCloudConnectorAccessSessionLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIoTCloudConnectorAccessSessionLogsRequest setSourceIps(java.util.List<String> sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }
    public java.util.List<String> getSourceIps() {
        return this.sourceIps;
    }

    public ListIoTCloudConnectorAccessSessionLogsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
