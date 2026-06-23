// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsShrinkRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2kqofrgXXXXX</p>
     */
    @NameInMap("AliyunResourceGroupId")
    public String aliyunResourceGroupId;

    /**
     * <p>The list of Alibaba Cloud tags.</p>
     */
    @NameInMap("AliyunResourceTags")
    public String aliyunResourceTagsShrink;

    /**
     * <p>The name of the resource group. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The billing method of the resource group. Valid values include:</p>
     * <ul>
     * <li><p><code>PrePaid</code>: subscription.</p>
     * </li>
     * <li><p><code>PostPaid</code>: pay-as-you-go.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The types of the resource groups to query. <strong>If this parameter is not specified, general-purpose resource groups are queried by default.</strong></p>
     */
    @NameInMap("ResourceGroupTypes")
    public String resourceGroupTypesShrink;

    /**
     * <p>The sorting criterion for the results. The format is <code>FieldName SortOrder</code>. <code>SortOrder</code> can be <code>Asc</code> (ascending) or <code>Desc</code> (descending). If you do not specify <code>SortOrder</code>, the default is <code>Asc</code>. The following fields are supported:</p>
     * <ul>
     * <li><p><code>Id</code>: Resource group ID</p>
     * </li>
     * <li><p><code>Name</code>: Resource group name</p>
     * </li>
     * <li><p><code>Remark</code>: Resource group remarks</p>
     * </li>
     * <li><p><code>Type</code>: Resource group type</p>
     * </li>
     * <li><p><code>Status</code>: Resource group status</p>
     * </li>
     * <li><p><code>Spec</code>: Resource group specifications</p>
     * </li>
     * <li><p><code>CreateUser</code>: The user who created the resource group</p>
     * </li>
     * <li><p><code>CreateTime</code>: The time when the resource group was created</p>
     * </li>
     * </ul>
     * <p>Default value: <code>CreateTime Asc</code></p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime Asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The statuses of the resource groups to query.</p>
     */
    @NameInMap("Statuses")
    public String statusesShrink;

    public static ListResourceGroupsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsShrinkRequest self = new ListResourceGroupsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsShrinkRequest setAliyunResourceGroupId(String aliyunResourceGroupId) {
        this.aliyunResourceGroupId = aliyunResourceGroupId;
        return this;
    }
    public String getAliyunResourceGroupId() {
        return this.aliyunResourceGroupId;
    }

    public ListResourceGroupsShrinkRequest setAliyunResourceTagsShrink(String aliyunResourceTagsShrink) {
        this.aliyunResourceTagsShrink = aliyunResourceTagsShrink;
        return this;
    }
    public String getAliyunResourceTagsShrink() {
        return this.aliyunResourceTagsShrink;
    }

    public ListResourceGroupsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListResourceGroupsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceGroupsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceGroupsShrinkRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListResourceGroupsShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListResourceGroupsShrinkRequest setResourceGroupTypesShrink(String resourceGroupTypesShrink) {
        this.resourceGroupTypesShrink = resourceGroupTypesShrink;
        return this;
    }
    public String getResourceGroupTypesShrink() {
        return this.resourceGroupTypesShrink;
    }

    public ListResourceGroupsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListResourceGroupsShrinkRequest setStatusesShrink(String statusesShrink) {
        this.statusesShrink = statusesShrink;
        return this;
    }
    public String getStatusesShrink() {
        return this.statusesShrink;
    }

}
