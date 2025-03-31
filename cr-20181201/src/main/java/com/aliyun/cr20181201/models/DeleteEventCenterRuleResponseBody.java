// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteEventCenterRuleResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>031572FA-7D8F-4C05-B790-1071E0E05DE6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEventCenterRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventCenterRuleResponseBody self = new DeleteEventCenterRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEventCenterRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteEventCenterRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
