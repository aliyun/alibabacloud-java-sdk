// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupList")
    public java.util.List<ListResourceGroupsResponseBodyResourceGroupList> resourceGroupList;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsResponseBody self = new ListResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupsResponseBody setResourceGroupList(java.util.List<ListResourceGroupsResponseBodyResourceGroupList> resourceGroupList) {
        this.resourceGroupList = resourceGroupList;
        return this;
    }
    public java.util.List<ListResourceGroupsResponseBodyResourceGroupList> getResourceGroupList() {
        return this.resourceGroupList;
    }

    public ListResourceGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListResourceGroupsResponseBodyResourceGroupListSpec extends TeaModel {
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

        public static ListResourceGroupsResponseBodyResourceGroupListSpec build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyResourceGroupListSpec self = new ListResourceGroupsResponseBodyResourceGroupListSpec();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyResourceGroupListSpec setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListResourceGroupsResponseBodyResourceGroupListSpec setStandard(String standard) {
            this.standard = standard;
            return this;
        }
        public String getStandard() {
            return this.standard;
        }

    }

    public static class ListResourceGroupsResponseBodyResourceGroupList extends TeaModel {
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
        public ListResourceGroupsResponseBodyResourceGroupListSpec spec;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListResourceGroupsResponseBodyResourceGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyResourceGroupList self = new ListResourceGroupsResponseBodyResourceGroupList();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyResourceGroupList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListResourceGroupsResponseBodyResourceGroupList setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListResourceGroupsResponseBodyResourceGroupList setDefaultVpcId(String defaultVpcId) {
            this.defaultVpcId = defaultVpcId;
            return this;
        }
        public String getDefaultVpcId() {
            return this.defaultVpcId;
        }

        public ListResourceGroupsResponseBodyResourceGroupList setDefaultVswicthId(String defaultVswicthId) {
            this.defaultVswicthId = defaultVswicthId;
            return this;
        }
        public String getDefaultVswicthId() {
            return this.defaultVswicthId;
        }

        public ListResourceGroupsResponseBodyResourceGroupList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourceGroupsResponseBodyResourceGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceGroupsResponseBodyResourceGroupList setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public ListResourceGroupsResponseBodyResourceGroupList setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListResourceGroupsResponseBodyResourceGroupList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListResourceGroupsResponseBodyResourceGroupList setResourceGroupType(String resourceGroupType) {
            this.resourceGroupType = resourceGroupType;
            return this;
        }
        public String getResourceGroupType() {
            return this.resourceGroupType;
        }

        public ListResourceGroupsResponseBodyResourceGroupList setSpec(ListResourceGroupsResponseBodyResourceGroupListSpec spec) {
            this.spec = spec;
            return this;
        }
        public ListResourceGroupsResponseBodyResourceGroupListSpec getSpec() {
            return this.spec;
        }

        public ListResourceGroupsResponseBodyResourceGroupList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
