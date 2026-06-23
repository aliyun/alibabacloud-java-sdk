// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListResourceGroupsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsResponseBody self = new ListResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsResponseBody setPagingInfo(ListResourceGroupsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListResourceGroupsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListResourceGroupsResponseBodyPagingInfoResourceGroupListAliyunResourceTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListResourceGroupsResponseBodyPagingInfoResourceGroupListAliyunResourceTags build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyPagingInfoResourceGroupListAliyunResourceTags self = new ListResourceGroupsResponseBodyPagingInfoResourceGroupListAliyunResourceTags();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupListAliyunResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupListAliyunResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListResourceGroupsResponseBodyPagingInfoResourceGroupListSpec extends TeaModel {
        /**
         * <p>The number of resource units.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The resource specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>2CU</p>
         */
        @NameInMap("Standard")
        public String standard;

        public static ListResourceGroupsResponseBodyPagingInfoResourceGroupListSpec build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyPagingInfoResourceGroupListSpec self = new ListResourceGroupsResponseBodyPagingInfoResourceGroupListSpec();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupListSpec setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupListSpec setStandard(String standard) {
            this.standard = standard;
            return this;
        }
        public String getStandard() {
            return this.standard;
        }

    }

    public static class ListResourceGroupsResponseBodyPagingInfoResourceGroupList extends TeaModel {
        /**
         * <p>The Alibaba Cloud resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2kqofrgXXXXX</p>
         */
        @NameInMap("AliyunResourceGroupId")
        public String aliyunResourceGroupId;

        /**
         * <p>A list of Alibaba Cloud tags.</p>
         */
        @NameInMap("AliyunResourceTags")
        public java.util.List<ListResourceGroupsResponseBodyPagingInfoResourceGroupListAliyunResourceTags> aliyunResourceTags;

        /**
         * <p>The creation time of the resource group, as a 64-bit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The user ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>11075500042XXXXX</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The ID of the default Virtual Private Cloud (VPC) bound to the general-purpose resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m2et4f3oc8msfbccXXXXX</p>
         */
        @NameInMap("DefaultVpcId")
        public String defaultVpcId;

        /**
         * <p>The ID of the default vSwitch bound to the general-purpose resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf8usrhs7hjd9amsXXXXX</p>
         */
        @NameInMap("DefaultVswicthId")
        public String defaultVswicthId;

        /**
         * <p>The unique identifier of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>common_resource_group</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the order for the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>c442b330-3b10-4584-959e-736e4edXXXXX</p>
         */
        @NameInMap("OrderInstanceId")
        public String orderInstanceId;

        /**
         * <p>The billing method of the resource group. <code>PrePaid</code> indicates subscription and <code>PostPaid</code> indicates pay-as-you-go.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>The description of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>Create a general-purpose resource group for common tasks.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The type of the resource group. Valid values:</p>
         * <ul>
         * <li><p><code>CommonV2</code>: The new general-purpose resource group.</p>
         * </li>
         * <li><p><code>ExclusiveDataIntegration</code>: The exclusive resource group for data integration.</p>
         * </li>
         * <li><p><code>ExclusiveScheduler</code>: The exclusive resource group for scheduling.</p>
         * </li>
         * <li><p><code>ExclusiveDataService</code>: The exclusive resource group for data services.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CommonV2</p>
         */
        @NameInMap("ResourceGroupType")
        public String resourceGroupType;

        /**
         * <p>The specifications of the resource group.</p>
         */
        @NameInMap("Spec")
        public ListResourceGroupsResponseBodyPagingInfoResourceGroupListSpec spec;

        /**
         * <p>The status of the resource group. Valid values:</p>
         * <ul>
         * <li><p><code>Normal</code>: Running.</p>
         * </li>
         * <li><p><code>Stop</code>: Frozen due to expiration.</p>
         * </li>
         * <li><p><code>Deleted</code>: Released.</p>
         * </li>
         * <li><p><code>Creating</code>: Creation in progress.</p>
         * </li>
         * <li><p><code>CreateFailed</code>: Creation failed.</p>
         * </li>
         * <li><p><code>Updating</code>: Update in progress.</p>
         * </li>
         * <li><p><code>UpdateFailed</code>: Update failed.</p>
         * </li>
         * <li><p><code>Deleting</code>: Release in progress.</p>
         * </li>
         * <li><p><code>DeleteFailed</code>: Release failed.</p>
         * </li>
         * <li><p><code>Timeout</code>: The operation timed out.</p>
         * </li>
         * <li><p><code>Freezed</code>: Frozen.</p>
         * </li>
         * <li><p><code>Starting</code>: Starting.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListResourceGroupsResponseBodyPagingInfoResourceGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyPagingInfoResourceGroupList self = new ListResourceGroupsResponseBodyPagingInfoResourceGroupList();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setAliyunResourceGroupId(String aliyunResourceGroupId) {
            this.aliyunResourceGroupId = aliyunResourceGroupId;
            return this;
        }
        public String getAliyunResourceGroupId() {
            return this.aliyunResourceGroupId;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setAliyunResourceTags(java.util.List<ListResourceGroupsResponseBodyPagingInfoResourceGroupListAliyunResourceTags> aliyunResourceTags) {
            this.aliyunResourceTags = aliyunResourceTags;
            return this;
        }
        public java.util.List<ListResourceGroupsResponseBodyPagingInfoResourceGroupListAliyunResourceTags> getAliyunResourceTags() {
            return this.aliyunResourceTags;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setDefaultVpcId(String defaultVpcId) {
            this.defaultVpcId = defaultVpcId;
            return this;
        }
        public String getDefaultVpcId() {
            return this.defaultVpcId;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setDefaultVswicthId(String defaultVswicthId) {
            this.defaultVswicthId = defaultVswicthId;
            return this;
        }
        public String getDefaultVswicthId() {
            return this.defaultVswicthId;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setResourceGroupType(String resourceGroupType) {
            this.resourceGroupType = resourceGroupType;
            return this;
        }
        public String getResourceGroupType() {
            return this.resourceGroupType;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setSpec(ListResourceGroupsResponseBodyPagingInfoResourceGroupListSpec spec) {
            this.spec = spec;
            return this;
        }
        public ListResourceGroupsResponseBodyPagingInfoResourceGroupListSpec getSpec() {
            return this.spec;
        }

        public ListResourceGroupsResponseBodyPagingInfoResourceGroupList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListResourceGroupsResponseBodyPagingInfo extends TeaModel {
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
         * <p>The list of resource groups.</p>
         */
        @NameInMap("ResourceGroupList")
        public java.util.List<ListResourceGroupsResponseBodyPagingInfoResourceGroupList> resourceGroupList;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListResourceGroupsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyPagingInfo self = new ListResourceGroupsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListResourceGroupsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListResourceGroupsResponseBodyPagingInfo setResourceGroupList(java.util.List<ListResourceGroupsResponseBodyPagingInfoResourceGroupList> resourceGroupList) {
            this.resourceGroupList = resourceGroupList;
            return this;
        }
        public java.util.List<ListResourceGroupsResponseBodyPagingInfoResourceGroupList> getResourceGroupList() {
            return this.resourceGroupList;
        }

        public ListResourceGroupsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
