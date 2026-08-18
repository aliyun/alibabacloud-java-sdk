// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The detailed information of the resource group.</p>
     */
    @NameInMap("ResourceGroup")
    public GetResourceGroupResponseBodyResourceGroup resourceGroup;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupResponseBody self = new GetResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceGroupResponseBody setResourceGroup(GetResourceGroupResponseBodyResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public GetResourceGroupResponseBodyResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    public GetResourceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetResourceGroupResponseBodyResourceGroupAliyunResourceTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetResourceGroupResponseBodyResourceGroupAliyunResourceTags build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResponseBodyResourceGroupAliyunResourceTags self = new GetResourceGroupResponseBodyResourceGroupAliyunResourceTags();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResponseBodyResourceGroupAliyunResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetResourceGroupResponseBodyResourceGroupAliyunResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetResourceGroupResponseBodyResourceGroupSpec extends TeaModel {
        /**
         * <p>The resource count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The specification details.</p>
         * 
         * <strong>example:</strong>
         * <p>2CU</p>
         */
        @NameInMap("Standard")
        public String standard;

        public static GetResourceGroupResponseBodyResourceGroupSpec build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResponseBodyResourceGroupSpec self = new GetResourceGroupResponseBodyResourceGroupSpec();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResponseBodyResourceGroupSpec setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public GetResourceGroupResponseBodyResourceGroupSpec setStandard(String standard) {
            this.standard = standard;
            return this;
        }
        public String getStandard() {
            return this.standard;
        }

    }

    public static class GetResourceGroupResponseBodyResourceGroup extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud resource group to which the resource group belongs.</p>
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
        public java.util.List<GetResourceGroupResponseBodyResourceGroupAliyunResourceTags> aliyunResourceTags;

        /**
         * <p>The creation time, represented as a 64-bit timestamp.</p>
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
         * <p>The ID of the default VPC bound to the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m2et4f3oc8msfbccXXXXX</p>
         */
        @NameInMap("DefaultVpcId")
        public String defaultVpcId;

        /**
         * <p>The ID of the default vSwitch bound to the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf8usrhs7hjd9amsXXXXX</p>
         */
        @NameInMap("DefaultVswitchId")
        public String defaultVswitchId;

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
         * <p>The order instance ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>c442b330-3b10-4584-959e-736e4edXXXXX</p>
         */
        @NameInMap("OrderInstanceId")
        public String orderInstanceId;

        /**
         * <p>The billing method of the resource group. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription.</li>
         * <li>PostPaid: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>The remarks of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>Create a common resource group for common tasks</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The type of the resource group. Valid values:</p>
         * <ul>
         * <li>CommonV2: new-version resource group.</li>
         * <li>ExclusiveDataIntegration: exclusive data integration resource group.</li>
         * <li>ExclusiveScheduler: exclusive scheduling resource group.</li>
         * <li>ExclusiveDataService: exclusive data service resource group.</li>
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
        public GetResourceGroupResponseBodyResourceGroupSpec spec;

        /**
         * <p>The status of the resource group. Valid values:</p>
         * <ul>
         * <li>Normal: normal (running/in service).</li>
         * <li>Stop: frozen (expired).</li>
         * <li>Deleted: deleted (released/destroyed).</li>
         * <li>Creating: being created.</li>
         * <li>CreateFailed: creation failed.</li>
         * <li>Updating: being updated (scaling out/scaling in/specification change in progress).</li>
         * <li>UpdateFailed: update failed (scale-out failed/upgrade failed).</li>
         * <li>Deleting: being deleted (being released/being destroyed).</li>
         * <li>DeleteFailed: deletion failed (release failed/destruction failed).</li>
         * <li>Timeout: operation timed out.</li>
         * <li>Freezed: frozen.</li>
         * <li>Starting: starting.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetResourceGroupResponseBodyResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupResponseBodyResourceGroup self = new GetResourceGroupResponseBodyResourceGroup();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupResponseBodyResourceGroup setAliyunResourceGroupId(String aliyunResourceGroupId) {
            this.aliyunResourceGroupId = aliyunResourceGroupId;
            return this;
        }
        public String getAliyunResourceGroupId() {
            return this.aliyunResourceGroupId;
        }

        public GetResourceGroupResponseBodyResourceGroup setAliyunResourceTags(java.util.List<GetResourceGroupResponseBodyResourceGroupAliyunResourceTags> aliyunResourceTags) {
            this.aliyunResourceTags = aliyunResourceTags;
            return this;
        }
        public java.util.List<GetResourceGroupResponseBodyResourceGroupAliyunResourceTags> getAliyunResourceTags() {
            return this.aliyunResourceTags;
        }

        public GetResourceGroupResponseBodyResourceGroup setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetResourceGroupResponseBodyResourceGroup setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetResourceGroupResponseBodyResourceGroup setDefaultVpcId(String defaultVpcId) {
            this.defaultVpcId = defaultVpcId;
            return this;
        }
        public String getDefaultVpcId() {
            return this.defaultVpcId;
        }

        public GetResourceGroupResponseBodyResourceGroup setDefaultVswitchId(String defaultVswitchId) {
            this.defaultVswitchId = defaultVswitchId;
            return this;
        }
        public String getDefaultVswitchId() {
            return this.defaultVswitchId;
        }

        public GetResourceGroupResponseBodyResourceGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetResourceGroupResponseBodyResourceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResourceGroupResponseBodyResourceGroup setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public GetResourceGroupResponseBodyResourceGroup setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public GetResourceGroupResponseBodyResourceGroup setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetResourceGroupResponseBodyResourceGroup setResourceGroupType(String resourceGroupType) {
            this.resourceGroupType = resourceGroupType;
            return this;
        }
        public String getResourceGroupType() {
            return this.resourceGroupType;
        }

        public GetResourceGroupResponseBodyResourceGroup setSpec(GetResourceGroupResponseBodyResourceGroupSpec spec) {
            this.spec = spec;
            return this;
        }
        public GetResourceGroupResponseBodyResourceGroupSpec getSpec() {
            return this.spec;
        }

        public GetResourceGroupResponseBodyResourceGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
