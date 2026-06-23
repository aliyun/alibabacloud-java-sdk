// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUploadTasksRequest extends TeaModel {
    /**
     * <p>The end time in ISO 8601 format (for example, 2024-01-01T00:00:00+Z).</p>
     * <blockquote>
     * <p>Notice: StartTime and EndTime must be provided together to define the query time window. An error is returned if either one is missing..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-12-06T12:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The site ID. You can obtain this value by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <blockquote>
     * <p>Notice: This parameter is required when you call the ListUploadTasks operation..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The start time in ISO 8601 format (for example, 2024-01-01T00:00:00+Z).</p>
     * <blockquote>
     * <p>Notice: StartTime and EndTime must be provided together to define the query time window. An error is returned if either one is missing..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-11-29T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>file</strong>: URL file purge.</li>
     * <li><strong>preload</strong>: resource prefetch.</li>
     * <li><strong>directory</strong>: directory purge.</li>
     * <li><strong>ignoreparams</strong>: purge with parameters ignored.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListUploadTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUploadTasksRequest self = new ListUploadTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListUploadTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListUploadTasksRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListUploadTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListUploadTasksRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
