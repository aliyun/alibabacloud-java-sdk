// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDigitalEmployeeSkillResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>350779DC-980D-58FD-BECB-D2275D2487CA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateDigitalEmployeeSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDigitalEmployeeSkillResponseBody self = new UpdateDigitalEmployeeSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDigitalEmployeeSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
