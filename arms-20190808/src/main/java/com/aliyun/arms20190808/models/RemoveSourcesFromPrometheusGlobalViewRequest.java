// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class RemoveSourcesFromPrometheusGlobalViewRequest extends TeaModel {
    /**
     * <p>The ID of the global aggregation instance.</p>
     */
    @NameInMap("GlobalViewClusterId")
    public String globalViewClusterId;

    /**
     * <p>The name of the global aggregation instance.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of custom data sources. You can specify multiple data sources and separate them with commas (,).</p>
     */
    @NameInMap("SourceNames")
    public String sourceNames;

    public static RemoveSourcesFromPrometheusGlobalViewRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSourcesFromPrometheusGlobalViewRequest self = new RemoveSourcesFromPrometheusGlobalViewRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSourcesFromPrometheusGlobalViewRequest setGlobalViewClusterId(String globalViewClusterId) {
        this.globalViewClusterId = globalViewClusterId;
        return this;
    }
    public String getGlobalViewClusterId() {
        return this.globalViewClusterId;
    }

    public RemoveSourcesFromPrometheusGlobalViewRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public RemoveSourcesFromPrometheusGlobalViewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveSourcesFromPrometheusGlobalViewRequest setSourceNames(String sourceNames) {
        this.sourceNames = sourceNames;
        return this;
    }
    public String getSourceNames() {
        return this.sourceNames;
    }

}
