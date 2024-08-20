// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchModifyDcdnWafRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-XXXX-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchModifyDcdnWafRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchModifyDcdnWafRulesResponseBody self = new BatchModifyDcdnWafRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchModifyDcdnWafRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
