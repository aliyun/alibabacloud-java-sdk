// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosAllEventListRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The DDoS attack events occur before **EndTime** are queried. This value is a UNIX timestamp. Unit: seconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The type of the DDoS attack events you want to query. Valid values:</p>
     * <br>
     * <p>*   **web-cc**: resource exhaustion attacks</p>
     * <p>*   **cc**: connection flood attacks</p>
     * <p>*   **defense**: DDoS attacks that trigger traffic scrubbing</p>
     * <p>*   **blackhole**: DDoS attacks that trigger blackhole filtering</p>
     * <br>
     * <p>If you want to query multiple types of DDoS attack events, separate them with commas (,).</p>
     * <br>
     * <p>If you do not configure this parameter, DDoS attack events of all types are queried.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. The DDoS attack events occur after **StartTime** are queried. This value is a UNIX timestamp. Unit: seconds.</p>
     * <br>
     * <p>This parameter is required.</p>
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
