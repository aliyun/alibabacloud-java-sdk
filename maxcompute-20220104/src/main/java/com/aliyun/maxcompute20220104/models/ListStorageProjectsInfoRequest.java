// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStorageProjectsInfoRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort the results in ascending order.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ascOrder")
    public Boolean ascOrder;

    /**
     * <p>The statistics collection date. The date is accurate to the day. The date must be in the <code>YYYYMMdd</code> format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20241205</p>
     */
    @NameInMap("date")
    public String date;

    /**
     * <p>The column to sort by. Valid values:</p>
     * <ul>
     * <li><p>totalStorage</p>
     * </li>
     * <li><p>longTermStorage</p>
     * </li>
     * <li><p>lowFreqStorage</p>
     * </li>
     * <li><p>standardStorage</p>
     * </li>
     * <li><p>recycleBinStorage</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>totalStorage</p>
     */
    @NameInMap("orderColumn")
    public String orderColumn;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The prefix of the MaxCompute project name.</p>
     * 
     * <strong>example:</strong>
     * <p>odps_project</p>
     */
    @NameInMap("projectPrefix")
    public String projectPrefix;

    /**
     * <p>The number of days for year-over-year comparison.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("recentDays")
    public Integer recentDays;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The tenant ID. You can log on to the MaxCompute console and choose <strong>Tenant Property</strong> in the navigation pane on the left to view the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>28074710977****</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListStorageProjectsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStorageProjectsInfoRequest self = new ListStorageProjectsInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListStorageProjectsInfoRequest setAscOrder(Boolean ascOrder) {
        this.ascOrder = ascOrder;
        return this;
    }
    public Boolean getAscOrder() {
        return this.ascOrder;
    }

    public ListStorageProjectsInfoRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public ListStorageProjectsInfoRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public ListStorageProjectsInfoRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListStorageProjectsInfoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListStorageProjectsInfoRequest setProjectPrefix(String projectPrefix) {
        this.projectPrefix = projectPrefix;
        return this;
    }
    public String getProjectPrefix() {
        return this.projectPrefix;
    }

    public ListStorageProjectsInfoRequest setRecentDays(Integer recentDays) {
        this.recentDays = recentDays;
        return this;
    }
    public Integer getRecentDays() {
        return this.recentDays;
    }

    public ListStorageProjectsInfoRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListStorageProjectsInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
