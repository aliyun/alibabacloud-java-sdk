// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    @NameInMap("cmsInstanceType")
    public String cmsInstanceType;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags to add to the resource.</p>
     */
    @NameInMap("tag")
    public java.util.List<ListInstancesRequestTag> tag;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setCmsInstanceType(String cmsInstanceType) {
        this.cmsInstanceType = cmsInstanceType;
        return this;
    }
    public String getCmsInstanceType() {
        return this.cmsInstanceType;
    }

    public ListInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListInstancesRequest setTag(java.util.List<ListInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("value")
        public String value;

        public static ListInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesRequestTag self = new ListInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
