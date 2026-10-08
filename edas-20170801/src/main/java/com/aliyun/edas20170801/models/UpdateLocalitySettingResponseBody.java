// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateLocalitySettingResponseBody extends TeaModel {
    /**
     * <p>The status code of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The result of the update.</p>
     */
    @NameInMap("Data")
    public UpdateLocalitySettingResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>a5281053-08e4-47a5-b2ab-5c0323de*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateLocalitySettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLocalitySettingResponseBody self = new UpdateLocalitySettingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLocalitySettingResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateLocalitySettingResponseBody setData(UpdateLocalitySettingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLocalitySettingResponseBodyData getData() {
        return this.data;
    }

    public UpdateLocalitySettingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateLocalitySettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLocalitySettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLocalitySettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateLocalitySettingResponseBodyData extends TeaModel {
        /**
         * <p>Whether it is active.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The threshold of the ECU.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        public static UpdateLocalitySettingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLocalitySettingResponseBodyData self = new UpdateLocalitySettingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLocalitySettingResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateLocalitySettingResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
