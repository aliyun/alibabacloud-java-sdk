// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class GetPassThroughAuthInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetPassThroughAuthInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7B0FC4BC-9E4B-5AD7-9D35-6559BDC0788E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetPassThroughAuthInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPassThroughAuthInfoResponseBody self = new GetPassThroughAuthInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPassThroughAuthInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPassThroughAuthInfoResponseBody setData(GetPassThroughAuthInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPassThroughAuthInfoResponseBodyData getData() {
        return this.data;
    }

    public GetPassThroughAuthInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPassThroughAuthInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPassThroughAuthInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPassThroughAuthInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPassThroughAuthInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mm_2b7d37b695fb44faa983e5fbb032</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>35f9ed99b27a1e8374f6593bf969f7d6</p>
         */
        @NameInMap("deviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>{&quot;device_info&quot;:&quot;246c19a2c721724aa3e52e96a93a730ce9080b3a7680522a0d5210e0dc0a43cd&quot;,&quot;timestamp&quot;:&quot;1765874670867&quot;}</p>
         */
        @NameInMap("passThroughParams")
        public java.util.Map<String, ?> passThroughParams;

        /**
         * <strong>example:</strong>
         * <p>8e4e0522a986cd641866c2b2453eedfa</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static GetPassThroughAuthInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPassThroughAuthInfoResponseBodyData self = new GetPassThroughAuthInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPassThroughAuthInfoResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetPassThroughAuthInfoResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetPassThroughAuthInfoResponseBodyData setPassThroughParams(java.util.Map<String, ?> passThroughParams) {
            this.passThroughParams = passThroughParams;
            return this;
        }
        public java.util.Map<String, ?> getPassThroughParams() {
            return this.passThroughParams;
        }

        public GetPassThroughAuthInfoResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
