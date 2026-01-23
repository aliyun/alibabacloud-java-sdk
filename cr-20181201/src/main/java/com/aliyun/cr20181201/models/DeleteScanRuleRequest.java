// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteScanRuleRequest extends TeaModel {
    /**
     * <p>The instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The rule ID</p>
     * 
     * <strong>example:</strong>
     * <p>crscnr-aemytkwad2h7fyhb</p>
     */
    @NameInMap("ScanRuleId")
    public String scanRuleId;

    public static DeleteScanRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScanRuleRequest self = new DeleteScanRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScanRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteScanRuleRequest setScanRuleId(String scanRuleId) {
        this.scanRuleId = scanRuleId;
        return this;
    }
    public String getScanRuleId() {
        return this.scanRuleId;
    }

}
