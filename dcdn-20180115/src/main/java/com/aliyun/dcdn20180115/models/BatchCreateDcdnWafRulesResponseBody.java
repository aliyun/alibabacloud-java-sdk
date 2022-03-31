// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchCreateDcdnWafRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchCreateDcdnWafRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateDcdnWafRulesResponseBody self = new BatchCreateDcdnWafRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateDcdnWafRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
