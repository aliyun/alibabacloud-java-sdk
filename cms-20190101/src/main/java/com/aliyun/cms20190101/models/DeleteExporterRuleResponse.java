// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteExporterRuleResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static DeleteExporterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExporterRuleResponse self = new DeleteExporterRuleResponse();
        return TeaModel.build(map, self);
    }

}
