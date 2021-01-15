// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListTasksHistoriesRequest extends TeaModel {
    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    // 巡检项ID
    @NameInMap("ItemId")
    public String itemId;

    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    public static ListTasksHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksHistoriesRequest self = new ListTasksHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksHistoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTasksHistoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTasksHistoriesRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public ListTasksHistoriesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
