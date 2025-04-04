// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AddShareTaskDeviceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddShareTaskDeviceResponseBodyData data;

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

    public static AddShareTaskDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddShareTaskDeviceResponseBody self = new AddShareTaskDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddShareTaskDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddShareTaskDeviceResponseBody setData(AddShareTaskDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddShareTaskDeviceResponseBodyData getData() {
        return this.data;
    }

    public AddShareTaskDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddShareTaskDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddShareTaskDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddShareTaskDeviceResponseBodyData extends TeaModel {
        @NameInMap("FailSum")
        public Integer failSum;

        @NameInMap("FailedResultCsvFile")
        public String failedResultCsvFile;

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

        @NameInMap("SuccessSum")
        public Integer successSum;

        public static AddShareTaskDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddShareTaskDeviceResponseBodyData self = new AddShareTaskDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddShareTaskDeviceResponseBodyData setFailSum(Integer failSum) {
            this.failSum = failSum;
            return this;
        }
        public Integer getFailSum() {
            return this.failSum;
        }

        public AddShareTaskDeviceResponseBodyData setFailedResultCsvFile(String failedResultCsvFile) {
            this.failedResultCsvFile = failedResultCsvFile;
            return this;
        }
        public String getFailedResultCsvFile() {
            return this.failedResultCsvFile;
        }

        public AddShareTaskDeviceResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public AddShareTaskDeviceResponseBodyData setProgressId(String progressId) {
            this.progressId = progressId;
            return this;
        }
        public String getProgressId() {
            return this.progressId;
        }

        public AddShareTaskDeviceResponseBodyData setSuccessSum(Integer successSum) {
            this.successSum = successSum;
            return this;
        }
        public Integer getSuccessSum() {
            return this.successSum;
        }

    }

}
