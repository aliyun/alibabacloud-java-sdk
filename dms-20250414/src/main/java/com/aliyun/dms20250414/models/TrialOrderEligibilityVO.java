// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class TrialOrderEligibilityVO extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Valid")
    public Boolean valid;

    public static TrialOrderEligibilityVO build(java.util.Map<String, ?> map) throws Exception {
        TrialOrderEligibilityVO self = new TrialOrderEligibilityVO();
        return TeaModel.build(map, self);
    }

    public TrialOrderEligibilityVO setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrialOrderEligibilityVO setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

}
