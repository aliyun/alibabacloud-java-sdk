// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupAgentStatusDetailsResponseBody extends TeaModel {
    // 错误编码
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public GetSkillGroupAgentStatusDetailsResponseBodyData data;

    // 错误描述
    @NameInMap("Message")
    public String message;

    // 请求ID，用于跟踪错误原因
    @NameInMap("RequestId")
    public String requestId;

    // 接口调用是否成功
    @NameInMap("Success")
    public String success;

    public static GetSkillGroupAgentStatusDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupAgentStatusDetailsResponseBody self = new GetSkillGroupAgentStatusDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setData(GetSkillGroupAgentStatusDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupAgentStatusDetailsResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSkillGroupAgentStatusDetailsResponseBodyData extends TeaModel {
        // 当前页数
        @NameInMap("PageNum")
        public Long pageNum;

        // 每页的数量
        @NameInMap("PageSize")
        public Long pageSize;

        // 信息为list<map>类型的json字符串
        @NameInMap("Rows")
        public String rows;

        // 总记录数
        @NameInMap("TotalNum")
        public Long totalNum;

        public static GetSkillGroupAgentStatusDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupAgentStatusDetailsResponseBodyData self = new GetSkillGroupAgentStatusDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupAgentStatusDetailsResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetSkillGroupAgentStatusDetailsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetSkillGroupAgentStatusDetailsResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSkillGroupAgentStatusDetailsResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
