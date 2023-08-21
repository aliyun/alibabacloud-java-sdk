// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxBackupSetsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data. The following parameters are contained:</p>
     * <br>
     * <p>*   **backupSetTime**: the point in time when the snapshot was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
     * <p>*   **backupSetId**: the ID of the backup set.</p>
     * <p>*   **backupSetType**: the type of the snapshot. A value of **Full** indicates that the snapshot is a full backup snapshot. A value of **Inc** indicates that the snapshot is an incremental backup snapshot.</p>
     * <p>*   **backupPlanId**: the ID of the backup schedule.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSandboxBackupSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSandboxBackupSetsResponseBody self = new DescribeSandboxBackupSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSandboxBackupSetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSandboxBackupSetsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeSandboxBackupSetsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSandboxBackupSetsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSandboxBackupSetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSandboxBackupSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSandboxBackupSetsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
