// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcTaxGeneralTaxpayerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcTaxGeneralTaxpayerResponseBodyData> data;

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

    public static GetOcTaxGeneralTaxpayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcTaxGeneralTaxpayerResponseBody self = new GetOcTaxGeneralTaxpayerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcTaxGeneralTaxpayerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcTaxGeneralTaxpayerResponseBody setData(java.util.List<GetOcTaxGeneralTaxpayerResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcTaxGeneralTaxpayerResponseBodyData> getData() {
        return this.data;
    }

    public GetOcTaxGeneralTaxpayerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcTaxGeneralTaxpayerResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcTaxGeneralTaxpayerResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcTaxGeneralTaxpayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcTaxGeneralTaxpayerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcTaxGeneralTaxpayerResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcTaxGeneralTaxpayerResponseBodyData extends TeaModel {
        @NameInMap("Department")
        public String department;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("JudgeDate")
        public String judgeDate;

        @NameInMap("Qualification")
        public String qualification;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("TaxpayerNum")
        public String taxpayerNum;

        public static GetOcTaxGeneralTaxpayerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcTaxGeneralTaxpayerResponseBodyData self = new GetOcTaxGeneralTaxpayerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcTaxGeneralTaxpayerResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcTaxGeneralTaxpayerResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetOcTaxGeneralTaxpayerResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcTaxGeneralTaxpayerResponseBodyData setJudgeDate(String judgeDate) {
            this.judgeDate = judgeDate;
            return this;
        }
        public String getJudgeDate() {
            return this.judgeDate;
        }

        public GetOcTaxGeneralTaxpayerResponseBodyData setQualification(String qualification) {
            this.qualification = qualification;
            return this;
        }
        public String getQualification() {
            return this.qualification;
        }

        public GetOcTaxGeneralTaxpayerResponseBodyData setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetOcTaxGeneralTaxpayerResponseBodyData setTaxpayerNum(String taxpayerNum) {
            this.taxpayerNum = taxpayerNum;
            return this;
        }
        public String getTaxpayerNum() {
            return this.taxpayerNum;
        }

    }

}
