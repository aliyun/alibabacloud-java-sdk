// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2kqofrgXXXXX</p>
     */
    @NameInMap("AliyunResourceGroupId")
    public String aliyunResourceGroupId;

    /**
     * <p>The Alibaba Cloud tags.</p>
     */
    @NameInMap("AliyunResourceTags")
    public String aliyunResourceTagsShrink;

    /**
     * <p>The name of the resource group for fuzzy match.</p>
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
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The billing method of the resource group. Valid values:</p>
     * <ul>
     * <li>PrePaid: Subscription.</li>
     * <li>PostPaid: Pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The ID of the workspace to which the resource group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The types of the resource groups to query. <strong>If this parameter is left empty, general-purpose resource groups are queried by default.</strong></p>
     */
    @NameInMap("ResourceGroupTypes")
    public String resourceGroupTypesShrink;

    /**
     * <p>The fields by which to sort the results. You can sort the results by fields such as scheduled time and start time. The format is \&quot;Sort field+Sort order (Desc/Asc)\&quot;. Asc can be omitted. Valid values for the sort field:</p>
     * <ul>
     * <li>Id (Desc/Asc): The ID of the resource group.</li>
     * <li>Name (Desc/Asc): The name of the resource group.</li>
     * <li>Remark (Desc/Asc): The description of the resource group.</li>
     * <li>Type (Desc/Asc): The type of the resource group.</li>
     * <li>Status (Desc/Asc): The status of the resource group.</li>
     * <li>Spec (Desc/Asc): The specifications of the resource group.</li>
     * <li>CreateUser (Desc/Asc): The creator of the resource group.</li>
     * <li>CreateTime (Desc/Asc): The time when the resource group was created.</li>
     * </ul>
     * <p>Default value: CreateTime Asc.</p>
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
