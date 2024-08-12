// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteSyndbResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public Long errorCode;

    /**
     * <ul>
     * <li>If the value <strong>true</strong> is returned for the <strong>Status</strong> parameter, the system does not return the ErrorMsg parameter.</li>
     * <li>If the value <strong>false</strong> is returned for the <strong>Status</strong> parameter, the system returns the deletion failure cause for the ErrorMsg parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ClickHouse exception, code: 49, host: 100.100.xx.xx, port: 49670; Code: 49, e.displayText() = DB::Exception: Logical error: there is no global context (version 20.8.17.25)n</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2C7393F1-5FD1-5CEE-A2EA-270A2CF99693</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the database used for data synchronization was deleted. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
