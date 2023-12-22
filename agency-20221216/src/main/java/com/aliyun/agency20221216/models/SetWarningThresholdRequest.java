// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetWarningThresholdRequest extends TeaModel {
    /**
     * <p>The UID of the partner‘s customer.</p>
     */
    @NameInMap("Uid")
    public Long uid;

    /**
     * <p>Percentage, 1 to 100. When the available credit limit is lower than the credit limit percentage, an email is sent to the main account.</p>
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
