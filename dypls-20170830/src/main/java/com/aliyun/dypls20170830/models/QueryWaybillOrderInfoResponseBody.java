// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryWaybillOrderInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryWaybillOrderInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryWaybillOrderInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWaybillOrderInfoResponseBody self = new QueryWaybillOrderInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWaybillOrderInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryWaybillOrderInfoResponseBody setData(QueryWaybillOrderInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryWaybillOrderInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryWaybillOrderInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryWaybillOrderInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryWaybillOrderInfoResponseBodyData extends TeaModel {
        @NameInMap("Aliyunprice")
        public String aliyunprice;

        @NameInMap("AppointGotEndTime")
        public String appointGotEndTime;

        @NameInMap("AppointGotStartTime")
        public String appointGotStartTime;

        @NameInMap("BizType")
        public Integer bizType;

        @NameInMap("City")
        public String city;

        @NameInMap("CpCode")
        public String cpCode;

        @NameInMap("GotCode")
        public String gotCode;

        @NameInMap("LastLogisticDetail")
        public String lastLogisticDetail;

        @NameInMap("LogisticsGmtModified")
        public String logisticsGmtModified;

        @NameInMap("LogisticsStatus")
        public String logisticsStatus;

        @NameInMap("LogisticsStatusDesc")
        public String logisticsStatusDesc;

        @NameInMap("MailNo")
        public String mailNo;

        @NameInMap("OuterOrderCode")
        public String outerOrderCode;

        public static QueryWaybillOrderInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryWaybillOrderInfoResponseBodyData self = new QueryWaybillOrderInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryWaybillOrderInfoResponseBodyData setAliyunprice(String aliyunprice) {
            this.aliyunprice = aliyunprice;
            return this;
        }
        public String getAliyunprice() {
            return this.aliyunprice;
        }

        public QueryWaybillOrderInfoResponseBodyData setAppointGotEndTime(String appointGotEndTime) {
            this.appointGotEndTime = appointGotEndTime;
            return this;
        }
        public String getAppointGotEndTime() {
            return this.appointGotEndTime;
        }

        public QueryWaybillOrderInfoResponseBodyData setAppointGotStartTime(String appointGotStartTime) {
            this.appointGotStartTime = appointGotStartTime;
            return this;
        }
        public String getAppointGotStartTime() {
            return this.appointGotStartTime;
        }

        public QueryWaybillOrderInfoResponseBodyData setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public QueryWaybillOrderInfoResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryWaybillOrderInfoResponseBodyData setCpCode(String cpCode) {
            this.cpCode = cpCode;
            return this;
        }
        public String getCpCode() {
            return this.cpCode;
        }

        public QueryWaybillOrderInfoResponseBodyData setGotCode(String gotCode) {
            this.gotCode = gotCode;
            return this;
        }
        public String getGotCode() {
            return this.gotCode;
        }

        public QueryWaybillOrderInfoResponseBodyData setLastLogisticDetail(String lastLogisticDetail) {
            this.lastLogisticDetail = lastLogisticDetail;
            return this;
        }
        public String getLastLogisticDetail() {
            return this.lastLogisticDetail;
        }

        public QueryWaybillOrderInfoResponseBodyData setLogisticsGmtModified(String logisticsGmtModified) {
            this.logisticsGmtModified = logisticsGmtModified;
            return this;
        }
        public String getLogisticsGmtModified() {
            return this.logisticsGmtModified;
        }

        public QueryWaybillOrderInfoResponseBodyData setLogisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryWaybillOrderInfoResponseBodyData setLogisticsStatusDesc(String logisticsStatusDesc) {
            this.logisticsStatusDesc = logisticsStatusDesc;
            return this;
        }
        public String getLogisticsStatusDesc() {
            return this.logisticsStatusDesc;
        }

        public QueryWaybillOrderInfoResponseBodyData setMailNo(String mailNo) {
            this.mailNo = mailNo;
            return this;
        }
        public String getMailNo() {
            return this.mailNo;
        }

        public QueryWaybillOrderInfoResponseBodyData setOuterOrderCode(String outerOrderCode) {
            this.outerOrderCode = outerOrderCode;
            return this;
        }
        public String getOuterOrderCode() {
            return this.outerOrderCode;
        }

    }

}
