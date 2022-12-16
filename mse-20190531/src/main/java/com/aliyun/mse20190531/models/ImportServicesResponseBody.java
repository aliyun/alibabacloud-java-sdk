// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportServicesResponseBody extends TeaModel {
    // Indicates whether the request is successful. Valid values:
    // 
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Code")
    public Integer code;

    // Import services
    @NameInMap("Data")
    public Boolean data;

    // The message returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The request is processed successfully.
    @NameInMap("Message")
    public String message;

    // The HTTP status code returned.
    @NameInMap("RequestId")
    public String requestId;

    // The returned results.
    @NameInMap("Success")
    public Boolean success;

    public static ImportServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportServicesResponseBody self = new ImportServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportServicesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImportServicesResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ImportServicesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ImportServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportServicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
