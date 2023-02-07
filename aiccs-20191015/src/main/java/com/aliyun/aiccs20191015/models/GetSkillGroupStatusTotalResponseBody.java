// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupStatusTotalResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSkillGroupStatusTotalResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetSkillGroupStatusTotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupStatusTotalResponseBody self = new GetSkillGroupStatusTotalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupStatusTotalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupStatusTotalResponseBody setData(GetSkillGroupStatusTotalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupStatusTotalResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupStatusTotalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupStatusTotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupStatusTotalResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSkillGroupStatusTotalResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Rows")
        public String rows;

        @NameInMap("TotalNum")
        public Long totalNum;

        public static GetSkillGroupStatusTotalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupStatusTotalResponseBodyData self = new GetSkillGroupStatusTotalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupStatusTotalResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetSkillGroupStatusTotalResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetSkillGroupStatusTotalResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSkillGroupStatusTotalResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
