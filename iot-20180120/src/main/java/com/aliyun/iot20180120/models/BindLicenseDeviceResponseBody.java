// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindLicenseDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see the "Error codes" section in this topic.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the batch binding operation.</p>
     */
    @NameInMap("Data")
    public BindLicenseDeviceResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BindLicenseDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindLicenseDeviceResponseBody self = new BindLicenseDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public BindLicenseDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindLicenseDeviceResponseBody setData(BindLicenseDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindLicenseDeviceResponseBodyData getData() {
        return this.data;
    }

    public BindLicenseDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BindLicenseDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindLicenseDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindLicenseDeviceResponseBodyData extends TeaModel {
        /**
         * <p>The unique ID that can be used to query the progress of the batch binding operation.</p>
         */
        @NameInMap("CheckProgressId")
        public String checkProgressId;

        /**
         * <p>The number of devices that failed to be bound to the license.</p>
         */
        @NameInMap("FailSum")
        public Long failSum;

        /**
         * <p>The progress of the batch binding operation. The progress is a percentage. Valid values: 1 to 100.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The URL of the file that contains unbound devices. The devices failed to be bound to the license.</p>
         */
        @NameInMap("ResultCsvFile")
        public String resultCsvFile;

        /**
         * <p>The number of devices to which the license is successfully bound.</p>
         */
        @NameInMap("SuccessSum")
        public Long successSum;

        public static BindLicenseDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindLicenseDeviceResponseBodyData self = new BindLicenseDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindLicenseDeviceResponseBodyData setCheckProgressId(String checkProgressId) {
            this.checkProgressId = checkProgressId;
            return this;
        }
        public String getCheckProgressId() {
            return this.checkProgressId;
        }

        public BindLicenseDeviceResponseBodyData setFailSum(Long failSum) {
            this.failSum = failSum;
            return this;
        }
        public Long getFailSum() {
            return this.failSum;
        }

        public BindLicenseDeviceResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public BindLicenseDeviceResponseBodyData setResultCsvFile(String resultCsvFile) {
            this.resultCsvFile = resultCsvFile;
            return this;
        }
        public String getResultCsvFile() {
            return this.resultCsvFile;
        }

        public BindLicenseDeviceResponseBodyData setSuccessSum(Long successSum) {
            this.successSum = successSum;
            return this;
        }
        public Long getSuccessSum() {
            return this.successSum;
        }

    }

}
