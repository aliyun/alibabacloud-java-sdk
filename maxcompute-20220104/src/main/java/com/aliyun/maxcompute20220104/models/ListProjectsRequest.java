// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
    /**
     * <p>Specifies whether to list the built-in <strong>SYSTEM_CATALOG</strong> projects that are used to provide data such as project metadata and historical usage data. For more information, see <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tenant-level-information-schema">Tenant-level Information Schema</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: The built-in SYSTEM_CATALOG projects are listed.</li>
     * <li>false: The built-in SYSTEM_CATALOG projects are not listed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("listSystemCatalog")
    public Boolean listSystemCatalog;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The maximum number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxItem")
    public Integer maxItem;

    /**
     * <p>Specifies the marker after which the returned list begins.</p>
     * 
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The quota name that is automatically generated. You can log on to the <a href="https://maxcompute.console.aliyun.com">MaxCompute console</a>, choose <strong>Workspace</strong> &gt; <strong>Quotas</strong> from the left-side navigation pane, and then view the quota name on the <strong>Quotas</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;hsajkdgbkaubh&quot;</p>
     */
    @NameInMap("quotaName")
    public String quotaName;

    /**
     * <p>The quota nickname. You can log on to the <a href="https://maxcompute.console.aliyun.com">MaxCompute console</a>, choose <strong>Workspace</strong> &gt; <strong>Quotas</strong> from the left-side navigation pane, and then view the quota nickname on the <strong>Quotas</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>quotaA</p>
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
     * <p>The instance ID and billing method of the default computing quota.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;aaaa-bbbb&quot;</p>
     */
    @NameInMap("saleTags")
    public String saleTags;

    /**
     * <p>The tenant ID. You can log on to the <a href="https://maxcompute.console.aliyun.com">MaxCompute console</a>, and choose <strong>Tenants</strong> &gt; <strong>Tenant Property</strong> from the left-side navigation pane to view the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>549532154333697</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The project type. Valid values:</p>
     * <ul>
     * <li><strong>managed</strong>: internal project</li>
     * <li><strong>external</strong>: external project</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;managed&quot;</p>
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
