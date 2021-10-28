// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupAndAgentStatusSummaryResponseBody extends TeaModel {
    // 错误编码
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public GetSkillGroupAndAgentStatusSummaryResponseBodyData data;

    // 错误描述
    @NameInMap("Message")
    public String message;

    // 请求ID，用于跟踪错误原因
    @NameInMap("RequestId")
    public String requestId;

    // 接口调用是否成功
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
        // 当前页数
        @NameInMap("PageNum")
        public Integer pageNum;

        // 每页的数量
        @NameInMap("PageSize")
        public Integer pageSize;

        // 信息为list<map>类型的json字符串
        @NameInMap("Rows")
        public String rows;

        // 总记录数
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
