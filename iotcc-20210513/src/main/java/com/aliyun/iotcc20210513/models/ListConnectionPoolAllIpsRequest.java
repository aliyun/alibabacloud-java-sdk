// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListConnectionPoolAllIpsRequest extends TeaModel {
    @NameInMap("ConnectionPoolId")
    public String connectionPoolId;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    public static ListConnectionPoolAllIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoolAllIpsRequest self = new ListConnectionPoolAllIpsRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoolAllIpsRequest setConnectionPoolId(String connectionPoolId) {
        this.connectionPoolId = connectionPoolId;
        return this;
    }
    public String getConnectionPoolId() {
        return this.connectionPoolId;
    }

    public ListConnectionPoolAllIpsRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public ListConnectionPoolAllIpsRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListConnectionPoolAllIpsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectionPoolAllIpsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConnectionPoolAllIpsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListConnectionPoolAllIpsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
