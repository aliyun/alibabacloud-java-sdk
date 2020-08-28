// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ReportVoipProblemsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Module")
    @Validation(required = true)
    public String module;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static ReportVoipProblemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportVoipProblemsResponse self = new ReportVoipProblemsResponse();
        return TeaModel.build(map, self);
    }

}
