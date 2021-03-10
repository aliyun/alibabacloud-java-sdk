// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDistributeDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("File")
    public String file;

    public static QueryDeviceDistributeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDistributeDetailResponseBody self = new QueryDeviceDistributeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDistributeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceDistributeDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceDistributeDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceDistributeDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceDistributeDetailResponseBody setFile(String file) {
        this.file = file;
        return this;
    }
    public String getFile() {
        return this.file;
    }

}
