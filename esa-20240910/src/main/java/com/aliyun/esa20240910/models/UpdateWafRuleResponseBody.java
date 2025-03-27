// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWafRuleResponseBody extends TeaModel {
    /**
     * <p>WAF rule ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850237.html">ListWafRules</a> interface.</p>
     * 
     * <strong>example:</strong>
     * <p>20000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWafRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWafRuleResponseBody self = new UpdateWafRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWafRuleResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateWafRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
