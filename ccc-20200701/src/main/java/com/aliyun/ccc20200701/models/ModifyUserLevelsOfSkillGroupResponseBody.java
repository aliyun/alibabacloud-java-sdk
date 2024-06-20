// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyUserLevelsOfSkillGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E49D8B83-A3EC-44D4-A920-578BC3C698AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserLevelsOfSkillGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserLevelsOfSkillGroupResponseBody self = new ModifyUserLevelsOfSkillGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserLevelsOfSkillGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyUserLevelsOfSkillGroupResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ModifyUserLevelsOfSkillGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyUserLevelsOfSkillGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyUserLevelsOfSkillGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
