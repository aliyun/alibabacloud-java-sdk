// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReBindLicenseDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ReBindLicenseDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CheckProgressId")
        public String checkProgressId;

        @NameInMap("FailSum")
        public Long failSum;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("ResultCsvFile")
        public String resultCsvFile;

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
