// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsResponseBody extends TeaModel {
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
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
         * <strong>example:</strong>
         * <p>rg-aek2kqofrgXXXXX</p>
         */
        @NameInMap("AliyunResourceGroupId")
        public String aliyunResourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>11075500042XXXXX</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>vpc-m2et4f3oc8msfbccXXXXX</p>
         */
        @NameInMap("DefaultVpcId")
        public String defaultVpcId;

        /**
         * <strong>example:</strong>
         * <p>vsw-uf8usrhs7hjd9amsXXXXX</p>
         */
        @NameInMap("DefaultVswicthId")
        public String defaultVswicthId;

        /**
         * <strong>example:</strong>
         * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>common_resource_group</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>c442b330-3b10-4584-959e-736e4edXXXXX</p>
         */
        @NameInMap("OrderInstanceId")
        public String orderInstanceId;

        /**
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <strong>example:</strong>
         * <p>创建用于普通任务的通用资源组</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>CommonV2</p>
         */
        @NameInMap("ResourceGroupType")
        public String resourceGroupType;

        @NameInMap("Spec")
        public ListResourceGroupsResponseBodyPagingInfoResourceGroupListSpec spec;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ResourceGroupList")
        public java.util.List<ListResourceGroupsResponseBodyPagingInfoResourceGroupList> resourceGroupList;

        /**
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
