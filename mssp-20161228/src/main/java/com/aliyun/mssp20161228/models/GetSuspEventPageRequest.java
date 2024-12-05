// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSuspEventPageRequest extends TeaModel {
    /**
     * <p>Alarm end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1732515522000</p>
     */
    @NameInMap("AlarmEndTime")
    public Long alarmEndTime;

    /**
     * <p>Alarm start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1722515522000</p>
     */
    @NameInMap("AlarmStartTime")
    public Long alarmStartTime;

    /**
     * <p>Current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Number of items per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Alarm source.</p>
     * 
     * <strong>example:</strong>
     * <p>SUSP_EVENT</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Disposal status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static GetSuspEventPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSuspEventPageRequest self = new GetSuspEventPageRequest();
        return TeaModel.build(map, self);
    }

    public GetSuspEventPageRequest setAlarmEndTime(Long alarmEndTime) {
        this.alarmEndTime = alarmEndTime;
        return this;
    }
    public Long getAlarmEndTime() {
        return this.alarmEndTime;
    }

    public GetSuspEventPageRequest setAlarmStartTime(Long alarmStartTime) {
        this.alarmStartTime = alarmStartTime;
        return this;
    }
    public Long getAlarmStartTime() {
        return this.alarmStartTime;
    }

    public GetSuspEventPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSuspEventPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSuspEventPageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetSuspEventPageRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
