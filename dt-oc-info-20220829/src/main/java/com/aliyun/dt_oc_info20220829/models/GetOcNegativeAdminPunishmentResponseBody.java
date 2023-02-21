// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcNegativeAdminPunishmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcNegativeAdminPunishmentResponseBodyData> data;

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

    public static GetOcNegativeAdminPunishmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcNegativeAdminPunishmentResponseBody self = new GetOcNegativeAdminPunishmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcNegativeAdminPunishmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcNegativeAdminPunishmentResponseBody setData(java.util.List<GetOcNegativeAdminPunishmentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcNegativeAdminPunishmentResponseBodyData> getData() {
        return this.data;
    }

    public GetOcNegativeAdminPunishmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcNegativeAdminPunishmentResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcNegativeAdminPunishmentResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcNegativeAdminPunishmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcNegativeAdminPunishmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcNegativeAdminPunishmentResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcNegativeAdminPunishmentResponseBodyData extends TeaModel {
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

        public static GetOcNegativeAdminPunishmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcNegativeAdminPunishmentResponseBodyData self = new GetOcNegativeAdminPunishmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcNegativeAdminPunishmentResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcNegativeAdminPunishmentResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcNegativeAdminPunishmentResponseBodyData setIllegalType(String illegalType) {
            this.illegalType = illegalType;
            return this;
        }
        public String getIllegalType() {
            return this.illegalType;
        }

        public GetOcNegativeAdminPunishmentResponseBodyData setLawBasis(String lawBasis) {
            this.lawBasis = lawBasis;
            return this;
        }
        public String getLawBasis() {
            return this.lawBasis;
        }

        public GetOcNegativeAdminPunishmentResponseBodyData setPublicDate(String publicDate) {
            this.publicDate = publicDate;
            return this;
        }
        public String getPublicDate() {
            return this.publicDate;
        }

        public GetOcNegativeAdminPunishmentResponseBodyData setPunishDate(String punishDate) {
            this.punishDate = punishDate;
            return this;
        }
        public String getPunishDate() {
            return this.punishDate;
        }

        public GetOcNegativeAdminPunishmentResponseBodyData setPunishNum(String punishNum) {
            this.punishNum = punishNum;
            return this;
        }
        public String getPunishNum() {
            return this.punishNum;
        }

        public GetOcNegativeAdminPunishmentResponseBodyData setPunishResult(String punishResult) {
            this.punishResult = punishResult;
            return this;
        }
        public String getPunishResult() {
            return this.punishResult;
        }

    }

}
