// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupServiceStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSkillGroupServiceStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetSkillGroupServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupServiceStatusResponseBody self = new GetSkillGroupServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupServiceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupServiceStatusResponseBody setData(GetSkillGroupServiceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupServiceStatusResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupServiceStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupServiceStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSkillGroupServiceStatusResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rows")
        public String rows;

        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetSkillGroupServiceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupServiceStatusResponseBodyData self = new GetSkillGroupServiceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupServiceStatusResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetSkillGroupServiceStatusResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSkillGroupServiceStatusResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSkillGroupServiceStatusResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
