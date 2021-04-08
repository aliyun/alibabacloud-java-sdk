// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentServiceStatusResponseBody extends TeaModel {
    // 错误描述
    @NameInMap("Message")
    public String message;

    // 请求ID，用于跟踪错误原因
    @NameInMap("RequestId")
    public String requestId;

    // data
    @NameInMap("Data")
    public GetAgentServiceStatusResponseBodyData data;

    // 错误编码
    @NameInMap("Code")
    public String code;

    // 调用接口是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetAgentServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentServiceStatusResponseBody self = new GetAgentServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentServiceStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentServiceStatusResponseBody setData(GetAgentServiceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentServiceStatusResponseBodyData getData() {
        return this.data;
    }

    public GetAgentServiceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentServiceStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentServiceStatusResponseBodyData extends TeaModel {
        // 当前页数
        @NameInMap("PageNum")
        public Long pageNum;

        // 页大小
        @NameInMap("PageSize")
        public Long pageSize;

        // 总记录数
        @NameInMap("TotalNum")
        public Long totalNum;

        // 信息为list<map>类型的json字符串
        @NameInMap("Rows")
        public String rows;

        public static GetAgentServiceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentServiceStatusResponseBodyData self = new GetAgentServiceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentServiceStatusResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetAgentServiceStatusResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetAgentServiceStatusResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public GetAgentServiceStatusResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

    }

}
