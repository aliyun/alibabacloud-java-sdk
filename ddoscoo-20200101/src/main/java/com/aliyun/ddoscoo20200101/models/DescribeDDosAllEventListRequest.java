// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosAllEventListRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. DDoS attack events that occurred before <strong>EndTime</strong> are queried. Specify a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p>EndTime can specify only events within the last three months.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1640966399</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The type of DDoS attack event to query. Valid values:</p>
     * <ul>
     * <li><strong>web-cc</strong>: web resource exhaustion attack.</li>
     * <li><strong>cc</strong>: connection flood attack.</li>
     * <li><strong>defense</strong>: volumetric attack (scrubbing event).</li>
     * <li><strong>blackhole</strong>: volumetric attack (blackhole filtering event).</li>
     * </ul>
     * <p>You can specify multiple types. Separate them with commas (,).</p>
     * <p>If you do not set this parameter, attack events of all types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>defense</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance to query.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.1</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The page number to return in a paging query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of attack events to return on each page in a paging query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. DDoS attack events that occurred after <strong>StartTime</strong> are queried. Specify a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p>StartTime can specify only events within the last three months.</p>
     * </blockquote>
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

    public DescribeDDosAllEventListRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
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
