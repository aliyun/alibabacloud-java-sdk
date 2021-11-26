// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteSyndbResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

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
