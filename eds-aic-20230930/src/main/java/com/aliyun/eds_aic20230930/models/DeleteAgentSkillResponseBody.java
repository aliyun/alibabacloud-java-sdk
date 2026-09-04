// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteAgentSkillResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAgentSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentSkillResponseBody self = new DeleteAgentSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgentSkillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAgentSkillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAgentSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
