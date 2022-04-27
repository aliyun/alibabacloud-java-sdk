// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListWirelessCloudConnectorsRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("Names")
    public java.util.List<String> names;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    @NameInMap("WirelessCloudConnectorIds")
    public java.util.List<String> wirelessCloudConnectorIds;

    public static ListWirelessCloudConnectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWirelessCloudConnectorsRequest self = new ListWirelessCloudConnectorsRequest();
        return TeaModel.build(map, self);
    }

    public ListWirelessCloudConnectorsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListWirelessCloudConnectorsRequest setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public ListWirelessCloudConnectorsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWirelessCloudConnectorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListWirelessCloudConnectorsRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public ListWirelessCloudConnectorsRequest setWirelessCloudConnectorIds(java.util.List<String> wirelessCloudConnectorIds) {
        this.wirelessCloudConnectorIds = wirelessCloudConnectorIds;
        return this;
    }
    public java.util.List<String> getWirelessCloudConnectorIds() {
        return this.wirelessCloudConnectorIds;
    }

}
