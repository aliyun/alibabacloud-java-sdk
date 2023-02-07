// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentBasisStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAgentBasisStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetAgentBasisStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentBasisStatusResponseBody self = new GetAgentBasisStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentBasisStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentBasisStatusResponseBody setData(GetAgentBasisStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentBasisStatusResponseBodyData getData() {
        return this.data;
    }

    public GetAgentBasisStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentBasisStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentBasisStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetAgentBasisStatusResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rows")
        public String rows;

        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetAgentBasisStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentBasisStatusResponseBodyData self = new GetAgentBasisStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentBasisStatusResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetAgentBasisStatusResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAgentBasisStatusResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetAgentBasisStatusResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
