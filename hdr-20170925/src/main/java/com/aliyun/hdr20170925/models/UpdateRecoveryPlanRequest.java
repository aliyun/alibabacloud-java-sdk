// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateRecoveryPlanRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Name")
    public String name;

    @NameInMap("RecoveryPlanId")
    public String recoveryPlanId;

    public static UpdateRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecoveryPlanRequest self = new UpdateRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecoveryPlanRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateRecoveryPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRecoveryPlanRequest setRecoveryPlanId(String recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public String getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

}
