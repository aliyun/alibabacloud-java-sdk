// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyRDSToClickhouseDbResponseBody extends TeaModel {
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
     * <li>If the value <strong>1</strong> is returned for the <strong>Status</strong> parameter, the system does not return the ErrorMsg parameter.</li>
     * <li>If the value <strong>0</strong> is returned for the <strong>Status</strong> parameter, the ErrorMsg parameter returns the cause for the modification failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ClickHouse exception, code: 49, host: 100.100.118.132, port: 49670; Code: 49, e.displayText() = DB::Exception: Logical error: there is no global context (version 20.8.17.25)n</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>746CD303-0B82-5E8D-886D-93A9FAF3A876</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the modification was successful. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: The modification was successful.</li>
     * <li><strong>0</strong>: The modification failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
