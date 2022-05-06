// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindLicenseDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BindLicenseDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
