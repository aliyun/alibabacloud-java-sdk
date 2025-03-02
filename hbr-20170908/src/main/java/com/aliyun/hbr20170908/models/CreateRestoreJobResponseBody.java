// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateRestoreJobResponseBody extends TeaModel {
    /**
     * <p>Return code, 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Description of the return message, usually \&quot;successful\&quot; when successful, and corresponding error messages when there is an error.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Restore job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>r-*********************</p>
     */
    @NameInMap("RestoreId")
    public String restoreId;

    /**
     * <p>Whether the request was successful.</p>
     * <ul>
     * <li>true: Success</li>
     * <li>false: Failure</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateRestoreJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRestoreJobResponseBody self = new CreateRestoreJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRestoreJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRestoreJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRestoreJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRestoreJobResponseBody setRestoreId(String restoreId) {
        this.restoreId = restoreId;
        return this;
    }
    public String getRestoreId() {
        return this.restoreId;
    }

    public CreateRestoreJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
