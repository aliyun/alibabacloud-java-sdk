// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.efc_service20190318.models;

import com.aliyun.tea.*;

public class CheckAllMasterTrusteeshipResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public CheckAllMasterTrusteeshipResponseData data;

    public static CheckAllMasterTrusteeshipResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAllMasterTrusteeshipResponse self = new CheckAllMasterTrusteeshipResponse();
        return TeaModel.build(map, self);
    }

    public CheckAllMasterTrusteeshipResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAllMasterTrusteeshipResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckAllMasterTrusteeshipResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckAllMasterTrusteeshipResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckAllMasterTrusteeshipResponse setData(CheckAllMasterTrusteeshipResponseData data) {
        this.data = data;
        return this;
    }
    public CheckAllMasterTrusteeshipResponseData getData() {
        return this.data;
    }

    public static class CheckAllMasterTrusteeshipResponseDataCheckDataList extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static CheckAllMasterTrusteeshipResponseDataCheckDataList build(java.util.Map<String, ?> map) throws Exception {
            CheckAllMasterTrusteeshipResponseDataCheckDataList self = new CheckAllMasterTrusteeshipResponseDataCheckDataList();
            return TeaModel.build(map, self);
        }

        public CheckAllMasterTrusteeshipResponseDataCheckDataList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CheckAllMasterTrusteeshipResponseDataCheckDataList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class CheckAllMasterTrusteeshipResponseData extends TeaModel {
        @NameInMap("CheckResult")
        @Validation(required = true)
        public Boolean checkResult;

        @NameInMap("CheckDataList")
        @Validation(required = true)
        public java.util.List<CheckAllMasterTrusteeshipResponseDataCheckDataList> checkDataList;

        public static CheckAllMasterTrusteeshipResponseData build(java.util.Map<String, ?> map) throws Exception {
            CheckAllMasterTrusteeshipResponseData self = new CheckAllMasterTrusteeshipResponseData();
            return TeaModel.build(map, self);
        }

        public CheckAllMasterTrusteeshipResponseData setCheckResult(Boolean checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Boolean getCheckResult() {
            return this.checkResult;
        }

        public CheckAllMasterTrusteeshipResponseData setCheckDataList(java.util.List<CheckAllMasterTrusteeshipResponseDataCheckDataList> checkDataList) {
            this.checkDataList = checkDataList;
            return this;
        }
        public java.util.List<CheckAllMasterTrusteeshipResponseDataCheckDataList> getCheckDataList() {
            return this.checkDataList;
        }

    }

}
