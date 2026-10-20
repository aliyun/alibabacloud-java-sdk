// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCalendarsRequest extends TeaModel {
    /**
     * <p>The name of the scheduling calendar. Partial match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>calendar</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The account ID of the owner. Exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of items per page. Default value: 10. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The workspace ID. Queries the calendars applicable to this workspace, including those applicable to all workspaces. If this parameter is not specified, the calendars of the current tenant are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The sorting rule. The format is &quot;Field Direction&quot;, separated by a space.</p>
     * <ul>
     * <li>Field: ModifyTime, Name, or Id.</li>
     * <li>Direction: Asc for ascending order, or Desc for descending order. If this parameter is not specified, Asc is used.</li>
     * </ul>
     * <p>Default value: ModifyTime Desc.</p>
     * 
     * <strong>example:</strong>
     * <p>ModifyTime Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListCalendarsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCalendarsRequest self = new ListCalendarsRequest();
        return TeaModel.build(map, self);
    }

    public ListCalendarsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCalendarsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListCalendarsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCalendarsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCalendarsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListCalendarsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
