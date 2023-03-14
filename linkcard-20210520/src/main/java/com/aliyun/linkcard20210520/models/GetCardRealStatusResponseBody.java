// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardRealStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetCardRealStatusResponseBodyData> data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCardRealStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCardRealStatusResponseBody self = new GetCardRealStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCardRealStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCardRealStatusResponseBody setData(java.util.List<GetCardRealStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCardRealStatusResponseBodyData> getData() {
        return this.data;
    }

    public GetCardRealStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCardRealStatusResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public GetCardRealStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCardRealStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCardRealStatusResponseBodyData extends TeaModel {
        @NameInMap("Gprs")
        public Boolean gprs;

        @NameInMap("Iccid")
        public String iccid;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("SerialNo")
        public String serialNo;

        @NameInMap("Status")
        public String status;

        public static GetCardRealStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCardRealStatusResponseBodyData self = new GetCardRealStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCardRealStatusResponseBodyData setGprs(Boolean gprs) {
            this.gprs = gprs;
            return this;
        }
        public Boolean getGprs() {
            return this.gprs;
        }

        public GetCardRealStatusResponseBodyData setIccid(String iccid) {
            this.iccid = iccid;
            return this;
        }
        public String getIccid() {
            return this.iccid;
        }

        public GetCardRealStatusResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public GetCardRealStatusResponseBodyData setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public GetCardRealStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
