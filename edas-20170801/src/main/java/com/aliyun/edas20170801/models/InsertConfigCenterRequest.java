// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertConfigCenterRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Group")
    public String group;

    @NameInMap("Data")
    public String data;

    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    @NameInMap("AppName")
    public String appName;

    public static InsertConfigCenterRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertConfigCenterRequest self = new InsertConfigCenterRequest();
        return TeaModel.build(map, self);
    }

    public InsertConfigCenterRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public InsertConfigCenterRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public InsertConfigCenterRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InsertConfigCenterRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public InsertConfigCenterRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
