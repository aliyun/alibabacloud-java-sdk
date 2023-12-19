// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DisableBackupPlanResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the request is successful, a value of successful is returned. If the request fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: indicates that the request is successful.</p>
     * <p>*   false: indicates that the request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DisableBackupPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableBackupPlanResponseBody self = new DisableBackupPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableBackupPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableBackupPlanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableBackupPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableBackupPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
