// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CheckBindLicenseDeviceProgressResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CheckBindLicenseDeviceProgressResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckBindLicenseDeviceProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckBindLicenseDeviceProgressResponseBody self = new CheckBindLicenseDeviceProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckBindLicenseDeviceProgressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckBindLicenseDeviceProgressResponseBody setData(CheckBindLicenseDeviceProgressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckBindLicenseDeviceProgressResponseBodyData getData() {
        return this.data;
    }

    public CheckBindLicenseDeviceProgressResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckBindLicenseDeviceProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckBindLicenseDeviceProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckBindLicenseDeviceProgressResponseBodyData extends TeaModel {
        @NameInMap("FailSum")
        public Long failSum;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("ResultCsvFile")
        public String resultCsvFile;

        @NameInMap("SuccessSum")
        public Long successSum;

        public static CheckBindLicenseDeviceProgressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckBindLicenseDeviceProgressResponseBodyData self = new CheckBindLicenseDeviceProgressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckBindLicenseDeviceProgressResponseBodyData setFailSum(Long failSum) {
            this.failSum = failSum;
            return this;
        }
        public Long getFailSum() {
            return this.failSum;
        }

        public CheckBindLicenseDeviceProgressResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public CheckBindLicenseDeviceProgressResponseBodyData setResultCsvFile(String resultCsvFile) {
            this.resultCsvFile = resultCsvFile;
            return this;
        }
        public String getResultCsvFile() {
            return this.resultCsvFile;
        }

        public CheckBindLicenseDeviceProgressResponseBodyData setSuccessSum(Long successSum) {
            this.successSum = successSum;
            return this;
        }
        public Long getSuccessSum() {
            return this.successSum;
        }

    }

}
