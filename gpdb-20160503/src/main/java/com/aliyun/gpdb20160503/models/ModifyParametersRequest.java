// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyParametersRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("ForceRestartInstance")
    public Boolean forceRestartInstance;

    public static ModifyParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyParametersRequest self = new ModifyParametersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyParametersRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyParametersRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyParametersRequest setForceRestartInstance(Boolean forceRestartInstance) {
        this.forceRestartInstance = forceRestartInstance;
        return this;
    }
    public Boolean getForceRestartInstance() {
        return this.forceRestartInstance;
    }

}
