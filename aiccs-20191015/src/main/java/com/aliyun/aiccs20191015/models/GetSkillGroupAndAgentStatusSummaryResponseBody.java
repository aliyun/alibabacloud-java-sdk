// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupAndAgentStatusSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSkillGroupAndAgentStatusSummaryResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetSkillGroupAndAgentStatusSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupAndAgentStatusSummaryResponseBody self = new GetSkillGroupAndAgentStatusSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupAndAgentStatusSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupAndAgentStatusSummaryResponseBody setData(GetSkillGroupAndAgentStatusSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupAndAgentStatusSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupAndAgentStatusSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupAndAgentStatusSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupAndAgentStatusSummaryResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSkillGroupAndAgentStatusSummaryResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rows")
        public String rows;

        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetSkillGroupAndAgentStatusSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupAndAgentStatusSummaryResponseBodyData self = new GetSkillGroupAndAgentStatusSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupAndAgentStatusSummaryResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetSkillGroupAndAgentStatusSummaryResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSkillGroupAndAgentStatusSummaryResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSkillGroupAndAgentStatusSummaryResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
