// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsResponseBody extends TeaModel {
    /**
     * <p>The time when the resource group was last updated.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListResourceGroupsResponseBodyData> data;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The resource groups.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the resource group. Valid values:</p>
     * <br>
     * <p>*   0: The resource group is running or in service.</p>
     * <p>*   1: The resource group has expired and is frozen.</p>
     * <p>*   2: The resource group is released or destroyed.</p>
     * <p>*   3: The resource group is being created or started.</p>
     * <p>*   4: The resource group fails to be created or started.</p>
     * <p>*   5: The resource group is being scaled out or upgraded.</p>
     * <p>*   6: The resource group fails to be scaled out or upgraded.</p>
     * <p>*   7: The resource group is being released or destroyed.</p>
     * <p>*   8: The resource group fails to be released or destroyed.</p>
     * <p>*   9: The operation performed on the resource group times out. All operations may time out. This value is temporarily available only for DataService Studio.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsResponseBody self = new ListResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsResponseBody setData(java.util.List<ListResourceGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListResourceGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListResourceGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static class ListResourceGroupsResponseBodyDataTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListResourceGroupsResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyDataTags self = new ListResourceGroupsResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceGroupsResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListResourceGroupsResponseBodyData extends TeaModel {
        /**
         * <p>The details of the resource group. The content enclosed in braces {} is the details of the resource group.</p>
         */
        @NameInMap("BizExtKey")
        public String bizExtKey;

        /**
         * <p>The type of the resource group. Valid values:</p>
         * <br>
         * <p>*   0: DataWorks</p>
         * <p>*   2: MaxCompute</p>
         * <p>*   3: PAI</p>
         * <p>*   4: Data Integration</p>
         * <p>*   7: scheduling</p>
         * <p>*   9: DataService Studio</p>
         */
        @NameInMap("Cluster")
        public String cluster;

        /**
         * <p>The mode of the resource group. Valid values:</p>
         * <br>
         * <p>*   ISOLATE: exclusive resource group that adopts the subscription billing method</p>
         * <p>*   SHARE: shared resource group that adopts the pay-as-you-go billing method</p>
         * <p>*   DEVELOP: resource group for developers</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the cluster was created. Example: Jul 9, 2018 02:43:37 PM.</p>
         */
        @NameInMap("EnableKp")
        public Boolean enableKp;

        /**
         * <p>The ID of your Alibaba Cloud resource group.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The category of the resource group. Valid values:</p>
         * <br>
         * <p>*   default: shared resource group</p>
         * <p>*   single: exclusive resource group</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>Indicates whether the UID of an Alibaba Cloud account is used for access. Valid values:</p>
         * <br>
         * <p>*   true: The MaxCompute compute engine uses the UID of the Alibaba Cloud account as the display name of the account for access.</p>
         * <br>
         * <p>*   false: The MaxCompute compute engine uses the name of the Alibaba Cloud account as the display name of the account for access.</p>
         * <br>
         * <p>    The remaining values are useless. This parameter is returned only if the type of the resource group is MaxCompute.</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The sequence number of the resource group. Created resource groups are sorted in ascending order by sequence number.</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The identifier of the resource group.</p>
         */
        @NameInMap("ResourceGroupType")
        public String resourceGroupType;

        /**
         * <p>The tag key.</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <p>The name of the resource group.</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("Specs")
        public java.util.Map<String, ?> specs;

        /**
         * <p>Indicates whether the resource group is the default resource group. Valid values:</p>
         * <br>
         * <p>*   true: The resource group is the default resource group.</p>
         * <p>*   false: The resource group is not the default resource group.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListResourceGroupsResponseBodyDataTags> tags;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The name of the cluster. This parameter is returned only if the type of the resource group is MaxCompute or PAI.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListResourceGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyData self = new ListResourceGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyData setBizExtKey(String bizExtKey) {
            this.bizExtKey = bizExtKey;
            return this;
        }
        public String getBizExtKey() {
            return this.bizExtKey;
        }

        public ListResourceGroupsResponseBodyData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListResourceGroupsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceGroupsResponseBodyData setEnableKp(Boolean enableKp) {
            this.enableKp = enableKp;
            return this;
        }
        public Boolean getEnableKp() {
            return this.enableKp;
        }

        public ListResourceGroupsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListResourceGroupsResponseBodyData setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListResourceGroupsResponseBodyData setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListResourceGroupsResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListResourceGroupsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceGroupsResponseBodyData setResourceGroupType(String resourceGroupType) {
            this.resourceGroupType = resourceGroupType;
            return this;
        }
        public String getResourceGroupType() {
            return this.resourceGroupType;
        }

        public ListResourceGroupsResponseBodyData setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        public ListResourceGroupsResponseBodyData setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListResourceGroupsResponseBodyData setSpecs(java.util.Map<String, ?> specs) {
            this.specs = specs;
            return this;
        }
        public java.util.Map<String, ?> getSpecs() {
            return this.specs;
        }

        public ListResourceGroupsResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListResourceGroupsResponseBodyData setTags(java.util.List<ListResourceGroupsResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListResourceGroupsResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public ListResourceGroupsResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListResourceGroupsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
