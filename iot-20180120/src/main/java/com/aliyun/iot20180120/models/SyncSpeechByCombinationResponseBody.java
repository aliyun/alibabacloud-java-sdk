// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SyncSpeechByCombinationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SyncSpeechByCombinationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>An internal error occurred. Try again later.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>671D0F8F-FDC7-4B12-93FA-336C079C965A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SyncSpeechByCombinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncSpeechByCombinationResponseBody self = new SyncSpeechByCombinationResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncSpeechByCombinationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncSpeechByCombinationResponseBody setData(SyncSpeechByCombinationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SyncSpeechByCombinationResponseBodyData getData() {
        return this.data;
    }

    public SyncSpeechByCombinationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SyncSpeechByCombinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncSpeechByCombinationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SyncSpeechByCombinationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Bat_Pt:99 RSSI: -92</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeviceErrorCode")
        public String deviceErrorCode;

        /**
         * <strong>example:</strong>
         * <p>speech model not found</p>
         */
        @NameInMap("DeviceErrorMessage")
        public String deviceErrorMessage;

        /**
         * <strong>example:</strong>
         * <p>42000011392021112380********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxRetryCount")
        public Integer maxRetryCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RetryCount")
        public Integer retryCount;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static SyncSpeechByCombinationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyncSpeechByCombinationResponseBodyData self = new SyncSpeechByCombinationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SyncSpeechByCombinationResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public SyncSpeechByCombinationResponseBodyData setDeviceErrorCode(String deviceErrorCode) {
            this.deviceErrorCode = deviceErrorCode;
            return this;
        }
        public String getDeviceErrorCode() {
            return this.deviceErrorCode;
        }

        public SyncSpeechByCombinationResponseBodyData setDeviceErrorMessage(String deviceErrorMessage) {
            this.deviceErrorMessage = deviceErrorMessage;
            return this;
        }
        public String getDeviceErrorMessage() {
            return this.deviceErrorMessage;
        }

        public SyncSpeechByCombinationResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SyncSpeechByCombinationResponseBodyData setMaxRetryCount(Integer maxRetryCount) {
            this.maxRetryCount = maxRetryCount;
            return this;
        }
        public Integer getMaxRetryCount() {
            return this.maxRetryCount;
        }

        public SyncSpeechByCombinationResponseBodyData setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public SyncSpeechByCombinationResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
