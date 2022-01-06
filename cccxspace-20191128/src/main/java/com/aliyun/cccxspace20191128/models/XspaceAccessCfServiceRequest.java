// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class XspaceAccessCfServiceRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ExecutorEmpId")
    public String executorEmpId;

    @NameInMap("UpgradeTaskId")
    public String upgradeTaskId;

    public static XspaceAccessCfServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceAccessCfServiceRequest self = new XspaceAccessCfServiceRequest();
        return TeaModel.build(map, self);
    }

    public XspaceAccessCfServiceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public XspaceAccessCfServiceRequest setExecutorEmpId(String executorEmpId) {
        this.executorEmpId = executorEmpId;
        return this;
    }
    public String getExecutorEmpId() {
        return this.executorEmpId;
    }

    public XspaceAccessCfServiceRequest setUpgradeTaskId(String upgradeTaskId) {
        this.upgradeTaskId = upgradeTaskId;
        return this;
    }
    public String getUpgradeTaskId() {
        return this.upgradeTaskId;
    }

}
