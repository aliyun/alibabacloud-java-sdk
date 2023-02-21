// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcNegativeEnvironmentPunishmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcNegativeEnvironmentPunishmentResponseBodyData> data;

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

    public static GetOcNegativeEnvironmentPunishmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcNegativeEnvironmentPunishmentResponseBody self = new GetOcNegativeEnvironmentPunishmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcNegativeEnvironmentPunishmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcNegativeEnvironmentPunishmentResponseBody setData(java.util.List<GetOcNegativeEnvironmentPunishmentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcNegativeEnvironmentPunishmentResponseBodyData> getData() {
        return this.data;
    }

    public GetOcNegativeEnvironmentPunishmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcNegativeEnvironmentPunishmentResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcNegativeEnvironmentPunishmentResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcNegativeEnvironmentPunishmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcNegativeEnvironmentPunishmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcNegativeEnvironmentPunishmentResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcNegativeEnvironmentPunishmentResponseBodyData extends TeaModel {
        @NameInMap("Department")
        public String department;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("ExecStatus")
        public String execStatus;

        @NameInMap("PunishBasis")
        public String punishBasis;

        @NameInMap("PunishContent")
        public String punishContent;

        @NameInMap("PunishDate")
        public String punishDate;

        @NameInMap("PunishLaw")
        public String punishLaw;

        @NameInMap("PunishNum")
        public String punishNum;

        @NameInMap("PunishRes")
        public String punishRes;

        public static GetOcNegativeEnvironmentPunishmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcNegativeEnvironmentPunishmentResponseBodyData self = new GetOcNegativeEnvironmentPunishmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcNegativeEnvironmentPunishmentResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcNegativeEnvironmentPunishmentResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcNegativeEnvironmentPunishmentResponseBodyData setExecStatus(String execStatus) {
            this.execStatus = execStatus;
            return this;
        }
        public String getExecStatus() {
            return this.execStatus;
        }

        public GetOcNegativeEnvironmentPunishmentResponseBodyData setPunishBasis(String punishBasis) {
            this.punishBasis = punishBasis;
            return this;
        }
        public String getPunishBasis() {
            return this.punishBasis;
        }

        public GetOcNegativeEnvironmentPunishmentResponseBodyData setPunishContent(String punishContent) {
            this.punishContent = punishContent;
            return this;
        }
        public String getPunishContent() {
            return this.punishContent;
        }

        public GetOcNegativeEnvironmentPunishmentResponseBodyData setPunishDate(String punishDate) {
            this.punishDate = punishDate;
            return this;
        }
        public String getPunishDate() {
            return this.punishDate;
        }

        public GetOcNegativeEnvironmentPunishmentResponseBodyData setPunishLaw(String punishLaw) {
            this.punishLaw = punishLaw;
            return this;
        }
        public String getPunishLaw() {
            return this.punishLaw;
        }

        public GetOcNegativeEnvironmentPunishmentResponseBodyData setPunishNum(String punishNum) {
            this.punishNum = punishNum;
            return this;
        }
        public String getPunishNum() {
            return this.punishNum;
        }

        public GetOcNegativeEnvironmentPunishmentResponseBodyData setPunishRes(String punishRes) {
            this.punishRes = punishRes;
            return this;
        }
        public String getPunishRes() {
            return this.punishRes;
        }

    }

}
