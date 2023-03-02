// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsRequest extends TeaModel {
    /**
     * <p>The category of the resource groups. Valid values:</p>
     * <br>
     * <p>*   default: shared resource group</p>
     * <p>*   single: exclusive resource group</p>
     * <p>*   Default value: default</p>
     */
    @NameInMap("BizExtKey")
    public String bizExtKey;

    /**
     * <p>The keyword that is used for fuzzy queries by resource group name and identifier.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The type of the resource groups that you want to query. Valid values:</p>
     * <br>
     * <p>*   0: DataWorks</p>
     * <p>*   1: scheduling</p>
     * <p>*   2: MaxCompute</p>
     * <p>*   3: Machine Learning Platform for AI (PAI)</p>
     * <p>*   4: Data Integration</p>
     * <p>*   7: exclusive resource group for scheduling (An ID is generated for the purchased resource when you purchase an exclusive resource group for scheduling.)</p>
     * <p>*   9: DataService Studio</p>
     * <p>*   Default value: 1</p>
     * <br>
     * <p>If the value indicates a compute engine, the resource groups to query are the ones that were created when you purchased the compute engine.</p>
     */
    @NameInMap("ResourceGroupType")
    public Integer resourceGroupType;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListResourceGroupsRequestTags> tags;

    public static ListResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsRequest self = new ListResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsRequest setBizExtKey(String bizExtKey) {
        this.bizExtKey = bizExtKey;
        return this;
    }
    public String getBizExtKey() {
        return this.bizExtKey;
    }

    public ListResourceGroupsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListResourceGroupsRequest setResourceGroupType(Integer resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
        return this;
    }
    public Integer getResourceGroupType() {
        return this.resourceGroupType;
    }

    public ListResourceGroupsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ListResourceGroupsRequest setTags(java.util.List<ListResourceGroupsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListResourceGroupsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListResourceGroupsRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListResourceGroupsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsRequestTags self = new ListResourceGroupsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceGroupsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
