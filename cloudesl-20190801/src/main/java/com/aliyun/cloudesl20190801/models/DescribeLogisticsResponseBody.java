// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribeLogisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Logistics")
    public DescribeLogisticsResponseBodyLogistics logistics;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeLogisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogisticsResponseBody self = new DescribeLogisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeLogisticsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeLogisticsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeLogisticsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeLogisticsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeLogisticsResponseBody setLogistics(DescribeLogisticsResponseBodyLogistics logistics) {
        this.logistics = logistics;
        return this;
    }
    public DescribeLogisticsResponseBodyLogistics getLogistics() {
        return this.logistics;
    }

    public DescribeLogisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLogisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeLogisticsResponseBodyLogisticsLogisticsInfo extends TeaModel {
        @NameInMap("AcceptStatus")
        public Boolean acceptStatus;

        @NameInMap("ApMacList")
        public String apMacList;

        @NameInMap("Description")
        public String description;

        @NameInMap("EslMacList")
        public String eslMacList;

        @NameInMap("HasSend")
        public String hasSend;

        @NameInMap("LogisticsDocuments")
        public String logisticsDocuments;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("PoNumber")
        public String poNumber;

        @NameInMap("PrNumber")
        public String prNumber;

        public static DescribeLogisticsResponseBodyLogisticsLogisticsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogisticsResponseBodyLogisticsLogisticsInfo self = new DescribeLogisticsResponseBodyLogisticsLogisticsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLogisticsResponseBodyLogisticsLogisticsInfo setAcceptStatus(Boolean acceptStatus) {
            this.acceptStatus = acceptStatus;
            return this;
        }
        public Boolean getAcceptStatus() {
            return this.acceptStatus;
        }

        public DescribeLogisticsResponseBodyLogisticsLogisticsInfo setApMacList(String apMacList) {
            this.apMacList = apMacList;
            return this;
        }
        public String getApMacList() {
            return this.apMacList;
        }

        public DescribeLogisticsResponseBodyLogisticsLogisticsInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLogisticsResponseBodyLogisticsLogisticsInfo setEslMacList(String eslMacList) {
            this.eslMacList = eslMacList;
            return this;
        }
        public String getEslMacList() {
            return this.eslMacList;
        }

        public DescribeLogisticsResponseBodyLogisticsLogisticsInfo setHasSend(String hasSend) {
            this.hasSend = hasSend;
            return this;
        }
        public String getHasSend() {
            return this.hasSend;
        }

        public DescribeLogisticsResponseBodyLogisticsLogisticsInfo setLogisticsDocuments(String logisticsDocuments) {
            this.logisticsDocuments = logisticsDocuments;
            return this;
        }
        public String getLogisticsDocuments() {
            return this.logisticsDocuments;
        }

        public DescribeLogisticsResponseBodyLogisticsLogisticsInfo setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public DescribeLogisticsResponseBodyLogisticsLogisticsInfo setPoNumber(String poNumber) {
            this.poNumber = poNumber;
            return this;
        }
        public String getPoNumber() {
            return this.poNumber;
        }

        public DescribeLogisticsResponseBodyLogisticsLogisticsInfo setPrNumber(String prNumber) {
            this.prNumber = prNumber;
            return this;
        }
        public String getPrNumber() {
            return this.prNumber;
        }

    }

    public static class DescribeLogisticsResponseBodyLogistics extends TeaModel {
        @NameInMap("LogisticsInfo")
        public java.util.List<DescribeLogisticsResponseBodyLogisticsLogisticsInfo> logisticsInfo;

        public static DescribeLogisticsResponseBodyLogistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogisticsResponseBodyLogistics self = new DescribeLogisticsResponseBodyLogistics();
            return TeaModel.build(map, self);
        }

        public DescribeLogisticsResponseBodyLogistics setLogisticsInfo(java.util.List<DescribeLogisticsResponseBodyLogisticsLogisticsInfo> logisticsInfo) {
            this.logisticsInfo = logisticsInfo;
            return this;
        }
        public java.util.List<DescribeLogisticsResponseBodyLogisticsLogisticsInfo> getLogisticsInfo() {
            return this.logisticsInfo;
        }

    }

}
