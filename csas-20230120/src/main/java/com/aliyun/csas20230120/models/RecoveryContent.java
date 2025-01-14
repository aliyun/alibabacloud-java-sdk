// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RecoveryContent extends TeaModel {
    @NameInMap("AuthReportInterval")
    public AuthReportInterval authReportInterval;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecoveryActions")
    public java.util.List<String> recoveryActions;

    public static RecoveryContent build(java.util.Map<String, ?> map) throws Exception {
        RecoveryContent self = new RecoveryContent();
        return TeaModel.build(map, self);
    }

    public RecoveryContent setAuthReportInterval(AuthReportInterval authReportInterval) {
        this.authReportInterval = authReportInterval;
        return this;
    }
    public AuthReportInterval getAuthReportInterval() {
        return this.authReportInterval;
    }

    public RecoveryContent setRecoveryActions(java.util.List<String> recoveryActions) {
        this.recoveryActions = recoveryActions;
        return this;
    }
    public java.util.List<String> getRecoveryActions() {
        return this.recoveryActions;
    }

}
