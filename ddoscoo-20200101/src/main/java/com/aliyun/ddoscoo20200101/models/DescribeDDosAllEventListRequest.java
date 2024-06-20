// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosAllEventListRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The DDoS attack events occur before <strong>EndTime</strong> are queried. This value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1640966399</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The type of the DDoS attack events you want to query. Valid values:</p>
     * <ul>
     * <li><strong>web-cc</strong>: resource exhaustion attacks</li>
     * <li><strong>cc</strong>: connection flood attacks</li>
     * <li><strong>defense</strong>: DDoS attacks that trigger traffic scrubbing</li>
     * <li><strong>blackhole</strong>: DDoS attacks that trigger blackhole filtering</li>
     * </ul>
     * <p>If you want to query multiple types of DDoS attack events, separate them with commas (,).</p>
     * <p>If you do not configure this parameter, DDoS attack events of all types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>defense</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. The DDoS attack events occur after <strong>StartTime</strong> are queried. This value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1609430400</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDDosAllEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosAllEventListRequest self = new DescribeDDosAllEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDosAllEventListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDDosAllEventListRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeDDosAllEventListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDDosAllEventListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDDosAllEventListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
