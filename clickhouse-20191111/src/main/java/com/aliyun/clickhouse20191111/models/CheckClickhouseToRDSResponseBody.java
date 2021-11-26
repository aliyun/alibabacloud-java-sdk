// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckClickhouseToRDSResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Boolean status;

    public static CheckClickhouseToRDSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckClickhouseToRDSResponseBody self = new CheckClickhouseToRDSResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckClickhouseToRDSResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckClickhouseToRDSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckClickhouseToRDSResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
