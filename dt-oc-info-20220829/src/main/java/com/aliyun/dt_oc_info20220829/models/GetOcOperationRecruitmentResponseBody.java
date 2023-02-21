// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcOperationRecruitmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcOperationRecruitmentResponseBodyData> data;

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

    public static GetOcOperationRecruitmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcOperationRecruitmentResponseBody self = new GetOcOperationRecruitmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcOperationRecruitmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcOperationRecruitmentResponseBody setData(java.util.List<GetOcOperationRecruitmentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcOperationRecruitmentResponseBodyData> getData() {
        return this.data;
    }

    public GetOcOperationRecruitmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcOperationRecruitmentResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcOperationRecruitmentResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcOperationRecruitmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcOperationRecruitmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcOperationRecruitmentResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcOperationRecruitmentResponseBodyData extends TeaModel {
        @NameInMap("BenefitList")
        public String benefitList;

        @NameInMap("Description")
        public String description;

        @NameInMap("Education")
        public String education;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("Experience")
        public String experience;

        @NameInMap("PageUrl")
        public String pageUrl;

        @NameInMap("PublishDate")
        public String publishDate;

        @NameInMap("RecruitingAddress")
        public String recruitingAddress;

        @NameInMap("RecruitingName")
        public String recruitingName;

        @NameInMap("Salary")
        public String salary;

        @NameInMap("StartDate")
        public String startDate;

        public static GetOcOperationRecruitmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcOperationRecruitmentResponseBodyData self = new GetOcOperationRecruitmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcOperationRecruitmentResponseBodyData setBenefitList(String benefitList) {
            this.benefitList = benefitList;
            return this;
        }
        public String getBenefitList() {
            return this.benefitList;
        }

        public GetOcOperationRecruitmentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOcOperationRecruitmentResponseBodyData setEducation(String education) {
            this.education = education;
            return this;
        }
        public String getEducation() {
            return this.education;
        }

        public GetOcOperationRecruitmentResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetOcOperationRecruitmentResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcOperationRecruitmentResponseBodyData setExperience(String experience) {
            this.experience = experience;
            return this;
        }
        public String getExperience() {
            return this.experience;
        }

        public GetOcOperationRecruitmentResponseBodyData setPageUrl(String pageUrl) {
            this.pageUrl = pageUrl;
            return this;
        }
        public String getPageUrl() {
            return this.pageUrl;
        }

        public GetOcOperationRecruitmentResponseBodyData setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public GetOcOperationRecruitmentResponseBodyData setRecruitingAddress(String recruitingAddress) {
            this.recruitingAddress = recruitingAddress;
            return this;
        }
        public String getRecruitingAddress() {
            return this.recruitingAddress;
        }

        public GetOcOperationRecruitmentResponseBodyData setRecruitingName(String recruitingName) {
            this.recruitingName = recruitingName;
            return this;
        }
        public String getRecruitingName() {
            return this.recruitingName;
        }

        public GetOcOperationRecruitmentResponseBodyData setSalary(String salary) {
            this.salary = salary;
            return this;
        }
        public String getSalary() {
            return this.salary;
        }

        public GetOcOperationRecruitmentResponseBodyData setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

}
