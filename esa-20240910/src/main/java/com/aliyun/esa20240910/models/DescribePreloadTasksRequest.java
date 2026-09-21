// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribePreloadTasksRequest extends TeaModel {
    /**
     * <p>The query content. Exact match is used.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://a.com/1.jpg?b=2">http://a.com/1.jpg?b=2</a></p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The end time. The date is in ISO 8601 format and uses UTC+0 time in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-03-23T06:23:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Valid values: <strong>1</strong> to <strong>100000</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. Default value: <strong>20</strong>. Maximum value: <strong>50</strong>. Valid values: any integer from <strong>1</strong> to <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The start time. The date is in ISO 8601 format and uses UTC+0 time in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-22T17:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The task execution status. Valid values:</p>
     * <ul>
     * <li><strong>Complte</strong>: Complete.</li>
     * <li><strong>Refreshing</strong>: Prefetching.</li>
     * <li><strong>Failed</strong>: Prefetch failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Complete</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribePreloadTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePreloadTasksRequest self = new DescribePreloadTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribePreloadTasksRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribePreloadTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePreloadTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePreloadTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePreloadTasksRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DescribePreloadTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribePreloadTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
