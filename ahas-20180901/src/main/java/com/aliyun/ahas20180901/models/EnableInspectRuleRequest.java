// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EnableInspectRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("FunctionId")
    public Long functionId;

    public static EnableInspectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableInspectRuleRequest self = new EnableInspectRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableInspectRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public EnableInspectRuleRequest setFunctionId(Long functionId) {
        this.functionId = functionId;
        return this;
    }
    public Long getFunctionId() {
        return this.functionId;
    }

}
