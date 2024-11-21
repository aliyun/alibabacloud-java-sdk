// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribePurgeTasksRequest extends TeaModel {
    /**
     * <p>The content to purge. Exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://a.com/1.jpg?b=1">http://a.com/1.jpg?b=1</a></p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The end time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-11-18T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Valid values: 1 to 100000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20. Valid values: 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The website ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The start time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-16T05:33:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><strong>Complete</strong>: The task is complete.</li>
     * <li><strong>Refreshing</strong>: The task is in progress.</li>
     * <li><strong>Failed</strong>: The task failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Complete</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>file</strong> (default): purges the cache by file.</li>
     * <li><strong>cachetag</strong>: purges the cache by cache tag.</li>
     * <li><strong>directory</strong>: purges the cache by directory.</li>
     * <li><strong>ignoreParams</strong>: purges the cache by URL with specified parameters ignored.</li>
     * <li><strong>hostname</strong>: purges the cache by hostname.</li>
     * <li><strong>purgeall</strong>: purges all cache.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribePurgeTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePurgeTasksRequest self = new DescribePurgeTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribePurgeTasksRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribePurgeTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePurgeTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePurgeTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePurgeTasksRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DescribePurgeTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribePurgeTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribePurgeTasksRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
