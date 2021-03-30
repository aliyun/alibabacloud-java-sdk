// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class RepairApRadioResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("ErrorCode")
    public Boolean errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    public static RepairApRadioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RepairApRadioResponseBody self = new RepairApRadioResponseBody();
        return TeaModel.build(map, self);
    }

    public RepairApRadioResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public RepairApRadioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RepairApRadioResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public RepairApRadioResponseBody setErrorCode(Boolean errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Boolean getErrorCode() {
        return this.errorCode;
    }

    public RepairApRadioResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
