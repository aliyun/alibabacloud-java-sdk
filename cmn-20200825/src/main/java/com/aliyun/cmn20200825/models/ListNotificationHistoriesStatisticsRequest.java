// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListNotificationHistoriesStatisticsRequest extends TeaModel {
    @NameInMap("End")
    public Long end;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsDedicatedLine")
    public Boolean isDedicatedLine;

    @NameInMap("IsDevice")
    public Boolean isDevice;

    @NameInMap("IsMonitorItem")
    public Boolean isMonitorItem;

    @NameInMap("IsPhysicalSpace")
    public Boolean isPhysicalSpace;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    @NameInMap("Start")
    public Long start;

    @NameInMap("Type")
    public String type;

    public static ListNotificationHistoriesStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationHistoriesStatisticsRequest self = new ListNotificationHistoriesStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListNotificationHistoriesStatisticsRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public ListNotificationHistoriesStatisticsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListNotificationHistoriesStatisticsRequest setIsDedicatedLine(Boolean isDedicatedLine) {
        this.isDedicatedLine = isDedicatedLine;
        return this;
    }
    public Boolean getIsDedicatedLine() {
        return this.isDedicatedLine;
    }

    public ListNotificationHistoriesStatisticsRequest setIsDevice(Boolean isDevice) {
        this.isDevice = isDevice;
        return this;
    }
    public Boolean getIsDevice() {
        return this.isDevice;
    }

    public ListNotificationHistoriesStatisticsRequest setIsMonitorItem(Boolean isMonitorItem) {
        this.isMonitorItem = isMonitorItem;
        return this;
    }
    public Boolean getIsMonitorItem() {
        return this.isMonitorItem;
    }

    public ListNotificationHistoriesStatisticsRequest setIsPhysicalSpace(Boolean isPhysicalSpace) {
        this.isPhysicalSpace = isPhysicalSpace;
        return this;
    }
    public Boolean getIsPhysicalSpace() {
        return this.isPhysicalSpace;
    }

    public ListNotificationHistoriesStatisticsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNotificationHistoriesStatisticsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNotificationHistoriesStatisticsRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public ListNotificationHistoriesStatisticsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public ListNotificationHistoriesStatisticsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
