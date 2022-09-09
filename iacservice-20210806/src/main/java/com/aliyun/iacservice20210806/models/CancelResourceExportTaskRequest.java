// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CancelResourceExportTaskRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("ramRole")
    public String ramRole;

    public static CancelResourceExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelResourceExportTaskRequest self = new CancelResourceExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelResourceExportTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CancelResourceExportTaskRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

}
