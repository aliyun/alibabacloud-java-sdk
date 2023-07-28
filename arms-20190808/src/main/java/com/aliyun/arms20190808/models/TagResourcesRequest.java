// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>Schema of Response</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type.</p>
     * <br>
     * <p>WEB-front-end monitoring</p>
     * <p>APPLICATION-Application Monitoring</p>
     * <p>PROMETHEUS-PROM monitoring</p>
     * <p>SYNTHETICTASK-Cloud dial test</p>
     * <p>ALERTRULE - Application Monitoring Similar</p>
     * <p>PROMETHEUSALERTRULE - Prometheus monitoring</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Tag")
    public java.util.List<TagResourcesRequestTag> tag;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTag(java.util.List<TagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class TagResourcesRequestTag extends TeaModel {
        /**
         * <p>http://arms.${regionId}.aliyun-inc.com:8099/tag/TagResources.json</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static TagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTag self = new TagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public TagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
