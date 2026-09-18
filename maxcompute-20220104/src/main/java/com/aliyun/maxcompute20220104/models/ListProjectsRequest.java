// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
    /**
     * <p>Specifies whether to list the built-in <strong>SYSTEM_CATALOG</strong> project. This project provides information such as project metadata and usage history. For more information, see &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tenant-level-information-schema">Information Schema</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("listSystemCatalog")
    public Boolean listSystemCatalog;

    /**
     * <p>The token that specifies the starting point of the query. The results are returned in alphabetical order, starting from the entry that immediately follows the marker.</p>
     * 
     * <strong>example:</strong>
     * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The maximum number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxItem")
    public Integer maxItem;

    /**
     * <p>The prefix of the resource names to query. For example, if you specify <code>a</code> for this parameter, only resources whose names start with &quot;a&quot; are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The quota name. The system automatically generates this name. To obtain the quota name, log in to the <a href="https://maxcompute.console.aliyun.com">MaxCompute console</a> and select <strong>Workspace</strong> &gt; <strong>Quota</strong> <strong>Management</strong> from the navigation pane on the left.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_5495***3697</p>
     */
    @NameInMap("quotaName")
    public String quotaName;

    /**
     * <p>The quota nickname. To obtain the quota nickname, log in to the <a href="https://maxcompute.console.aliyun.com">MaxCompute console</a> and select <strong>Workspace</strong> &gt; <strong>Quota</strong> <strong>Management</strong> from the navigation pane on the left.</p>
     * 
     * <strong>example:</strong>
     * <p>os_PayAsYouGoQuota</p>
     */
    @NameInMap("quotaNickName")
    public String quotaNickName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The instance ID and billing method of the default compute quota.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;resourceId&quot;: &quot;b7afb7d1-<strong><strong>-</strong></strong>-****-c393669c307b&quot;,
     *       &quot;resourceType&quot;: &quot;PayAsYouGo&quot;
     *     }</p>
     */
    @NameInMap("saleTags")
    public String saleTags;

    /**
     * <p>The sort field. The only supported value is <code>createdTime</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>createdTime</p>
     */
    @NameInMap("sortBy")
    public String sortBy;

    /**
     * <p>The sort order. This parameter takes effect only when <code>sortBy</code> is specified. Valid values are <code>ASC</code> and <code>DESC</code>. The values are case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("sortOrder")
    public String sortOrder;

    /**
     * <p>The tenant ID. To obtain the ID, log in to the <a href="https://maxcompute.console.aliyun.com">MaxCompute console</a> and select <strong>Tenant Management</strong> &gt; <strong>Tenant Properties</strong> from the navigation pane on the left.</p>
     * 
     * <strong>example:</strong>
     * <p>5495****3697</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The project type. Valid values:</p>
     * <ul>
     * <li><p><strong>managed</strong>: a managed project.</p>
     * </li>
     * <li><p><strong>external</strong>: an external project.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>managed</p>
     */
    @NameInMap("type")
    public String type;

    public static ListProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsRequest self = new ListProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsRequest setListSystemCatalog(Boolean listSystemCatalog) {
        this.listSystemCatalog = listSystemCatalog;
        return this;
    }
    public Boolean getListSystemCatalog() {
        return this.listSystemCatalog;
    }

    public ListProjectsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListProjectsRequest setMaxItem(Integer maxItem) {
        this.maxItem = maxItem;
        return this;
    }
    public Integer getMaxItem() {
        return this.maxItem;
    }

    public ListProjectsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListProjectsRequest setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public ListProjectsRequest setQuotaNickName(String quotaNickName) {
        this.quotaNickName = quotaNickName;
        return this;
    }
    public String getQuotaNickName() {
        return this.quotaNickName;
    }

    public ListProjectsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListProjectsRequest setSaleTags(String saleTags) {
        this.saleTags = saleTags;
        return this;
    }
    public String getSaleTags() {
        return this.saleTags;
    }

    public ListProjectsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListProjectsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListProjectsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListProjectsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
