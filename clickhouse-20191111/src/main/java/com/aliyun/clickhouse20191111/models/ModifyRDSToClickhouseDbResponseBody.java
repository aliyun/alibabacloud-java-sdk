// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyRDSToClickhouseDbResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

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
