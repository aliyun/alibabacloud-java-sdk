// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CheckFinishMissionResponseBody extends TeaModel {
    @NameInMap("HasFinish")
    public Boolean hasFinish;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static CheckFinishMissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckFinishMissionResponseBody self = new CheckFinishMissionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckFinishMissionResponseBody setHasFinish(Boolean hasFinish) {
        this.hasFinish = hasFinish;
        return this;
    }
    public Boolean getHasFinish() {
        return this.hasFinish;
    }

    public CheckFinishMissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckFinishMissionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckFinishMissionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckFinishMissionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
