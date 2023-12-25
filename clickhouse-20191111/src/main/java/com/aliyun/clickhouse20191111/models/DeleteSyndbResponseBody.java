// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteSyndbResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public Long errorCode;

    /**
     * <p>*   If the value **true** is returned for the **Status** parameter, the system does not return the ErrorMsg parameter.</p>
     * <p>*   If the value **false** is returned for the **Status** parameter, the system returns the deletion failure cause for the ErrorMsg parameter.</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the database used for data synchronization was deleted. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static DeleteSyndbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSyndbResponseBody self = new DeleteSyndbResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSyndbResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public DeleteSyndbResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DeleteSyndbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSyndbResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
