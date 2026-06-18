// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSAllEventListRequest extends TeaModel {
    /**
     * <p>The end time of the query.</p>
     * <p>The time must be in ISO 8601 format and in UTC. Format: <code>yyyy-MM-ddTHH:mm:ssZ</code>. The time range between <code>StartTime</code> and <code>EndTime</code> cannot exceed 31 days.</p>
     * <p>If this parameter is not specified, it defaults to the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-22T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of DDoS attack events to query. Valid values:</p>
     * <ul>
     * <li><p><strong>web-cc</strong>: A web resource exhaustion attack.</p>
     * </li>
     * <li><p><strong>cc</strong>: A connection-based attack.</p>
     * </li>
     * <li><p><strong>traffic</strong>: A traffic-based attack.</p>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter, the operation queries <code>web-cc</code> events by default.</p>
     * 
     * <strong>example:</strong>
     * <p>web-cc</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The page number to return. Valid range: <strong>1</strong> to <strong>100000</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>. Valid values: <strong>5</strong>, <strong>10</strong>, and <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the site. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7096621098****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The start time of the query.</p>
     * <p>The time must be in ISO 8601 format and in UTC. Format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-12T15:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDDoSAllEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSAllEventListRequest self = new DescribeDDoSAllEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSAllEventListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDDoSAllEventListRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeDDoSAllEventListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDDoSAllEventListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDDoSAllEventListRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DescribeDDoSAllEventListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
