// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSourceEventsRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    // 2020-09-18 13:00:00
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("instanceId")
    public Long instanceId;

    @NameInMap("instanceType")
    public String instanceType;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("startRowKey")
    public String startRowKey;

    // 2020-09-10 13:00:00
    @NameInMap("startTime")
    public String startTime;

    @NameInMap("stopRowKey")
    public String stopRowKey;

    public static ListSourceEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSourceEventsRequest self = new ListSourceEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListSourceEventsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListSourceEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListSourceEventsRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public ListSourceEventsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListSourceEventsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSourceEventsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSourceEventsRequest setStartRowKey(String startRowKey) {
        this.startRowKey = startRowKey;
        return this;
    }
    public String getStartRowKey() {
        return this.startRowKey;
    }

    public ListSourceEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListSourceEventsRequest setStopRowKey(String stopRowKey) {
        this.stopRowKey = stopRowKey;
        return this;
    }
    public String getStopRowKey() {
        return this.stopRowKey;
    }

}
