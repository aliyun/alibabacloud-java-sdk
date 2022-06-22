// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DisableInspectRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("FunctionId")
    public Long functionId;

    public static DisableInspectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableInspectRuleRequest self = new DisableInspectRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisableInspectRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public DisableInspectRuleRequest setFunctionId(Long functionId) {
        this.functionId = functionId;
        return this;
    }
    public Long getFunctionId() {
        return this.functionId;
    }

}
