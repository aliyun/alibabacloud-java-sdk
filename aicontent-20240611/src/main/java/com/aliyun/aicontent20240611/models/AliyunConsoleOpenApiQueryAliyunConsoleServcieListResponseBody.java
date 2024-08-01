// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody self = new AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody();
        return TeaModel.build(map, self);
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody setData(java.util.List<AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBodyData> getData() {
        return this.data;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FreeConcurrencyCount")
        public Integer freeConcurrencyCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FreeCount")
        public Integer freeCount;

        /**
         * <strong>example:</strong>
         * <p>online_ai_algorithm_personalized_text_to_image_call_count</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <strong>example:</strong>
         * <p>AI算法模型-个性化文生图-在线按量调用</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBodyData self = new AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBodyData setFreeConcurrencyCount(Integer freeConcurrencyCount) {
            this.freeConcurrencyCount = freeConcurrencyCount;
            return this;
        }
        public Integer getFreeConcurrencyCount() {
            return this.freeConcurrencyCount;
        }

        public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBodyData setFreeCount(Integer freeCount) {
            this.freeCount = freeCount;
            return this;
        }
        public Integer getFreeCount() {
            return this.freeCount;
        }

        public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBodyData setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
