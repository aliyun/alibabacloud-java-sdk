// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListChannelAlertsRequest extends TeaModel {
    /**
     * <p>The alert type.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-21T16:10:45Z</p>
     */
    @NameInMap("GmtEnd")
    public String gmtEnd;

    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-21T16:10:45Z</p>
     */
    @NameInMap("GmtStart")
    public String gmtStart;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ARN of the channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ims:mediaweaver:<regionId>:<userId>:channel/myChannel</p>
     */
    @NameInMap("ResourceArn")
    public String resourceArn;

    /**
     * <p>The sorting order by modification time. Valid values: asc and desc.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortByModifiedTime")
    public String sortByModifiedTime;

    public static ListChannelAlertsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChannelAlertsRequest self = new ListChannelAlertsRequest();
        return TeaModel.build(map, self);
    }

    public ListChannelAlertsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListChannelAlertsRequest setGmtEnd(String gmtEnd) {
        this.gmtEnd = gmtEnd;
        return this;
    }
    public String getGmtEnd() {
        return this.gmtEnd;
    }

    public ListChannelAlertsRequest setGmtStart(String gmtStart) {
        this.gmtStart = gmtStart;
        return this;
    }
    public String getGmtStart() {
        return this.gmtStart;
    }

    public ListChannelAlertsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChannelAlertsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChannelAlertsRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public ListChannelAlertsRequest setSortByModifiedTime(String sortByModifiedTime) {
        this.sortByModifiedTime = sortByModifiedTime;
        return this;
    }
    public String getSortByModifiedTime() {
        return this.sortByModifiedTime;
    }

}
