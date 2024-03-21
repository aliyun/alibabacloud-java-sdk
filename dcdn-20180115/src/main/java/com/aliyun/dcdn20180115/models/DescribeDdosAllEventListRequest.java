// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDdosAllEventListRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The end time must be later than the start time. The maximum time range is 31 days.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the DDoS attack event to be queried. Valid values:</p>
     * <br>
     * <p> *   **web-cc**: resource exhaustion attacks</p>
     * <p> *   **cc**: connection flood attacks</p>
     * <p> *   **traffic**: volumetric attacks</p>
     * <br>
     * <p>If you do not configure this parameter, DDoS attack events of all types are queried.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The page number. Default value: 1. Value range: 1 to 10,000.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: **10**. Valid values: 5, 10, and 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDdosAllEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosAllEventListRequest self = new DescribeDdosAllEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosAllEventListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDdosAllEventListRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeDdosAllEventListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDdosAllEventListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDdosAllEventListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
