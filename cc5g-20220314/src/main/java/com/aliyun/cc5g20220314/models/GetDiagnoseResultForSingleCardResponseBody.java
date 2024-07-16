// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetDiagnoseResultForSingleCardResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1646100223024</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <strong>example:</strong>
     * <p>10.176.78.61</p>
     */
    @NameInMap("CardIp")
    public String cardIp;

    /**
     * <strong>example:</strong>
     * <p>106.14.175.4</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <strong>example:</strong>
     * <p>Domain</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("DiagnoseItem")
    public java.util.List<GetDiagnoseResultForSingleCardResponseBodyDiagnoseItem> diagnoseItem;

    /**
     * <strong>example:</strong>
     * <p>1646100223264</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ErrorResult")
    public java.util.List<GetDiagnoseResultForSingleCardResponseBodyErrorResult> errorResult;

    /**
     * <strong>example:</strong>
     * <p>89860477102170127555</p>
     */
    @NameInMap("IccId")
    public String iccId;

    /**
     * <strong>example:</strong>
     * <p>94032572-8758-575E-B306-86F59D1B826E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>failed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>cc5g-xxxx</p>
     */
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

    public static class GetDiagnoseResultForSingleCardResponseBodyDiagnoseItemSubItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CardStatus</p>
         */
        @NameInMap("SubItem")
        public String subItem;

        /**
         * <strong>example:</strong>
         * <p>Card status is real-time</p>
         */
        @NameInMap("SubItemInfo")
        public String subItemInfo;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("SubItemStatus")
        public String subItemStatus;

        public static GetDiagnoseResultForSingleCardResponseBodyDiagnoseItemSubItems build(java.util.Map<String, ?> map) throws Exception {
            GetDiagnoseResultForSingleCardResponseBodyDiagnoseItemSubItems self = new GetDiagnoseResultForSingleCardResponseBodyDiagnoseItemSubItems();
            return TeaModel.build(map, self);
        }

        public GetDiagnoseResultForSingleCardResponseBodyDiagnoseItemSubItems setSubItem(String subItem) {
            this.subItem = subItem;
            return this;
        }
        public String getSubItem() {
            return this.subItem;
        }

        public GetDiagnoseResultForSingleCardResponseBodyDiagnoseItemSubItems setSubItemInfo(String subItemInfo) {
            this.subItemInfo = subItemInfo;
            return this;
        }
        public String getSubItemInfo() {
            return this.subItemInfo;
        }

        public GetDiagnoseResultForSingleCardResponseBodyDiagnoseItemSubItems setSubItemStatus(String subItemStatus) {
            this.subItemStatus = subItemStatus;
            return this;
        }
        public String getSubItemStatus() {
            return this.subItemStatus;
        }

    }

    public static class GetDiagnoseResultForSingleCardResponseBodyDiagnoseItem extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Terminal</p>
         */
        @NameInMap("Part")
        public String part;

        /**
         * <strong>example:</strong>
         * <p>Wrong</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SubItems")
        public java.util.List<GetDiagnoseResultForSingleCardResponseBodyDiagnoseItemSubItems> subItems;

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

        public GetDiagnoseResultForSingleCardResponseBodyDiagnoseItem setSubItems(java.util.List<GetDiagnoseResultForSingleCardResponseBodyDiagnoseItemSubItems> subItems) {
            this.subItems = subItems;
            return this;
        }
        public java.util.List<GetDiagnoseResultForSingleCardResponseBodyDiagnoseItemSubItems> getSubItems() {
            return this.subItems;
        }

    }

    public static class GetDiagnoseResultForSingleCardResponseBodyErrorResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Terminal abnormal</p>
         */
        @NameInMap("ErrorDesc")
        public String errorDesc;

        /**
         * <strong>example:</strong>
         * <p>CardStatus</p>
         */
        @NameInMap("ErrorItem")
        public String errorItem;

        /**
         * <strong>example:</strong>
         * <p>Warning</p>
         */
        @NameInMap("ErrorLevel")
        public String errorLevel;

        /**
         * <strong>example:</strong>
         * <p>Terminal</p>
         */
        @NameInMap("ErrorPart")
        public String errorPart;

        /**
         * <strong>example:</strong>
         * <p>Please check whether the terminal and card are compatible or whether the terminal can send messages</p>
         */
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

        public GetDiagnoseResultForSingleCardResponseBodyErrorResult setErrorItem(String errorItem) {
            this.errorItem = errorItem;
            return this;
        }
        public String getErrorItem() {
            return this.errorItem;
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
