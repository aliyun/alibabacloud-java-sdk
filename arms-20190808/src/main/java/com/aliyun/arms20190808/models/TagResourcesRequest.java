// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The resource IDs. You can specify a maximum of 50 resource IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the ARMS resources for which you want to modify tags. Valid values:</p>
     * <ul>
     * <li>WEB: Browser Monitoring</li>
     * <li>APPLICATION: Application Monitoring</li>
     * <li>PROMETHEUS: Managed Service for Prometheus</li>
     * <li>SYNTHETICTASK: Synthetic Monitoring</li>
     * <li>ALERTRULE: Application Monitoring alert rule</li>
     * <li>PROMETHEUSALERTRULE: Managed Service for Prometheus alert rule</li>
     * <li>XTRACEAPP: Managed Service for OpenTelemetry</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROMETHEUS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags to add to the resource. You can specify a maximum of 20 tags.</p>
     * <p>This parameter is required.</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Test1</p>
         */
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
