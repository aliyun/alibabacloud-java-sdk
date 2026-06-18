// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetCallDialogContentResponseBody extends TeaModel {
    /**
     * <p>Details about the access denial. Returned only when RAM authentication fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Access Denied</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetCallDialogContentResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FB0B0481-F13E-16E0-8A7A-1AD2FXXXEF55</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456^123478</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>The call status.</p>
         * <blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>0</code>: Not connected</p>
         * </li>
         * <li><p><code>1</code>: Connected</p>
         * </li>
         * <li><p><code>2</code>: Disconnected</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CallStatus")
        public Long callStatus;

        /**
         * <p>The dialog content.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;content\&quot;:\&quot;您好。\&quot;,\&quot;role\&quot;:\&quot;assistant\&quot;},{\&quot;content\&quot;:\&quot;不用了。\&quot;,\&quot;role\&quot;:\&quot;user\&quot;},{\&quot;content\&quot;:\&quot;呃，不用了，再见，谢谢。\&quot;,\&quot;role\&quot;:\&quot;user\&quot;}]</p>
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
