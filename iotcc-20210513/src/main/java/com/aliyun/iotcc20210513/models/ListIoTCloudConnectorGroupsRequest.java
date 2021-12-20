// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorGroupsRequest extends TeaModel {
    @NameInMap("IoTCloudConnectorGroupIds")
    public java.util.List<String> ioTCloudConnectorGroupIds;

    @NameInMap("IoTCloudConnectorGroupName")
    public java.util.List<String> ioTCloudConnectorGroupName;

    @NameInMap("IoTCloudConnectorGroupStatus")
    public java.util.List<String> ioTCloudConnectorGroupStatus;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    public static ListIoTCloudConnectorGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorGroupsRequest self = new ListIoTCloudConnectorGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorGroupsRequest setIoTCloudConnectorGroupIds(java.util.List<String> ioTCloudConnectorGroupIds) {
        this.ioTCloudConnectorGroupIds = ioTCloudConnectorGroupIds;
        return this;
    }
    public java.util.List<String> getIoTCloudConnectorGroupIds() {
        return this.ioTCloudConnectorGroupIds;
    }

    public ListIoTCloudConnectorGroupsRequest setIoTCloudConnectorGroupName(java.util.List<String> ioTCloudConnectorGroupName) {
        this.ioTCloudConnectorGroupName = ioTCloudConnectorGroupName;
        return this;
    }
    public java.util.List<String> getIoTCloudConnectorGroupName() {
        return this.ioTCloudConnectorGroupName;
    }

    public ListIoTCloudConnectorGroupsRequest setIoTCloudConnectorGroupStatus(java.util.List<String> ioTCloudConnectorGroupStatus) {
        this.ioTCloudConnectorGroupStatus = ioTCloudConnectorGroupStatus;
        return this;
    }
    public java.util.List<String> getIoTCloudConnectorGroupStatus() {
        return this.ioTCloudConnectorGroupStatus;
    }

    public ListIoTCloudConnectorGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIoTCloudConnectorGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIoTCloudConnectorGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
