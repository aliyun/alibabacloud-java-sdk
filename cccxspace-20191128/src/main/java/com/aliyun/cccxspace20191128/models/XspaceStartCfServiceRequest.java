// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class XspaceStartCfServiceRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ExecutorEmpId")
    public String executorEmpId;

    @NameInMap("SourceOrderId")
    public String sourceOrderId;

    public static XspaceStartCfServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceStartCfServiceRequest self = new XspaceStartCfServiceRequest();
        return TeaModel.build(map, self);
    }

    public XspaceStartCfServiceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public XspaceStartCfServiceRequest setExecutorEmpId(String executorEmpId) {
        this.executorEmpId = executorEmpId;
        return this;
    }
    public String getExecutorEmpId() {
        return this.executorEmpId;
    }

    public XspaceStartCfServiceRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

}
