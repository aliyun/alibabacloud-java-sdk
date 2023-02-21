// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcNegativeFoodDrugPunishmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcNegativeFoodDrugPunishmentResponseBodyData> data;

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

    public static GetOcNegativeFoodDrugPunishmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcNegativeFoodDrugPunishmentResponseBody self = new GetOcNegativeFoodDrugPunishmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcNegativeFoodDrugPunishmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcNegativeFoodDrugPunishmentResponseBody setData(java.util.List<GetOcNegativeFoodDrugPunishmentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcNegativeFoodDrugPunishmentResponseBodyData> getData() {
        return this.data;
    }

    public GetOcNegativeFoodDrugPunishmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcNegativeFoodDrugPunishmentResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcNegativeFoodDrugPunishmentResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcNegativeFoodDrugPunishmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcNegativeFoodDrugPunishmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcNegativeFoodDrugPunishmentResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcNegativeFoodDrugPunishmentResponseBodyData extends TeaModel {
        @NameInMap("Department")
        public String department;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("IllegalType")
        public String illegalType;

        @NameInMap("LawBasis")
        public String lawBasis;

        @NameInMap("PublicDate")
        public String publicDate;

        @NameInMap("PunishDate")
        public String punishDate;

        @NameInMap("PunishNum")
        public String punishNum;

        @NameInMap("PunishResult")
        public String punishResult;

        public static GetOcNegativeFoodDrugPunishmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcNegativeFoodDrugPunishmentResponseBodyData self = new GetOcNegativeFoodDrugPunishmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcNegativeFoodDrugPunishmentResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcNegativeFoodDrugPunishmentResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcNegativeFoodDrugPunishmentResponseBodyData setIllegalType(String illegalType) {
            this.illegalType = illegalType;
            return this;
        }
        public String getIllegalType() {
            return this.illegalType;
        }

        public GetOcNegativeFoodDrugPunishmentResponseBodyData setLawBasis(String lawBasis) {
            this.lawBasis = lawBasis;
            return this;
        }
        public String getLawBasis() {
            return this.lawBasis;
        }

        public GetOcNegativeFoodDrugPunishmentResponseBodyData setPublicDate(String publicDate) {
            this.publicDate = publicDate;
            return this;
        }
        public String getPublicDate() {
            return this.publicDate;
        }

        public GetOcNegativeFoodDrugPunishmentResponseBodyData setPunishDate(String punishDate) {
            this.punishDate = punishDate;
            return this;
        }
        public String getPunishDate() {
            return this.punishDate;
        }

        public GetOcNegativeFoodDrugPunishmentResponseBodyData setPunishNum(String punishNum) {
            this.punishNum = punishNum;
            return this;
        }
        public String getPunishNum() {
            return this.punishNum;
        }

        public GetOcNegativeFoodDrugPunishmentResponseBodyData setPunishResult(String punishResult) {
            this.punishResult = punishResult;
            return this;
        }
        public String getPunishResult() {
            return this.punishResult;
        }

    }

}
