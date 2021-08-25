// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateConfigRulesReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateConfigRulesReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateConfigRulesReportResponseBody self = new GenerateConfigRulesReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateConfigRulesReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
