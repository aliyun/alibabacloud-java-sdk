// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcNegativeCustomsPunishmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcNegativeCustomsPunishmentResponseBodyData> data;

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

    public static GetOcNegativeCustomsPunishmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcNegativeCustomsPunishmentResponseBody self = new GetOcNegativeCustomsPunishmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcNegativeCustomsPunishmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcNegativeCustomsPunishmentResponseBody setData(java.util.List<GetOcNegativeCustomsPunishmentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcNegativeCustomsPunishmentResponseBodyData> getData() {
        return this.data;
    }

    public GetOcNegativeCustomsPunishmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcNegativeCustomsPunishmentResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcNegativeCustomsPunishmentResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcNegativeCustomsPunishmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcNegativeCustomsPunishmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcNegativeCustomsPunishmentResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcNegativeCustomsPunishmentResponseBodyData extends TeaModel {
        @NameInMap("Basis")
        public String basis;

        @NameInMap("CaseNo")
        public String caseNo;

        @NameInMap("Customs")
        public String customs;

        @NameInMap("CustomsNo")
        public String customsNo;

        @NameInMap("LegalName")
        public String legalName;

        @NameInMap("PunishDate")
        public String punishDate;

        @NameInMap("PunishType")
        public String punishType;

        @NameInMap("Title")
        public String title;

        public static GetOcNegativeCustomsPunishmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcNegativeCustomsPunishmentResponseBodyData self = new GetOcNegativeCustomsPunishmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcNegativeCustomsPunishmentResponseBodyData setBasis(String basis) {
            this.basis = basis;
            return this;
        }
        public String getBasis() {
            return this.basis;
        }

        public GetOcNegativeCustomsPunishmentResponseBodyData setCaseNo(String caseNo) {
            this.caseNo = caseNo;
            return this;
        }
        public String getCaseNo() {
            return this.caseNo;
        }

        public GetOcNegativeCustomsPunishmentResponseBodyData setCustoms(String customs) {
            this.customs = customs;
            return this;
        }
        public String getCustoms() {
            return this.customs;
        }

        public GetOcNegativeCustomsPunishmentResponseBodyData setCustomsNo(String customsNo) {
            this.customsNo = customsNo;
            return this;
        }
        public String getCustomsNo() {
            return this.customsNo;
        }

        public GetOcNegativeCustomsPunishmentResponseBodyData setLegalName(String legalName) {
            this.legalName = legalName;
            return this;
        }
        public String getLegalName() {
            return this.legalName;
        }

        public GetOcNegativeCustomsPunishmentResponseBodyData setPunishDate(String punishDate) {
            this.punishDate = punishDate;
            return this;
        }
        public String getPunishDate() {
            return this.punishDate;
        }

        public GetOcNegativeCustomsPunishmentResponseBodyData setPunishType(String punishType) {
            this.punishType = punishType;
            return this;
        }
        public String getPunishType() {
            return this.punishType;
        }

        public GetOcNegativeCustomsPunishmentResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
