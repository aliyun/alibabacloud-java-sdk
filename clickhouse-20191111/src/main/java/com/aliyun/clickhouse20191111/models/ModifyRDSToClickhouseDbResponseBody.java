// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyRDSToClickhouseDbResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public Long errorCode;

    /**
     * <p>*   If the value **1** is returned for the **Status** parameter, the system does not return the ErrorMsg parameter.</p>
     * <p>*   If the value **0** is returned for the **Status** parameter, the ErrorMsg parameter returns the cause for the modification failure.</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the modification was successful. Valid values:</p>
     * <br>
     * <p>*   **1**: The modification was successful.</p>
     * <p>*   **0**: The modification failed.</p>
     */
    @NameInMap("Status")
    public Long status;

    public static ModifyRDSToClickhouseDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRDSToClickhouseDbResponseBody self = new ModifyRDSToClickhouseDbResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRDSToClickhouseDbResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ModifyRDSToClickhouseDbResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ModifyRDSToClickhouseDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRDSToClickhouseDbResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
