// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete all tags. This parameter takes effect only when the TagKey.N parameter is not specified. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("All")
    public Boolean all;

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
     * <p>The tag keys. You can specify a maximum of 20 tag keys.</p>
     */
    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<UntagResourcesRequestTags> tags;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

    public UntagResourcesRequest setTags(java.util.List<UntagResourcesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UntagResourcesRequestTags> getTags() {
        return this.tags;
    }

    public static class UntagResourcesRequestTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static UntagResourcesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UntagResourcesRequestTags self = new UntagResourcesRequestTags();
            return TeaModel.build(map, self);
        }

        public UntagResourcesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UntagResourcesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
