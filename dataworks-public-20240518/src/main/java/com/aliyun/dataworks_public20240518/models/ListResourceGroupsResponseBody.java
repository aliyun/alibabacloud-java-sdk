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
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
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

    public static class ListResourceGroupsResponseBodyPagingInfoResourceGroupListSpec extends TeaModel {
        /**
         * <p>Quantity</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>Specification details</p>
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
         * <p>Alibaba Cloud Resource Group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2kqofrgXXXXX</p>
         */
        @NameInMap("AliyunResourceGroupId")
        public String aliyunResourceGroupId;

        /**
         * <p>The creation time, which is a 64-bit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the user who created the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>11075500042XXXXX</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>Default VPC ID bound to a common resource group</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m2et4f3oc8msfbccXXXXX</p>
         */
        @NameInMap("DefaultVpcId")
        public String defaultVpcId;

        /**
         * <p>The default switch ID bound to the common resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf8usrhs7hjd9amsXXXXX</p>
         */
        @NameInMap("DefaultVswicthId")
        public String defaultVswicthId;

        /**
         * <p>Unique identifier of a resource group</p>
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
         * <p>The order instance ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>c442b330-3b10-4584-959e-736e4edXXXXX</p>
         */
        @NameInMap("OrderInstanceId")
        public String orderInstanceId;

        /**
         * <p>The billing method of the resource group. Valid values: PrePaid and PostPaid. The value PrePaid indicates the subscription billing method, and the value PostPaid indicates the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>Remarks for resource groups</p>
         * 
         * <strong>example:</strong>
         * <p>Create a common resource group for common tasks</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The type of resource group. Valid values:</p>
         * <ul>
         * <li>CommonV2: serverless resource group</li>
         * <li>ExclusiveDataIntegration: exclusive resource group for Data Integration</li>
         * <li>ExclusiveScheduler: exclusive resource group for scheduling</li>
         * <li>ExclusiveDataService: exclusive resource group for DataService Studio</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CommonV2</p>
         */
        @NameInMap("ResourceGroupType")
        public String resourceGroupType;

        /**
         * <p>Resource Group specifications</p>
         */
        @NameInMap("Spec")
        public ListResourceGroupsResponseBodyPagingInfoResourceGroupListSpec spec;

        /**
         * <p>The status of the resource group. Valid values:</p>
         * <ul>
         * <li>Normal: The resource group is running or in use.</li>
         * <li>Stop: The resource group is expired.</li>
         * <li>Deleted: The resource group is released or destroyed.</li>
         * <li>Creating: The resource group is being started.</li>
         * <li>CreateFailed: The resource group fails to be started.</li>
         * <li>Updating: The resource group is being scaled in or out, or the configurations of the resource group are being changed.</li>
         * <li>UpdateFailed: The resource group fails to be scaled out or upgraded.</li>
         * <li>Deleting: The resource group is being released or destroyed.</li>
         * <li>DeleteFailed: The resource group fails to be released or destroyed.</li>
         * <li>Timeout: The operations that are performed on the resource group time out.</li>
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
         * <p>The resource groups returned.</p>
         */
        @NameInMap("ResourceGroupList")
        public java.util.List<ListResourceGroupsResponseBodyPagingInfoResourceGroupList> resourceGroupList;

        /**
         * <p>All data entries</p>
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
