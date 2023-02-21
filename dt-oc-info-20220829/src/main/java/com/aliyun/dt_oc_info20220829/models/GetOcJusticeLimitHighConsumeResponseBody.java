// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeLimitHighConsumeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcJusticeLimitHighConsumeResponseBodyData> data;

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

    public static GetOcJusticeLimitHighConsumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeLimitHighConsumeResponseBody self = new GetOcJusticeLimitHighConsumeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeLimitHighConsumeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcJusticeLimitHighConsumeResponseBody setData(java.util.List<GetOcJusticeLimitHighConsumeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcJusticeLimitHighConsumeResponseBodyData> getData() {
        return this.data;
    }

    public GetOcJusticeLimitHighConsumeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcJusticeLimitHighConsumeResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcJusticeLimitHighConsumeResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcJusticeLimitHighConsumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcJusticeLimitHighConsumeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcJusticeLimitHighConsumeResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcJusticeLimitHighConsumeResponseBodyData extends TeaModel {
        @NameInMap("CaseNum")
        public String caseNum;

        @NameInMap("CauseAction")
        public String causeAction;

        @NameInMap("CompanyName")
        public String companyName;

        @NameInMap("Court")
        public String court;

        @NameInMap("ExecutionApplicant")
        public String executionApplicant;

        @NameInMap("FilingDate")
        public String filingDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("PublishDate")
        public String publishDate;

        public static GetOcJusticeLimitHighConsumeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcJusticeLimitHighConsumeResponseBodyData self = new GetOcJusticeLimitHighConsumeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcJusticeLimitHighConsumeResponseBodyData setCaseNum(String caseNum) {
            this.caseNum = caseNum;
            return this;
        }
        public String getCaseNum() {
            return this.caseNum;
        }

        public GetOcJusticeLimitHighConsumeResponseBodyData setCauseAction(String causeAction) {
            this.causeAction = causeAction;
            return this;
        }
        public String getCauseAction() {
            return this.causeAction;
        }

        public GetOcJusticeLimitHighConsumeResponseBodyData setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public GetOcJusticeLimitHighConsumeResponseBodyData setCourt(String court) {
            this.court = court;
            return this;
        }
        public String getCourt() {
            return this.court;
        }

        public GetOcJusticeLimitHighConsumeResponseBodyData setExecutionApplicant(String executionApplicant) {
            this.executionApplicant = executionApplicant;
            return this;
        }
        public String getExecutionApplicant() {
            return this.executionApplicant;
        }

        public GetOcJusticeLimitHighConsumeResponseBodyData setFilingDate(String filingDate) {
            this.filingDate = filingDate;
            return this;
        }
        public String getFilingDate() {
            return this.filingDate;
        }

        public GetOcJusticeLimitHighConsumeResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOcJusticeLimitHighConsumeResponseBodyData setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

    }

}
