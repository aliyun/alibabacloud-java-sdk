// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteResourceExportTaskRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("ramRole")
    public String ramRole;

    public static ExecuteResourceExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteResourceExportTaskRequest self = new ExecuteResourceExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteResourceExportTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ExecuteResourceExportTaskRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

}
