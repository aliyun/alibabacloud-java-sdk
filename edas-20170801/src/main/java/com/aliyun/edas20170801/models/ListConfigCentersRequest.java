// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConfigCentersRequest extends TeaModel {
    @NameInMap("DataIdPattern")
    public String dataIdPattern;

    @NameInMap("Group")
    public String group;

    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    @NameInMap("AppName")
    public String appName;

    public static ListConfigCentersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigCentersRequest self = new ListConfigCentersRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigCentersRequest setDataIdPattern(String dataIdPattern) {
        this.dataIdPattern = dataIdPattern;
        return this;
    }
    public String getDataIdPattern() {
        return this.dataIdPattern;
    }

    public ListConfigCentersRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListConfigCentersRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public ListConfigCentersRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
