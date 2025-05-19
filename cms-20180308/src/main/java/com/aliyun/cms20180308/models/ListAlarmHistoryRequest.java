// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListAlarmHistoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Cursor")
    public String cursor;

    /**
     * <strong>example:</strong>
     * <p>1548927491223</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>1a775e37-dfba-430c-ab9f-7036475c8bfb_2dbe619b-0483-402e-9437-7c7a38fba7ed</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>1548913091223</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListAlarmHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmHistoryRequest self = new ListAlarmHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmHistoryRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public ListAlarmHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAlarmHistoryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListAlarmHistoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAlarmHistoryRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListAlarmHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
