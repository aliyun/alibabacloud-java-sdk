// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAlertRuleRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>28547072</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRuleRequest self = new GetAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertRuleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
