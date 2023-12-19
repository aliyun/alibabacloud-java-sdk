// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateHanaRestoreResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the restore job.</p>
     */
    @NameInMap("RestoreId")
    public String restoreId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateHanaRestoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHanaRestoreResponseBody self = new CreateHanaRestoreResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHanaRestoreResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateHanaRestoreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateHanaRestoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHanaRestoreResponseBody setRestoreId(String restoreId) {
        this.restoreId = restoreId;
        return this;
    }
    public String getRestoreId() {
        return this.restoreId;
    }

    public CreateHanaRestoreResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
