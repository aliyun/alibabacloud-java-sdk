// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListJobsShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-csbua72***</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The job filter information.</p>
     */
    @NameInMap("JobFilter")
    public String jobFilterShrink;

    /**
     * <p>The page number of the page to return.</p>
     * <ul>
     * <li>Pages start from page 1.</li>
     * <li>Default value: 1</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Maximum value: 50.</li>
     * <li>Default value: 10</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static ListJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsShrinkRequest self = new ListJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListJobsShrinkRequest setJobFilterShrink(String jobFilterShrink) {
        this.jobFilterShrink = jobFilterShrink;
        return this;
    }
    public String getJobFilterShrink() {
        return this.jobFilterShrink;
    }

    public ListJobsShrinkRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
