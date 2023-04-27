// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTaskFlowNotificationResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Notification")
    public GetTaskFlowNotificationResponseBodyNotification notification;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTaskFlowNotificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskFlowNotificationResponseBody self = new GetTaskFlowNotificationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskFlowNotificationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTaskFlowNotificationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTaskFlowNotificationResponseBody setNotification(GetTaskFlowNotificationResponseBodyNotification notification) {
        this.notification = notification;
        return this;
    }
    public GetTaskFlowNotificationResponseBodyNotification getNotification() {
        return this.notification;
    }

    public GetTaskFlowNotificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskFlowNotificationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTaskFlowNotificationResponseBodyNotification extends TeaModel {
        @NameInMap("DagNotificationFail")
        public Boolean dagNotificationFail;

        @NameInMap("DagNotificationSla")
        public Boolean dagNotificationSla;

        @NameInMap("DagNotificationSuccess")
        public Boolean dagNotificationSuccess;

        public static GetTaskFlowNotificationResponseBodyNotification build(java.util.Map<String, ?> map) throws Exception {
            GetTaskFlowNotificationResponseBodyNotification self = new GetTaskFlowNotificationResponseBodyNotification();
            return TeaModel.build(map, self);
        }

        public GetTaskFlowNotificationResponseBodyNotification setDagNotificationFail(Boolean dagNotificationFail) {
            this.dagNotificationFail = dagNotificationFail;
            return this;
        }
        public Boolean getDagNotificationFail() {
            return this.dagNotificationFail;
        }

        public GetTaskFlowNotificationResponseBodyNotification setDagNotificationSla(Boolean dagNotificationSla) {
            this.dagNotificationSla = dagNotificationSla;
            return this;
        }
        public Boolean getDagNotificationSla() {
            return this.dagNotificationSla;
        }

        public GetTaskFlowNotificationResponseBodyNotification setDagNotificationSuccess(Boolean dagNotificationSuccess) {
            this.dagNotificationSuccess = dagNotificationSuccess;
            return this;
        }
        public Boolean getDagNotificationSuccess() {
            return this.dagNotificationSuccess;
        }

    }

}
