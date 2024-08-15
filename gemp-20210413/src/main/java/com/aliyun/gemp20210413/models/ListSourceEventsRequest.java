// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSourceEventsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>2020-09-18 13:00:00</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-01 23:59:59</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("instanceId")
    public Long instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INCIDENT</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>9223370410626682599-1344383-78954515-1-0a6e01a1701447fd9ef18b079edd2c6d</p>
     */
    @NameInMap("startRowKey")
    public String startRowKey;

    /**
     * <p>2020-09-10 13:00:00</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-01 00:00:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>9223370410626682599-1344383-78954515-1-0a6e01a1701447fd9ef18b079edd2c6d</p>
     */
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
