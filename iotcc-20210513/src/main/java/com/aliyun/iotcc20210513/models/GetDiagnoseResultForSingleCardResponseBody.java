// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GetDiagnoseResultForSingleCardResponseBody extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("CardIp")
    public String cardIp;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("DiagnoseItem")
    public java.util.List<GetDiagnoseResultForSingleCardResponseBodyDiagnoseItem> diagnoseItem;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ErrorResult")
    public java.util.List<GetDiagnoseResultForSingleCardResponseBodyErrorResult> errorResult;

    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static GetDiagnoseResultForSingleCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnoseResultForSingleCardResponseBody self = new GetDiagnoseResultForSingleCardResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDiagnoseResultForSingleCardResponseBody setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetDiagnoseResultForSingleCardResponseBody setCardIp(String cardIp) {
        this.cardIp = cardIp;
        return this;
    }
    public String getCardIp() {
        return this.cardIp;
    }

    public GetDiagnoseResultForSingleCardResponseBody setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public GetDiagnoseResultForSingleCardResponseBody setDiagnoseItem(java.util.List<GetDiagnoseResultForSingleCardResponseBodyDiagnoseItem> diagnoseItem) {
        this.diagnoseItem = diagnoseItem;
        return this;
    }
    public java.util.List<GetDiagnoseResultForSingleCardResponseBodyDiagnoseItem> getDiagnoseItem() {
        return this.diagnoseItem;
    }

    public GetDiagnoseResultForSingleCardResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetDiagnoseResultForSingleCardResponseBody setErrorResult(java.util.List<GetDiagnoseResultForSingleCardResponseBodyErrorResult> errorResult) {
        this.errorResult = errorResult;
        return this;
    }
    public java.util.List<GetDiagnoseResultForSingleCardResponseBodyErrorResult> getErrorResult() {
        return this.errorResult;
    }

    public GetDiagnoseResultForSingleCardResponseBody setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public GetDiagnoseResultForSingleCardResponseBody setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public GetDiagnoseResultForSingleCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDiagnoseResultForSingleCardResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetDiagnoseResultForSingleCardResponseBodyDiagnoseItem extends TeaModel {
        @NameInMap("Part")
        public String part;

        @NameInMap("Status")
        public String status;

        public static GetDiagnoseResultForSingleCardResponseBodyDiagnoseItem build(java.util.Map<String, ?> map) throws Exception {
            GetDiagnoseResultForSingleCardResponseBodyDiagnoseItem self = new GetDiagnoseResultForSingleCardResponseBodyDiagnoseItem();
            return TeaModel.build(map, self);
        }

        public GetDiagnoseResultForSingleCardResponseBodyDiagnoseItem setPart(String part) {
            this.part = part;
            return this;
        }
        public String getPart() {
            return this.part;
        }

        public GetDiagnoseResultForSingleCardResponseBodyDiagnoseItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetDiagnoseResultForSingleCardResponseBodyErrorResult extends TeaModel {
        @NameInMap("ErrorDes")
        public String errorDes;

        @NameInMap("ErrorLevel")
        public String errorLevel;

        @NameInMap("ErrorPart")
        public String errorPart;

        @NameInMap("ErrorSuggestion")
        public String errorSuggestion;

        public static GetDiagnoseResultForSingleCardResponseBodyErrorResult build(java.util.Map<String, ?> map) throws Exception {
            GetDiagnoseResultForSingleCardResponseBodyErrorResult self = new GetDiagnoseResultForSingleCardResponseBodyErrorResult();
            return TeaModel.build(map, self);
        }

        public GetDiagnoseResultForSingleCardResponseBodyErrorResult setErrorDes(String errorDes) {
            this.errorDes = errorDes;
            return this;
        }
        public String getErrorDes() {
            return this.errorDes;
        }

        public GetDiagnoseResultForSingleCardResponseBodyErrorResult setErrorLevel(String errorLevel) {
            this.errorLevel = errorLevel;
            return this;
        }
        public String getErrorLevel() {
            return this.errorLevel;
        }

        public GetDiagnoseResultForSingleCardResponseBodyErrorResult setErrorPart(String errorPart) {
            this.errorPart = errorPart;
            return this;
        }
        public String getErrorPart() {
            return this.errorPart;
        }

        public GetDiagnoseResultForSingleCardResponseBodyErrorResult setErrorSuggestion(String errorSuggestion) {
            this.errorSuggestion = errorSuggestion;
            return this;
        }
        public String getErrorSuggestion() {
            return this.errorSuggestion;
        }

    }

}
