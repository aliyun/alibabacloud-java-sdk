// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRulesRequest extends TeaModel {
    @NameInMap("Id")
    @Validation(required = true)
    public java.util.List<String> id;

    public static DeleteMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRulesRequest self = new DeleteMetricRulesRequest();
        return TeaModel.build(map, self);
    }

}
