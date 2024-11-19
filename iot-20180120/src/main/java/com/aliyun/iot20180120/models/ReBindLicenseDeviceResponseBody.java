// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReBindLicenseDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the batch rebinding operation.</p>
     */
    @NameInMap("Data")
    public ReBindLicenseDeviceResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal error occurred. Try again later.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AF71BF1D-B552-47CD-B34B-352557627992</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReBindLicenseDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReBindLicenseDeviceResponseBody self = new ReBindLicenseDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReBindLicenseDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReBindLicenseDeviceResponseBody setData(ReBindLicenseDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReBindLicenseDeviceResponseBodyData getData() {
        return this.data;
    }

    public ReBindLicenseDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ReBindLicenseDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReBindLicenseDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReBindLicenseDeviceResponseBodyData extends TeaModel {
        /**
         * <p>The unique ID that can be used to query the progress of the batch rebinding operation.</p>
         * 
         * <strong>example:</strong>
         * <p>123***</p>
         */
        @NameInMap("CheckProgressId")
        public String checkProgressId;

        /**
         * <p>The number of devices that failed to be rebound to the license.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FailSum")
        public Long failSum;

        /**
         * <p>The progress of the batch rebinding operation. The progress is a percentage. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The URL of the file that contains unbound devices. The devices failed to be rebound with the license.</p>
         * 
         * <strong>example:</strong>
         * <p>http://***</p>
         */
        @NameInMap("ResultCsvFile")
        public String resultCsvFile;

        /**
         * <p>The number of devices to which the license is rebound.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SuccessSum")
        public Long successSum;

        public static ReBindLicenseDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReBindLicenseDeviceResponseBodyData self = new ReBindLicenseDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReBindLicenseDeviceResponseBodyData setCheckProgressId(String checkProgressId) {
            this.checkProgressId = checkProgressId;
            return this;
        }
        public String getCheckProgressId() {
            return this.checkProgressId;
        }

        public ReBindLicenseDeviceResponseBodyData setFailSum(Long failSum) {
            this.failSum = failSum;
            return this;
        }
        public Long getFailSum() {
            return this.failSum;
        }

        public ReBindLicenseDeviceResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ReBindLicenseDeviceResponseBodyData setResultCsvFile(String resultCsvFile) {
            this.resultCsvFile = resultCsvFile;
            return this;
        }
        public String getResultCsvFile() {
            return this.resultCsvFile;
        }

        public ReBindLicenseDeviceResponseBodyData setSuccessSum(Long successSum) {
            this.successSum = successSum;
            return this;
        }
        public Long getSuccessSum() {
            return this.successSum;
        }

    }

}
