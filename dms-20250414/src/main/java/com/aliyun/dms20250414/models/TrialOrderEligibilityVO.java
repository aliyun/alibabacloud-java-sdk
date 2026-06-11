// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class TrialOrderEligibilityVO extends TeaModel {
    /**
     * <p>Contains details about the eligibility status, such as the reason for ineligibility.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the user is eligible for the trial.</p>
     */
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
