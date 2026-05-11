// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class Audit extends TeaModel {
    /**
     * <p>Specifies whether to push migration logs to Simple Log Service (SLS). To push migration logs to SLS, you must create the AliyunOSSImportSlsAuditRole role and grant the required permissions to the role. Valid values: off, basic, and detail. off: does not push migration logs. basic: pushes only migration failure logs. detail: pushes migration success logs and migration failure logs.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LogMode")
    public String logMode;

    public static Audit build(java.util.Map<String, ?> map) throws Exception {
        Audit self = new Audit();
        return TeaModel.build(map, self);
    }

    public Audit setLogMode(String logMode) {
        this.logMode = logMode;
        return this;
    }
    public String getLogMode() {
        return this.logMode;
    }

}
