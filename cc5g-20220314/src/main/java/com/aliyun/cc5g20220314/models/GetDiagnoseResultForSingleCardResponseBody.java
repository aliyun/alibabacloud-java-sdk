// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetDiagnoseResultForSingleCardResponseBody extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("CardIp")
    public String cardIp;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("DiagnoseItem")
    public java.util.List<GetDiagnoseResultForSingleCardResponseBodyDiagnoseItem> diagnoseItem;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ErrorResult")
    public java.util.List<GetDiagnoseResultForSingleCardResponseBodyErrorResult> errorResult;

    @NameInMap("IccId")
    public String iccId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

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

    public GetDiagnoseResultForSingleCardResponseBody setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
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

    public GetDiagnoseResultForSingleCardResponseBody setIccId(String iccId) {
        this.iccId = iccId;
        return this;
    }
    public String getIccId() {
        return this.iccId;
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

    public GetDiagnoseResultForSingleCardResponseBody setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
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
        @NameInMap("ErrorDesc")
        public String errorDesc;

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

        public GetDiagnoseResultForSingleCardResponseBodyErrorResult setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
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
