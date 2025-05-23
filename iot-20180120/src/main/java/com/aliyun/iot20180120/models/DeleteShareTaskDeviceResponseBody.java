// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteShareTaskDeviceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteShareTaskDeviceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>An internal error occurred. Try again later.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>AF71BF1D-B552-47CD-B34B-352557627992</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteShareTaskDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteShareTaskDeviceResponseBody self = new DeleteShareTaskDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteShareTaskDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteShareTaskDeviceResponseBody setData(DeleteShareTaskDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteShareTaskDeviceResponseBodyData getData() {
        return this.data;
    }

    public DeleteShareTaskDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteShareTaskDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteShareTaskDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteShareTaskDeviceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>Md3ZiTL888K9llXDy7890***********</p>
         */
        @NameInMap("ProgressId")
        public String progressId;

        public static DeleteShareTaskDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteShareTaskDeviceResponseBodyData self = new DeleteShareTaskDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteShareTaskDeviceResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DeleteShareTaskDeviceResponseBodyData setProgressId(String progressId) {
            this.progressId = progressId;
            return this;
        }
        public String getProgressId() {
            return this.progressId;
        }

    }

}
