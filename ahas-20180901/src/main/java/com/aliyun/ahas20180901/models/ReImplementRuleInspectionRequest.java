// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ReImplementRuleInspectionRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("FunctionResultId")
    public Long functionResultId;

    @NameInMap("Namespace")
    public String namespace;

    public static ReImplementRuleInspectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReImplementRuleInspectionRequest self = new ReImplementRuleInspectionRequest();
        return TeaModel.build(map, self);
    }

    public ReImplementRuleInspectionRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ReImplementRuleInspectionRequest setFunctionResultId(Long functionResultId) {
        this.functionResultId = functionResultId;
        return this;
    }
    public Long getFunctionResultId() {
        return this.functionResultId;
    }

    public ReImplementRuleInspectionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
