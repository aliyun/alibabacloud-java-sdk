// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchDeleteDcdnWafRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeleteDcdnWafRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDcdnWafRulesResponseBody self = new BatchDeleteDcdnWafRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDcdnWafRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
