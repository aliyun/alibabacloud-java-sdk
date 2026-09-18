// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetAllRulesSummaryRequest extends TeaModel {
    /**
     * <p>The source dialect.</p>
     * 
     * <strong>example:</strong>
     * <p>postgresql</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The target dialect.</p>
     * 
     * <strong>example:</strong>
     * <p>hologres</p>
     */
    @NameInMap("target")
    public String target;

    public static GetAllRulesSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllRulesSummaryRequest self = new GetAllRulesSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetAllRulesSummaryRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetAllRulesSummaryRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
