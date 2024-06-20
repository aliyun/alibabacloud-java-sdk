// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveTerminalLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1647309061000</p>
     */
    @NameInMap("TimeStamp")
    public Long timeStamp;

    public static SaveTerminalLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveTerminalLogResponseBody self = new SaveTerminalLogResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveTerminalLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveTerminalLogResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveTerminalLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveTerminalLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveTerminalLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveTerminalLogResponseBody setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public Long getTimeStamp() {
        return this.timeStamp;
    }

}
