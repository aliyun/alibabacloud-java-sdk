// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListWarehouseScheduleEventRequest extends TeaModel {
    /**
     * <p>The elastic type. If this parameter is omitted, events of all types are returned. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>timed</p>
     */
    @NameInMap("elasticType")
    public String elasticType;

    /**
     * <p>The end timestamp, in seconds. Defaults to the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1777516201</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The page number. Defaults to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default: 30. Maximum: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The start timestamp, in seconds. Defaults to three days ago.</p>
     * 
     * <strong>example:</strong>
     * <p>1777257001</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static ListWarehouseScheduleEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWarehouseScheduleEventRequest self = new ListWarehouseScheduleEventRequest();
        return TeaModel.build(map, self);
    }

    public ListWarehouseScheduleEventRequest setElasticType(String elasticType) {
        this.elasticType = elasticType;
        return this;
    }
    public String getElasticType() {
        return this.elasticType;
    }

    public ListWarehouseScheduleEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListWarehouseScheduleEventRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListWarehouseScheduleEventRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWarehouseScheduleEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
