// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSparkJobDriverLogResponseBody extends TeaModel {
    // driver log of the spark job
    @NameInMap("DriverLog")
    public String driverLog;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSparkJobDriverLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkJobDriverLogResponseBody self = new GetSparkJobDriverLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkJobDriverLogResponseBody setDriverLog(String driverLog) {
        this.driverLog = driverLog;
        return this;
    }
    public String getDriverLog() {
        return this.driverLog;
    }

    public GetSparkJobDriverLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetSparkJobDriverLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSparkJobDriverLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSparkJobDriverLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
