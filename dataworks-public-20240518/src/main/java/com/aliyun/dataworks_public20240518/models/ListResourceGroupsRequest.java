// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsRequest extends TeaModel {
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
    public java.util.List<ListResourceGroupsRequestAliyunResourceTags> aliyunResourceTags;

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
    public java.util.List<String> resourceGroupTypes;

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
    public java.util.List<String> statuses;

    public static ListResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsRequest self = new ListResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsRequest setAliyunResourceGroupId(String aliyunResourceGroupId) {
        this.aliyunResourceGroupId = aliyunResourceGroupId;
        return this;
    }
    public String getAliyunResourceGroupId() {
        return this.aliyunResourceGroupId;
    }

    public ListResourceGroupsRequest setAliyunResourceTags(java.util.List<ListResourceGroupsRequestAliyunResourceTags> aliyunResourceTags) {
        this.aliyunResourceTags = aliyunResourceTags;
        return this;
    }
    public java.util.List<ListResourceGroupsRequestAliyunResourceTags> getAliyunResourceTags() {
        return this.aliyunResourceTags;
    }

    public ListResourceGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListResourceGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceGroupsRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListResourceGroupsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListResourceGroupsRequest setResourceGroupTypes(java.util.List<String> resourceGroupTypes) {
        this.resourceGroupTypes = resourceGroupTypes;
        return this;
    }
    public java.util.List<String> getResourceGroupTypes() {
        return this.resourceGroupTypes;
    }

    public ListResourceGroupsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListResourceGroupsRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static class ListResourceGroupsRequestAliyunResourceTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListResourceGroupsRequestAliyunResourceTags build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsRequestAliyunResourceTags self = new ListResourceGroupsRequestAliyunResourceTags();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsRequestAliyunResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceGroupsRequestAliyunResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
