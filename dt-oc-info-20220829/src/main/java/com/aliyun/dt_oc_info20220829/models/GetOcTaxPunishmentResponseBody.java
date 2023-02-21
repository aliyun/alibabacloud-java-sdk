// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcTaxPunishmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcTaxPunishmentResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static GetOcTaxPunishmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcTaxPunishmentResponseBody self = new GetOcTaxPunishmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcTaxPunishmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcTaxPunishmentResponseBody setData(java.util.List<GetOcTaxPunishmentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcTaxPunishmentResponseBodyData> getData() {
        return this.data;
    }

    public GetOcTaxPunishmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcTaxPunishmentResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcTaxPunishmentResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcTaxPunishmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcTaxPunishmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcTaxPunishmentResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcTaxPunishmentResponseBodyData extends TeaModel {
        @NameInMap("Department")
        public String department;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("LegalName")
        public String legalName;

        @NameInMap("PunishDate")
        public String punishDate;

        @NameInMap("TaxpayerNum")
        public String taxpayerNum;

        @NameInMap("Title")
        public String title;

        public static GetOcTaxPunishmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcTaxPunishmentResponseBodyData self = new GetOcTaxPunishmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcTaxPunishmentResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcTaxPunishmentResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcTaxPunishmentResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public GetOcTaxPunishmentResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public GetOcTaxPunishmentResponseBodyData setLegalName(String legalName) {
            this.legalName = legalName;
            return this;
        }
        public String getLegalName() {
            return this.legalName;
        }

        public GetOcTaxPunishmentResponseBodyData setPunishDate(String punishDate) {
            this.punishDate = punishDate;
            return this;
        }
        public String getPunishDate() {
            return this.punishDate;
        }

        public GetOcTaxPunishmentResponseBodyData setTaxpayerNum(String taxpayerNum) {
            this.taxpayerNum = taxpayerNum;
            return this;
        }
        public String getTaxpayerNum() {
            return this.taxpayerNum;
        }

        public GetOcTaxPunishmentResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
