// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetCallDialogContentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Access Denied</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCallDialogContentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>FB0B0481-F13E-16E0-8A7A-1AD2FXXXEF55</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCallDialogContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCallDialogContentResponseBody self = new GetCallDialogContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCallDialogContentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetCallDialogContentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCallDialogContentResponseBody setData(GetCallDialogContentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCallDialogContentResponseBodyData getData() {
        return this.data;
    }

    public GetCallDialogContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCallDialogContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCallDialogContentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCallDialogContentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456^123478</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CallStatus")
        public Long callStatus;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("DialogContent")
        public String dialogContent;

        public static GetCallDialogContentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCallDialogContentResponseBodyData self = new GetCallDialogContentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCallDialogContentResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public GetCallDialogContentResponseBodyData setCallStatus(Long callStatus) {
            this.callStatus = callStatus;
            return this;
        }
        public Long getCallStatus() {
            return this.callStatus;
        }

        public GetCallDialogContentResponseBodyData setDialogContent(String dialogContent) {
            this.dialogContent = dialogContent;
            return this;
        }
        public String getDialogContent() {
            return this.dialogContent;
        }

    }

}
