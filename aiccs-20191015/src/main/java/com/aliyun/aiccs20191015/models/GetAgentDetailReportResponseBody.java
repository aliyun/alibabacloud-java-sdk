// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentDetailReportResponseBody extends TeaModel {
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
    public GetAgentDetailReportResponseBodyData data;

    public static GetAgentDetailReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDetailReportResponseBody self = new GetAgentDetailReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentDetailReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentDetailReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentDetailReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentDetailReportResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetAgentDetailReportResponseBody setData(GetAgentDetailReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentDetailReportResponseBodyData getData() {
        return this.data;
    }

    public static class GetAgentDetailReportResponseBodyData extends TeaModel {
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

        public static GetAgentDetailReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentDetailReportResponseBodyData self = new GetAgentDetailReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentDetailReportResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetAgentDetailReportResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetAgentDetailReportResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public GetAgentDetailReportResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

    }

}
