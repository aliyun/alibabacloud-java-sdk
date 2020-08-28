// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableActiveMetricRuleRequest extends TeaModel {
    @NameInMap("Product")
    @Validation(required = true)
    public String product;

    public static EnableActiveMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableActiveMetricRuleRequest self = new EnableActiveMetricRuleRequest();
        return TeaModel.build(map, self);
    }

}
