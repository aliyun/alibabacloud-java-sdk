// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsRequest extends TeaModel {
    @NameInMap("BizExtKey")
    public String bizExtKey;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("ResourceGroupType")
    public Integer resourceGroupType;

    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    @NameInMap("Tags")
    public java.util.List<ListResourceGroupsRequestTags> tags;

    @NameInMap("TypeNames")
    public String typeNames;

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

    public ListResourceGroupsRequest setTypeNames(String typeNames) {
        this.typeNames = typeNames;
        return this;
    }
    public String getTypeNames() {
        return this.typeNames;
    }

    public static class ListResourceGroupsRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

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
