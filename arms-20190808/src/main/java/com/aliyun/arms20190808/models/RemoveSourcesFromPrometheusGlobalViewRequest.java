// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class RemoveSourcesFromPrometheusGlobalViewRequest extends TeaModel {
    @NameInMap("GlobalViewClusterId")
    public String globalViewClusterId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RegionId")
    public String regionId;

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
