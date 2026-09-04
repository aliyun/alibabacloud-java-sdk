// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UninstallSkillsResponseBody extends TeaModel {
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
     * <p>F07A1DA1-E1EB-5CCA-8EED-12F85D32****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UninstallSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallSkillsResponseBody self = new UninstallSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallSkillsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UninstallSkillsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UninstallSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
