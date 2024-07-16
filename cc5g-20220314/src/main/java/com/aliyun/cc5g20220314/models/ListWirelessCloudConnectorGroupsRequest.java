// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListWirelessCloudConnectorGroupsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>iou001238joojjaere</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("WirelessCloudConnectorGroupIds")
    public java.util.List<String> wirelessCloudConnectorGroupIds;

    @NameInMap("WirelessCloudConnectorGroupNames")
    public java.util.List<String> wirelessCloudConnectorGroupNames;

    @NameInMap("WirelessCloudConnectorGroupStatus")
    public java.util.List<String> wirelessCloudConnectorGroupStatus;

    public static ListWirelessCloudConnectorGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWirelessCloudConnectorGroupsRequest self = new ListWirelessCloudConnectorGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListWirelessCloudConnectorGroupsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListWirelessCloudConnectorGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWirelessCloudConnectorGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListWirelessCloudConnectorGroupsRequest setWirelessCloudConnectorGroupIds(java.util.List<String> wirelessCloudConnectorGroupIds) {
        this.wirelessCloudConnectorGroupIds = wirelessCloudConnectorGroupIds;
        return this;
    }
    public java.util.List<String> getWirelessCloudConnectorGroupIds() {
        return this.wirelessCloudConnectorGroupIds;
    }

    public ListWirelessCloudConnectorGroupsRequest setWirelessCloudConnectorGroupNames(java.util.List<String> wirelessCloudConnectorGroupNames) {
        this.wirelessCloudConnectorGroupNames = wirelessCloudConnectorGroupNames;
        return this;
    }
    public java.util.List<String> getWirelessCloudConnectorGroupNames() {
        return this.wirelessCloudConnectorGroupNames;
    }

    public ListWirelessCloudConnectorGroupsRequest setWirelessCloudConnectorGroupStatus(java.util.List<String> wirelessCloudConnectorGroupStatus) {
        this.wirelessCloudConnectorGroupStatus = wirelessCloudConnectorGroupStatus;
        return this;
    }
    public java.util.List<String> getWirelessCloudConnectorGroupStatus() {
        return this.wirelessCloudConnectorGroupStatus;
    }

}
