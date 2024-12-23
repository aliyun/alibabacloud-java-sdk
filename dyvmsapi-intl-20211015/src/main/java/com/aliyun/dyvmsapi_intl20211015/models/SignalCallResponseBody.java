// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SignalCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>请求状态码。  返回OK代表请求成功。 其他错误码，请参见API错误码。</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回信息描述。</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public SignalCallResponseBodyModel model;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>D9CB****-<strong><strong>-</strong></strong>-****-********9D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>请求是否成功，成功：true，失败：false。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SignalCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SignalCallResponseBody self = new SignalCallResponseBody();
        return TeaModel.build(map, self);
    }

    public SignalCallResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SignalCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SignalCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SignalCallResponseBody setModel(SignalCallResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public SignalCallResponseBodyModel getModel() {
        return this.model;
    }

    public SignalCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SignalCallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SignalCallResponseBodyModel extends TeaModel {
        /**
         * <p>任务ID，可以通过此ID查询任务的详情。</p>
         * 
         * <strong>example:</strong>
         * <p>550E****-<strong><strong>-</strong></strong>-****-********0CA0</p>
         */
        @NameInMap("CallId")
        public String callId;

        public static SignalCallResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            SignalCallResponseBodyModel self = new SignalCallResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public SignalCallResponseBodyModel setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

    }

}
