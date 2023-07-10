// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyParametersRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstances](~~86911~~) operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to forcibly restart the instance. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("ForceRestartInstance")
    public Boolean forceRestartInstance;

    /**
     * <p>The name and value of the parameter to be modified. Specify the parameter in the `<Parameter name>:<Parameter value>` format.</p>
     * <br>
     * <p>You can call the [DescribeParameters](~~208310~~) operation to query the parameters that can be modified.</p>
     */
    @NameInMap("Parameters")
    public String parameters;

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

    public ModifyParametersRequest setForceRestartInstance(Boolean forceRestartInstance) {
        this.forceRestartInstance = forceRestartInstance;
        return this;
    }
    public Boolean getForceRestartInstance() {
        return this.forceRestartInstance;
    }

    public ModifyParametersRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
