// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUploadTasksRequest extends TeaModel {
    /**
     * <p>The time when the task ends. Specify the time in the YYYY-MM-DDThh:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-06T12:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The time when the task starts. Specify the time in the YYYY-MM-DDThh:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-11-29T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>file</strong>: purges the cache by file URL.</li>
     * <li><strong>preload</strong>: prefetches files.</li>
     * <li><strong>directory</strong>: purges the cache by directory.</li>
     * <li><strong>ignoreparams</strong>: purges the cache by URL with specified parameters ignored.</li>
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
