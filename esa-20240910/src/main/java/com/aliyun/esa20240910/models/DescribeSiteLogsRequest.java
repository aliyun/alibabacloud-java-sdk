// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteLogsRequest extends TeaModel {
    /**
     * <p>The end time for log retrieval.</p>
     * <p>The date is in ISO 8601 format and uses UTC+0 time in the format of yyyy-MM-ddTHH:mm:ssZ.</p>
     * <blockquote>
     * <p>Note: The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-11-06T17:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number to return. Valid values: any integer greater than 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 300. Maximum value: 1000. Valid values: any integer from 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The site ID, which can be obtained by calling ListSites.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The start time for log retrieval.</p>
     * <p>The date is in ISO 8601 format and uses UTC+0 time in the format of yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-06T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSiteLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteLogsRequest self = new DescribeSiteLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteLogsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSiteLogsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSiteLogsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DescribeSiteLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
