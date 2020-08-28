// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ImportCustomAlertRulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static ImportCustomAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportCustomAlertRulesResponse self = new ImportCustomAlertRulesResponse();
        return TeaModel.build(map, self);
    }

}
