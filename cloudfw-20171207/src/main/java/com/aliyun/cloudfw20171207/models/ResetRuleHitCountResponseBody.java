// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ResetRuleHitCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sg_server</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <strong>example:</strong>
     * <p>706B2093-CBA0-51B2-BEBF-58903FC6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetRuleHitCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetRuleHitCountResponseBody self = new ResetRuleHitCountResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetRuleHitCountResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public ResetRuleHitCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
