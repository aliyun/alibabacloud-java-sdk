// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateRestorePlanRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("TargetClusterId")
    public String targetClusterId;

    @NameInMap("RestoreAllTable")
    public Boolean restoreAllTable;

    @NameInMap("RestoreByCopy")
    public Boolean restoreByCopy;

    @NameInMap("RestoreToDate")
    public String restoreToDate;

    @NameInMap("Tables")
    public String tables;

    public static CreateRestorePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRestorePlanRequest self = new CreateRestorePlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateRestorePlanRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateRestorePlanRequest setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
        return this;
    }
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

    public CreateRestorePlanRequest setRestoreAllTable(Boolean restoreAllTable) {
        this.restoreAllTable = restoreAllTable;
        return this;
    }
    public Boolean getRestoreAllTable() {
        return this.restoreAllTable;
    }

    public CreateRestorePlanRequest setRestoreByCopy(Boolean restoreByCopy) {
        this.restoreByCopy = restoreByCopy;
        return this;
    }
    public Boolean getRestoreByCopy() {
        return this.restoreByCopy;
    }

    public CreateRestorePlanRequest setRestoreToDate(String restoreToDate) {
        this.restoreToDate = restoreToDate;
        return this;
    }
    public String getRestoreToDate() {
        return this.restoreToDate;
    }

    public CreateRestorePlanRequest setTables(String tables) {
        this.tables = tables;
        return this;
    }
    public String getTables() {
        return this.tables;
    }

}
