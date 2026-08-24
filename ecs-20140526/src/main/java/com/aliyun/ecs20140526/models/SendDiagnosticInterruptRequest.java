// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class SendDiagnosticInterruptRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform only a dry run. Valid values: ● true: Sends a check request without sending the NMI command. ● false (default): Sends a normal NMI request to trigger a crash dump.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the instance to which you want to send a diagnostic break.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4ph****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SendDiagnosticInterruptRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDiagnosticInterruptRequest self = new SendDiagnosticInterruptRequest();
        return TeaModel.build(map, self);
    }

    public SendDiagnosticInterruptRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public SendDiagnosticInterruptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
