// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListTraceAppsRequest extends TeaModel {
    /**
     * <p>The type of the application that is associated with the alert rule. Valid values:</p>
     * <ul>
     * <li>TRACE: Application Monitoring</li>
     * <li>EBPF: Application Monitoring eBPF Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TRACE</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListTraceAppsRequestTags> tags;

    public static ListTraceAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTraceAppsRequest self = new ListTraceAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListTraceAppsRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ListTraceAppsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListTraceAppsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTraceAppsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTraceAppsRequest setTags(java.util.List<ListTraceAppsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTraceAppsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListTraceAppsRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTraceAppsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListTraceAppsRequestTags self = new ListTraceAppsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListTraceAppsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTraceAppsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
