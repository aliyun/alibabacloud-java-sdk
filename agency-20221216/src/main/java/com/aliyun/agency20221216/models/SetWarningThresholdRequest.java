// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetWarningThresholdRequest extends TeaModel {
    /**
     * <p>The UID of the reseller customer account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1792155717328010</p>
     */
    @NameInMap("Uid")
    public Long uid;

    /**
     * <p>The percentage value. Valid values: 1 to 100. When the available credit drops below this percentage of the total credit limit, an alert email is sent to the reseller partner account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("WarningValue")
    public String warningValue;

    public static SetWarningThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        SetWarningThresholdRequest self = new SetWarningThresholdRequest();
        return TeaModel.build(map, self);
    }

    public SetWarningThresholdRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public SetWarningThresholdRequest setWarningValue(String warningValue) {
        this.warningValue = warningValue;
        return this;
    }
    public String getWarningValue() {
        return this.warningValue;
    }

}
