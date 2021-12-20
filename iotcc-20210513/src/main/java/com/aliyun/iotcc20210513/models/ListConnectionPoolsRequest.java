// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListConnectionPoolsRequest extends TeaModel {
    @NameInMap("ConnectionPoolIds")
    public java.util.List<String> connectionPoolIds;

    @NameInMap("ConnectionPoolName")
    public java.util.List<String> connectionPoolName;

    @NameInMap("ConnectionPoolStatus")
    public java.util.List<String> connectionPoolStatus;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    public static ListConnectionPoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoolsRequest self = new ListConnectionPoolsRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoolsRequest setConnectionPoolIds(java.util.List<String> connectionPoolIds) {
        this.connectionPoolIds = connectionPoolIds;
        return this;
    }
    public java.util.List<String> getConnectionPoolIds() {
        return this.connectionPoolIds;
    }

    public ListConnectionPoolsRequest setConnectionPoolName(java.util.List<String> connectionPoolName) {
        this.connectionPoolName = connectionPoolName;
        return this;
    }
    public java.util.List<String> getConnectionPoolName() {
        return this.connectionPoolName;
    }

    public ListConnectionPoolsRequest setConnectionPoolStatus(java.util.List<String> connectionPoolStatus) {
        this.connectionPoolStatus = connectionPoolStatus;
        return this;
    }
    public java.util.List<String> getConnectionPoolStatus() {
        return this.connectionPoolStatus;
    }

    public ListConnectionPoolsRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public ListConnectionPoolsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectionPoolsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConnectionPoolsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
