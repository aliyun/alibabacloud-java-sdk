// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenStructRefreshJobModel extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("Processid")
    public String processid;

    @NameInMap("RefreshInterval")
    public String refreshInterval;

    @NameInMap("RefreshModel")
    public String refreshModel;

    @NameInMap("ResourceGroup")
    public String resourceGroup;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    public static OpenStructRefreshJobModel build(java.util.Map<String, ?> map) throws Exception {
        OpenStructRefreshJobModel self = new OpenStructRefreshJobModel();
        return TeaModel.build(map, self);
    }

    public OpenStructRefreshJobModel setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public OpenStructRefreshJobModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenStructRefreshJobModel setProcessid(String processid) {
        this.processid = processid;
        return this;
    }
    public String getProcessid() {
        return this.processid;
    }

    public OpenStructRefreshJobModel setRefreshInterval(String refreshInterval) {
        this.refreshInterval = refreshInterval;
        return this;
    }
    public String getRefreshInterval() {
        return this.refreshInterval;
    }

    public OpenStructRefreshJobModel setRefreshModel(String refreshModel) {
        this.refreshModel = refreshModel;
        return this;
    }
    public String getRefreshModel() {
        return this.refreshModel;
    }

    public OpenStructRefreshJobModel setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public OpenStructRefreshJobModel setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public OpenStructRefreshJobModel setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public OpenStructRefreshJobModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
