// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryConfigCenterRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Group")
    public String group;

    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    public static QueryConfigCenterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigCenterRequest self = new QueryConfigCenterRequest();
        return TeaModel.build(map, self);
    }

    public QueryConfigCenterRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public QueryConfigCenterRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QueryConfigCenterRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

}
