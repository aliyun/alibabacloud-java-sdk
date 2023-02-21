// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeTerminalCaseResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcJusticeTerminalCaseResponseBodyData> data;

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

    public static GetOcJusticeTerminalCaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeTerminalCaseResponseBody self = new GetOcJusticeTerminalCaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeTerminalCaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcJusticeTerminalCaseResponseBody setData(java.util.List<GetOcJusticeTerminalCaseResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcJusticeTerminalCaseResponseBodyData> getData() {
        return this.data;
    }

    public GetOcJusticeTerminalCaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcJusticeTerminalCaseResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcJusticeTerminalCaseResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcJusticeTerminalCaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcJusticeTerminalCaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcJusticeTerminalCaseResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcJusticeTerminalCaseResponseBodyData extends TeaModel {
        @NameInMap("CaseNum")
        public String caseNum;

        @NameInMap("Court")
        public String court;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("ExecAmount")
        public String execAmount;

        @NameInMap("FailPerformAmount")
        public String failPerformAmount;

        @NameInMap("FilingDate")
        public String filingDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("TerminalNum")
        public String terminalNum;

        @NameInMap("TerminateDate")
        public String terminateDate;

        public static GetOcJusticeTerminalCaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcJusticeTerminalCaseResponseBodyData self = new GetOcJusticeTerminalCaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcJusticeTerminalCaseResponseBodyData setCaseNum(String caseNum) {
            this.caseNum = caseNum;
            return this;
        }
        public String getCaseNum() {
            return this.caseNum;
        }

        public GetOcJusticeTerminalCaseResponseBodyData setCourt(String court) {
            this.court = court;
            return this;
        }
        public String getCourt() {
            return this.court;
        }

        public GetOcJusticeTerminalCaseResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcJusticeTerminalCaseResponseBodyData setExecAmount(String execAmount) {
            this.execAmount = execAmount;
            return this;
        }
        public String getExecAmount() {
            return this.execAmount;
        }

        public GetOcJusticeTerminalCaseResponseBodyData setFailPerformAmount(String failPerformAmount) {
            this.failPerformAmount = failPerformAmount;
            return this;
        }
        public String getFailPerformAmount() {
            return this.failPerformAmount;
        }

        public GetOcJusticeTerminalCaseResponseBodyData setFilingDate(String filingDate) {
            this.filingDate = filingDate;
            return this;
        }
        public String getFilingDate() {
            return this.filingDate;
        }

        public GetOcJusticeTerminalCaseResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOcJusticeTerminalCaseResponseBodyData setTerminalNum(String terminalNum) {
            this.terminalNum = terminalNum;
            return this;
        }
        public String getTerminalNum() {
            return this.terminalNum;
        }

        public GetOcJusticeTerminalCaseResponseBodyData setTerminateDate(String terminateDate) {
            this.terminateDate = terminateDate;
            return this;
        }
        public String getTerminateDate() {
            return this.terminateDate;
        }

    }

}
