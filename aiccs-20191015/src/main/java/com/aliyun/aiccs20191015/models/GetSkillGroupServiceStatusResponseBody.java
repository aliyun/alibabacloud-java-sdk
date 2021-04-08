// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetSkillGroupServiceStatusResponseBody extends TeaModel {
    // 请求ID，用于跟踪错误原因
    @NameInMap("RequestId")
    public String requestId;

    // 错误描述
    @NameInMap("Message")
    public String message;

    // 错误编码
    @NameInMap("Code")
    public String code;

    // 调用接口是否成功
    @NameInMap("Success")
    public String success;

    // data
    @NameInMap("Data")
    public GetSkillGroupServiceStatusResponseBodyData data;

    public static GetSkillGroupServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupServiceStatusResponseBody self = new GetSkillGroupServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupServiceStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupServiceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupServiceStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetSkillGroupServiceStatusResponseBody setData(GetSkillGroupServiceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupServiceStatusResponseBodyData getData() {
        return this.data;
    }

    public static class GetSkillGroupServiceStatusResponseBodyData extends TeaModel {
        // 页大小
        @NameInMap("PageSize")
        public Integer pageSize;

        // 总记录数
        @NameInMap("TotalNum")
        public Integer totalNum;

        // 信息为list<map>类型的json字符串
        @NameInMap("Rows")
        public String rows;

        // 当前页数
        @NameInMap("PageNum")
        public Integer pageNum;

        public static GetSkillGroupServiceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupServiceStatusResponseBodyData self = new GetSkillGroupServiceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupServiceStatusResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSkillGroupServiceStatusResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public GetSkillGroupServiceStatusResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSkillGroupServiceStatusResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

    }

}
